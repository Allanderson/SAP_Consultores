<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Corpo e Banho Sabonetes</title>
		<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
        <link rel="stylesheet" type="text/css" href = "estilo/estilosabonetes.css"/>
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
            }
            ul#album-corpoebanho-sabonetes li#sabonetes01 {
                background: url("corpoebanhosabonetes/Baby-Boti-Sabonete-Liquido-Cabelo-e-Corpo-Ultra-Suave-200ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes02 {
                background: url("corpoebanhosabonetes/Baby-Boti-Sabonete-Suave-2-unidades-de-85g-cada-uma.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes03 {    
                background: url("corpoebanhosabonetes/-coffee-man-sabonetes-perfumados-2-uunidades-de-90g-cada.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes04 {
                background: url("corpoebanhosabonetes/Cuide-se-Bem-Sabonete-Intimo-Cremoso-Floral-200ml.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes05 {
                background: url("corpoebanhosabonetes/Cuide-se-Bem-Sabonete-Perfumado-Frutas-Vermelhas-e-Avela-2-unidades-de-80g-cada.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes06 {
                background: url("corpoebanhosabonetes/cuide-se-bem-sabonete-perfumado-leite-e-mel-5-unidades-de-80g-cada.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes07 {
                background: url("corpoebanhosabonetes/cuide-se-bem-sabonete-perfumado-rosa-e-alcacuz-5-unidades-de-80g-cada.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes08 {
                background: url("corpoebanhosabonetes/linda-sabonetes-perfumados-2-unidades-de-90g-cada.jpg") no-repeat;
                background-position: 50% 50%;
                background-size: 400px 400px;
                background-color: #ffffff;
            }
            ul#album-corpoebanho-sabonetes li#sabonetes09 {
                background: url("corpoebanhosabonetes/Nativa-SPA-Sabonete-Exotico-Ameixa-100g.jpg") no-repeat;
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
                
                <%-- Apresentação dos produtos sabonetes--%>
                <section id="corpol-full">
                    <article id="noticia-principal">
                        <header id="cabecalho-artigo">
                            <hgroup>
                                <h3>Corpo e Banho > Sabonetes</h3>
                                <h1>Galeria de Corpo e Banho Sabonetes</h1>
                                <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        
                            </hgroup>
                        </header>     

                        <ul id="album-corpoebanho-sabonetes">
                            <li id="sabonetes01"><span>Baby Boti sab.Liquido 200ml R$24,00</span></li>
                            <li id="sabonetes02"><span>Baby Boti 2Unid. Cada 85g R$15,00</span></li>
                            <li id="sabonetes03"><span>Coffee Man 2Unid. Cada 90g R$18,00</span></li>
                            <li id="sabonetes04"><span>Sabonete Íntimo Floral 200ml R$20,00</span></li>
                            <li id="sabonetes05"><span>Fruatas vermelhas e avelã 80g R$15,00</span></li>
                            <li id="sabonetes06"><span>Leite e Mel 5Unid. Cada 80g R$17,00</span></li>
                            <li id="sabonetes07"><span>Rosa e Alcaçu 5Unid. Cada 80g R$17,00</span></li>
                            <li id="sabonetes08"><span>Linda 2Unid. Cada 90g R$18,00</span></li>
                            <li id="sabonetes09"><span>Nativa SPA  Ameixa 100g R$8,00</span></li>
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