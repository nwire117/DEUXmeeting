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
public class RoomModel {
    
    private User user;
    private String confirm = "";
    private boolean status = false;
    
    //constructor
    public RoomModel(){
        
    }
    
    public String createNewRoom(User user){
        this.user = user;
        return confirm;
    }
    
    private boolean authenticateRoom(){
        return status;
    }
    
    public String editRoom(){
        return confirm;
    }
}
