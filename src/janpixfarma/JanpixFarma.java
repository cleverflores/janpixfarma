/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma;


/**
 *
 * @author clever
 */
public class JanpixFarma {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializando datos de la aplicación
        janpixfarma.modules.application.BootStrap.getInstance();
        
        // Login de usuario
        janpixfarma.modules.application.controller.LoginController.Login();
    }
}