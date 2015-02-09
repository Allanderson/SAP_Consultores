<script type="text/javascript" src="js/scripts.js"></script>            
            <header id="boasVindas">
                <table>
                    <tr>
                        <td id="bemVindo">
                            <script>saudacao();</script>&nbsp;  
                        </td>
                        <td id="nomeCliente">
                            <%= session.getAttribute("nome")%>
                        </td>
                    </tr>
                </table>            
            </header>