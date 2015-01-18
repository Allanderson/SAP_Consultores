<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Perfumaria Jovens e Crianças</title>
        <link rel="stylesheet" type="text/css" href = "estilo/estilojovensecrianca.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca01 {
                    background: url("perfumejovensecrianca/Baby-Boti-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca02 {
                    background: url("perfumejovensecrianca/Baby-Boti-Mel-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca03 {    
                    background: url("perfumejovensecrianca/Capricho-70ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca04 {
                    background: url("perfumejovensecrianca/Capricho-Day-Night-50ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca05 {
                    background: url("perfumejovensecrianca/Capricho-Rock-50ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca06 {
                    background: url("perfumejovensecrianca/Capricho-Sweet-50ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca07 {
                    background: url("perfumejovensecrianca/petit-sophie-75ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca08 {
                    background: url("perfumejovensecrianca/portinari-pipas-50ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-jovensecrianca li#jovensecrianca09 {
                    background: url("perfumejovensecrianca/spulokis-150ml.jpg") no-repeat;
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
                
                <%-- Apresentação dos produtos perfumes de jovens e crianças--%>            
                <section id="corpol-full">
                    <article id="noticia-principal">
                        <header id="cabecalho-artigo">
                            <hgroup>
                                <h3>Perfumaria > Jovens e Crianças</h3>
                                <h1>Galeria de Perfumes Jovens e Crianças</h1>
                                <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                            </hgroup>
                        </header>     
            
                        <ul id="album-perfumaria-jovensecrianca">
                            <li id="jovensecrianca01"><span>Baby Boti 100ml R$43,00</span></li>
                            <li id="jovensecrianca02"><span>Baby Boti Mel 100ml R$43,00</span></li>
                            <li id="jovensecrianca03"><span>Capricho 70ml R$48,00</span></li>
                            <li id="jovensecrianca04"><span>Capricho Day Night 50ml, cada R$48,00</span></li>
                            <li id="jovensecrianca05"><span>Capricho Rock 50ml R$35,00</span></li>
                            <li id="jovensecrianca06"><span>Capricho Sweet 50ml R$35,00</span></li>
                            <li id="jovensecrianca07"><span>Petit Sophie 75ml R$50,00</span></li>
                            <li id="jovensecrianca08"><span>Portinari Pipa 50ml R$50,00</span></li>
                            <li id="jovensecrianca09"><span>Spulokis 150ml R$50,00</span></li>
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
