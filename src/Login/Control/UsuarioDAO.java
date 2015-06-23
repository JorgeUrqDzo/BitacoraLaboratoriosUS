package Login.Control;

import Login.Modelo.Usuario;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by JorgeLuis on 22/06/2015.
 */
public class UsuarioDAO {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    public UsuarioDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitacora","Bitacora","123");
            System.out.println("Conexion Lista");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean getUsuario(Usuario usuario){

        String sql = "SELECT * FROM usuario WHERE nombre = '" + usuario.getLogin() + "' AND password = '" + usuario.getPassword() + "'";
        //System.out.println(sql);

        try {

            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            return rs.first();
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;

    }
}
