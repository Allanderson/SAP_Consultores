/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import conexaoBanco.ConexaoFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Allanderson Nunes
 */
public class RemoverClientes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String nome = request.getParameter("NomeClienteRemover");
        String sobrenome = request.getParameter("SobrenomeClienteRemover");
        String email = request.getParameter("EmailClienteRemover");

        Connection conexao = null;
        Statement stmt = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            int deletar = stmt.executeUpdate("delete from cadastro_cliente "
                    + "where nomeCliente= '" + nome + "' and sobrenomeCliente = '" + sobrenome + "' or emailCliente = '" + email + "'; ");

            if (deletar == 1) {
                out.println("<script>");
                out.println("alert('Cliente removido')");
                out.println("</script>");
            } else {
                out.println("<script>");
                out.println("alert('O Clientes não foi removido')");
                out.println("</script>");
            }

            conexao.commit();

        } catch (SQLException ex1) {
            ex1.printStackTrace();
            out.println(ex1);
            try {
                conexao.rollback();
            } catch (SQLException ex2) {
                ex2.printStackTrace();
                out.println(ex2);
            }
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println(e);
            }
        }

    }

}
