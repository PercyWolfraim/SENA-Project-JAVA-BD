package model.empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoDao implements IEmpleado {

    private Connection cn;
    private PreparedStatement stm;
    private String cod_empleado = "";

    public EmpleadoDao(String cod_empleado) {
            this.cod_empleado = cod_empleado;
    }

    @Override
    public boolean insertar(Empleado objEmpleado) {
        String sql = "INSERT INTO empleado (ID_EMPLEADO,COD_EMPLEADO,CEDULA_EMPLEADO,NOMBRE_EMPLEADO,ID_DEPARTAMENTO,ID_PUESTO,SALARIO_MENSUAL_EMPLEADO,RESPONSABLE_AREA) VALUES (?,?,?,?,?,?,?,?)";

        try {
            cn = Conexion.conectar();
            stm = cn.prepareStatement(sql);
            stm.setString(1, objEmpleado.getId_empleado());
            stm.setInt(2, objEmpleado.getCod_empleado());
            stm.setInt(3, objEmpleado.getCedula_empleado());
            stm.setString(4, objEmpleado.getNombre_empleado());
            stm.setInt(5, objEmpleado.getId_departamento());
            stm.setString(6, objEmpleado.getId_puesto());
            stm.setInt(7, objEmpleado.getSalario_mensual_empleado());
            stm.setString(8, objEmpleado.getResponsable_area());
            stm.executeUpdate();

            System.out.println("Se ha ingresado el nuevo usuario");

            return true;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean modificar(Empleado objEmpleado) {
        String sql = " UPDATE EMPLEADO SET "
                + "CEDULA_EMPLEADO = ?,"
                + "NOMBRE_EMPLEADO = ?,"
                + "ID_DEPARTAMENTO = ?,"
                + "ID_PUESTO = ?,"
                + "SALARIO_MENSUAL_EMPLEADO = ?,"
                + "RESPONSABLE_AREA = ?"
                + "WHERE ID_EMPLEADO = ?";

        try {
            cn = Conexion.conectar();
            stm = cn.prepareStatement(sql);
            
            stm.setInt(1, objEmpleado.getCedula_empleado());
            stm.setString(2, objEmpleado.getNombre_empleado());
            stm.setInt(3, objEmpleado.getId_departamento());
            stm.setString(4, objEmpleado.getId_puesto());
            stm.setInt(5, objEmpleado.getSalario_mensual_empleado());
            stm.setString(6, objEmpleado.getResponsable_area());
            stm.setString(7, objEmpleado.getId_empleado());
            stm.executeUpdate();

            System.out.println("Se ha modificado el usuario exitosamente");

            return true;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e);
        }

        return false;
    }

    @Override
    public boolean eliminar(Empleado objEmpleado) {

        String sql = "DELETE FROM EMPLEADO WHERE COD_EMPLEADO = ?";

        try {
            cn = Conexion.conectar();
            stm = cn.prepareStatement(sql);
            stm.setInt(1, objEmpleado.getCod_empleado());
            stm.executeUpdate();

            System.out.println("Se ha eliminado el usuario exitosamente");

            return true;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e);
        }

        return false;

    }

    @Override
    public List<Empleado> consultar() {

        ArrayList<Empleado> Lista = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM EMPLEADO WHERE COD_EMPLEADO = '" + this.cod_empleado + "'";

        try {
            cn = Conexion.conectar();
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();

            Empleado objBeanEmpleado = new Empleado();

            while (rs.next()) {
                objBeanEmpleado.setId_empleado(rs.getString("ID_EMPLEADO"));
                objBeanEmpleado.setCod_empleado(rs.getInt("COD_EMPLEADO"));
                objBeanEmpleado.setCedula_empleado(rs.getInt("CEDULA_EMPLEADO"));
                objBeanEmpleado.setNombre_empleado(rs.getString("NOMBRE_EMPLEADO"));
                objBeanEmpleado.setId_departamento(rs.getInt("ID_DEPARTAMENTO"));
                objBeanEmpleado.setId_puesto(rs.getString("ID_PUESTO"));
                objBeanEmpleado.setSalario_mensual_empleado(rs.getInt("SALARIO_MENSUAL_EMPLEADO"));
                objBeanEmpleado.setResponsable_area(rs.getString("RESPONSABLE_AREA"));

                Lista.add(objBeanEmpleado);

            }
        } catch (SQLException e) {
            System.out.println("Se ha encontrado un error: \n" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un error");
        }

        return Lista;
    }

    public String getCodEmpleado() {
        return this.cod_empleado;
    }

}
