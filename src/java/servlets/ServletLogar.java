/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.UsuarioDAO;
import java.io.IOException;
import javaBeans.Usuario;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Allanderson Nunes
 */
public class ServletLogar extends HttpServlet {

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

        String login = request.getParameter("tLogin");
        String senha = request.getParameter("tSenha");
        RequestDispatcher rd = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarios = usuarioDAO.getUsuario(login, senha);

        if (usuarios != null && usuarios.getNivel() == 2) {
            HttpSession session = request.getSession();
            session.setAttribute("nome", usuarios.getNome());
            rd = request.getRequestDispatcher("/consultor.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("mensagemErro", "Usuario ou Senha Inválidos");
            rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }
}
