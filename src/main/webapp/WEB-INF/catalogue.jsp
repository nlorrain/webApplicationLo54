<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/theme1/css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Catalogue</title>
</head>
<body>
    	<h1>Catalogue</h1>
        <br/><br/> 
        
        <form action="Catalogue", method="POST">
                         
            <div class="label">
                <label>Keyword :</label>
                <input name="keyword" type="text">
            </div> 
            
            <br>   
            
            <div class="label">
               <label>Start date :</label>
               <input name="date" type="text">
            </div>
            
            <br> 
            
            <div class="label">
                <label class="label">Location: </label>
                <SELECT name="location">
                        <c:forEach items="${listeCity}" var="city">
                            <OPTION>${city}
                        </c:forEach>
                </SELECT>
            </div>
            <br/><br/> 
          
            <button type="submit">Rechercher</button>		 
        </form>
    
       
        <br>

            
	<table id="tblData" border="1" style="text-align:center"> 
            <thead>
            <tr>
                <th>Code course  </th>
                <th>Title course  </th>
                <th>Start Date </th>
                <th>End Date</th>
                <th>Location </th>
                <th>Select</th>
            </tr>
            </thead>
	
            <tbody>                
                <c:forEach items="${listeCourseSession}" var="courseSession">  
                    <tr>  
                        <td>   
                            ${courseSession.id}
                        </td> 
                        <td>   
                            ${courseSession.courseCode.title}
                        </td> 
                        <td>   
                            ${courseSession.startDate}
                        </td>   
                        <td>   
                            ${courseSession.endDate}
                        </td>   
                        <td>   
                            ${courseSession.locationId.city}
                        </td> 
                        <td>                            
                            <form action ="inscription">
                                <input type="hidden" name="cours" value = ${courseSession.id} </input>
                                <button type="submit">inscription</button>	
                             </form>
                        </td>
                    </tr>
                </c:forEach>                            
            </tbody>
        </table>
      
</body>
</html> 


