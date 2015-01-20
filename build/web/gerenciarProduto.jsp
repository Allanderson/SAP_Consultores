<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Gerenciar Produto</title>
		<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
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
                    <input type="submit" name="tSair" id="cSair" value="Sair"/>
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

            <%-- Formulário para cadastrar produtos --%>
            <div id="conteudoDosProdutos">
                <h2 id="cadastrarOuAtualizarProdutos">Cadastrar ou Atualizar Produtos</h2>
                <h3>Para Efetuar o Cadastro ou Atualização dos Seus Produtos Preencha Todos os Campos Abaixo</h3>

                <form id="cadastroProduto" method="post" action="CadastrarProduto">
                    <fieldset>
                        <legend>Cadastre Aqui Seus Produtos</legend>

                        <table id="cadastroProduto">
                            <tr>
                                <td>
								<label for="cNomeProduto">Nome do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="NomeProduto" id="cNomeProduto" size="30" maxlength="80"/>
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cTipoProduto">Tipo do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="TipoProduto" id="cTipoProduto" size="30" maxlength="50"/>
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cVolumeProduto">Volume do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="VolumeProduto" id="cVolumeProduto" size="30" maxlength="10" 
								placeholder="Ex: 10ml, 40g, 3kg" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cPrecoProduto">Preço do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="PrecoProduto" id="cPrecoProduto" size="30" maxlength="15" 
								placeholder="Ex: 18,75" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cQuantidadeProduto">Quantidade de Produtos:</label>
								</td>
								<td>
								<input type="number" class="gerenciarProduto" name="QuantidadeProduto" id="cQuantidadeProduto" min="1" max="9999" />
								</td>
                            </tr>
                        </table>    
                        <td><input type="submit" value =" Cadastrar Produto" id="cCadastrarProduto" /></td>                               
                        <td><input type="reset"  value = "Limpar Campos" id="cLimparCampo" /></td>                                

                    </fieldset>
                </form>

                <%-- Formulário para verificar estoque de produtos --%>
                <h2>Verificar Estoque</h2>
                <h3>Para Verificar o Estoque dos Produtos Preencha Todos os Campos Abaixo</h3>

                <form id="verificarEstoque" method="post" action="visualizarProdutos.jsp">
                    <fieldset>
                        <legend>Verifique Aqui o Estoque dos seus Produtos</legend>
                        
                        <table id="verificarProduto">
                            <tr>
                                <td>
								<label for="cNomeProdutoVerifica">Nome do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="NomeProdutoVerifica" id="cNomeProdutoVerifica" size="30" maxlength="80" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cTipoProdutoVerifica">Tipo do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="TipoProdutoVerifica" id="cTipoProdutoVerifica" size="30" maxlength="50" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cVolumeProdutoVerifica">Volume do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="VolumeProdutoVerifica" id="cVolumeProdutoVerifica" size="30" 
								maxlength="15" />
								</td>
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
                            <tr>
                                <td>Nome do produto</td>
                                <td>Tipo do produto</td>
                                <td>Volume do produto</td>
                                <td>Preço do Produto</td>
                                <td>Quantidade de produtos</td>
                            </tr>                                
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
                                <td>
								<label for="cNomeProdutoRemove">Nome do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="NomeProdutoRemove" id="cNomeProdutoRemove" size="30" maxlength="80" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cTipoProdutoRemove">Tipo do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="TipoProdutoRemove" id="cTipoProdutoRemove" size="30" maxlength="50" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cVolumeProdutoRemove">Volume do Produto:</label>
								</td>
								<td>
								<input type="text" class="gerenciarProduto" name="VolumeProdutoRemove" id="cVolumeProdutoRemove" size="30" 
								maxlength="15" />
								</td>
                            </tr>
                        </table>

                        <input type="submit" name="tRemover" id="cRemover" value="Remover"/>                          

                    </fieldset>
                </form>
            </div>

                <%-- Rodapé da página --%>
            <footer id="rodape">
                <br />
                Copyright &copy; 2014
            </footer>
            <br />

        </div>
    </body>
</html>