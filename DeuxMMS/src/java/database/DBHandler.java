/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
/**
 *
 * @author Jess
 */
public class DBHandler {
    
    private static final String DB_URL = "jdbc:derby:DeuxMMSDB;create=true";
    private static Connection conn = null;
    
    public DBHandler(){
        createConnection();
    }

    private void createConnection() {
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_URL);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
