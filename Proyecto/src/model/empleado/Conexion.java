package model.empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection cn = null;

    public static Connection conectar(){
        String url = "jdbc:mysql://localhost:3306/construccion";

        try {
            return DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: \n" + e.getMessage());
        }
        
        return (null);
    }

}
