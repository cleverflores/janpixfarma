package janpixfarma.modules.application.controller;

import janpixfarma.Medicamento;
import janpixfarma.Cliente;
import janpixfarma.modules.application.view.MainView;
import janpixfarma.modules.application.BootStrap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/*
 *
 * @author clever
 */
public class MainController implements ActionListener {

    protected MainView view;
    protected BootStrap app;
    protected javax.swing.JDesktopPane pane;

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
        try {
            Form form = Form.valueOf(evento.getActionCommand());
            switch (form) {
                case USUARIO_ADMINISTRAR:
                    // invocando la ventana de administración de usuarios
                    janpixfarma.modules.admin.controller.UsuarioAdministrarController.UsuarioAdministrar(this);
                    break;
                case ADMIN_MEDICAMENTOS:
                    // obteniendo el pane y borrando todos los internalframes
                    pane = view.getMainPane();
                    pane.removeAll();
                    
                    // fromulario de administración de medicamentos
                    Medicamento frmMedicamento = new Medicamento();

                    // agredando al desktopPane el formulario de administración de medicamentos
                    pane.add(frmMedicamento);
                    
                    // maximizando el formulario de registro del usuario
                    frmMedicamento.setMaximum(true);
                    frmMedicamento.setClosable(true);
                    frmMedicamento.setVisible(true);
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
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
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
