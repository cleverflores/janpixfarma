/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.admin.controller;

import janpixfarma.modules.application.controller.MainController;
import janpixfarma.modules.application.BootStrap;
import janpixfarma.modules.admin.view.UsuarioAdministrarView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import janpixfarma.model.User;
import javax.swing.JOptionPane;

/**
 *
 * @author clever
 */
public class UsuarioAdministrarController implements ActionListener {

    protected UsuarioAdministrarView view;
    protected BootStrap app;
    javax.swing.JDesktopPane pane;

    @Override
    public void actionPerformed(ActionEvent evento) {
        String dni, username, password, nombres, apellidos, role;
        dni = view.getDni().getText().trim();
        username = view.getUserName().getText().trim();
        password = new String(view.getPassword().getPassword()).trim();
        nombres = view.getNombres().getText();
        apellidos = view.getApellidos().getText();
        role = view.getRole().getSelectedItem().toString();

        if (!app.getUsers().findByUsername(dni) && !app.getUsers().findByUsername(username)) {
            if (!dni.equals("") && !username.equals("") && !password.equals("")) {
                User u = new User(dni, username, password, nombres, apellidos, role);
                //agregando nuevo usuario
                app.getUsers().add(u);
                JOptionPane.showMessageDialog(null, "Usuario " + username + " agregado con éxito");
                view.getDni().setText("");
                view.getUserName().setText("");
                view.getPassword().setText("");
                view.getNombres().setText("");
                view.getApellidos().setText("");
                view.getDni().requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "No deje los campos dni, usuario y password vacíos");
                view.getDni().requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario " + username + " con dni " + dni + " ya existe");
            view.getDni().requestFocus();
        }
    }

    public UsuarioAdministrarController(MainController c, UsuarioAdministrarView view) {
        // Inicializando datos de la aplicación
        app = BootStrap.getInstance();

        // invocando a la vista de Main
        janpixfarma.modules.application.view.MainView mainView = c.getMainView();

        // obteniendo el pane
        pane = mainView.getMainPane();

        // vista de registro de usuario
        this.view = view;

        // agredando al desktopPane el formulario de registro de usuario
        pane.add(view);

        // maximizando el formulario de registro del usuario
        try {
            view.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(UsuarioAdministrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.setVisible(true);
    }

    public static void UsuarioAdministrar(MainController c) {
        // Invocando la vista de UsuarioAdministrar
        UsuarioAdministrarView view = new UsuarioAdministrarView();

        // Invocando controlador de UsuarioAdministrarView
        UsuarioAdministrarController controller = new UsuarioAdministrarController(c, view);

        // definiendo el controlador de la vista
        view.setController(controller);

        // Mostrando la ventana de Main
        view.setVisible(true);
    }
}
