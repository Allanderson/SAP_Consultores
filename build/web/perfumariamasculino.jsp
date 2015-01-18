<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Perfumaria Masculino</title>
        <link rel="stylesheet" type="text/css" href = "estilo/estilomasculino.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
                }
                ul#album-perfumaria-masculino li#masculino01 {
                    background: url("perfumemasculino/Arbo-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino02 {
                    background: url("perfumemasculino/Coffee-Man-Seduction-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino03 {    
                    background: url("perfumemasculino/Connexion-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino04 {
                    background: url("perfumemasculino/Egeo-Man-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino05 {
                    background: url("perfumemasculino/Galbe-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino06 {
                    background: url("perfumemasculino/Malbec-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino07 {
                    background: url("perfumemasculino/Portinari-100ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino08 {
                    background: url("perfumemasculino/Quasar-Fire-125ml.jpg") no-repeat;
                    background-position: 50% 50%;
                    background-size: 400px 400px;
                    background-color: #ffffff;
                }
                ul#album-perfumaria-masculino li#masculino09 {
                    background: url("perfumemasculino/Uomini-100ml.jpg") no-repeat;
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
                <%-- Apresentação dos produtos perfumes masculinos --%>
            
                <section id="corpol-full">
                    <article id="noticia-principal">
                        <header id="cabecalho-artigo">
                            <hgroup>
                                <h3>Perfumaria > Masculino</h3>
                                <h1>Galeria de Perfumes Masculino</h1>
                                <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                            </hgroup>
                        </header>     

                        <ul id="album-perfumaria-masculino">
                            <li id="masculino01"><span>Arbo 100ml R$85,00</span></li>
                            <li id="masculino02"><span>Coffee Man Seduction 100ml R$95,00</span></li>
                            <li id="masculino03"><span>Connexion 100ml R$67,00</span></li>
                            <li id="masculino04"><span>Egeo Man 100ml R$79,00</span></li>
                            <li id="masculino05"><span>Galbe 100ml R$75,00</span></li>
                            <li id="masculino06"><span>Malbec 100ml R$104,00</span></li>
                            <li id="masculino07"><span>Portinari 100ml R$99,00</span></li>
                            <li id="masculino08"><span>Quasar Fire 125ml R$84,00</span></li>
                            <li id="masculino09"><span>Uomini 100ml R$89,00</span></li>
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
