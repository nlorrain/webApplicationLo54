/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projetLo54Servlet.login;

import fr.utbm.projectlo54.core.entity.Client;
import fr.utbm.projectlo54.core.entity.CourseSession;
import fr.utbm.projectlo54.core.service.ClientService;
import fr.utbm.projectlo54.core.service.CourseSessionService;
import fr.utbm.projectlo54.core.service.LocationService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author java
 */
public class ServletInscription  extends HttpServlet
{

    public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        
        String courseID = request.getParameter("cours");	
        
        session.setAttribute("CourseID", courseID);
        
         /*String password = request.getParameter("password");
         //connection
	 if(true)
         {
		 request.getSession().setAttribute("user", userId);
                 response.sendRedirect("./Catalogue?MotsCle=");
               //  this.getServletContext().getRequestDispatcher( "/Wee" ).forward( request, response );

	}
         else
         {*/
           this.getServletContext().getRequestDispatcher( "/WEB-INF/inscription.jsp" ).forward( request, response );
        
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        String addresse = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        int stringCourseSession = Integer.valueOf((String)session.getAttribute("CourseID"));
        
        /*
        
        Ajouter contrôl sur les données entrés
        
        
        */
        
        CourseSessionService courseSessionService = new CourseSessionService();
        
        CourseSession courseSession = courseSessionService.getCourseSessionById(stringCourseSession);
        
        ClientService clientService = new ClientService();
        Client c = new Client(lastName, firstName, addresse, phone, email, courseSession);
        
        clientService.registerClient(c);
        
         this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( req, resp );
    }
    
    
}

