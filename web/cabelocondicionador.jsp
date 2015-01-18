<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cabelo Condicionador</title>
<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
<link rel="stylesheet" type="text/css" href = "estilo/estilocondicionador.css"/>
<style>
    @font-face{
	font-family: 'FonteLogo';
	src:url(fonte/bubblegum-sans-regular.otf);
	}
ul#album-cabelo-condicionador li#condicionador01 {
    background: url("cabelocondicionador/Baby-Boti-Condicionador-Suave-200ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador02 {
    background: url("cabelocondicionador/Capricho-Condicionador-Antifrizz-200ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador03 {    
    background: url("cabelocondicionador/Cuide-se-Bem-Condicionador-Fios-Hidratados-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador04 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Exotico-Restauracao-dos-Fios-Ameixa-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador05 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Intenso-Forca-para-os-Fios-Amora+Sandalo-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador06 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Protecao-dos-Fios-Jabuticaba+Castanha-do-Para-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador07 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Purificante-Brilho-e-Maciez-Verbena+Aloe-Vera-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador08 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Refrescante-Purificacao-da-Raiz-Melissa+Alecrim-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}
ul#album-cabelo-condicionador li#condicionador09 {
    background: url("cabelocondicionador/Nativa-SPA-Condicionador-Revitalizante-Equilibrio-dos-Fios-Blueberry-250ml.jpg") no-repeat;
    background-position: 50% 50%;
    background-size: 400px 400px;
    background-color: #ffffff;
}


</style>

</head>

<body>
    
    
    <div id="corpo">
        
        <%-- Logo marca do sistema--%>
        <header id="cabecalho">
            <img src="imagens/libelula.jpg"/>
            <nav id="nomeLogo">
                <h2>SAP</h2>
                <h3> Consultores </h3>
            </nav>
	</header>
         
        <%-- Tabela que apresenta as boas vinda ao cliente --%>
        <header id="boasVindas">
             <table>
                <tr>
                    <td id="bemVindo">
                        Olá!&nbsp; 
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
                <input type="submit"  name="tSair" id="cSair" value="Sair"/>
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
        
        <%-- Apresentação dos produtos condicionadores--%>           
        <section id="corpol-full">
            <article id="noticia-principal">
                <header id="cabecalho-artigo">
                    <hgroup>
                        <h3>Cabelo > Condicionador</h3>
                        <h1>Galeria de Cabelo Condicionador</h1>
                        <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                    </hgroup>
                </header>     
            
                <ul id="album-cabelo-condicionador">
                    <li id="condicionador01"><span>Baby Boti Condicionador 200ml R$18,00</span></li>
                    <li id="condicionador02"><span>Capricho Antifrizz 200ml R$16,00</span></li>
                    <li id="condicionador03"><span>Fios Hidratados 250ml R$17,00</span></li>
                    <li id="condicionador04"><span>Restauração Ameixa 250ml R$25,00</span></li>
                    <li id="condicionador05"><span>Fotificação Amora 250ml R$25,00</span></li>
                    <li id="condicionador06"><span>Proteção Jabuticaba 250ml R$25,00</span></li>
                    <li id="condicionador07"><span>Brilho e Maciez Verbana250ml R$25,00</span></li>
                    <li id="condicionador08"><span>Purificação Alecrim 250ml R$25,00</span></li>
                    <li id="condicionador09"><span>Revitalizante 250ml R$25,00</span></li>
                </ul>
                   
            </article>
        </section>     
     
        <%-- Rodapé da página --%>
        <footer id="rodape">
            <br />
            Copyright &copy; 2014
        </footer>
       
        <br />
    
    </div>
</body>
</html>