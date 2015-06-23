package Login.Vista;

import Login.Control.InterfaceValidacion;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

/**
 * Created by JorgeLuis on 22/06/2015.
 */
public class UIValidarUsuario extends JFrame{
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnEntrar;
    private JButton btnCancelar;
    private JPanel Panel;

    private InterfaceValidacion interfaceValidacion;

    public UIValidarUsuario(final InterfaceValidacion interfaceValidacion) {

        this.interfaceValidacion = interfaceValidacion;

        setContentPane(Panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);

        txtUsuario.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                interfaceValidacion.recibeUsuario(txtUsuario.getText());
            }
        });


        txtPassword.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                interfaceValidacion.recibePassword(txtPassword.getText());
            }
        });

        btnEntrar.addComponentListener(new ComponentAdapter() {
        });

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaceValidacion.accionEntrar();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaceValidacion.accionCancelar();
            }
        });
    }


}
