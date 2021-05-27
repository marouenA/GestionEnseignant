<%-- 
    Document   : addNiveau
    Created on : 27 mai 2021, 10:06:23
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  <body>
        <h1>Ajouter Niveau</h1>
        
        <form method="post" action="./NiveauController1">
            <input type="hidden" name="action" value="ajouter"/>
            libelle : <input type="text" name="libelle"/><br>
            
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
            
    </body>
</html>
