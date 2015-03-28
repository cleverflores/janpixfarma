/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janpixfarma.model;

/**
 *
 * @author clever
 */
public class UserTable{
    User[] users;

    public UserTable(){
        users = null;
    }
    
    public UserTable(User u) {
        add(u);
    }
    
    public void add(User u){
        if(users==null){
            users = new User[1];
            users[0] = u;
        }else{
            int size = users.length;
            User[] temp = new User[size+1];
            System.arraycopy(users, 0, temp, 0, size);
            users = temp;
            users[size] = u;
        }        
    }
    
    public User get(int i){
        return users[i];
    }
    
    public int size(){
        return users.length;
    }
}