<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Compras Atuais</title>
	<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
    <link rel="stylesheet" type="text/css" href = "estilo/estiloComprasAtuais.css"/>
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
        
        <%-- Tabela de boas vindas ao cliente --%>
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
        
        <%--Botão sair do sistema --%>
        <header id="botaoSair">
            <form id="sair" action="Logoff" method="post">
                <input type="submit" name="tSair" id="cSair" value="Sair"/>
            </form>
        </header>
        <%-- Área do menu das compras --%>
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
        
        <%-- Iframe de apresentação da tabela com o relatório das 5 últimas compras --%>
        <aside id="mensagemLateral">
            <h3>Confira as Suas 5 Úitimas Compras</h3>
        </aside>
        
        <iframe src="tabelaComprasAtuais.jsp" name="janela" id="frame-comprasAtuais"></iframe>
         
        <%-- Rodapé da página --%>
        <footer id="rodape">
            <br />
            Copyright &copy; 2014
        </footer>
        <br />
    
    </div>
</body>
</html>