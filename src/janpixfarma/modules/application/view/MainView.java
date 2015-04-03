/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.application.view;

import janpixfarma.modules.application.controller.MainController;
import javax.swing.JFrame;

/**
 *
 * @author clever
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public javax.swing.JMenuBar getMenu(){
        return Menu;
    }
    
    public javax.swing.JDesktopPane getMainPane(){
        return mainPane;
    }
    
    // definiendo controladores para los menus
    public void setController(MainController c) {
        RegistrarUsuario.addActionListener(c);
        ActualizarUsuario.addActionListener(c);
        EliminarUsuario.addActionListener(c);
        ReporteCaja.addActionListener(c);
        ReporteClientes.addActionListener(c);
        ReporteCompras.addActionListener(c);
        ReporteVentaUsuario.addActionListener(c);
        ReporteRankingVentas.addActionListener(c);
        CerrarSesion.addActionListener(c);
        AdministrarMedicamentos.addActionListener(c);
        AdministrarClientes.addActionListener(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        Usuarios = new javax.swing.JMenu();
        RegistrarUsuario = new javax.swing.JMenuItem();
        ActualizarUsuario = new javax.swing.JMenuItem();
        EliminarUsuario = new javax.swing.JMenuItem();
        Medicamentos = new javax.swing.JMenu();
        AdministrarMedicamentos = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        AdministrarClientes = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        ReporteCaja = new javax.swing.JMenuItem();
        ReporteClientes = new javax.swing.JMenuItem();
        ReporteCompras = new javax.swing.JMenuItem();
        ReporteVentaUsuario = new javax.swing.JMenuItem();
        ReporteRankingVentas = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        SalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JANPIXFARMA SISTEMA DE FARMACIA");

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        Usuarios.setText("Usuarios");

        RegistrarUsuario.setText("Registrar Usuario");
        RegistrarUsuario.setActionCommand("USUARIO_REGISTRAR");
        Usuarios.add(RegistrarUsuario);

        ActualizarUsuario.setText("Actualizar datos de usuario");
        ActualizarUsuario.setActionCommand("USUARIO_ACTUALIZAR");
        ActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarUsuarioActionPerformed(evt);
            }
        });
        Usuarios.add(ActualizarUsuario);

        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.setActionCommand("USUARIO_ELIMINAR");
        Usuarios.add(EliminarUsuario);

        Menu.add(Usuarios);

        Medicamentos.setText("Medicamentos");

        AdministrarMedicamentos.setText("Administrar Medicamentos");
        AdministrarMedicamentos.setActionCommand("ADMIN_MEDICAMENTOS");
        Medicamentos.add(AdministrarMedicamentos);

        Menu.add(Medicamentos);

        Clientes.setText("Clientes");

        AdministrarClientes.setText("Administrar Clientes y Ventas");
        AdministrarClientes.setActionCommand("ADMIN_CLIENTES");
        Clientes.add(AdministrarClientes);

        Menu.add(Clientes);

        Reportes.setText("Reportes");

        ReporteCaja.setText("Reporte caja");
        ReporteCaja.setActionCommand("REPORTE_CAJA");
        Reportes.add(ReporteCaja);

        ReporteClientes.setText("Reporte clientes");
        ReporteClientes.setActionCommand("REPORTE_CLIENTES");
        Reportes.add(ReporteClientes);

        ReporteCompras.setText("Reporte compras");
        ReporteCompras.setActionCommand("REPORTE_COMPRAS");
        Reportes.add(ReporteCompras);

        ReporteVentaUsuario.setText("Reporte venta de usuario");
        ReporteVentaUsuario.setActionCommand("REPORTE_VENTA_USUARIO");
        Reportes.add(ReporteVentaUsuario);

        ReporteRankingVentas.setText("Reporte ranking de ventas");
        ReporteRankingVentas.setActionCommand("REPORTE_RANKING");
        Reportes.add(ReporteRankingVentas);

        Menu.add(Reportes);

        Salir.setText("Salir");

        CerrarSesion.setText("Cambiar de Usuario");
        CerrarSesion.setActionCommand("CERRAR_SESION");
        Salir.add(CerrarSesion);

        SalirSistema.setText("Salir del Sistema");
        SalirSistema.setActionCommand("SALIR");
        Salir.add(SalirSistema);

        Menu.add(Salir);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActualizarUsuario;
    private javax.swing.JMenuItem AdministrarClientes;
    private javax.swing.JMenuItem AdministrarMedicamentos;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JMenu Medicamentos;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem RegistrarUsuario;
    private javax.swing.JMenuItem ReporteCaja;
    private javax.swing.JMenuItem ReporteClientes;
    private javax.swing.JMenuItem ReporteCompras;
    private javax.swing.JMenuItem ReporteRankingVentas;
    private javax.swing.JMenuItem ReporteVentaUsuario;
    private javax.swing.JMenu Reportes;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem SalirSistema;
    private javax.swing.JMenu Usuarios;
    private javax.swing.JDesktopPane mainPane;
    // End of variables declaration//GEN-END:variables
}
