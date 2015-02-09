<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="cabecalho1.jsp" />
<title>Consultor</title>
<link rel="stylesheet" type="text/css" href="css/boasVindas_sair.css"/>
<link rel="stylesheet" type="text/css" href="css/menuConsultor.css"/>
<link rel="stylesheet" type="text/css" href="css/relatorioVendas.css"/>
<c:import url="cabecalho2.jsp" />
<c:import url="boasVindas.jsp" />
<c:import url="menuConsultor.jsp" />
<c:import url="sair.jsp" />
<nav id="tabelaRelatoriosDeVenda">
    <h1>Relatório das Vendas</h1>
    <table id="tabelaRelatorio">
        <tr>
            <td><strong>Valor a Receber:</strong></td>
            <td><strong>R$ 157,00</strong></td>
        </tr>
        <tr>
            <td><strong>Valor Total Vendido:</strong></td>
            <td><strong>R$ 315,00</strong></td>
        </tr>
    </table>                
</nav>
<c:import url="rodape.jsp" />
