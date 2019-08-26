/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.User;
import View.LoginView;

/**
 *
 * @author chaml
 */
public class LoginControl {

    User user;
    LoginView view;

    public LoginControl(User user, LoginView view) {
        this.user = user;
        this.view = view;

        while (true) {
            view.getUserInfo();
            if (checkLogin()) {
                view.showMessage("success");
                break;
            } else {
                view.showMessage("wrong user or password");               
            }
        }
    }

    private boolean checkLogin() {
        if (user.getName().equals("sa") && user.getPassword().equals("admin")) {
            return true;
        }
        return false;
    }

}
