/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projetLo54Servlet.catalogue;


import fr.utbm.projectlo54.core.entity.CourseSession;
import fr.utbm.projectlo54.core.service.CourseSessionService;
import fr.utbm.projectlo54.core.service.LocationService;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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

    @Override
    public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException
    {
        
       //Get Location service
       LocationService locationService = new LocationService();
       List<String> listeCity = locationService.getCity();
       listeCity.add(0,"*");
       request.setAttribute("listeCity", listeCity);
       
        
       //Get Course Session service 
       CourseSessionService courseSession = new CourseSessionService();
       List<CourseSession> listCourse= courseSession.getCourseSession(0, 15);
       
       request.setAttribute("listeCourseSession", listCourse);
       
       this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( request, response );
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        //Get Location service
        LocationService locationService = new LocationService();
        List<String> listeCity = locationService.getCity();
        listeCity.add(0,"*");
        req.setAttribute("listeCity", listeCity);

       // Cretiria 
         String nomCourse = req.getParameter("keyword");	
	 String dateCourse = req.getParameter("date");
         String lieuxCourse = req.getParameter("location");
       
         if(lieuxCourse.equals("*")){
             lieuxCourse = null;
         }
         
                      
        CourseSessionService courseGet = new CourseSessionService();
        dateCourse = dateCourse;
        Date date = stringToDate(dateCourse);
        List<CourseSession> courseSessionByCrit = courseGet.getCourseByCriteria(nomCourse, date,lieuxCourse);
        
        req.setAttribute("listeCourseSession", courseSessionByCrit);
        
        this.getServletContext().getRequestDispatcher( "/WEB-INF/catalogue.jsp" ).forward( req, resp );

    }
    
    
    protected Date stringToDate(String dateS){
        Date date = null;

        if(!dateS.isEmpty()){
            
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
