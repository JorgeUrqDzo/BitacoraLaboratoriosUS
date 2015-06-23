package Login.Control;

import Login.Modelo.Usuario;
import Login.Vista.UIValidarUsuario;

import javax.swing.*;

/**
 * Created by JorgeLuis on 22/06/2015.
 */
public class vUsuarioController implements InterfaceValidacion {

    private UIValidarUsuario iUiValidarUsuario;
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;

    public vUsuarioController() {

        usuarioDAO = new UsuarioDAO();
        usuario = new Usuario();
        iUiValidarUsuario = new UIValidarUsuario(this);
    }

    @Override
    public void recibeUsuario(String texto) {

        if(texto.length() > 1){
            usuario.setLogin(texto);
        }
    }

    @Override
    public void recibePassword(String texto) {
        if(texto.length() > 1){
            usuario.setPassword(texto);
        }
    }

    @Override
    public void accionEntrar() {

        if(usuarioDAO.getUsuario(usuario)){
            JOptionPane.showMessageDialog(null,"Login Exitoso");
        }else{
            JOptionPane.showMessageDialog(null,"Login Incorrecto");
        }

       // System.out.println("Ya entre a la accion buscar ");
    }

    @Override
    public void accionCancelar() {
        System.exit(1);
    }
}
