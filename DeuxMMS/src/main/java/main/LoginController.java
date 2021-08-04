/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jess
 */
public class LoginController {
    
    private String cMessage = "Successful Login";
    private String uMessage = "Invalid Credentials";
    User user = new User();
    private boolean confirm = false;
    
    //constructor
    public LoginController(){
        
    }
    
    private boolean authenticateLogin(User user){
        this.user = user;
        return confirm;
    }
    
    public String loginUnsuccessful(){
        return this.uMessage;
    }
    
    public String confirmLogin(){
        return this.cMessage;
    }
}
