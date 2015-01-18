<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html">
<html lang = "pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
<link rel="stylesheet" type="text/css" href = "estilo/estilocliente.css"/>
<title>Área do Cliente</title>

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
         
        <%-- Tabela de boas vindas ao cliente --%>
        <header id="boasVindas">
            <table>
                <tr>
                    <td id="bemVindo">
                        <h1>Olá&nbsp;</h1>  
                    </td>
                    <td id="nomeCliente">
                        <h1><%= session.getAttribute("usuario")%></h1>
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
        
        <%-- Área de apresentação dos relatórios de compras e dívidas do cliente --%>
	<section id="areacompras">
            <nav id="menucompras"> 
                <h1>Compras</h1>
                <ul>
                    <li>
                        <a href="#"><strong>Minhas Compras</strong></a>
                        <ul>
                            <li><a href="comprasAtuais.jsp"><strong>Compras Atuais</strong></a></li>
                            <li><a href="comprasPassadas.jsp"><strong>Compras passadas</strong></a></li>                  
                        </ul>
                    </li>         
                </ul>
            </nav>
	
            <br />
            <br />
            <br />
            <br />
            <br />
        
            <div id="divida">
   		<table id="minhadivida">
                    <tr>
    			<td id="mdivida"><strong>Minha Dívida</strong></td>
                        <td id="valor">R$ 100,00</td>
                    </tr>
                </table>
            </div>
            
            <br />
            
            <div id="pagamento">
                <table id="pagamento">
                    <tr>
                        <td><strong>Último Pagamento</strong></td>
                        <td>14/07/2014</td>
                        <td>R$ 350,00</td>
                    </tr>
                </table>
            </div>
            
            <br />
            <br />
        </section>
    
        <%-- Área do menu dos produtos --%>
        <aside id="areaprodutos"> 
            <h1>Produtos</h1>
        </aside>
    	
    	<nav id="perfumaria">                	
            <ul>
                <li class="itemmenu"><a href="#"><strong>Perfumaria</strong></a>
                	<ul>
                    	<li><a href="perfumariafeminino.jsp"><strong>Feminino</strong></a></li>
                        <li><a href="perfumariamasculino.jsp"><strong>Masculino</strong></a></li>
                        <li><a href="perfumariajovensecrianca.jsp"><strong>Jovens e Crianças</strong></a></li>
                    </ul>
               	</li>
            </ul>
        </nav>
         
        <nav id="corpobanho">      
            <ul>
            	<li class="itemmenu"><a href="#"><strong>Corpo e Banho</strong></a>
                    <ul>
                    	<li><a href="corpoebanhohidratantes.jsp"><strong>Hidratantes</strong></a></li>
                        <li><a href="corpoebanhosabonetes.jsp"><strong>Sabonetes</strong></a></li>
                    </ul>
            	</li>
            </ul>
        </nav>
         
        <nav id="cabelo">
            <ul>
                <li><a href="#"><strong>Cabelo</strong></a>
                    <ul>
                    	<li><a href="cabeloshampoo.jsp"><strong>Shampoo</strong></a></li>
                        <li><a href="cabelocondicionador.jsp"><strong>Condicionador</strong></a></li>
                    </ul>
                </li>
            </ul>        
    	</nav>
	
        <%-- Rodapé da página --%>
	<footer id="rodape">
            <br />
            Copyright &copy; 2014
	</footer>
        
	<br />
    
    </div>
    
</body>
</html>
