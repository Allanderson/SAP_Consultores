<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho1.jsp" />
<title>Clientes</title>
<link rel="stylesheet" type="text/css" href="css/sair.css"/>
<link rel="stylesheet" type="text/css" href="css/menuConsultor.css" />
<link rel="stylesheet" type="text/css" href="css/listaDeClientesProdutos.css"/>
<link rel="stylesheet" type="text/css" href="css/boasVindas.css"/>
<c:import url="cabecalho2.jsp" />
<c:import url="menuConsultorComInicio.jsp" />
<c:import url="sair.jsp" />
<c:import url="boasVindas.jsp" />

<div id="listaClientesProdutos">
<form id="pesquisar" action="" method="">
    <label for="cCategoria"><strong>Localizar Por:</strong></label>
        <select name="tCategoria" id="cCategoria" >
            <option value="nome">Nome</option>
            <option value="codigo">Código</option>            
        </select>
    <input type="text" name="tCategoriaDigitada" id="cCategoriaDigitada" />
    <input type="image" name="tPesquisar" id="cPesquisar" src="imagens/pesquisar.png"/>
</form>

<a id="novoCadastro" href="cadastroCliente.jsp"><strong>Novo Cadastro</strong></a>
<table  id="listaClientesProdutos">
    <tr>
        <th colspan="4">Dados Cliente</th>
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
            Endereço
        </th>
        <th class="coluna">
            Telefone
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
            123  
        </td>
        <td class="coluna">
            Paulo  
        </td>
        <td class="coluna">
            Monte
        </td>
        <td class="coluna">
            083
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