package Login.Modelo;

/**
 * Created by JorgeLuis on 22/06/2015.
 */
public class Usuario {

    private String login;
    private String password;

    public Usuario() {
        this("","");
    }

    public Usuario(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
