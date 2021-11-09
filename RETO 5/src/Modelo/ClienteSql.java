package Modelo;

/* @author Angela DIaz*/

import java.sql.*;
import java.util.ArrayList;

public class ClienteSql {

    Conexion conexion = new Conexion();
    Connection acceso = conexion.crearConexion();
    
    public boolean Insertar(Cliente Cli) {
        try {
            String sql = "INSERT INTO cliente (cli_nombre1, cli_nombre2, cli_apellido1,cli_apellido2, cli_nacionalidad, cli_correo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, Cli.getCli_nombre1());
            statement.setString(2, Cli.getCli_nombre2());
            statement.setString(3, Cli.getCli_apellido1());
            statement.setString(4, Cli.getCli_apellido2());
            statement.setString(5, Cli.getCli_nacionalidad());
            statement.setString(6, Cli.getCli_correo());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) { 
                System.out.println("Registro exitoso");
            }
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Editar(Cliente Cli) {
        try {
            String sql = "UPDATE cliente SET cli_nombre1=?, cli_nombre2=?, cli_apellido1=?, cli_apellido2=?, cli_nacionalidad=?, cli_correo=? WHERE cli_id=?";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, Cli.getCli_nombre1());
            statement.setString(2, Cli.getCli_nombre2());
            statement.setString(3, Cli.getCli_apellido1());
            statement.setString(4, Cli.getCli_apellido2());
            statement.setString(5, Cli.getCli_nacionalidad());
            statement.setString(6, Cli.getCli_correo());
            statement.setInt(7, Cli.getCli_id());
            statement.executeUpdate();
            System.out.println("Registro modificado");
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Eliminar(Cliente Cli) {
        try {
            String sql = "DELETE FROM cliente WHERE cli_id=?";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setInt(1, Cli.getCli_id());
            statement.executeUpdate();
            System.out.println("Registro eliminado");
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ArrayList<Cliente> Consulta() {
        Cliente cliente;
        ArrayList<Cliente> data = new ArrayList<>();

        try {
            //2. crear el objeto statement
            Statement sentencia = acceso.createStatement();
            //3. ejecutar la sentencia
            ResultSet datos = sentencia.executeQuery("select * from cliente");
            // 4. recorrer los datos de la tabla virtual
            while (datos.next()) {
                cliente = new Cliente();
                cliente.setCli_id(Integer.parseInt(datos.getString(1)));
                cliente.setCli_nombre1(datos.getString(2));
                cliente.setCli_nombre2(datos.getString(3));
                cliente.setCli_apellido1(datos.getString(4));
                cliente.setCli_apellido2(datos.getString(5));
                cliente.setCli_nacionalidad(datos.getString(6));
                cliente.setCli_correo(datos.getString(7));
                data.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}



    

