<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html">
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>
            SAP Consultores
        </title>

        <link rel = "shortcut icon" href = "imagens/libelula.jpg" />
        <link rel="stylesheet" type="text/css" href = "estilo/estilo.css"/>
        <!--  <link rel="stylesheet" type="text/css" href = "css/bootstrap.min.css"/>  -->


        <style>@font-face{
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

            <!--Formuláro de entrada no sistema falta colocar a ação do formulário-->
            <form id="formEntrar" method="post" action="LoginCliente">
                <label for="cemailentrar">Email:&nbsp;</label><input type="email" name="temailentrar" id="cemailentrar" size="20" maxlength="50" />
                &nbsp;
                <label for="csenhaentrar">Senha:&nbsp;</label><input type="password" name="tsenhaentrar" id="csenhaentrar" size="20" 
                                                                     maxlength="15"/>&nbsp;
                <input type="image" src="imagens/botao_entrar.png" id="centrar" />
            </form> 

            <%-- Link pra realizar o cadastro do administrador --%>
            <header id="cadastrarAdministrador">
                Administrador Cadastre-se <a href="cadastroAdministrador.jsp">Aqui</a>
            </header>

            <!--Formulario de cadastro dos clientes--> 
            <form  id="formCadastro" method = "POST" action ="CadastroCliente">  
                <h1>Cadastro do Cliente</h1>
                <fieldset id="dadospessoais">
                    <legend id="dadospessoais">
                        <strong>Dados Pessoais</strong>
                    </legend>
                    <table id="dadospessoais">
                        <tr>
                        <p>
                        <td>
                            <label for="cnomecadastro">Nome:</label>
                        </td>
                        <td>
                            <input type="text" class="inputdadospessoais" name="nome" id="cnomecadastro" size="30" maxlength="50" 
                                   placeholder="Digite seu nome" required = "required" />
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="csobrenome">Sobrenome:</label>
                        </td>
                        <td>
                            <input type="text" class="inputdadospessoais" name="sobrenome" id="csobrenome" size="30" maxlength="50" 
                                   placeholder="Digite seu sobre nome" required = "required"/>
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="cendereco">Endereço:</label>
                        </td>
                        <td>
                            <input type="text" class="inputdadospessoais" name="endereco" id="cendereco" size="30" maxlength="100" 
                                   placeholder="Rua, Av, etc required = "required""/>
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="ccomplemento">Complemento:</label>
                        </td>
                        <td>
                            <input type="text" class="inputdadospessoais" name="complemento" id="ccomplemento" size="30" maxlength="50" 
                                   placeholder="Ponto de referência"/>
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="ctelefone">Telefone:</label>
                        </td>
                        <td>
                            <input type="text" class="inputdadospessoais" name="telefone" id="ctelefone" size="30" maxlength="20" 
                                   placeholder="(0xx)9999-9999"/>
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="cemail">Email:</label>
                        </td>
                        <td>
                            <input type="email" class="inputdadospessoais" name="email" id="cemail" size="30" maxlength="50" 
                                   placeholder="Ex: consultores@gmail.com" required = "required"/>
                        </td>
                        </p>
                        </tr>
                        <tr> 
                        <p>
                        <td>
                            <label for="csenha">Senha:</label>
                        </td>
                        <td>
                            <input type="password" name="senha" class="inputdadospessoais" id="csenha" size="30" maxlength="15" 
                                   placeholder="Até 15 dígitos" required = "required"/>
                        </td>
                        </p>
                        </tr>
                        <tr>
                        <p>
                        <td>
                            <label for="cconfirmasenha">Confirmar Senha:</label>
                        </td>
                        <td>
                            <input type="password" name="confirmarsenha" id="cconfirmasenha" class="inputdadospessoais" size="30" maxlength="15" 
                                   placeholder="Repita a senha" required = "required"/>
                        </td>
                        </p>
                        </tr> 
                    </table>
                    <nav id="botoessubmitcadastro">		
                        <input type="submit"  value = "Enviar" id="cCadastrar" />
                        <input type="reset" value = "Limpar" id="cLimpar" /> 
                    </nav> 
                </fieldset>
            </form>

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