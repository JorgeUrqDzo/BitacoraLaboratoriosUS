package GUI;

import ConexionBD.BD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JorgeLuis on 13/06/2015.
 */
public class Login extends JFrame{
    private JTextField usuarioText;
    private JPasswordField passwordText;
    private JButton ingresarButton;
    private JButton cancelarButton;
    private JPanel Padre;

    public Login(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Login");
        this.setContentPane(Padre);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usr = usuarioText.getText();
                String psw = passwordText.getText();
                if(usr.equals("") && psw.equals(""))
                    JOptionPane.showMessageDialog(null,"Campos Vacios ");
                else{
                    BD bd = new BD();
                    if(bd.Login(usr,psw)){
                        JOptionPane.showMessageDialog(null,"Bienvenido ");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Datos Erroneos ");
                }
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usr = usuarioText.getText();
                JOptionPane.showMessageDialog(null,"ADIOS " + usr);
                System.exit(1);
            }
        });


        this.pack();
    }

    public static void main(String[] args) {
        Login l = new Login();

    }
}
