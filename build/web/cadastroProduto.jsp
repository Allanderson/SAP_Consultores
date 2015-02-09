<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="cabecalho1.jsp" />
<title> Cadastro Produto</title>
<link rel="stylesheet" type="text/css" href="css/boasVindas_sair.css"/>
<link rel="stylesheet" type="text/css" href="css/formulariosCadastros.css"/>
<link rel="stylesheet" type="text/css" href="css/menuConsultor.css"/>
<c:import url="cabecalho2.jsp" />
<c:import url="sair.jsp" />
<c:import url="boasVindas.jsp" />
<c:import url="menuConsultorComInicio.jsp" />

<%--Formulário de Cadastro de Produtos--%>
<nav id="formularios">
    <h1>Cadastrar Produtos</h1>

    <form id="formularios">
        <fieldset id="formularios">
            <table id="formularios">
                <tr>
                    <td><label for="cCodigoProduto">Código do Produto</label></td>
                    <td><input type="text" required="true" class="formularios" name="tCodigoProduto" id="cCodigoProduto" placeholder="Código do Produto" /></td>
                </tr>
                <tr>
                    <td><label for="cNome">Nome do Produto:</label></td>
                    <td><input type="text" required="true" class="formularios" name="tNome" id="cNome" placeholder="Nome do Produto" /></td>
                </tr>
                <tr>
                    <td><label for="cTipo">Tipo do Produto:</label></td>
                    <td><input type="text" required="true" class="formularios" name="tTipo" id="cTipo" placeholder="ex: Colônia, shampoo" /></td>
                </tr>
                <tr>
                    <td><label for="cVolume">Volume:</label></td><td>
                        <input type="text" required="true" class="formularios" name="tVolume" id="cVolume" placeholder="ex: 100ml" /></td>
                </tr>
                <tr>
                    <td><label for="cPreco">Preço Unitário:</label></td>
                    <td><input type="text" required="true" class="formularios" name="tPreco" id="cPreco" placeholder="R$" /></td>
                </tr>
                <tr>
                    <td><label for="cQuantidade">Quantidade:</label></td>
                    <td><input type="password" required="true" class="formularios" name="tQuantidade" id="cQuantidade" placeholder="Quantidade" /></td>
                </tr>
                <tr>
                    <td><input type="submit" name="tCadastrar" id="cCadastrar" value="Cadastrar" />
                        <input type="reset" name="tLimpar" id="cLimpar" value="Limpar" /></td>
                </tr>
            </table>
        </fieldset>
    </form>
</nav>
<c:import url="rodape.jsp" />