/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Cesar R
 */
public class ReporteCliente extends javax.swing.JFrame {

    /**
     * Creates new form ReporteCliente
     */
    
    /*
    Datos de usuario para hacer pruebas    
    */       
   static  String unombres = "Cesar"; //Guarda el nombre del usuario
   static  String uapellidos = "Rubinos";//Guarda en apellido del usuario
   static  String udni = "40067345"; //Guarda el DNI del usuario
   
   
   public static String clientes[][] = new String[20][4];  //Matriz donde guarda los datos del cliente                                           
   public static String ventas[][] = new String[20][7]; //Matriz donde se gurdan los datos de las ventas  
// public static String medicamentos[][] = new String[20][7]; //Matriz donde se guardan los datos de medicamento                                            
   DefaultTableModel modeloReporteCliente; //Se crea una tabla del modelo 
    
                            
    public ReporteCliente() {                                
        initComponents();

        setLocationRelativeTo(null);//Coloca la ventana en el centro de la pantalla
        setResizable(false);//Desabilita la opcion "ampliar ventana" 
        
        modeloReporteCliente = new DefaultTableModel();//Se instancia nuestro modelo de tabla
        modeloReporteCliente.addColumn("Medicamento");//Se crea la columna "Medicamento" en la tabla
        modeloReporteCliente.addColumn("Cantidad");//Se crea la columna "Cantidad" en la tabla
        modeloReporteCliente.addColumn("Monto Recaudado");//Se crea la columna "Monto Recaudado" en la tabla
        modeloReporteCliente.addColumn("Fecha");//Se crea la columna "Fecha" en la tabla
        this.libReporteCliente.setModel(modeloReporteCliente);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBonos = new javax.swing.JLabel();
        lblMontoBonos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libReporteCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese DNI: ");

        txtDNI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cliente: ");

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Usuario: ");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ptos Bonos: ");

        lblBonos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMontoBonos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Monto Bonos: ");

        libReporteCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(libReporteCliente);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total: ");

        btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("N.S.");

        lblMontoTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Ventana Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("N.S.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBonos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMontoBonos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBonos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMontoBonos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMontoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
       
        /*
     * Matriz para almacenar Ventas. Esta matriz es llenada en la operacion de venta y tiene la siguiente estructura:
     * 0: DNI 
     * 1: Medicamento 
     * 2: Cantidad 
     * 3: Fecha 
     * 4: Usuario 
     * 5: Monto Efectivo 
     * 6: Monto Bono
     */            
        
      ventas[1][0]="123456";
      ventas[1][1]="Voltaren";
      ventas[1][2]="10";
      ventas[1][3]="01/02/15";
      ventas[1][4]="Superusuario";
      ventas[1][5]="20";
      ventas[1][6]="5";
        
      ventas[3][0]="123456";
      ventas[3][1]="Apronax";
      ventas[3][2]="10";
      ventas[3][3]="01/02/15";
      ventas[3][4]="Superusuario";
      ventas[3][5]="10";
      ventas[3][6]="3";   
      
      ventas[5][0]="654321";
      ventas[5][1]="Humed";
      ventas[5][2]="1";
      ventas[5][3]="01/02/15";
      ventas[5][4]="Superusuario";
      ventas[5][5]="50";
      ventas[5][6]="3";    
        
            
        
    /*
     * Matriz para registrar datos de cliente. 
     * 0: DNI. 
     * 1: Apellidos. 
     * 2: Nombres. 
     * 3: Puntos bonus.
     */          
      clientes[1][0]="123456";
      clientes[1][1]="Juan ";
      clientes[1][2]="Perez";
      clientes[1][3]="10000";  
      
      clientes[2][0]="654321";
      clientes[2][1]="Ernerto";
      clientes[2][2]="Alcantara";
      clientes[2][3]="200"; 
      
                                                                
       
      String dni = txtDNI.getText();//Guarda el DNI que se digita en el cuadro de texto
      String pbono = null;//Guarda los puntos bonos   
      String datosCliente[] = new String[4];//Arreglo que guarda los datos del cliente para mostrarlos en la lista      
      double montoBonos;//Guarda el monto el equivalente de los bonos en efectivo
        
    /*
    Se realiza la busqueda en la matriz de ventas. Se busca coincidencias del "dni". Cuando encuentra coincidencias
    por cada cliente que coincida en su dni busca luego en la matriz de clientes. Busca y muestra en pantalla
      - Nombre y apellido del cliente
      - Bonos del cliente
    */
    for (int i = 0; i < ventas.length; i++) {
        if (ventas[i][0] != null && ventas[i][0].equalsIgnoreCase(dni)) {
            for (int j = 0; j < clientes.length; j++) {
                if (clientes[j][0] != null && clientes[j][0].equalsIgnoreCase(dni)) {
                   lblCliente.setText(clientes[j][1]+ " " +clientes[j][2]); //Muestra el nombre y apellido del cliente                       
                   lblBonos.setText(clientes[j][3]);//Muestra el bono del cliente    
                   pbono=clientes[j][3];//Guarda los puntos bonos
                    break;
                }
            }
            break;
        }
    }
       
    //Muestra en pantalla los datos del usuario y calcula el monto monetario de los bonos        
        lblUsuario.setText(unombres+" "+uapellidos);//Muestra los datos de usuario  
        montoBonos= ((Double.parseDouble(pbono)*50)/5000);//Calcula los puntos bonos en soles
        lblMontoBonos.setText(String.valueOf(montoBonos));//Muestra el valor monetario de los puntos bonos            
        double total = 0.0;
        
        
    /*    
    Realiza una busqueda del dni en la matriz venta para hallar:
      - Medicamento vendido
      - Cantidad de productos vendida
      - Fecha de la venta
      - Monto efectivo                   
    */           
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null && ventas[i][0].equalsIgnoreCase(dni)) {
                datosCliente[0] = ventas[i][1];//Medicamento vendido
                datosCliente[1] = ventas[i][2];//Cantidad vendida                
                datosCliente[3] = ventas[i][3];//Fecha de la venta
                datosCliente[2] = ventas[i][5];//Monto efectivo
                modeloReporteCliente.addRow(datosCliente); //Muestra la matriz de datos en la lista                                              
                total += Double.parseDouble(datosCliente[2]);//Calculoo del total vendido
                lblMontoTotal.setText(String.valueOf(total));//Se muestra en pantalla el total vendido
            }
        }                                                                               
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int cantidadFilas = modeloReporteCliente.getRowCount();//Borra la lista cuando se pulse el boton Borrar
        for(int i=cantidadFilas-1; i>=0; i--){
            modeloReporteCliente.removeRow(i);
        }
        lblMontoTotal.setText(" ");
        lblBonos.setText(" ");
        lblCliente.setText(" ");
        lblMontoBonos.setText(" ");
        lblUsuario.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);//Se habilita la opcion visible del objeto creado
        dispose();//Oculta la ventana principal.
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(ReporteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBonos;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMontoBonos;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable libReporteCliente;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
