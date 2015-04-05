import javax.swing.JOptionPane;

import java.util.Arrays;

import java.util.Comparator;

public class Notas {

    public static void main(String[] args) {

    

        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas alumnos ingresara?","Sistema",JOptionPane.QUESTION_MESSAGE));

        

        String lista[][] = new String[n][2];

        

        for(int i=0;i<n;i++){

            JOptionPane.showMessageDialog(null, "Alumno ["+(i+1)+"]");

            lista[i][0]= JOptionPane.showInputDialog(null, "Ingrese Nombre ["+(i+1)+"]","Sistema",JOptionPane.QUESTION_MESSAGE);

            lista[i][1]= JOptionPane.showInputDialog(null, "Ingrese Nota de Alumno ["+(i+1)+"]","Sistema",JOptionPane.QUESTION_MESSAGE);

        }

        

        String conc="Lista de Alumnos y sus Notas\n"

                + "-------------------------------------\n\n";

        for(int i=0;i<n;i++){            

            String result="";

            result="["+(i+1)+"] --> "+ lista[i][0]+" --->["+lista[i][1]+"]\n";

            conc=conc+result;

        } 

        

        JOptionPane.showMessageDialog(null, conc, "Sistema", JOptionPane.INFORMATION_MESSAGE);

        

        Arrays.sort(lista, new Comparator<String[]>() {

            

            public int compare(String[] entry1, String[] entry2) {

                final String nota1 = entry1[1];

                final String nota2 = entry2[1];

                return -nota1.compareTo(nota2);

            }

        });

        

        conc="Lista de Alumnos y sus Notas en Orden de Mérito\n"

                + "-------------------------------------\n\n";

        for(int i=0;i<n;i++){            

            String result="";

            result="["+(i+1)+"] --> "+ lista[i][0]+" --->["+lista[i][1]+"]\n";

            conc=conc+result;

        } 

        

        JOptionPane.showMessageDialog(null, conc, "Sistema", JOptionPane.INFORMATION_MESSAGE);

        

        Arrays.sort(lista, new Comparator<String[]>() {

            

            public int compare(String[] entry1, String[] entry2) {

                final String nombre1 = entry1[0];

                final String nombre2 = entry2[0];

                return nombre1.substring(0,1).compareTo(nombre2.substring(0,1));

            }

        });

        

        conc="Lista de Alumnos Aprobados en Orden Alfabético\n"

                + "-------------------------------------\n\n";

        for(int i=0;i<n;i++){

            if(Double.parseDouble(lista[i][1])>=10.5){

                String result="";

                result="["+(i+1)+"] --> "+ lista[i][0]+" --->["+lista[i][1]+"]\n";

                conc=conc+result;

            }

            

        } 

        

        JOptionPane.showMessageDialog(null, conc, "Sistema", JOptionPane.INFORMATION_MESSAGE);

    }

}

