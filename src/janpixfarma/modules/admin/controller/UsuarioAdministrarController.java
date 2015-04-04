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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clever
 */
public class UsuarioAdministrarController implements ActionListener {

    protected UsuarioAdministrarView view;
    protected BootStrap app;
    protected javax.swing.JDesktopPane pane;
    protected javax.swing.table.DefaultTableModel tableModel;
    protected DefaultTableModel modelTable;

    enum Command {

        REGISTRAR,
        ACTUALIZAR,
        ELIMINAR,
        LIMPIAR
    }

    public void Limpiar() {
        view.getDni().setText("");
        view.getUserName().setText("");
        view.getPassword().setText("");
        view.getNombres().setText("");
        view.getApellidos().setText("");
        view.getRole().setSelectedIndex(0);
        view.getDni().requestFocus();
    }

    public void Registrar() {
        String dni, username, password, nombres, apellidos, role;
        dni = view.getDni().getText().trim();
        username = view.getUserName().getText().trim();
        password = new String(view.getPassword().getPassword()).trim();
        nombres = view.getNombres().getText();
        apellidos = view.getApellidos().getText();
        role = view.getRole().getSelectedItem().toString();

        if (!app.getUsers().findByDni(dni) && !app.getUsers().findByUsername(username)) {
            if (!dni.equals("") && !username.equals("") && !password.equals("")) {
                User u = new User(dni, username, password, nombres, apellidos, role);
                //agregando nuevo usuario
                app.getUsers().add(u);
                JOptionPane.showMessageDialog(null, "Usuario " + username + " agregado con éxito");
                setDefaultModel();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No deje los campos dni, usuario y password vacíos");
                view.getDni().requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario " + username + " con dni " + dni + " ya existe");
            view.getDni().requestFocus();
        }
    }

    public void Actualizar() {
        String dni, username, password, nombres, apellidos, role;
        dni = view.getDni().getText().trim();
        username = view.getUserName().getText().trim();
        password = new String(view.getPassword().getPassword()).trim();
        nombres = view.getNombres().getText();
        apellidos = view.getApellidos().getText();
        role = view.getRole().getSelectedItem().toString();

        if (app.getUsers().findByDni(dni) && app.getUsers().findByUsername(username)) {
            User usuario = app.getUsers().getUserByUsername(username);
            usuario.setDni(dni);
            usuario.setUsername(username);
            usuario.setPassword(password);
            usuario.setNombres(nombres);
            usuario.setApellidos(apellidos);
            usuario.setRole(role);
            JOptionPane.showMessageDialog(null, "Usuario " + username + " actualizado con éxito");
            setDefaultModel();
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario " + username + " con dni " + dni + " no encontrado");
            view.getDni().requestFocus();
        }
    }

    public void Eliminar() {
        String dni, username;
        dni = view.getDni().getText().trim();
        username = view.getUserName().getText().trim();

        if (app.getUsers().findByDni(dni) && app.getUsers().findByUsername(username)) {
            if (!username.equals("SUPERUSUARIO")) {
                app.getUsers().remove(username);
                JOptionPane.showMessageDialog(null, "Usuario " + username + " eliminado con éxito");
                setDefaultModel();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se puede borrar al superuusario");
                view.getDni().requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario " + username + " con dni " + dni + " no encontrado");
            view.getDni().requestFocus();
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Command command = Command.valueOf(evento.getActionCommand());
        switch (command) {
            case REGISTRAR:
                Registrar();
                break;
            case ACTUALIZAR:
                Actualizar();
                break;
            case LIMPIAR:
                Limpiar();
                break;
            case ELIMINAR:
                Eliminar();
                break;
        }
    }

    public void setDefaultModel() {
        int rowCount = modelTable.getRowCount();
        //Borrando los datos
        for (int i = rowCount - 1; i >= 0; i--) {
            modelTable.removeRow(i);
        }
        for (int i = 0; i < app.getUsers().size(); i++) {
            String[] row = new String[7];
            row[0] = "" + i + "";
            row[1] = app.getUsers().getUser(i).getDni();
            row[2] = app.getUsers().getUser(i).getUsername();
            row[3] = app.getUsers().getUser(i).getPassword();
            row[4] = app.getUsers().getUser(i).getNombres();
            row[5] = app.getUsers().getUser(i).getApellidos();
            row[6] = app.getUsers().getUser(i).getRole();
            modelTable.addRow(row);
        }
    }

    public UsuarioAdministrarController(MainController c, final UsuarioAdministrarView view) {
        // Inicializando datos de la aplicación
        app = BootStrap.getInstance();

        // invocando a la vista de Main
        janpixfarma.modules.application.view.MainView mainView = c.getMainView();

        // obteniendo el pane
        pane = mainView.getMainPane();
        pane.removeAll();
        // vista de registro de usuario
        this.view = view;

        // agredando al desktopPane el formulario de administración de usuarios
        pane.add(view);

        // maximizando el formulario de registro del usuario
        try {
            view.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(UsuarioAdministrarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelTable = (DefaultTableModel) view.getListaUsuarios().getModel();
        setDefaultModel();
        final JTable lista = view.getListaUsuarios();
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = lista.rowAtPoint(evt.getPoint());
                view.getDni().setText(app.getUsers().getUser(row).getDni());
                view.getUserName().setText(app.getUsers().getUser(row).getUsername());
                view.getPassword().setText(app.getUsers().getUser(row).getPassword());
                view.getNombres().setText(app.getUsers().getUser(row).getNombres());
                view.getApellidos().setText(app.getUsers().getUser(row).getApellidos());
                for (int i = 0; i < view.getRole().getItemCount(); i++) {
                    if (view.getRole().getItemAt(i).equals(app.getUsers().getUser(row).getRole())) {
                        view.getRole().setSelectedIndex(i);
                    }
                }
                //view.getRole().setSelectedIndex(row);
                view.getDni().requestFocus();
                //JOptionPane.showMessageDialog(null, app.getUsers().getUser(row).getUsername());
            }
        });
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
