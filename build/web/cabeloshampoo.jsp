<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cabelo Shampoo</title>
<link rel="stylesheet" type="text/css" href = "estilo/estiloshampoo.css"/>
<style>
    @font-face{
	font-family: 'FonteLogo';
	src:url(fonte/bubblegum-sans-regular.otf);
	}
ul#album-cabelo-shampoo li#shampoo01 {
    background: url("cabeloshampoo/Baby-Boti-Shampoo-Suave-200ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo02 {
    background: url("cabeloshampoo/Nativa-SPA-Frutoterapia-Monoï-&-Argan-Shampoo-Ultra-Hidratante-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo03 {    
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Exotico-Restauracao-dos-Fios-Ameixa-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo04 {
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Intenso-Forca-para-os-Fios-Amora---Sandalo-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo05 {
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Intenso-Protecao-da-Cor-Cereja-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo06 {
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Purificante-Brilho-e-Maciez-Verbena-Aloe-Vera-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo07 {
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Refrescante-Purificacao-da-Raiz-Melissa-Alecrim-400ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo08 {
    background: url("cabeloshampoo/Nativa-SPA-Shampoo-Revitalizante-Equilibrio-dos-Fios-Blueberry-400m.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-shampoo li#shampoo09 {
    background: url("cabeloshampoo/O-Boticario-MEN-Shampoo-Anticaspa-200m.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
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
        
        <%-- Tabela de boas vinda ao cliente --%>
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
        
        <%-- Área do menu dos produtos--%>
        <nav id="inicio">
            <ul>
                <li>
                    <a href="cliente.jsp"><strong>Início</strong></a>
                </li>
            </ul>
        </nav>
        
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
        
        <%-- Apresentação dos produtos shampoo--%>            
        <section id="corpol-full">
            <article id="noticia-principal">
                <header id="cabecalho-artigo">
                    <hgroup>
                        <h3>Cabelo > Shampoo</h3>
                        <h1>Galeria de Cabelo Shampoo</h1>
                        <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                    </hgroup>
                </header>     
            
                <ul id="album-cabelo-shampoo">
                    <li id="shampoo01"><span>Baby Boti Shampoo Suave 200ml R$18,00</span></li>
                    <li id="shampoo02"><span>Fruto Terapia Monoi-Argã400ml R$27,00</span></li>
                    <li id="shampoo03"><span>Restaura os fios Ameixa 400ml R$23,00</span></li>
                    <li id="shampoo04"><span>Força para os fios Amora400ml R$23,00</span></li>
                    <li id="shampoo05"><span>Proteção da cor Cereja 400ml R$23,00</span></li>
                    <li id="shampoo06"><span>Brilho e Maciez Verbena400ml R$23,00</span></li>
                    <li id="shampoo07"><span>Purifica a Raiz Alecrim400ml R$23,00</span></li>
                    <li id="shampoo08"><span>Revitalizante Blueberry400ml R$23,00</span></li>
                    <li id="shampoo09"><span>Man Anti-Caspa 200ml R$20,00</span></li>
                </ul>                   
            </article>
        </section>
       
        
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