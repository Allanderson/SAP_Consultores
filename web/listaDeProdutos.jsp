<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho1.jsp" />
<title>Produtos</title>
<link rel="stylesheet" type="text/css" href="css/sair.css"/>
<link rel="stylesheet" type="text/css" href="css/menuConsultor.css" />
<link rel="stylesheet" type="text/css" href="css/listaDeProdutos.css"/>
<link rel="stylesheet" type="text/css" href="css/boasVindas.css"/>
<c:import url="cabecalho2.jsp" />
<c:import url="boasVindas.jsp" />
<c:import url="menuConsultorComInicio.jsp" />
<c:import url="sair.jsp" />

<div id="listaProdutos">
<form id="pesquisar" action="" method="">
    <label for="cCategoria"><strong>Localizar Por:</strong></label>
        <select name="tCategoria" id="cCategoria" >
            <option value="nome">Nome</option>
            <option value="codigo">Código</option>            
        </select>
    <input type="text" name="tCategoriaDigitada" id="cCategoriaDigitada" />
    <input type="image" name="tPesquisar" id="cPesquisar" src="imagens/pesquisar.png"/>
</form>

<a id="novoCadastro" href="cadastroProduto.jsp"><strong>Novo Cadastro</strong></a>
<table  id="listaProdutos">
    <tr>
        <th colspan="4">Dados Produto</th>
        <th colspan="2">Ações</th>
    </tr>
    <tr class="linha">
        <th class="coluna">
            Código  
        </th>
        <th class="coluna">
            Nome  
        </th>
        <th class="coluna">
            preço
        </th>
        <th class="coluna">
            Quantidade
        </th>
        <th class="coluna">
           Alterar 
        </th>
        <th class="coluna">
            Excluir
        </th>
    </tr>
    
    <tr class="linha">
        <td class="coluna">
            321  
        </td>
        <td class="coluna">
            Quasar Brasil   
        </td>
        <td class="coluna">
            85.00
        </td>
        <td class="coluna">
            4
        </td>
        <td class="coluna">
            <a href="" ><img src="imagens/editar.png" /></a> 
        </td>
        <td class="coluna">
            <a href=""><img src="imagens/delete.png"/></a>
        </td>
    </tr>
</table>
</div>
<c:import url="rodape.jsp" />