<%@page import="java.sql.SQLException"%>
<%@page import="conexaoBanco.ConexaoFactory"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>

    </head>
    <body> 
        <%-- Tabela com a lista de todos os clientes --%>
        <table id="resultadoPesquisa"  border = 1>
            <tr>
                <th>Identificador</th>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>Endereço</th>
                <th>Complemento</th>
                <th>Telefone</th>
                <th>Email</th>
                <th>Senha</th>
            </tr>
            <%
                                Connection conexao = null;
                                Statement stmt = null;
                                ResultSet rs = null;

                                try {
                                    conexao = new ConexaoFactory().getConexaoFactory();
                                    conexao.setAutoCommit(false);
                                    stmt = conexao.createStatement();

                                    rs = stmt.executeQuery("select * from cadastro_cliente");

                                    out.println("<tr>");
                                    while (rs.next()) {
                                     
                                        out.println("<td>");
                                        out.println(rs.getInt("idCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("nomeCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("sobrenomeCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("enderecoCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("complementoEndereco"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("telefoneCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("emailCliente"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("senhaCliente"));
                                        out.println("</td>");
                                        out.println("</tr>");
                                    }
                                    conexao.commit();

                                } catch (SQLException ex1) {
                                    try {
                                        conexao.rollback();
                                    } catch (SQLException ex2) {

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

                                    }
                                }

            %> 
        </table>
    </body>
</html>