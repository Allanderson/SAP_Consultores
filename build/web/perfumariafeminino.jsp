<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Perfumaria Feminino</title>
        <link rel="stylesheet" type="text/css" href = "estilo/estilofeminino.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
                }
                ul#album-perfumaria-feminino li#feminino01 {
                    background: url("perfumefeminino/Accordes-Des-Colonia-80ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino02 {
                    background: url("perfumefeminino/Anni-Des-Colonia-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino03 {    
                    background: url("perfumefeminino/Coffee-Woman-Seduction 100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino04 {
                    background: url("perfumefeminino/Egeo-Dolce-Woman-colonia-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino05 {
                    background: url("perfumefeminino/Floratta-in-Blue-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino06 {
                    background: url("perfumefeminino/Floratta-in-Gold-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino07 {
                    background: url("perfumefeminino/Floratta-in-Rose-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino08 {
                    background: url("perfumefeminino/Glamour-75ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-feminino li#feminino09 {
                    background: url("perfumefeminino/Glamour-Secrets-Black-75ml.jpg") no-repeat;
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
                
                <%-- Apresentação dos produtos perfumes femininos--%>
                <section id="corpol-full">
                    <article id="noticia-principal">
                        <header id="cabecalho-artigo">
                            <hgroup>
                                <h3>Perfumaria > Feminino</h3>
                                <h1>Galeria de Perfumes Femininos</h1>
                                <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                            </hgroup>
                        </header>     

                        <ul id="album-perfumaria-feminino">
                            <li id="feminino01"><span>Accordes 80ml R$99,00</span></li>
                            <li id="feminino02"><span>Anni 100ml R$64,00 </span></li>
                            <li id="feminino03"><span>Coffe Woman Seduction 100ml R$95,00</span></li>
                            <li id="feminino04"><span>Egeu Dolce Woman 100ml R$82,00</span></li>
                            <li id="feminino05"><span>Floratta In Blue 100ml R$70,00</span></li>
                            <li id="feminino06"><span>Floratta In Gold 100ml R$70,00</span></li>
                            <li id="feminino07"><span>Floratta In Rose 100ml R$70,00</span></li>
                            <li id="feminino08"><span>Glamour 75ml R$100,00</span></li>
                            <li id="feminino09"><span>Glamour Secrets Black 75ml R$100,00</span></li>
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

