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
public class RemoverProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String nome = request.getParameter("NomeProdutoRemove");
        String tipo = request.getParameter("TipoProdutoRemove");
        String volume = request.getParameter("VolumeProdutoRemove");

        String nomeDelete = new String("");
        String tipoDelete = new String("");
        String volumeDelete = new String("");

        Connection conexao = null;
        Statement stmt = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            int deletar = stmt.executeUpdate("delete from cadastro_produto "
                    + "where nomeProduto = '" + nome + "' and tipoProduto = '" + tipo + "' or volumeProduto = '" + volume + "'; ");

            if (deletar == 1) {
                out.println("<script>");
                out.println("alert('Produto(s) removido(s)')");
                out.println("</script>");
            } else {
                out.println("<script>");
                out.println("alert('O(s) Produto(s) não foram removido(s)')");
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
