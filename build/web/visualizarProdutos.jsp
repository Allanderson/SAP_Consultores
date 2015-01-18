<%@page import="java.sql.SQLException"%>
<%@page import="conexaoBanco.ConexaoFactory"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Gerenciar Produto</title>
        <link rel="stylesheet" type="text/css" href = "estilo/estiloGerenciarProduto.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
            }
        </style>

    </head>

    <body>
        <div id="corpo">
            
            <%-- Logo marca do sistema --%>
            <header id="cabecalho">
                <img src="imagens/libelula.jpg"/>
                <nav id="nomeLogo">
                    <h2>SAP</h2>
                    <h3> Consultores </h3>
                </nav>
            </header>

            <%-- Tabela de boas vindas ao administrador --%>
            <header id="boasVindas">
                <table>
                <tr>
                    <td id="bemVindo">
                        Olá&nbsp;  
                    </td>
                    <td id="nomeCliente">
                        <%= session.getAttribute("usuario") %>
                    </td>
                </tr>
            </table>           
            </header>

                        <%-- Botão sair do sistema --%>
            <header id="botaoSair">
                <form id="sair" action="Logoff" method="post">
                    <input type="image" src="imagens/sair1.jpg" name="tSair" id="cSair"  />
                </form>
            </header>

            <%-- Área do menu do administrador --%>
            <nav id="inicio">
                <ul>
                    <li class="itemmenu">
                        <a href="administrador.jsp"><strong>Início</strong></a>
                    </li>
                </ul>
            </nav>
            <nav id="gerenciarProduto">                	
                <ul>
                    <li class="itemmenu">
                        <a href="gerenciarProduto.jsp"><strong>Gerenciar Produto</strong></a>                    
                    </li>
                </ul>
            </nav>

            <nav id="gerenciarCliente">      
                <ul>
                    <li class="itemmenu">
                        <a href="gerenciarCliente.jsp"><strong>Gerenciar Cliente</strong></a>                 
                    </li>
                </ul>
            </nav>

            <nav id="gerenciarVenda">
                <ul>
                    <li class="itemmenu">
                        <a href="gerenciarVenda.jsp"><strong>Gerenciar Venda</strong></a>                    
                    </li>
                </ul>        
            </nav>

            <%-- Formulário para realizar o cadastro de produtos --%>
            <div id="conteudoDosProdutos">
                <h2 id="cadastrarOuAtualizarProdutos">Cadastrar ou Atualizar Produtos</h2>
                <h3>Para Efetuar o Cadastro ou Atualização dos Seus Produtos Preencha Todos os Campos Abaixo</h3>

                <form id="cadastroProduto" method="post" action="CadastrarProduto">
                    <fieldset>
                        <legend>Cadastre Aqui Seus Produtos</legend>

                        <table id="cadastroProduto">
                            <tr>
                                <td><label for="cNomeProduto">Nome do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="NomeProduto" id="cNomeProduto" size="30" maxlength="80"/></td>
                            </tr>
                            <tr>
                                <td><label for="cTipoProduto">Tipo do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="TipoProduto" id="cTipoProduto" size="30" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td><label for="cVolumeProduto">Volume do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="VolumeProduto" id="cVolumeProduto" size="30" maxlength="10" placeholder="Ex: 10ml, 40g, 3kg" /></td>
                            </tr>
                            <tr>
                                <td><label for="cPrecoProduto">Preço do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="PrecoProduto" id="cPrecoProduto" size="30" maxlength="15" placeholder="Ex: 18,75" /></td>
                            </tr>
                            <tr>
                                <td><label for="cQuantidadeProduto">Quantidade de Produtos:</label></td><td><input type="number" class="gerenciarProduto" name="QuantidadeProduto" id="cQuantidadeProduto" min="1" max="9999" /></td>
                            </tr>
                        </table>    
                        <td><input type="submit" value =" Cadastrar Produto" id="cCadastrarProduto" /></td>                               
                        <td><input type="reset"  value = "Restaurar Campos" id="cLimparCampo" /></td>                                

                    </fieldset>
                </form>

                <%-- Formulário para verificar o estoque de produtos --%>
                <h2>Verificar Estoque</h2>
                <h3>Para Verificar o Estoque de Um Produto Preencha Todos os Campos Abaixo</h3>

                <form id="verificarEstoque">
                    <fieldset>
                        <legend>Verifique Aqui o estoque do Produto</legend>

                        <table id="verificarEstoque">
                            <tr>
                                <td><label for="cNomeProdutoEstoque">Nome do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tNomeProdutoEstoque" id="cNomeProdutoEstoque" size="30" maxlength="80"/></td>
                            </tr>
                            <tr>
                                <td><label for="cTipoProdutoEstoque">Tipo do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tTipoProdutoEstoque" id="cTipoProdutoEstoque" size="30" maxlength="50" /></td>
                            </tr>
                            <tr>
                                <td><label for="cVolumeProdutoEstoque">Volume do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tVolumeProdutoEstoque" id="cVolumeProdutoEstoque" size="30" maxlength="15"/></td>
                            </tr>                             
                        </table>

                        <input type="submit" name="tPesquisar" id="cPesquisar" value="Pesquisar"/>

                        <table id="resultadoPesquisa">
                            <tr>
                                <th>Nome</th>
                                <th>Tipo</th>
                                <th>Volume</th>
                                <th>Preço</th>
                                <th>Quantidade</th>
                            </tr>
                            <%
                                Connection conexao = null;
                                Statement stmt = null;
                                ResultSet rs = null;

                                try {
                                    conexao = new ConexaoFactory().getConexaoFactory();
                                    conexao.setAutoCommit(false);
                                    stmt = conexao.createStatement();

                                    rs = stmt.executeQuery("select * from cadastro_produto");

                                    out.println("<tr>");
                                    while (rs.next()) {
                                        out.println("<td>");
                                        out.println(rs.getString("nomeProduto"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("tipoProduto"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("volumeProduto"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("precoProduto"));
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(rs.getString("quatidadeProduto"));
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

                    </fieldset>
                </form>

                            <%-- Formulário para remover produtos --%>
                <h2>Remover Produto</h2>
                <h3>Para Remover Um Produto Preencha Todos os Campos Abaixo</h3>

                <form id="removerProduto" method="post" action="RemoverProduto">
                    <fieldset>
                        <legend>Remova Aqui Seus Produtos</legend>
                        <table id="removerProduto">
                            <tr>
                                <td><label for="cNomeProdutoRemove">Nome do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tNomeProdutoRemove" id="cNomeProdutoRemove" size="30" maxlength="80" /></td>
                            </tr>
                            <tr>
                                <td><label for="cTipoProdutoRemove">Tipo do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tTipoProdutoRemove" id="cTipoProdutoRemove" size="30" maxlength="50" /></td>
                            </tr>
                            <tr>
                                <td><label for="cVolumeProdutoRemove">Volume do Produto:</label></td><td><input type="text" class="gerenciarProduto" name="tVolumeProdutoRemove" id="cVolumeProdutoRemove" size="30" maxlength="15" /></td>
                            </tr>
                        </table>

                        <input type="submit" name="tRemover" id="cRemover" value="Remover"/>                          

                    </fieldset>
                </form>
            </div>

            <%-- Rodapé da página --%>
            <footer id="rodape">
                <br />
                Copyright &copy; 2014 - by Allanderson, Aziclévio e João Paulo<br />
                Atualizado em 20 de Agosto de 2014
            </footer>
            <br />

        </div>
    </body>
</html>