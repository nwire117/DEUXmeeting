/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 *
 * @author Jess
 */
public class login extends HttpServlet {
    
    //LoginModel lm = new LoginModel();
    public login(){
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String _username = request.getParameter("username");
        String _password = request.getParameter("password");
        
        //String type = lm.confirmLogin(_username, _password);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if(_username != null && _password != null){
                response.sendRedirect("Admin-Dashboard.jsp");
                //if(type.equals("A")){
                //    response.sendRedirect("Admin-Dashboard.jsp");
               // }
                //else if(type.equals("C")){
                    //response.sendRedirect("User-Dashboard.jsp");
                }
                else
                    response.sendRedirect("index.jsp");
            }
            //else
                //out.println("Empty username or password field");

        //}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
