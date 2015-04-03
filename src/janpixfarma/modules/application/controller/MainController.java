package janpixfarma.modules.application.controller;

import janpixfarma.modules.application.view.MainView;
import janpixfarma.modules.application.BootStrap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;

/*
 *
 * @author clever
 */
public class MainController implements ActionListener {

    protected MainView view;
    protected BootStrap app;

    // enumeración para invocar al formulario seleccionado en el menú
    public enum Form {
        USUARIO_REGISTRAR,
        USUARIO_ACTUALIZAR,
        USUARIO_ELIMINAR,
        TIPO_REGISTRAR,
        TIPO_ACTUALIZAR,
        TIPO_ELIMINAR,
        PRESENTACION_REGISTRAR,
        PRESENTACION_ACTUALIZAR,
        PRESENTACION_ELIMINAR,
        MEDICAMENTO_REGISTRAR,
        MEDICAMENTO_ACTUALIZAR,
        MEDICAMENTO_ELIMINAR,
        CLIENTE_REGISTRAR,
        CLIENTE_ACTUALIZAR,
        CLIENTE_ACTUALIZAR_BONO,
        CLIENTE_ELIMINAR,
        VENTA_REGISTRAR,
        VENTA_MOSTRAR,
        REPORTE_CAJA,
        REPORTE_CLIENTES,
        REPORTE_COMPRAS,
        REPORTE_VENTA_USUARIO,
        REPORTE_RANKING,
        CERRAR_SESION,
        SALIR
    }

    public MainView getMainView() {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Form form = Form.valueOf(evento.getActionCommand());
        switch (form) {
            case USUARIO_REGISTRAR:
                // invocando la ventana principal
                janpixfarma.modules.admin.controller.UsuarioRegistrarController.UsuarioRegistrar(this);
                //JOptionPane.showMessageDialog(null, "Habla loco" + evento.getActionCommand() + "\n");
                break;
        }
    }

    public MainController(MainView view) {
        // Inicializando datos de la aplicación
        app = BootStrap.getInstance();

        this.view = view;
        
        // Si el usuario no es administrador no se le muestra
        // el menú para administrar usuarios (índice 0)
        if (!app.isAdmin()) {
            view.getMenu().remove(0);
        }

        // Mostrando la ventana de Main
        view.setVisible(true);
    }

    public static void Main() {
        // invocando a la vista de Main
        MainView view = new MainView();
        // Invocando controlador de Main
        MainController controller = new MainController(view);
        // definiendo el controlador de la vista
        view.setController(controller);
        // Mostrando la ventana de Main
        view.setVisible(true);
    }
}