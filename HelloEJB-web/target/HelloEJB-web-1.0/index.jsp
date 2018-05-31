<%-- 
    Document   : index
    Created on : May 31, 2018, 4:03:24 PM
    Author     : evgeny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>EJB 3.1</title>
   </head>
   <body>
       <h3>Enterprise JavaBeans 3</h3>
          <p>${answer}</p>
          <form action="NewServlet" method="post">
              Введите имя : <input type="text" name="name" value=""/>
              <input type="submit" value="OK"/>
          </form>
   </body>
</html>
