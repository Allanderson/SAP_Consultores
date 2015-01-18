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

public class CadastrarProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("NomeProduto");
        String tipo = request.getParameter("TipoProduto");
        String volume = request.getParameter("VolumeProduto");
        String preco = request.getParameter("PrecoProduto");
        String quantidade = request.getParameter("QuantidadeProduto");

        Connection conexao = null;
        Statement stmt = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            int inserir = stmt.executeUpdate("insert into cadastro_produto (nomeProduto, tipoProduto, volumeProduto, precoProduto, quatidadeProduto)"
                    + "values ('" + nome + "', '" + tipo + "', '" + volume + "', '" + preco + "', '" + quantidade + "');  ");

            if (inserir == 1) {
                out.println("<script>");
                out.println("alert('Dados Enviados')");
                out.println("</script>");
            } else {
                out.println("<script>");
                out.println("alert('Os dados não foram enviados')");
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
