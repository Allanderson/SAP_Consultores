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

/**
 *
 * @author Allanderson Nunes
 */
public class LoginAdministrador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String email = request.getParameter("temailentrar");
        String senha = request.getParameter("tsenhaentrar");
        String emailLogado = new String("");
        String senhaLogada = new String("");
        String nomeAdm = new String("");

        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            rs = stmt.executeQuery("select * from cadastro_administrador "
                    + "where emailAdministrador = '" + email + "' and senhaAdministrador = '" + senha + "' ; ");

            while (rs.next()) {
                nomeAdm = rs.getString("nomeAdministrador");
                emailLogado = rs.getString("emailAdministrador");
                senhaLogada = rs.getString("senhaAdministrador");
            }
            if (emailLogado.equals(email) && senhaLogada.equals(senha)) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", nomeAdm);
                response.sendRedirect("administrador.jsp");
            } else {
                response.sendRedirect("paginaDeErro.jsp");
            }
            conexao.commit();

        } catch (SQLException e) {
            e.printStackTrace(out);

            try {
                conexao.rollback();
            } catch (SQLException e1) {
                System.out.println("erro encontrado no bd");
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
            } catch (Exception ex2) {
                System.out.println("sem jdbc");
            }
        }
    }
}
