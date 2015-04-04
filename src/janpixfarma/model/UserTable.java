/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.model;

import javax.swing.JOptionPane;

/**
 *
 * @author clever
 */
public final class UserTable {

    User[] users;

    public UserTable() {
        users = null;
    }

    public UserTable(User u) {
        users = null;
        add(u);
    }

    public void add(User u) {
        if (users == null) {
            // si tabla  usuarios está vacía se inicializa el array con tamaño 1
            users = new User[1];
            users[0] = u;
        } else {
            // calculando tamaño original del array
            int size = users.length;
            // creando array temporal con un índice mayor al array users en 1
            User[] temp = new User[size + 1];
            // copiando el array users a temp
            System.arraycopy(users, 0, temp, 0, size);
            // referenciando el array users a temp y expandiendo su tamaño
            users = temp;
            // asignando el valor del índice expandido
            users[size] = u;
        }
    }

    public void remove(String username) {
        if (username.equals("SUPERUSUARIO")) {
            JOptionPane.showMessageDialog(null, "No se puede borrar al super usuario");
        } else {
            // calculando tamaño original del array
            int size = users.length;
            if (size > 1) {
                // creando array temporal con un índice menor al array users en 1
                User[] temp = new User[size - 1];

                int k = 0;
                for (int i = 0; i < size; i++) {
                    if (!users[i].getUsername().equals(username)) {
                        temp[k] = users[i];
                        k++;
                    }
                }

                users = null;

                // referenciando el array users a temp y reduciendo su tamaño
                users = temp;
            }
        }
    }

    public int size() {
        return users.length;
    }

    public User getUser(int i) {
        return users[i];
    }

    public User[] getUsers() {
        return users;
    }

    public User getUserByUsername(String username) {
        for (int i = 0; i < size(); i++) {
            if (getUser(i).getUsername().equals(username)) {
                return getUser(i);
            }
        }
        return null;
    }
    
    public boolean findByUsername(String username) {
        for (int i = 0; i < size(); i++) {
            if (getUser(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean findByDni(String dni) {
        for (int i = 0; i < size(); i++) {
            if (getUser(i).getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
}
