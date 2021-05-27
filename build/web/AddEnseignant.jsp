<%-- 
    Document   : AddEnseignant
    Created on : May 25, 2021, 12:15:14 PM
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
         
        <form method="post" action="./EnseignantsController2">
            <input type="hidden" name="action" value="ajouter"/>
            cin : <input type="text" name="cin"/><br>
            nom : <input type="text" name="nom"/><br>
            prenom : <input type="text" name="prenom"/><br>
            adress : <input type="text" name="adress"/><br>
            email : <input type="text" name="email"/><br>
            phone : <input type="text" name="phone"/><br>
            login : <input type="text" name="login"/><br>
            password : <input type="password" name="password"/><br>
            
            <input type="submit" name="OK" value="OK"/>
            
        </form>
    </body>
</html>
