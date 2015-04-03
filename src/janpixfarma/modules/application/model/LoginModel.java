/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.modules.application.model;

import janpixfarma.modules.application.BootStrap;

/**
 *
 * @author clever
 */
public class LoginModel {

    private final BootStrap app;

    public LoginModel() {
        app = BootStrap.getInstance();
    }

    public boolean Login(String username, String password) {
        for (int i = 0; i < app.getUsers().size(); i++) {
            if (app.getUsers().getUser(i).getUsername().equals(username) && app.getUsers().getUser(i).getPassword().equals(password)) {
                app.setUser(app.getUsers().getUser(i));
                if (app.getUsers().getUser(i).getRole().equals("admin")) {
                    app.setAdmin(true);
                }
                return true;
            }

        }
        return false;
    }
}