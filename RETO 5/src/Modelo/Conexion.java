package Modelo;

/* @author Angela DIaz */

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conexion;

    public static Connection crearConexion() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/UNIREPUESTOS", "root", "admin");
            System.out.println("conexión ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sin conexion");
        }
        return conexion;
    }
}