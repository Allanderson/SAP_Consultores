<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Gerenciar Cliente</title>
		<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
        <link rel="stylesheet" type="text/css" href = "estilo/estiloGerenciarCliente.css"/>
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

            <%--Área do menu do administrador --%>
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

            <%-- Apresentação de uma lista com todos os clientes --%>
            <div id="conteudoDosClientes">
                <h2 id="listarTodosOsClientes">Listar Todos os Clientes</h2>
                <h3>Ao Clicar em <u>"Listar Cliente"</u> Será Exibida Uma<br/>&emsp;Lista Com Todos os Seus Clientes</h3>

                <form id="listarClientes" method="post" >
                    <input type="submit" name="tListarClientes" id="cListarClientes" value="Listar Clientes" />
                    <%--<input type="image" src="imagens/listarClientes.jpg" name="tListarClientes" id="cListarClientes"/> --%>


                    <iframe src="tabelaComClientes.jsp" name="janela" id="frame-listarClientes"></iframe>
                </form>

                <%-- Formulário para remover clientes --%>
                <h2 id="removerCliente">Remover Cliente</h2>
                <form id="removerCliente" method="post" action="RemoverClientes">
                    <fieldset>
                        <legend>Remova Aqui Seus Clientes</legend>
                        <table id="removerCliente">
                            <tr>
                                <td>
								<label for="cNomeClienteRemove">Nome do Cliente:</label>
								</td>
								<td>
								<input type="text" class="gerenciarCliente" name="NomeClienteRemover" id="cNomeClienteRemove" size="30" maxlength="80" placeholder="Nome Completo"/>
								</td>
                            </tr>

                            <tr>
                                <td>
								<label for="cEmailClienteRemove">Email do Cliente:</label>
								</td>
								<td>
								<input type="email" class="gerenciarCliente" name="EmailClienteRemover" id="cEmailClienteRemove" size="30" maxlength="80" />
								</td>
                            </tr>
                        </table>

                        <input type="submit" name="tRemover" id="cRemover" value="Remover"/>



                    </fieldset>
                </form>

                <%--  Formulário para atualizar os dados do cadastro dos clientes --%>
                <h2>Atualizar Cadastro do Cliente</h2>
                <h3>Preencha os Campos Que Deseja Alterar No Cadastro Do Cliente</h3>
                <form id="atualizarCadastroCliente" method="post" action="AtualizarDadosCliente">
                    <fieldset>
                        <legend>Atualize o Cadastro do Seu Cliente</legend>
                        <table id="atualizarCadastroCliente">
                            <tr>
                                <td>
								<label for="cNomeCliente">Identificador:</label>
								</td>
								<td>
								<input type="number" class="gerenciarCliente" name="NomeCliente" id="cNomeCliente" size="30" maxlength="80"/>
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cEnderecoCliente">Endereço:</label>
								</td>
								<td>
								<input type="text" class="gerenciarCliente" name="EnderecoCliente" id="cEnderecoCliente" size="30" maxlength="80"  />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cComplementoCliente">Complemento:</label>
								</td>
								<td>
								<input type="text" class="gerenciarCliente" name="ComplementoCliente" id="cComplementoCliente" size="30" maxlength="50" />
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cTelefoneCliente">Telefone:</label>
								</td>
								<td>
								<input type="text" class="gerenciarCliente" name="TelefoneCliente" id="cTelefoneCliente" size="30" maxlength="15"/>
								</td>
                            </tr>
                            <tr>
                                <td>
								<label for="cEmailCliente">Email:</label>
								</td>
								<td>
								<input type="email" class="gerenciarCliente" name="EmailCliente" id="cEmailCliente" size="30" maxlength="80"/>
								</td>
                            </tr>
                        </table>                       
                        <input type="submit"  value ="Atualizar" id="cAtualizar" />
                        <input type="reset" id="cLimpar" value = "limpar" />                              

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


