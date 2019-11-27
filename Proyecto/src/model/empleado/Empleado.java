/*Luego de haver creado las bases de datos, en esta clase empece a trabajar*/
package model.empleado;

public class Empleado {

    private String id_empleado;
    private int cod_empleado;
    private int cedula_empleado;
    private String nombre_empleado;
    private int id_departamento;
    private String id_puesto;
    private int salario_mensual_empleado;
    private String responsable_area;

    /*Generé guetters, setters, toString, un methodo con todas las variables privadas y uno vacio*/

    public Empleado (){

    }

    public Empleado(String id_empleado, int cod_empleado, int cedula_empleado, String nombre_empleado, int id_departamento, String id_puesto, int salario_mensual_empleado, String responsable_area) {
        this.id_empleado = id_empleado;
        this.cod_empleado = cod_empleado;
        this.cedula_empleado = cedula_empleado;
        this.nombre_empleado = nombre_empleado;
        this.id_departamento = id_departamento;
        this.id_puesto = id_puesto;
        this.salario_mensual_empleado = salario_mensual_empleado;
        this.responsable_area = responsable_area;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado='" + id_empleado + '\'' +
                ", cod_empleado=" + cod_empleado +
                ", cedula_empleado=" + cedula_empleado +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", id_departamento=" + id_departamento +
                ", id_puesto=" + id_puesto +
                ", salario_mensual_empleado=" + salario_mensual_empleado +
                ", responsable_area='" + responsable_area + '\'' +
                '}';
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public int getCedula_empleado() {
        return cedula_empleado;
    }

    public void setCedula_empleado(int cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(String id_puesto) {
        this.id_puesto = id_puesto;
    }

    public int getSalario_mensual_empleado() {
        return salario_mensual_empleado;
    }

    public void setSalario_mensual_empleado(int salario_mensual_empleado) {
        this.salario_mensual_empleado = salario_mensual_empleado;
    }

    public String getResponsable_area() {
        return responsable_area;
    }

    public void setResponsable_area(String responsable_area) {
        this.responsable_area = responsable_area;
    }
}
