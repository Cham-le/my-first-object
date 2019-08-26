/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entity.User;
import java.util.Scanner;

/**
 *
 * @author chaml
 */
public class LoginView {
    User user;

    public LoginView(User user) {
        this.user = user;
    }
    public void showMessage(String smg){
        System.out.println(smg);
    }
    public void getUserInfo(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Username: ");
            user.setName(input.nextLine());
            System.out.print("Password: ");
            user.setPassword(input.nextLine());
//          wait();
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
