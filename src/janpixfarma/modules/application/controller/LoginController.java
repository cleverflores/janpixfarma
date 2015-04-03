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

    public LoginController(LoginView view, LoginModel model) {
        // obteniendo datos de la aplicación
        app = BootStrap.getInstance();

        // invocando a la vista de Login
        this.view = view;
        
        this.model = model;
        
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
            janpixfarma.modules.application.controller.MainController.Main();
        } else {
            JOptionPane.showMessageDialog(null, "ACCESO INCORRECTO, intente de nuevo" + "\n");
        }
    }

    public static void Login() {
        // Invocando la vista de Login
        LoginView view = new LoginView();

        // Invocando al modelo de Login
        LoginModel model = new LoginModel();

        // Invocando controlador de LoginView
        LoginController controller = new LoginController(view,model);

        // definiendo el controlador de la vista
        view.setController(controller);

        // Mostrando la ventana de Main
        view.setVisible(true);
    }
}