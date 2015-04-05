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
import javax.swing.JOptionPane;

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
        REGISTRAR_VENTA,
        REPORTE_CAJA,
        REPORTE_CLIENTES,
        REPORTE_COMPRAS,
        REPORTE_VENTA_USUARIO,
        REPORTE_RANKING,
        CAMBIAR_USUARIO,
        SALIR
    }

    public MainView getMainView() {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            Form form = Form.valueOf(evento.getActionCommand());
            // obteniendo el pane y borrando todos los internalframes
            pane = view.getMainPane();
            pane.removeAll();

            switch (form) {
                case USUARIO_ADMINISTRAR:
                    // invocando la ventana de administración de usuarios
                    janpixfarma.modules.admin.controller.UsuarioAdministrarController.UsuarioAdministrar(this);
                    break;
                case ADMIN_MEDICAMENTOS:
                    // fromulario de administración de medicamentos
                    Medicamento frmMedicamento = new Medicamento();
                    // agredando al desktopPane el formulario de administración de medicamentos
                    pane.add(frmMedicamento);
                    frmMedicamento.setTitle("Administración de Medicamentos");
                    frmMedicamento.setMaximum(true);
                    frmMedicamento.setClosable(true);
                    frmMedicamento.setVisible(true);
                    break;
                case ADMIN_CLIENTES:
                    Cliente cliente = new Cliente();
                    // agredando al desktopPane el formulario de administración de clientes
                    pane.add(cliente);
                    cliente.setMaximum(true);
                    cliente.setClosable(true);
                    cliente.setVisible(true);
                    break;
                case REGISTRAR_VENTA:
                    janpixfarma.RegistroVentas regventas = new janpixfarma.RegistroVentas();
                    // mostrando el ranking de venta por usuario
                    pane.add(regventas);
                    regventas.setTitle("Registrar Venta");                    
                    regventas.setMaximum(true);
                    regventas.setClosable(true);
                    regventas.setVisible(true);
                    break;
                case REPORTE_CAJA:
                    janpixfarma.ReporteCaja repcaja = new janpixfarma.ReporteCaja();
                    // agredando al desktopPane el reporte de caja
                    pane.add(repcaja);
                    repcaja.setMaximum(true);
                    repcaja.setClosable(true);
                    repcaja.setVisible(true);
                    break;
                case REPORTE_CLIENTES:
                    janpixfarma.ReporteCliente repcliente = new janpixfarma.ReporteCliente();
                    // agredando al desktopPane el reporte de clientes
                    pane.add(repcliente);
                    repcliente.setMaximum(true);
                    repcliente.setClosable(true);
                    repcliente.setVisible(true);
                    break;
                case REPORTE_COMPRAS:
                    janpixfarma.ReporteCompras repcompras = new janpixfarma.ReporteCompras();
                    // agredando al desktopPane el formulario de administración de medicamentos
                    pane.add(repcompras);
                    // maximizando el formulario de registro del usuario
                    repcompras.setMaximum(true);
                    repcompras.setClosable(true);
                    repcompras.setVisible(true);
                    break;
                case REPORTE_VENTA_USUARIO:
                    janpixfarma.reporVentas repventas = new janpixfarma.reporVentas();
                    // agredando al desktopPane el formulario de administración de medicamentos
                    pane.add(repventas);
                    // maximizando el formulario de registro del usuario
                    repventas.setMaximum(true);
                    repventas.setClosable(true);
                    repventas.setVisible(true);
                    break;
                case REPORTE_RANKING:
                    janpixfarma.rankVentas repranking = new janpixfarma.rankVentas();
                    // mostrando el ranking de venta por usuario
                    repranking.setVisible(true);
                    break;
                case CAMBIAR_USUARIO:
                    // Login de usuario
                    view.setVisible(false);
                    app.setAdmin(false);
                    janpixfarma.modules.application.controller.LoginController.Login();
                    break;
                case SALIR:
                    JOptionPane.showMessageDialog(null, "Hasta Pronto");
                    System.exit(1);
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
