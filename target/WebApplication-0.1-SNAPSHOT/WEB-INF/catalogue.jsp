<%@page import="fr.utbm.projectlo54.core.entity.Course"%>
<%@page import="fr.utbm.projectlo54.core.repositoryHibernate.HibernateCourseRepository"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.List"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalogue</title>
</head>
<body>
    <form action="Catalogue">
			 <h1>Catalogue</h1>

                         <br/>  <br/>                             
                         <label>Mots clé : </label>
			 <input type="text" name="MotsCle" />
                         <br/> 

			 <button type="submit">Rechercher</button>		 
    </form>
    
		 <table>
			 <thead>
				 <tr>
					 <th>ID</th>
					 <th>Code</th>
					 <th>Title</th>
				 </tr>
			 </thead>
			 <tbody>
                          <%
                             HibernateCourseRepository  hibernateCourse = new HibernateCourseRepository();
                             List<Course> list = hibernateCourse.getByKeyword(request.getParameter("MotsCle"));
                                for (Course i : list)
                                {%>
                                 <tr>
					 <td><%=i.getId()%></td>
					 <td><%=i.getCode()%></td>
					 <td><%=i.getTitle()%></td>
				 </tr>
                                <%}%>
			 <tbody>
		 </table>
                          
</body>
</html> 