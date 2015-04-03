/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma;

/**
 *
 * @author mjch23
 */
//public class Medicamento {
/**
 * @param args the command line arguments
 */
//    public static void main(String[] args) {
// TODO code application logic here
//  }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Medicamento extends JFrame implements ActionListener {

    private final JMenuBar mb;
    private final JMenu menu1;
    private final JMenu menu2;
    private final JMenu menu3;
    private final JMenu menu4;
    private final JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9, mi10;

    private JButton Actualizar, Eliminar;
    private JTextField Campo;

    public static String tiposmedicamentos[] = new String[10];
    public static String presmedicamentos[] = new String[10];
    public static int tamTM;
    public static int tamPM;

    // Definición de matrices para la Carga de Medicamentos
    public static String NombreMed[] = new String[10];
    public static String Compuesto[] = new String[10];
    public static int Cantidad[] = new int[10];
    public static double PrecioUnit[] = new double[10];
    public static int DiaVenc[] = new int[10];
    public static int MesVenc[] = new int[10];
    public static int AnoVenc[] = new int[10];
    public static String TipoMed[] = new String[10];
    public static String PresMed[] = new String[10];
    public static int tamCM;
    public static int seleccion;
    public static int seleccion2;

    public static String NM, CM, TM, FM;
    public static int QM, DVM, MVM, AVM;
    public static double PM;

    public Medicamento() {

        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Tipos de Medicamentos");
        menu2 = new JMenu("Presentación del Medicamento");
        menu3 = new JMenu("Carga de Medicamento");
        menu4 = new JMenu("Volver al Menu Anterior");

        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);
        mb.add(menu4);

        mi1 = new JMenuItem("Registrar Tipo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Actualizar Tipo");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3 = new JMenuItem("Eliminar Tipo");
        mi3.addActionListener(this);
        menu1.add(mi3);

        mi4 = new JMenuItem("Registrar Presentación");
        mi4.addActionListener(this);
        menu2.add(mi4);
        mi5 = new JMenuItem("Actualizar Presentación");
        mi5.addActionListener(this);
        menu2.add(mi5);
        mi6 = new JMenuItem("Eliminar Presentación");
        mi6.addActionListener(this);
        menu2.add(mi6);

        mi7 = new JMenuItem("Registrar Medicamento");
        mi7.addActionListener(this);
        menu3.add(mi7);
        mi8 = new JMenuItem("Actualizar Medicamento");
        mi8.addActionListener(this);
        menu3.add(mi8);
        mi9 = new JMenuItem("Eliminar Medicamento");
        mi9.addActionListener(this);
        menu3.add(mi9);
        mi10 = new JMenuItem("Mostrar Lista de Medicamentos");
        mi10.addActionListener(this);
        menu3.add(mi10);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container f = this.getContentPane();

        if (e.getSource() == mi1) {

            for (tamTM = 0; tamTM < tiposmedicamentos.length; tamTM++) {

                if (tiposmedicamentos[tamTM] == null) {

                    String seleccion = JOptionPane.showInputDialog(null, "Registrar tipo", "Tipos de Medicamentos", JOptionPane.QUESTION_MESSAGE);
                    tiposmedicamentos[tamTM] = seleccion;
                    System.out.println(tiposmedicamentos[tamTM]);

                    int opcion;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar otro Tipo?", "Tipos de Medicamentos", JOptionPane.YES_NO_OPTION);

                    if (JOptionPane.OK_OPTION == opcion) {

                    } else {

                        tamTM = tiposmedicamentos.length;

                    }

                }

            }

        }

        ////////////////////////////////////////////////////////////
        if (e.getSource() == mi2) {

            final JList ActualizaTipo;
            ActualizaTipo = new JList(tiposmedicamentos);
            ActualizaTipo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(ActualizaTipo);

            JButton button = new JButton("Seleccionar");

            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    int indice = ActualizaTipo.getSelectedIndex();
                    String Actualiza = JOptionPane.showInputDialog("Tipos de Medicamentos", tiposmedicamentos[indice]);
                    tiposmedicamentos[indice] = Actualiza;
                    ;
                }
            });

            ventana.add(button);
            ventana.setVisible(true);

        }

        if (e.getSource() == mi3) {

            final JList EliminaTipo;
            EliminaTipo = new JList(tiposmedicamentos);
            EliminaTipo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(EliminaTipo);

            JButton button = new JButton("Eliminar");
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    int indice = EliminaTipo.getSelectedIndex();

                    tiposmedicamentos[indice] = null;
                    System.out.println("La posicion es " + indice); // FLAG

                    JOptionPane.showMessageDialog(null, "Ha eliminado el tipo seleccionado", "Eliminar Tipos", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            ventana.add(button);
            ventana.setVisible(true);
        }

        if (e.getSource() == mi4) {

            for (tamPM = 0; tamPM < presmedicamentos.length; tamPM++) {

                if (presmedicamentos[tamPM] == null) {

                    String seleccion = JOptionPane.showInputDialog(null, "Registrar Presentación", "Presentación de Medicamentos", JOptionPane.QUESTION_MESSAGE);
                    presmedicamentos[tamPM] = seleccion;
                    System.out.println(presmedicamentos[tamPM]);

                    int opcion;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar otra Presentación?", "Presentación de Medicamentos", JOptionPane.YES_NO_OPTION);

                    if (JOptionPane.OK_OPTION == opcion) {

                    } else {

                        tamPM = presmedicamentos.length;

                    }

                }

            }

        }

        if (e.getSource() == mi5) {

            final JList ActualizaPres;
            ActualizaPres = new JList(presmedicamentos);
            ActualizaPres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(ActualizaPres);

            JButton button = new JButton("Seleccionar");

            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    int indice = ActualizaPres.getSelectedIndex();
                    String Actualiza = JOptionPane.showInputDialog("Presentacion de Medicamentos", presmedicamentos[indice]);
                    presmedicamentos[indice] = Actualiza;
                    ;
                }
            });

            ventana.add(button);
            ventana.setVisible(true);

        }

        if (e.getSource() == mi6) {

            final JList EliminaPres;
            EliminaPres = new JList(presmedicamentos);
            EliminaPres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(EliminaPres);

            JButton button = new JButton("Eliminar");
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    int indice = EliminaPres.getSelectedIndex();

                    presmedicamentos[indice] = null;

                    JOptionPane.showMessageDialog(null, "Ha eliminado la presentación seleccionada", "Eliminar Presentación", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            ventana.add(button);
            ventana.setVisible(true);

        }

        if (e.getSource() == mi7) {

            final JTextField Nombre = new JTextField(20);
            final JTextField CompuestoMed = new JTextField(20);
            final JTextField Cant = new JTextField(5);
            final JTextField Precio = new JTextField(5);
            final JTextField VenceDia = new JTextField(2);
            JTextField VenceMes = new JTextField(2);
            JTextField VenceAno = new JTextField(2);

            //construyo los combos
            final JComboBox comboTipo = new JComboBox(tiposmedicamentos);
            final JComboBox comboPres = new JComboBox(presmedicamentos);

            final JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new GridLayout(10, 2));
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.add(new JLabel("Nombre:"));
            ventana.getContentPane().add(Nombre);
            ventana.add(new JLabel("Compuesto"));
            ventana.getContentPane().add(CompuestoMed);
            ventana.add(new JLabel("Cantidad"));
            ventana.getContentPane().add(Cant);
            ventana.add(new JLabel("Precio Unitario"));
            ventana.getContentPane().add(Precio);
            ventana.add(new JLabel("Día Vencimiento"));
            ventana.getContentPane().add(VenceDia);
            ventana.add(new JLabel("Mes Vencimiento"));
            ventana.getContentPane().add(VenceMes);
            ventana.add(new JLabel("Año Vencimiento"));
            ventana.getContentPane().add(VenceAno);
            ventana.add(new JLabel("Tipo de Medicamento"));
            ventana.getContentPane().add(comboTipo);
            ventana.add(new JLabel("Presentación Medicamento"));
            ventana.getContentPane().add(comboPres);

            ventana.setVisible(true);

            JButton button = new JButton("Agregar");
            ventana.add(button);
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

          //for (tamCM=0;tamCM<NombreMed.length;tamCM++){  
                    if (NombreMed[tamCM] == null) {

                        String NombreMedicamento = Nombre.getText();
                        String CompuestoMedicamento = CompuestoMed.getText();
                        String CantidadMedicamento = Cant.getText();
                        float CantidadMedicamentoQ = Float.parseFloat(CantidadMedicamento);
                        String PrecioMedicamento = Precio.getText();
                        float PrecioMedicamentoQ = Float.parseFloat(PrecioMedicamento);
                        String DiaVencMedicamento = VenceDia.getText();
                        float DiaVencMedicamentoQ = Float.parseFloat(DiaVencMedicamento);
                        String MesVencMedicamento = VenceDia.getText();
                        float MesVencMedicamentoQ = Float.parseFloat(MesVencMedicamento);
                        String AnoVencMedicamento = VenceDia.getText();
                        float AnoVencMedicamentoQ = Float.parseFloat(AnoVencMedicamento);
                        String TipoMedicamento = (String) comboTipo.getSelectedItem();
                        String PresMedicamento = (String) comboPres.getSelectedItem();

                        NombreMed[tamCM] = NombreMedicamento;
                        Compuesto[tamCM] = CompuestoMedicamento;
                        Cantidad[tamCM] = (int) CantidadMedicamentoQ;
                        PrecioUnit[tamCM] = PrecioMedicamentoQ;
                        DiaVenc[tamCM] = (int) DiaVencMedicamentoQ;
                        MesVenc[tamCM] = (int) MesVencMedicamentoQ;
                        AnoVenc[tamCM] = (int) AnoVencMedicamentoQ;
                        TipoMed[tamCM] = TipoMedicamento;
                        PresMed[tamCM] = PresMedicamento;

                    }

                    System.out.println(NombreMed[tamCM] + DiaVenc[tamCM] + TipoMed[tamCM] + PresMed[tamCM]); // FLAG

                    int opcion;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar otro Medicamento?", "Carga de Medicamentos", JOptionPane.YES_NO_OPTION);

                    if (JOptionPane.YES_OPTION == opcion) {

                    } else {

                        tamCM = tamCM + 1 - 1;
                        ventana.setVisible(false);

                    }

                    System.out.println(tamCM); // FLAG2

                    tamCM++;

            //} 
                }
            }); // Acá termina el Set Action del Boton

        }

        if (e.getSource() == mi8) {

            final JList ActualizaNom;

            ActualizaNom = new JList(NombreMed);

            ActualizaNom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(ActualizaNom);

            JButton button = new JButton("Seleccionar");

            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    final int indice = ActualizaNom.getSelectedIndex();

                //extraigo los valores a editar de los arrays
                    NM = NombreMed[indice];
                    CM = Compuesto[indice];
                    QM = Cantidad[indice];
                    PM = PrecioUnit[indice];
                    DVM = DiaVenc[indice];
                    MVM = MesVenc[indice];
                    AVM = AnoVenc[indice];
                    TM = TipoMed[indice];
                    FM = PresMed[indice];

                // convierto los valores numéricos a cadenas para poder llevarlos al formulario
                    String QMString = Integer.toString(QM);
                    String PMString = Double.toString(PM);
                    String DVMString = Integer.toString(DVM);
                    String MVMString = Integer.toString(MVM);
                    String AVMString = Integer.toString(AVM);

                 // llevo esos valores al formulario 
                    final JTextField Nombre = new JTextField(NM, 20);
                    final JTextField CompuestoMed = new JTextField(CM, 20);
                    final JTextField Cant = new JTextField(QMString, 5);
                    final JTextField Precio = new JTextField(PMString, 5);
                    final JTextField VenceDia = new JTextField(DVMString, 2);
                    JTextField VenceMes = new JTextField(MVMString, 2);
                    JTextField VenceAno = new JTextField(AVMString, 2);

                    //construyo los combos
                    final JComboBox comboTipo = new JComboBox(tiposmedicamentos);
                    final JComboBox comboPres = new JComboBox(presmedicamentos);

                // muestro el formulario
                    final JFrame ventana = new JFrame();
                    ventana.getContentPane().setLayout(new GridLayout(10, 2));
                    ventana.setSize(400, 400);
                    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ventana.add(new JLabel("Nombre:"));
                    ventana.getContentPane().add(Nombre);
                    ventana.add(new JLabel("Compuesto:"));
                    ventana.getContentPane().add(CompuestoMed);
                    ventana.add(new JLabel("Cantidad:"));
                    ventana.getContentPane().add(Cant);
                    ventana.add(new JLabel("Precio:"));
                    ventana.getContentPane().add(Precio);
                    ventana.add(new JLabel("Dia Vencimiento:"));
                    ventana.getContentPane().add(VenceDia);
                    ventana.add(new JLabel("Mes Vencimiento"));
                    ventana.getContentPane().add(VenceMes);
                    ventana.add(new JLabel("Año Vencimiento"));
                    ventana.getContentPane().add(VenceAno);
                    ventana.add(new JLabel("Tipo de Medicamento:"));
                    ventana.getContentPane().add(comboTipo);
                    ventana.add(new JLabel("Prsentación Medicamento:"));
                    ventana.getContentPane().add(comboPres);
                    ventana.setVisible(true);

                    JButton button = new JButton("Actualizar");
                    ventana.add(button);
                    button.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {

                            if (NombreMed[indice] != null) {

                                String NombreMedicamento = Nombre.getText();
                                String CompuestoMedicamento = CompuestoMed.getText();
                                String CantidadMedicamento = Cant.getText();
                                float CantidadMedicamentoQ = Float.parseFloat(CantidadMedicamento);
                                String PrecioMedicamento = Precio.getText();
                                float PrecioMedicamentoQ = Float.parseFloat(PrecioMedicamento);
                                String DiaVencMedicamento = VenceDia.getText();
                                float DiaVencMedicamentoQ = Float.parseFloat(DiaVencMedicamento);
                                String MesVencMedicamento = VenceDia.getText();
                                float MesVencMedicamentoQ = Float.parseFloat(MesVencMedicamento);
                                String AnoVencMedicamento = VenceDia.getText();
                                float AnoVencMedicamentoQ = Float.parseFloat(AnoVencMedicamento);
                                String TipoMedicamento = (String) comboTipo.getSelectedItem();
                                String PresMedicamento = (String) comboPres.getSelectedItem();

                                NombreMed[indice] = NombreMedicamento;
                                Compuesto[indice] = CompuestoMedicamento;
                                Cantidad[indice] = (int) CantidadMedicamentoQ;
                                PrecioUnit[indice] = PrecioMedicamentoQ;
                                DiaVenc[indice] = (int) DiaVencMedicamentoQ;
                                MesVenc[indice] = (int) MesVencMedicamentoQ;
                                AnoVenc[indice] = (int) AnoVencMedicamentoQ;
                                TipoMed[indice] = TipoMedicamento;
                                PresMed[indice] = PresMedicamento;

                            }

                            System.out.println(NombreMed[indice] + DiaVenc[indice] + TipoMed[indice] + PresMed[indice]); // FLAG

                            int opcion;
                            opcion = JOptionPane.showConfirmDialog(null, "Medicamento Actualizado", "Actualizar Medicamentos", JOptionPane.CLOSED_OPTION);

                            ventana.setVisible(false);

                        }
                    }); // Acá termina el Set Action del Boton

                }
            });

            ventana.add(button);
            ventana.setVisible(true);

        }  // Acá termina el if del mi8

        if (e.getSource() == mi9) {

            final JList EliminaMed;
            EliminaMed = new JList(NombreMed);

            EliminaMed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(EliminaMed);

            JButton button = new JButton("Eliminar");

            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    int indice = EliminaMed.getSelectedIndex();

                    NombreMed[indice] = null;
                    Compuesto[indice] = null;
                    Cantidad[indice] = 0;
                    PrecioUnit[indice] = 0;
                    DiaVenc[indice] = 0;
                    MesVenc[indice] = 0;
                    AnoVenc[indice] = 0;
                    TipoMed[indice] = null;
                    PresMed[indice] = null;

                    JOptionPane.showMessageDialog(null, "Ha eliminado el medicamento seleccionado", "Eliminar Medicamento", JOptionPane.INFORMATION_MESSAGE);

                }
            });

            ventana.add(button);
            ventana.setVisible(true);

        }

        if (e.getSource() == mi10) {

        // Muestro la lista haciendo varios JList. Los JList no se pueden cargar con Integer o Float
            // Entonces tengo que crear nuevos arrays con los mismos elementos pero convertidos a String
            int i, QM2, DVM2, MVM2, AVM2;
            double PM2;
            String MuestraCantidad[], MuestraPrecio[], MuestraDia[], MuestraMes[], MuestraAno[];
            MuestraCantidad = new String[NombreMed.length];
            MuestraPrecio = new String[NombreMed.length];
            MuestraDia = new String[NombreMed.length];
            MuestraMes = new String[NombreMed.length];
            MuestraAno = new String[NombreMed.length];

            for (i = 0; i < NombreMed.length; i++) {

        // tomo los datos de los arrays     
                QM2 = Cantidad[i];
                PM2 = PrecioUnit[i];
                DVM2 = DiaVenc[i];
                MVM2 = MesVenc[i];
                AVM2 = AnoVenc[i];

        // convierto los datos a String 
                String QM2String = Integer.toString(QM2);
                String PM2String = Double.toString(PM2);
                String DVM2String = Integer.toString(DVM2);
                String MVM2String = Integer.toString(MVM2);
                String AVM2String = Integer.toString(AVM2);

        // creo nuevos arrays con datos en String, para poder cargar las JList
                MuestraCantidad[i] = QM2String;
                MuestraPrecio[i] = PM2String;
                MuestraDia[i] = DVM2String;
                MuestraMes[i] = MVM2String;
                MuestraAno[i] = AVM2String;

            }

            JList Nombre, CompMed, TMed, PMed, QMed, PrMed, DMed, MMed, AMed;
            Nombre = new JList(NombreMed);
            CompMed = new JList(Compuesto);
            QMed = new JList(MuestraCantidad);
            PrMed = new JList(MuestraPrecio);
            DMed = new JList(MuestraDia);
            MMed = new JList(MuestraMes);
            AMed = new JList(MuestraAno);
            TMed = new JList(TipoMed);
            PMed = new JList(PresMed);

            JFrame ventana = new JFrame();
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.setSize(400, 400);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.getContentPane().add(Nombre);
            ventana.getContentPane().add(CompMed);
            ventana.getContentPane().add(QMed);
            ventana.getContentPane().add(PrMed);
            ventana.getContentPane().add(DMed);
            ventana.getContentPane().add(MMed);
            ventana.getContentPane().add(AMed);
            ventana.getContentPane().add(TMed);
            ventana.getContentPane().add(PMed);
            ventana.setVisible(true);

        }

    }

    public static void main(String[] ar) {
        Medicamento formulario1 = new Medicamento();
        formulario1.setBounds(10, 20, 800, 600);
        formulario1.setVisible(true);
    }
}
