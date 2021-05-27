<%-- 
    Document   : AddDepartement
    Created on : May 27, 2021, 11:39:48 AM
    Author     : marouen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <form method="post" action="./DepartementController">
            <input type="hidden" name="action" value="ajouter"/>
            libelle : <input type="text" name="lib"/><br>
           
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
    </body>
</html>
