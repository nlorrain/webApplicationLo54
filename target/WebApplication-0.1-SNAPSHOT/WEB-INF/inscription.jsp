<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connection</title>
    </head>
    <body>
         <form action="LoginServlet">
			 <h1>Connection</h1>
			 <p>Welcome, Please log on to continue
                             
                         <br/>  <br/>                             
                         <label>User Name :  </label>
			 <input type="text" name="userId" />
                         <br/> 
			 <label>Password : </label>
			 <input type="password" name="password" />
                         <br/> <br/>  
			 <button type="submit">Log-on</button>		 
		 </form>
    </body>
</html>
