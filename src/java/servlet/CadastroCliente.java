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

public class CadastroCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String endereco = request.getParameter("endereco");
        String complemento = request.getParameter("complemento");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String senha = request.getParameter("confirmarsenha");

        Connection conexao = null;
        Statement stmt = null;

        try {
            
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            int inserir = stmt.executeUpdate("insert into cadastro_cliente(nomeCliente, sobrenomeCliente, enderecoCliente, complementoEndereco,"
                    + "telefoneCliente, emailCliente, senhaCliente)"
                    + "values ('" + nome + "', '" + sobrenome + "', '" + endereco + "', '" + complemento + "', '" + telefone + "', '" + email + "', '" + senha + "');");

            if (inserir == 1) {
                response.sendRedirect("confirmacao.jsp");
            } else {
                response.sendRedirect("paginaDeErro.jsp");
            }

            conexao.commit();
        } catch (SQLException ex1) {
            try {
                conexao.rollback();
            } catch (SQLException ex2) {
                ex2.printStackTrace();
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
            }

        }

    }
}
