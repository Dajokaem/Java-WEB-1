<%-- 
    Document   : editar
    Created on : 10/01/2024, 17:27:05
    Author     : jos56
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>
        <h1>Datos del Usuario</h1>
        <form action="SV_Editar" method="POST" align="center">
            <p><label>DPI: </label> <input type ="text" name="dpi" value="<%= usu.getDPI()%>"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= usu.getNm()%>"></p>
            <p><label>Apellido: </label><input type ="text" name="apellido" value="<%= usu.getApe()%>"></p>
            <p><label>Telefono: </label><input type="text" name="telefono" value="<%= usu.getTel()%>"></p>
            <button type ="submit">Enviar</button> 
        </form>
    </body>
</html>
