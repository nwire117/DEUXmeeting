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
public class ComplaintModel {
    
    private User user;
    private String complaint = "";
    private int compNum = 0;
    private int printNum = 0;
    
    //constructor
    ComplaintModel(){
        
    }
    
    private String viewComplaint(){
        return complaint;
    }
    
    public int printComplaint(){
        return printNum;
    }
    
    public int closeComplaint(User user){
        return compNum;
    }
    
}
