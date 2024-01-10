/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package www.dajokaem.com.servlets;

import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Persistencia.Control;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_usuario", urlPatterns = {"/SV_usuario"})
public class SV_usuario extends HttpServlet {
    Control ctUsu = new Control();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> Usuarios = new ArrayList<>();
        Usuarios = ctUsu.traerUsuarios();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("Usuarios", Usuarios);
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dpi = request.getParameter("dpi"), nm = request.getParameter("nombre"), ape = request.getParameter("apellido"), tel = request.getParameter("telefono");
        System.out.println("DNI: " + dpi);
        System.out.println("Nombre: " + nm);
        System.out.println("Apellido: " + ape);
        System.out.println("telefono: " + tel);
        Usuario usu = new Usuario();
        usu.setDPI(dpi);
        usu.setApe(ape);
        usu.setNm(nm);
        usu.setTel(tel); 
        ctUsu.crear(usu);
        response.sendRedirect("index.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
