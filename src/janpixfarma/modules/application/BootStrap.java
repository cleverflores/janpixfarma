/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.application;

import janpixfarma.model.User;
import janpixfarma.model.UserTable;

/**
 *
 * @author clever
 */
public class BootStrap {

    private static BootStrap app = null;
    // Clases que gestionan los usuarios
    protected UserTable users;
    private User user;

    // Variable de control que verifica login
    private boolean login = false;

    // Variable de control que verifica si usuario es administrador
    private boolean admin = false;

    // Matriz de tipos de medicamentos
    public static String tiposmedicamentos[] = new String[20];

    // Matriz de presentación de medicamentos
    public static String presmedicamentos[] = new String[20];

    // Matrices para los medicamentos
    public static String NombreMed[] = new String[20];
    public static String Compuesto[] = new String[20];
    public static int Cantidad[] = new int[20];
    public static double PrecioUnit[] = new double[20];
    public static int DiaVenc[] = new int[20];
    public static int MesVenc[] = new int[20];
    public static int AnoVenc[] = new int[20];
    public static String TipoMed[] = new String[20];
    public static String PresMed[] = new String[20];

    /*
     * Constructor privado para control de una sola instancia
     */
    private BootStrap() {
    }

    public UserTable getUsers() {
        return users;
    }

    public void setUsers(UserTable users) {
        this.users = users;
    }

    /*
     * Método Singleton que controla una sola instanciación la clase y entrega el objeto
     * Inicialización de datos para acceso global en las clases
     */
    public static synchronized BootStrap getInstance() {
        if (app == null) {
            app = new BootStrap();
            // Agregando usuarios del sistema
            // UserTable es una clase que usa arrays primivitos, no se usa Collections
            app.users = new UserTable();
            app.users.add(new User("00000001", "SUPERUSUARIO", "SUPERUSUARIO", "Linus", "Tolvards", "admin"));
            app.users.add(new User("34578123", "pepito", "pepito", "Pepito", "Pérez", "user"));
            app.users.add(new User("10987895", "rosa", "rosa", "Rosa", "García", "user"));
            app.users.add(new User("09876344", "juanito", "juanito", "Juanito", "Martinez", "user"));

            // Agregando Tipos de medicamentos
            BootStrap.tiposmedicamentos[0] = "antipirético";
            BootStrap.tiposmedicamentos[1] = "antifúngico";
            BootStrap.tiposmedicamentos[2] = "analgésico";
            BootStrap.tiposmedicamentos[3] = "antibiótico";
            BootStrap.tiposmedicamentos[4] = "vacunas";
            BootStrap.tiposmedicamentos[5] = "antiséptico";
            BootStrap.tiposmedicamentos[6] = "antiinflamatorio";
            BootStrap.tiposmedicamentos[7] = "antihistáminico";
            BootStrap.tiposmedicamentos[8] = "anestésico";
            BootStrap.tiposmedicamentos[9] = "antidepresivo";
            BootStrap.tiposmedicamentos[10] = "diurético";
            BootStrap.tiposmedicamentos[11] = "laxante";
            BootStrap.tiposmedicamentos[12] = "broncodilatador";

            // Agregando Presentación de Medicamentos
            BootStrap.presmedicamentos[0] = "pastilla";
            BootStrap.presmedicamentos[1] = "cápsula";
            BootStrap.presmedicamentos[2] = "polvo";
            BootStrap.presmedicamentos[3] = "granulado";
            BootStrap.presmedicamentos[4] = "trocisco";
            BootStrap.presmedicamentos[5] = "preparados libreación prolongada";
            BootStrap.presmedicamentos[6] = "crema";
            BootStrap.presmedicamentos[7] = "emplasto";
            BootStrap.presmedicamentos[8] = "linimento";
            BootStrap.presmedicamentos[9] = "suspensión";
            BootStrap.presmedicamentos[10] = "solución";
            BootStrap.presmedicamentos[11] = "loción";
            BootStrap.presmedicamentos[12] = "inhalación";
            BootStrap.presmedicamentos[13] = "jarabe";
            BootStrap.presmedicamentos[14] = "ampolla";
            BootStrap.presmedicamentos[15] = "tintura";
            BootStrap.presmedicamentos[16] = "mucílago";

            // Carga de medicamentos
            BootStrap.NombreMed[0] = "dolocordalán";
            BootStrap.Compuesto[0] = "paracetamol 500mg";
            BootStrap.Cantidad[0] = 500;
            BootStrap.PrecioUnit[0] = 0.50;
            BootStrap.DiaVenc[0] = 15;
            BootStrap.MesVenc[0] = 3;
            BootStrap.AnoVenc[0] = 2016;
            BootStrap.TipoMed[0] = "analgésico";
            BootStrap.PresMed[0] = "pastilla";

            BootStrap.NombreMed[1] = "panadol";
            BootStrap.Compuesto[1] = "paracetamol 500mg";
            BootStrap.Cantidad[1] = 500;
            BootStrap.PrecioUnit[1] = 1.0;
            BootStrap.DiaVenc[1] = 12;
            BootStrap.MesVenc[1] = 12;
            BootStrap.AnoVenc[1] = 2016;
            BootStrap.TipoMed[1] = "analgésico";
            BootStrap.PresMed[1] = "pastilla";

        }
        return app;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
