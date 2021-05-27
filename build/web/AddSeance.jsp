<%-- 
    Document   : AddSeance
    Created on : May 27, 2021, 12:29:20 PM
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
        <form method="post" action="./SeanceController">
            <input type="hidden" name="action" value="ajouter"/>
            date : <input type="date" name="date"/><br>
            
            Heure de debut<input type="text" name="heure_debut"/><br>
            duree : <input type="text" name="duree"/><br>
            
            type : <input type="text" name="type"/><br>
            
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
    </body>
</html>
