/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projetLo54Servlet.catalogue;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author java
 */
public class ServletCatalogue extends HttpServlet
{

    public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException
    {
                    this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( request, response );
    } 
    
}
