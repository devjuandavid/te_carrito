
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JUAN DAVID
 */
@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession ses =request.getSession();
       //SE ELIMINA LA SESION
       ses.invalidate();
       //REDIRECCIONA  A INDEX.JSP
       response.sendRedirect("index.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("producto");
        HttpSession ses =request.getSession();
        ArrayList<String> lista = (ArrayList<String>)ses.getAttribute("lista");
        
        lista.add(producto);
        response.sendRedirect("index.jsp");
    }

    
}
