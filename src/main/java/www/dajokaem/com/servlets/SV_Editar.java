/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package www.dajokaem.com.servlets;

import Logica.Usuario;
import Persistencia.Control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_Editar", urlPatterns = {"/SV_Editar"})
public class SV_Editar extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int ide = Integer.parseInt(request.getParameter("idEdi"));
        Usuario usu = ct.traeruno(ide);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuEditar", usu);
        response.sendRedirect("editar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dpi = request.getParameter("dpi"), nm = request.getParameter("nombre"), ape = request.getParameter("apellido"), tel = request.getParameter("telefono");
        Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
        usu.setDPI(dpi);
        usu.setApe(ape);
        usu.setNm(nm);
        usu.setTel(tel);
        ct.editar(usu);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
