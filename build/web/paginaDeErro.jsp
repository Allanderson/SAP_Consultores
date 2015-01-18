
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Erro no Processo</title>        
        <style>
            @font-face{
                font-family: 'FonteLogo';
                src:url(fonte/bubblegum-sans-regular.otf);
            }
            body{
                background: #dddddd;
                font-family: Verdana, Sans-serif;
            }

            /*Formatação do corpo da página*/
            #corpo {
                border-radius: 20px;;
                width: 1050px;
                margin: 0px auto 0px auto;
                background-color: #FFFFFF;
            }

            /*Formatação do cabeçalho onde se encontra o nome do sistema*/
            header#cabecalho {
                background-color: #ffffff;
                width: 1000px;
                height: 120px;
                margin: -10px auto -27px auto;
                border-bottom: 1px solid #606060;

            }

            /*Formatação da imagem do logo*/
            header#cabecalho img{
                width: 80px;
                border-radius: 10px;
            }

            /*Formatação do nome do sistema*/
            nav#nomeLogo h2{
                font-family: 'FonteLogo', sans-serif;
                color: #606060;
                font-size: 30pt;
                position: relative;
                left: 85px;
                top: -95px;							
            }
            nav#nomeLogo h3 {
                font-family: 'FonteLogo', sans-serif;
                color: #606060;
                font-size: 28pt;
                position: relative;
                left: 20px;
                top: -130px;
            }

            /*Formatação da mensagem de agradeciomento do cadastro*/
            header#aviso h1 {
                text-align: center;
                font-family:Arial;
                font-size:30pt;
                color: blue;
                text-shadow: 2px 2px 2px black;
                padding: 30px;
            }
            header#aviso h2 {
                text-align: center;
                font-family:Arial;
                font-size:30pt;
                color: blue;
                text-shadow: 2px 2px 2px black;
            }

            /*Formatação do rodapé*/
            footer#rodape {
                background-color: #FFF;
                width: 1000px;
                height: 50px;
                margin: 0px auto 10px auto;
                border-top: 1px solid #606060;	
                text-align: center;	
                font-family: Arial, sans-serif;
                color: #000;															
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

                <%-- Mensagem de erro no cadastro --%>
                <header id="aviso">   
                    <h1>Ocorreu Um Erro Ao Tentar Entrar No Sistema!</h1>    
                    <h2>Verifique se os Dados Inseridos Estão Corretos!</h2>
                </header>

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