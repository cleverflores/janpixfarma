/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.admin.controller;

import janpixfarma.modules.application.controller.MainController;
import janpixfarma.modules.application.BootStrap;
import janpixfarma.modules.admin.view.UsuarioRegistrarView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clever
 */
public class UsuarioRegistrarController implements ActionListener {

    protected UsuarioRegistrarView view;
    protected BootStrap app;

    @Override
    public void actionPerformed(ActionEvent evento) {
    }

    public UsuarioRegistrarController(MainController c, UsuarioRegistrarView view) {
        // invocando a la vista de Main
        janpixfarma.modules.application.view.MainView mainView = c.getMainView();
        // obteniendo el pane
        javax.swing.JDesktopPane pane = mainView.getMainPane();

        this.view = view;

        pane.add(view);
        try {
            view.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(UsuarioRegistrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.setVisible(true);
    }

    public static void UsuarioRegistrar(MainController c) {
        // Invocando la vista de UsuarioRegistrar
        UsuarioRegistrarView view = new UsuarioRegistrarView();

        // Invocando controlador de UsuarioRegistrarView
        UsuarioRegistrarController controller = new UsuarioRegistrarController(c, view);

        // definiendo el controlador de la vista
        view.setController(controller);

        // Mostrando la ventana de Main
        view.setVisible(true);
    }
}