<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="cabecalho1.jsp" />
<title>Cadastro de Clientes</title>
    <link rel="stylesheet" type="text/css" href="css/sair.css"/>
    <link rel="stylesheet" type="text/css" href="css/boasVindas.css"/>
    <link rel="stylesheet" type="text/css" href="css/formulariosCadastros.css"/>
    <link rel="stylesheet" type="text/css" href="css/menuConsultor.css"/>
<c:import url="cabecalho2.jsp" />
<c:import url="sair.jsp" />
<c:import url="boasVindas.jsp" />
<c:import url="menuConsultorComInicio.jsp" />

    <%--Formulário de Cadastro de Clientes--%>
    <nav id="formularios">
        <h1>Cadastrar Clientes</h1>
             
        <form id="formularios">
            <fieldset id="formularios">
                <table id="formularios">
                    <tr>
                        <td><label for="cNivelPermissao">Nível de Permissão:</label></td>
                        <td><input type="text" required="true" autofocus="" class="formularios" name="tNivelPermissao" id="cNivelPermissao" placeholder="Seu Nével de permissão"/></td>
                    </tr>
                    <tr>
                        <td><label for="cCodigoCliente">Código do Cliente:</label></td>
                        <td><input type="text" required="true" class="formularios" name="tCodigoCliente" id="cCodigoCliente" placeholder="Código do Cliente" /></td>
                    </tr>
                    <tr>
                        <td><label for="cNome">Nome:</label></td>
                        <td><input type="text" required="true" class="formularios" name="tNome" id="cNome" placeholder="Nome Completo" /></td>
                    </tr>
                    <tr>
                        <td><label for="cEndereco">Endereço:</label></td>
                        <td><input type="text" required="true" class="formularios" name="tEndereco" id="cEndereco" placeholder="Endereço" /></td>
                    </tr>
                    <tr>
                        <td><label for="cTelefone">Telefone:</label></td>
                        <td><input type="text" required="true" class="formularios" name="tTelefone" id="cTelefone" placeholder="(0xx)9999-9999" /></td>
                    </tr>
                    <tr>
                        <td><label for="cLogin">Login:</label></td>
                        <td><input type="text" required="true" class="formularios" name="tLogin" id="cLogin" placeholder="Usuário" /></td>
                    </tr>
                    <tr>
                        <td><label for="cSenha">Senha:</label></td>
                        <td><input type="password" required="true" class="formularios" name="tSenha" id="cSenha" placeholder="Senha" /></td>
                    </tr>
                    <tr>
					 <tr>
                        <td><label for="cConfirmarSenha">Confirmar Senha:</label></td>
                        <td><input type="password" required="true" class="formularios" name="tConfirmarSenha" id="cConfirmarSenha" placeholder="Confirme sua senha" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="tCadastrar" id="cCadastrar" value="Cadastrar" />
                        <input type="reset" name="tLimpar" id="cLimpar" value="Limpar"</td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </nav>
<c:import url="rodape.jsp" />