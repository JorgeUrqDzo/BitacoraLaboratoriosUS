package ConexionBD;

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
        this.usuario = "bitacora";
        this.password = "123";
        this.dbURL = "jdbc:mysql://localhost:3306/bitacora";
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }
}
