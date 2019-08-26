/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.LoginControl;
import Entity.User;
import View.LoginView;

/**
 *
 * @author chaml
 */
public class LoginMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        LoginView view = new LoginView(user);
        LoginControl control = new LoginControl(user, view);
    }
    
}
