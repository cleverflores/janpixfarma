/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.application;

/**
 *
 * @author clever
 */
public class Application {
    /* Método que invoca a la ventana de Login
     *
     */
    public static void Login() {
        // Invocando al modelo de Login
        janpixfarma.modules.application.model.LoginModel model = new janpixfarma.modules.application.model.LoginModel();

        // invocando a la vista de Login
        janpixfarma.modules.application.view.LoginView view = new janpixfarma.modules.application.view.LoginView();

        // Invocando controlador de Login
        janpixfarma.modules.application.controller.LoginController controller = new janpixfarma.modules.application.controller.LoginController(model, view);

        // definiendo el controlador de la vista
        view.setController(controller);

        // Mostrando la ventana de Login
        view.setVisible(true);
    }

    /* Método que invoca a la ventana principal de la aplicación
     *
     */
    public static void Main() {
        // Invocando al modelo de Main
        janpixfarma.modules.application.model.MainModel model = new janpixfarma.modules.application.model.MainModel();

        // invocando a la vista de Main
        janpixfarma.modules.application.view.MainView view = new janpixfarma.modules.application.view.MainView();

        // Invocando controlador de Main
        janpixfarma.modules.application.controller.MainController controller = new janpixfarma.modules.application.controller.MainController(model, view);

        // definiendo el controlador de la vista
        view.setController(controller);

        // Mostrando la ventana de Main
        view.setVisible(true);
    }
}