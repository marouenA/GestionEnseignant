<%-- 
    Document   : AddGrade
    Created on : May 27, 2021, 12:08:36 PM
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
        <form method="post" action="./GradeController">
            <input type="hidden" name="action" value="ajouter"/>
            libelle : <input type="text" name="libelle"/><br>
            Prix : <br>
            Heure de cours<input type="text" name="prix_H_cours"/><br>
            Heure de TP : <input type="text" name="prix_H_td"/><br>
            Heure de TD : <input type="text" name="prix_H_tp"/><br>
            
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
    </body>
</html>
