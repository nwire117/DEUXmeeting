/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jess
 */
public class AccountModel {
    
    private User user;
    private String confirm = "Your account has been successfully created.";
    private boolean status = false;
    
   //constructor
    public AccountModel(){
        
    }
    
    public String createAccount(User user){
        return confirm;
    }
    
    private boolean authenticateAccount(){
        return status;
    }
}
