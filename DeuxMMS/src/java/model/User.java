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
public class User {
    
    private String email = "";
    private String nameFirst = "";
    private String nameLast = "";
    private String phone = "";
    private String user = "";
    private char type = 'B';
    
    //constructor
    public User(){
        
    }
    
    public String getUserType(char type){
        this.type = type;
        
        if(this.type == 'A')
            this.user = "Administrator";
        else
            this.user = "Client";
        
        return user;
    }
}

