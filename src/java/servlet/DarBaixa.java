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

public class DarBaixa extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("NomeClienteBaixa");
        String sobrenome = request.getParameter("SobrenomeClienteBaixa");
        String email = request.getParameter("EmailClienteBaixa");
        String valor = request.getParameter("ValorPago");
        String data = request.getParameter("DataPagamento");

        Connection conexao = null;
        Statement stmt = null;

        try {
            conexao = new ConexaoFactory().getConexaoFactory();
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();

            int inserir = stmt.executeUpdate("insert into divida_cliente (nomeCliente, sobrenomeCliente, emailCliente, valorPago, dataVenda)"
                    + "values ('" + nome + "', '" + sobrenome + "', '" + email + "', '" + valor + "', '" + data + "');  ");

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
