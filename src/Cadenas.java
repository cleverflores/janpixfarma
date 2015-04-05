   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clever
 */
class Cadenas {

    public static String Unir(String nom1, String nom2) {
        return nom1 + nom2;
    }

    public static void main(String[] args) {
        String nom1 = "Hola ";
        String nom2 = "Mundo";
        String saludo = Unir(nom1,nom2);
        System.out.println(saludo);
        System.out.println("saludo tiene longitud:"+saludo.length());
    }
}
