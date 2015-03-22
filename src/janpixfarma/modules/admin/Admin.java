package janpixfarma.modules.admin;


import janpixfarma.modules.application.BootStrap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;


/**
 *
 * @author clever
 */
public class Admin {
    public Admin(){
        BootStrap app = BootStrap.getInstance();
        if(app.isAdmin()){
            JOptionPane.showMessageDialog(null, "Bienvenido Admin \n");
        }
    }            
}