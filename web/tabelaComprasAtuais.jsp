<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang= "pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<link rel = "shortcut icon" href = "imagens/libelula.jpg" />
        <style>
            table td {
                padding: 10px;
                background-color: #dddddd;
            }
            body {
                font-family: verdana, sans-serif;
            }
            th {
                background-color: #606060;
                color: #FFFFFF;
            }
        </style>
    </head>
    <body>
        
        <%-- Tabela com a lista das 5 últimas compras --%>
        <table>
            <tr>
                <th>
                   Produto 
                </th>
                <th>
                    Quantidade
                </th>
                <th>
                    Valor da Compra
                </th>
                <th>
                    Data da Compra
                </th>
                
            </tr>
            
            <tr>
                <td>
            <center> Cuidese bem sabonete perfumado frutas vermelha e avelã 2 unidades de 80g cada</center>
                </td>
                <td>
                <center>3</center>
                </td>
                <td>
                <center>R$ 240,00</center>
                </td>
                <td>
                <center>14/07/14</center>
                </td>
                
            </tr>
            
            <tr>
                <td>
            <center>Nativa SPA Condicionador Refrescante Purificacao da Raiz Melissa e Alecrim 250ml</center> 
                </td>
                <td>
                <center>2</center>
                </td>
                <td>
                <center>R$ 50,00</center>
                </td>
                <td>
                <center>15/07/14</center>
                </td>
            </tr>
            
            <tr>
                <td>
            <center>Nativa SPA Shampoo Refrescante Purificacao da Raiz Melissa e Alecrim 400ml</center> 
                </td>
                <td>
                <center>1</center>
                </td>
                <td>
                <center>R$ 23,00</center>
                </td>
                <td>
                <center>16/07/14</center>
                </td>
            </tr>
            
            <tr>
                <td>
            <center>Nativa SPA Locao Cremosa Hidratante Nutritiva Acai 400ml</center> 
                </td>
                <td>
                <center>1</center>
                </td>
                <td>
                <center>R$ 32,00</center>
                </td>
                <td>
                <center>17/07/14</center>
                </td>
            </tr>
            
            <tr>
                <td>
            <center>Coffee Man Seduction Des.Colonia 100ml</center> 
                </td>
                <td>
                <center>2</center>
                </td>
                <td>
                <center>R$ 190,00</center>
                </td>
                <td>
                <center>18/07/14</center>
                </td>
            </tr>
        </table>
    </body>
</html>
