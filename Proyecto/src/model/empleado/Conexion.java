package model.empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection cn = null;

    public static Connection conectar(){

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/construccion";
        String usuario = "root";
        String clave = "";

        if(cn == null){
            try {
                Class.forName(driver);
                cn = DriverManager.getConnection(url,usuario,clave);
                System.out.println("Conexion realizada");
            } catch (ClassNotFoundException e) {
                System.out.println("Ha ocurrido un error "+e);
                e.printStackTrace();

            } catch (SQLException e) {
                System.out.println("Ha ocurrido un error "+e);
                e.printStackTrace();
            }
        }

        return null;
    }

}
