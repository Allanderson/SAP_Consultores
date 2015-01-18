<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Corpo e Banho Hidratantes</title>
        <link rel="stylesheet" type="text/css" href = "estilo/estilohidratantes.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
            }
            ul#album-corpoebanho-hidratantes li#hidratantes01 {
                background: url("corpoebanhohidratantes/Nativa-SPA-Locao-Cremosa-Hidratante-Exotica-Ameixa-400ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes02 {
                background: url("corpoebanhohidratantes/Cuide-se-Bem-Locao-Hidratante-Nutritiva-Camomila-e-Malva-400ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes03 {    
                background: url("corpoebanhohidratantes/Egeo-Dolce-Hidratante-de-Banho-Marshmallow-250g.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes04 {
                background: url("corpoebanhohidratantes/Egeo-Dolce-Merengue-Mousse-Creme-Hidratante-Des-Corporal-250g.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes05 {
                background: url("corpoebanhohidratantes/Floratta-in-Blue-Creme-Hidratante-200ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes06 {
                background: url("corpoebanhohidratantes/Floratta-in-Gold-Creme-Hidratante-200ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes07 {
                background: url("corpoebanhohidratantes/Floratta-in-Rose-Creme-Hidratante-200ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes08 {
                background: url("corpoebanhohidratantes/Lily-Essence-Creme-Acetinado-Hidratante-Corporal-250g.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-hidratantes li#hidratantes09 {
                background: url("corpoebanhohidratantes/Nativa-SPA-Locao-Cremosa-Hidratante-Nutritiva-Acai-400ml.jpg") no-repeat;
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
            
            <%-- tabela de boas vindas do cliente --%>
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
            
            <%-- Apresentação dos produtos hidratantes --%>            
            <section id="corpol-full">
                <article id="noticia-principal">
                    <header id="cabecalho-artigo">
                        <hgroup>
                            <h3>Corpo e Banho > Hidratantes</h3>
                            <h1>Galeria de Corpo e Banho Hidratantes</h1>
                            <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                        </hgroup>
                    </header>     
            
                    <ul id="album-corpoebanho-hidratantes">
                        <li id="hidratantes01"><span>Nativa SPA  Ameixa 400ml R$33,00</span></li>
                        <li id="hidratantes02"><span>Camomila e Malva 400ml R$25,00</span></li>
                        <li id="hidratantes03"><span>Egeo Dolce 250g R$35,00</span></li>
                        <li id="hidratantes04"><span>Egeo Dolce Merengue 250g R$45,00</span></li>
                        <li id="hidratantes05"><span>Floratta In Blue 200ml R$32,00</span></li>
                        <li id="hidratantes06"><span>Floratta In Gold 200ml R$32,00</span></li>
                        <li id="hidratantes07"><span>Floratta In Rose 200g R$32,00</span></li>
                        <li id="hidratantes08"><span>Lily Essence 250g R$60,00</span></li>
                        <li id="hidratantes09"><span>Nativa SPA  Açaí 400ml R$32,00</span></li>
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