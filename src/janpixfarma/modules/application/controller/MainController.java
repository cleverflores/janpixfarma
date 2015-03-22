package janpixfarma.modules.application.controller;

import janpixfarma.modules.application.view.MainView;
import janpixfarma.modules.application.model.MainModel;
import janpixfarma.modules.application.BootStrap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;

/*
 *
 * @author clever
 */

public class MainController implements ActionListener {

    MainModel model;
    MainView view;
    BootStrap app;

    @Override
    public void actionPerformed(ActionEvent evento) {
    }

    public MainController(MainModel model, MainView view) {
        this.model = model;
        this.view = view;
        app = BootStrap.getInstance();
        this.view.setVisible(true);
    }
}