/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhtran.refreshcounter;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thanh Tran
 */
public class RefreshCounter extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       
        RequestDispatcher rd = request.getRequestDispatcher("HelloWorld.jsp");
        rd.forward(request, response);
            
    }
    
    
    
}
