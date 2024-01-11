<%-- 
    Document   : index
    Created on : 8/01/2024, 20:16:09
    Author     : dajokaem/Jose Armando Lopez Cruz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center">
        <h1>Datos del Usuario</h1>
        <form action="SV_usuario" method="POST" align="center">
            <p><label>DPI: </label> <input type ="text" name="dpi"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type ="text" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type ="submit">Enviar</button> 
        </form> 
        <h1> Ver lista de usuarios </h1>
        <p>Para ver los datos de los usuarios cargados haga click en el siguiente boton</p>
        <form action="SV_usuario" method="GET">
            <button type="submit"> Mostrar Usuarios </button>
        </form>
        <h1> Eleminar Usuario</h1>
        <p>Ingrese la Id del usuario que quiere eliminar</p>
        <form action="SV_Eliminar" method="POST">
            <p>Id: <input type="text" name="idUsu"></p>
            <button type="submit"> Eliminar Usuario </button>
        </form>        
        <h1> Editar Usuario</h1>
        <p>Ingrese la Id del usuario que quiere editar</p>
        <form action="SV_Editar" method="GET">
            <p>Id: <input type="text" name="idEdi"></p>
            <button type="submit"> Editar Usuario </button>
        </form>  
    </body>
</html>
