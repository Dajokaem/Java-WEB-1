<%-- 
    Document   : mostrarUsuarios
    Created on : 8/01/2024, 20:46:37
    Author     : Dajokaem
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuarios</title>
    </head>
    <body>
        <h1>Usuarios</h1>
        <% 
            List<Usuario>Usuar = (List) request.getSession().getAttribute("Usuarios");
            int i = 0;
            for(Usuario usu : Usuar){
            i = i+1;
        %>
        <p><b>Usuario N°<%=i%></b><p>
        <p>Id: <%= usu.getId()%></p>
        <p>DPi: <%= usu.getDPI()%> </p>   
        <p>Nombre: <%= usu.getNm()%> </p>
        <p>Apellido: <%= usu.getApe()%> </p>
        <p>Telefono: <%= usu.getTel()%></p>
        <p>-------------------------------------</p>
        <% }%>
    </body>
</html>
