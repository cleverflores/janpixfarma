package janpixfarma.modules.application.controller;

import janpixfarma.Medicamento;
import janpixfarma.Cliente;
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

        USUARIO_ADMINISTRAR,
        ADMIN_MEDICAMENTOS,
        ADMIN_CLIENTES,
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
            case USUARIO_ADMINISTRAR:
                // invocando la ventana principal
                janpixfarma.modules.admin.controller.UsuarioAdministrarController.UsuarioAdministrar(this);
                //JOptionPane.showMessageDialog(null, "Habla loco" + evento.getActionCommand() + "\n");
                break;
            case ADMIN_MEDICAMENTOS:
                Medicamento formulario1 = new Medicamento();
                formulario1.setBounds(10, 20, 800, 600);
                formulario1.setVisible(true);
                //JOptionPane.showMessageDialog(null, "Habla loco" + evento.getActionCommand() + "\n");
                break;
            case ADMIN_CLIENTES:
                Cliente cliente = new Cliente();
                cliente.setVisible(true);
                cliente.toFront();
                //JOptionPane.showMessageDialog(null, "Habla loco" + evento.getActionCommand() + "\n");
                break;
            case REPORTE_CAJA:
                janpixfarma.ReporteCaja repcaja = new janpixfarma.ReporteCaja();
                repcaja.setVisible(true);
                break;
            case REPORTE_CLIENTES:
                janpixfarma.ReporteCliente repcliente = new janpixfarma.ReporteCliente();
                repcliente.setVisible(true);
                break;
            case REPORTE_COMPRAS:    
                janpixfarma.ReporteCompras repcompras = new janpixfarma.ReporteCompras();
                repcompras.setVisible(true);
                break;                
            case REPORTE_VENTA_USUARIO:
                janpixfarma.reporVentas repventas = new janpixfarma.reporVentas();
                repventas.setVisible(true);
                break;
            case REPORTE_RANKING:
                janpixfarma.rankVentas repranking = new janpixfarma.rankVentas();
                repranking.setVisible(true);
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