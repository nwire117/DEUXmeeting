/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBHandler;

/**
 *
 * @author Jess
 */
public class LoginModel {
    DBHandler dbHandler = new DBHandler();
    
    private String cMessage = "Successful Login";
    private String uMessage = "Invalid Credentials";
    private User user = new User();
    private boolean confirm = false;
    
    //constructor
    public LoginModel(){
        
    }
    
    private boolean authenticateLogin(String email, String pass){
        confirm = dbHandler.authenticateUser(email, pass);
        return confirm;
    }
    
    public String loginUnsuccessful(){
        return this.uMessage;
    }
    
    public String confirmLogin(String email, String pass){
        String type;
        while(true){
            if(authenticateLogin(email, pass)){
                type = dbHandler.getUserType(email);
                break;
            }
            else{
                type = "INVALID";
            }
        }
        return type;
    }
}
