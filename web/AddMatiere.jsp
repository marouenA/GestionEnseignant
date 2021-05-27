<%-- 
    Document   : AddMatiere
    Created on : May 27, 2021, 12:21:38 PM
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
        <form method="post" action="./MatiereController">
            <input type="hidden" name="action" value="ajouter"/>
            libelle : <input type="text" name="libelle"/><br>
            charge : <br>
            Heure de cours<input type="text" name="cours"/><br>
            Heure de TP : <input type="text" name="td"/><br>
            Heure de TD : <input type="text" name="tp"/><br>
            
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
    </body>
</html>
