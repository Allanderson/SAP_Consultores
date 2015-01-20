package servlet;

import conexaoBanco.ConexaoFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String email = request.getParameter("temailentrar");
        String senha = request.getParameter("tsenhaentrar");
        String nome = new String("");
        String emailLogado = new String("");
        String senhaLogada = new String("");

        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            rs = stmt.executeQuery("select * from cadastro_cliente "
                    + "where emailCliente = '" + email + "' and senhaCliente = '" + senha + "' ; ");

            while (rs.next()) {
                nome= rs.getString("nomeCliente");
                emailLogado = rs. getString("emailCliente");
                senhaLogada = rs.getString("senhaCliente");
            }

            if (emailLogado.equals(email) && senhaLogada.equals(senha)) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", nome);
                response.sendRedirect("cliente.jsp");
            } else {
                response.sendRedirect("paginaDeErro.jsp");
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
                if (rs != null) {
                    rs.close();
                }
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
