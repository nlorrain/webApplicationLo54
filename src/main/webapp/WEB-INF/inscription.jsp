
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="resources/theme1/css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center">
        <h1>Inscription</h1>
        <br/>
        <div align="center" style="margin:50px; border-color:  black;border-width: thick;"> 

            <form action="inscription" method="POST">
                <table>
                    <tr></tr>
                    <tr>
                        <td>
                            <div class="label">
                                <label>Last Name:</label>
                                <input name="lastName" type="text">
                            </div> 
                        </td>
                        <td>
                            <div class="label">
                                <label>First Name:</label>
                                <input name="firstName" type="text">
                            </div> 
                        <td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td>
                            <div class="label">
                                <label>Address:</label>
                                <input name="address" type="text">
                            </div> 
                        </td>
                        <td align="center">
                            <div class="label">
                                <label>Phone:</label>
                                <input name="phone" type="text">
                            </div> 
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td>
                            <div class="label">
                                <label>Email:</label>
                                <input name="email" type="text">
                            </div>
                        </td>
                        <td align="center">
                            <div class="label">
                                <button class="button" type="submit">Inscrire</button>	
                            </div> 
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
