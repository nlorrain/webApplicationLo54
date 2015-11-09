/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projetLo54Servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author java
 */
public class ServletInscription  extends HttpServlet
{

    public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException
    {
         String userId = request.getParameter("userId");	
	 String password = request.getParameter("password");
         //connection
	 if(true)
         {
		 request.getSession().setAttribute("user", userId);
                 response.sendRedirect("./Catalogue?MotsCle=");
               //  this.getServletContext().getRequestDispatcher( "/Wee" ).forward( request, response );

	}
         else
         {
           this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
         }
    }
}

