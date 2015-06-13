package ConexionBD;

import java.sql.*;

/**
 * Created by JorgeLuis on 13/06/2015.
 */
public class BD {
    private String nombreBD;
    private String usuario;
    private String password;
    private String dbURL;

    public BD(String nombreBD, String usuario, String password, String dbURL) {
        this.nombreBD = nombreBD;
        this.usuario = usuario;
        this.password = password;
        this.dbURL = dbURL;
    }

    public BD() {
        this.nombreBD = "bitacora";
        this.usuario = "Bitacora";
        this.password = "123";
        this.dbURL = "jdbc:mysql://localhost:3306/bitacora";
    }

    public Boolean Login(String u, String p){


        try (Connection conn = DriverManager.getConnection(this.dbURL, this.usuario, this.password)) {

            String sql = "SELECT nombre, password FROM  usuario WHERE nombre = '"+ u +"' and password = '"+ p +"'";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()){
                String name = result.getString("nombre");
                String pass = result.getString("password");

                ++count;
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
