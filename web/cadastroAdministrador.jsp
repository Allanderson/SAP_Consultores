<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html">
<html lang = "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Cadastro do Administrador</title>
		<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
        <link rel="stylesheet" type="text/css" href = "estilo/estiloCadastroAdministrador.css"/>

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

            <%--Formuláro de entrada no sistema falta colocar a ação do formulário--%>
            <form id="formEntrar" method = "POST" action = "LoginAdministrador" >
                <label for="cemailentrar">Email:&nbsp;</label>
				<input type="email" name="temailentrar" id="cemailentrar" size="20" maxlength="50" />&nbsp;
                <label for="csenhaentrar">Senha:&nbsp;</label>
				<input type="password" name="tsenhaentrar" id="csenhaentrar" size="20" maxlength="15"/>&nbsp;
                <input type="image" src="imagens/botao_entrar.png" id="centrar" />
            </form>

            <%--Formulario de cadastro dos clientes--%> 
            <form  id="formcadastro" method = "POST" action ="CadastrarAdministrador">
                <h1>Cadastro do Administrador</h1>
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
								<input type="text" class="inputdadospesoais" name="nome" id="cnomecadastro" size="30" maxlength="50" 
								placeholder="Digite seu nome"  required = "required"/>
								</td>
								</p>
                            </tr>
                            <tr>
                                <p>
								<td>
								<label for="csobrenome">Sobrenome:</label>
								</td>
								<td>
								<input type="text" class="inputdadospesoais" name="sobrenome" id="csobrenome" size="30" maxlength="50" 
								placeholder="Digite seu sobre nome" required = "required"/>
								</td>
								</p>
                            </tr>

                            <tr>
                                <p>
								<td>
								<label for="cemail">Email:</label>
								</td>
								<td>
								<input type="email" class="inputdadospesoais" name="email" id="cemail" size="30" maxlength="50" 
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
								<input type="password" name="senha" class="inputdadospesoais" id="csenha" size="30" maxlength="15" 
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
								<input type="password" name="confirmarsenha" id="cconfirmasenha" class="inputdadospesoais" size="30" maxlength="15" 
								placeholder="Repita a senha" required = "required"/>
								</td>
								</p>
                            </tr> 
                        </table>
                        <nav id="botoessubmitcadastro">		
                            <input type="submit" value = "Enviar" id="ccadastrar" />
                            <input type="reset" value = "Limpar" id="climpar" /> 
                        </nav> 
                    </fieldset>
            </form>
            
            <%-- Rodapé da página --%>
            <footer id="rodape">
                <br />
                Copyright &copy; 2014
            </footer>
            
            <br />
            
        </div>

    </body>
</html>
