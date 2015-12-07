<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="resources/theme1/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Catalogue</title>
    </head>
    <body align="center">
        <h1>Catalogue</h1>

        <div align="center" style="margin:50px; border-color:  black;border-width: thick;"> 

            <form action="Catalogue" method="POST">
                <table>
                    <tr></tr>
                    <tr>
                        <td>
                            <div class="label">
                                <label>Keyword :</label>
                                <input name="keyword" type="text">
                            </div>
                        </td>
                        <td>
                            <div class="label">
                                <label>Start date :</label>
                                <input name="date" type="text"  placeholder="AAAA-MM-JJ">
                            </div>
                        <td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td>
                            <label class="label">Location: </label>
                            <div class="label">
                                <SELECT name="location">
                                    <c:forEach items="${listeCity}" var="city">
                                        <OPTION>${city}
                                        </c:forEach>
                                </SELECT>
                            </div>
                        </td>
                        <td align="center">
                            <button class="button" type="submit">Rechercher</button>
                        </td>
                    </tr>
                </table>
            </form>


            <table id="tblData" lign="center" style="text-align:center;">
                <thead align="center" style="text-align:center;">
                    <tr >
                        <th>Code course</th>
                        <th >Title course</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Location</th>
                        <th>Select</th>
                    </tr>
                </thead>
                <c:forEach items="${listeCourseSession}" var="courseSession">  
                    <tr>  
                        <td>${courseSession.id}</td> 
                        <td>${courseSession.courseCode.title}</td> 
                        <td>${courseSession.startDate}</td>   
                        <td>${courseSession.endDate}</td>   
                        <td>${courseSession.locationId.city}</td> 
                        <td>                            
                            <form action ="inscription">
                                <input type="hidden" name="cours" value = ${courseSession.id} </input>
                                <button class="button" type="submit">inscription</button>	
                            </form>
                        </td>
                    </tr>
                </c:forEach>    
            </table>
        </div>
    </body>
</html>

