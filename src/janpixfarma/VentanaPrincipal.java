/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma;

/**
 *
 * @author Cesar R
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null);//Coloca la ventana en el centro de la pantalla
        setResizable(false);//Desabilita la opcion "ampliar ventana"                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReporteCaja = new javax.swing.JButton();
        btnReporteClientes = new javax.swing.JButton();
        btnReporteCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA PRINCIPAL");

        btnReporteCaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporteCaja.setText("Reporte de Caja");
        btnReporteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCajaActionPerformed(evt);
            }
        });

        btnReporteClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporteClientes.setText("Reporte de Clientes");
        btnReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteClientesActionPerformed(evt);
            }
        });

        btnReporteCompras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporteCompras.setText("Reporte de Compras");
        btnReporteCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReporteCompras)
                    .addComponent(btnReporteCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnReporteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnReporteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnReporteCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCajaActionPerformed
        // TODO add your handling code here:
        
        ReporteCaja ventanaReporteCaja = new ReporteCaja();//Se crea una instancia de la clase ReporteCaja llamada ventanaReporteCaja
        ventanaReporteCaja.setVisible(true);//Se habilita la opcion visible del objeto creado
        dispose();//Oculta la ventana principal.
        
        
    }//GEN-LAST:event_btnReporteCajaActionPerformed

    private void btnReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteClientesActionPerformed
        // TODO add your handling code here:
        ReporteCliente ventanaReporteCliente = new ReporteCliente();//Se crea una instancia de la clase ReporteCliente llamada ventanaReporteCliente
        ventanaReporteCliente.setVisible(true);//Se habilita la opcion visible del objeto creado
        dispose();//Oculta la ventana principal.
        
        
    }//GEN-LAST:event_btnReporteClientesActionPerformed

    private void btnReporteComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteComprasActionPerformed
        // TODO add your handling code here:
        ReporteCompras ventanaReporteCompras = new ReporteCompras();//Se crea una instancia de la clase ReporteCompras llamada ventanaReporteCompras
        ventanaReporteCompras.setVisible(true);//Se habilita la opcion visible del objeto creado
        dispose();//Oculta la ventana principal.
        
    }//GEN-LAST:event_btnReporteComprasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteCaja;
    private javax.swing.JButton btnReporteClientes;
    private javax.swing.JButton btnReporteCompras;
    // End of variables declaration//GEN-END:variables
}
