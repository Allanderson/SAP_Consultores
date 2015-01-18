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
public class AtualizarDadosCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String identificador = request.getParameter("NomeCliente");
        String endereco = request.getParameter("EnderecoCliente");
        String complemento = request.getParameter("ComplementoCliente");
        String telefone = request.getParameter("TelefoneCliente");
        String email = request.getParameter("EmailCliente");

        Connection conexao = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        Statement stmt3 = null;
        Statement stmt4 = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt1 = conexao.createStatement();
            stmt2 = conexao.createStatement();
            stmt3 = conexao.createStatement();
            stmt4 = conexao.createStatement();
            
            int atualizar = stmt1.executeUpdate("update cadastro_cliente "
                    + "set enderecoCliente = '" + endereco + "' "
                    + "where idCliente = '" + identificador + "'; ");
            
            int atualizar2 = stmt2.executeUpdate("update cadastro_cliente "
                    + "set complementoEndereco = '" + complemento + "' "
                    + "where idCliente = '" + identificador + "'; ");
            
            int atualizar3 = stmt3.executeUpdate("update cadastro_cliente "
                    + "set telefoneCliente = '" + telefone + "' "
                    + "where idCliente = '" + identificador + "'; ");
            
            int atualizar4 = stmt4.executeUpdate("update cadastro_cliente "
                    + "set emailCliente = '" + email + "' "
                    + "where idCliente = '" + identificador + "'; ");

            if (atualizar == 1 && atualizar2 == 1 && atualizar3 == 1 && atualizar4 == 1) {
                out.println("<script>");
                out.println("alert('Dados atualizados')");
                out.println("</script>");
            } else {
                out.println("<script>");
                out.println("alert('Os dados não foram atualizados, tente novamente')");
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
                if (stmt1 != null && stmt2 != null && stmt3 != null && stmt4 != null) {
                    stmt1.close();
                    stmt2.close();
                    stmt3.close();
                    stmt4.close();
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
