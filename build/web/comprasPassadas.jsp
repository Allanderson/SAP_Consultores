<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Compras Passadas</title>
    <link rel="stylesheet" type="text/css" href = "estilo/estiloComprasPassadas.css"/>
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
        
        <%-- Tabela de boas vindas do cliente --%>
        <header id="boasVindas">
            <table>
                <tr>
                    <td id="bemVindo">
                       Olá&nbsp;
                    </td>
                    <td id="nomeCliente">
                       <%= session.getAttribute("usuario")%>
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
        
        <%-- Menu de compras --%>
	<section id="areacompras">
            <nav id="menucompras"> 
               
                <ul id="inicio">
                    <li>
                        <a href="cliente.jsp"><strong><center>Início</center></strong></a>                       
                    </li>         
                </ul>
                
                <ul id="comprasAtuais">
                    <li>
                        <a href="comprasAtuais.jsp"><strong>Compras Atuais</strong></a>
                    </li>
                </ul>
                
                <ul id="comprasPassadas">
                    <li>
                        <a href="comprasPassadas.jsp"><strong>Compras Passadas</strong></a>
                    </li>
                </ul>
            </nav>
        </section>
        
        <%-- Iframe de apresentação da tabela com o relatório das compras passadas --%>
        <aside id="mensagemLateral">
            <h3>Confira as suas compras Passadas</h3>
        </aside>
        
        <iframe src="tabelaComprasPassadas.jsp" name="janela" id="frame-comprasPassadas"></iframe>
           
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