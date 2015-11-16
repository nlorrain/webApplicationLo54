/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projetLo54Servlet.catalogue;

import fr.utbm.projectlo54.core.entity.Course;
import fr.utbm.projectlo54.core.entity.CourseSession;
import fr.utbm.projectlo54.core.service.CourseService;
import fr.utbm.projectlo54.core.service.CourseSessionService;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        CourseSessionService courseSession = new CourseSessionService();
       List<CourseSession> listCourse= courseSession.getCourseSession(0, 15);
       
       request.setAttribute("ListCourseSession", listCourse);
       
       this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( request, response );
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         String nomCourse = req.getParameter("keyword");	
	 String dateCourse = req.getParameter("data");
         String lieuxCourse = req.getParameter("location");
       
        CourseSessionService courseGet = new CourseSessionService();
         
        Date date = stringToDate(dateCourse);
                
        List<CourseSession> courseSessionByCrit = courseGet.getCourseByCriteria(nomCourse, date,lieuxCourse);
        
        req.setAttribute("ListCourseSession", courseSessionByCrit);
        
        this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( req, resp );

    }
    
    
    protected Date stringToDate(String dateS){
        Date date = null;
        
        if(dateS != null){
            
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String date1 = dateS;

            try {
              date = simpleDateFormat.parse(date1);
              System.out.println(date);
            } catch (ParseException e) {
              e.printStackTrace();
            }
            
        }
        
        return date;
    }
    
    
    
}
