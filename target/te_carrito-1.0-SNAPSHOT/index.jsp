<%@page import="java.util.ArrayList"%>
<%
    if (session.getAttribute("lista") == null){
     // Incializar la lista
    ArrayList<String> lis = new ArrayList<String>();
    session.setAttribute("lista", lis);
    }
    ArrayList<String> lista = (ArrayList<String>)session.getAttribute("lista");
%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>carrito de compras</h1>
        <p>Inserte los prdouctos  que desea </p>
        <form action="ProcesaServlet" method="post">
            Producto: <input type="text" name="producto">
            <input type="submit" value ="Enviar">
        </form>
        <br>
        <a href="ProcesaServlet">Vaciar el carrito <a/>
            <h3> contenido del carrito </h3>
            <ul>
                <%
                    if(lista !=null){
                    for(String item : lista){
                    out.print("<li>"+item+"</li>");
                    }
                    }
                %>
                
            </ul>
    </body>
</html>