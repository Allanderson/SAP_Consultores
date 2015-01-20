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
public class VendaProdutos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("NomeCliente");
        String sobrenome = request.getParameter("SobrenomeCliente");
        String email = request.getParameter("EmailCliente");
        String nomeProduto = request.getParameter("NomeProdutoVendido");
        String tipoProduto = request.getParameter("TipoProdutoVendido");
        String volumeProduto = request.getParameter("VolumeProdutoVendido");
        int quantidadeProduto = Integer.parseInt(request.getParameter("QuantidadeProdutosVendidos"));
        double precoProduto = Double.parseDouble(request.getParameter("PrecoProdutoVendido"));
        String dataVenda = request.getParameter("DataVendaProduto");
        double resultado = quantidadeProduto * precoProduto;

        Connection conexao = null;
        Statement stmt = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            int inserir = stmt.executeUpdate("insert into venda_produtos (nomeCliente, sobrenomeCliente, emailCliente, nomeProduto, tipoProduto, "
                    + "volumeProduto, quantidadeItens, precoProduto, dataVenda, dividaTotal)"
                    + "values ('" + nome + "', '" + sobrenome + "', '" + email + "', '" + nomeProduto + "', '" + tipoProduto + "', '" + volumeProduto + "', "
                    + " '" + quantidadeProduto + "', '" + precoProduto + "', '" + dataVenda + "', '" + resultado + "');  ");

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
            try {
                conexao.rollback();
            } catch (SQLException ex2) {

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

            }
        }

    }

} 
