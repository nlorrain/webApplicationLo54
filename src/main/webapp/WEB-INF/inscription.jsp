<%-- 
    Document   : inscription
    Created on : 16 nov. 2015, 14:54:14
    Author     : java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="resources/theme1/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscription</h1>
        <br/><br/> 
        
        <form action="inscription" method="POST">
                         
            <div class="label">
                <label>Last Name:</label>
                <input name="lastName" type="text">
            </div> 
            
            <br>   
            
                                     
            <div class="label">
                <label>First Name:</label>
                <input name="firstName" type="text">
            </div> 
            
            <br>   

            <div class="label">
                <label>Address:</label>
                <input name="address" type="text">
            </div> 
            
            <br>   

            <div class="label">
                <label>Phone:</label>
                <input name="phone" type="text">
            </div> 
            
            <br>   
            
            <div class="label">
                <label>Email:</label>
                <input name="Email" type="text">
            </div> 
            
            <br>  
            <button type="submit">Inscrire</button>		 
        </form>
    </body>
</html>
