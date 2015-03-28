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
    protected UserTable users; 
    private boolean login = false;
    private boolean admin = false;
    private User user;

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
            app.users = new UserTable();
            app.users.add(new User("00000001","SUPERUSUARIO", "SUPERUSUARIO","Linus", "Tolvards","admin"));
            app.users.add(new User("34578123","pepito", "pepito","Pepito","Pérez","user"));
            app.users.add(new User("10987895","rosa", "rosa","Rosa","García","user"));
            app.users.add(new User("09876344","juanito", "juanito","Juanito","Martinez","user"));
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
    
    public void setUser(User user){
        this.user = user;
    }
    
    public User getUser(){
        return user;
    }
}