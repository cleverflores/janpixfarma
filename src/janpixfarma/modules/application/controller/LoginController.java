package janpixfarma.modules.application.controller;

import janpixfarma.modules.application.view.LoginView;
import janpixfarma.modules.application.model.LoginModel;
import janpixfarma.modules.application.BootStrap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/*
 *
 * @author clever
 */

public class LoginController implements ActionListener {

    LoginModel model;
    LoginView view;
    BootStrap app;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
        app = BootStrap.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        String user, password;
        user = view.getUser();
        password = view.getPassword();

        if (model.Login(user, password)) {
            if (app.isAdmin()) {
                JOptionPane.showMessageDialog(null, "Bienvenido Admin " + user + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "Bienvenido Usuario " + user + "\n");
            }
            view.setVisible(false);
            // invocando la ventana principal
            janpixfarma.modules.application.Application.Main();
        } else {
            JOptionPane.showMessageDialog(null, "ACCESO INCORRECTO, intente de nuevo" + "\n");
        }
    }
}