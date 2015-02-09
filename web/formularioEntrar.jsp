<%-- Formulário de entrada do sistema --%>
<form id="formEntrar" method="post" action="ServletLogar">
    <label for="cEmailEntrar">Login:</label>
    <input type="text" autofocus="" required="true" name="tLogin" id="cEmailEntrar" placeholder="Usuário" size="20"/> 
    <label for="cSenhaEntrar"> Senha:</label>
    <input type="password" required="true" name="tSenha" id="cSenhaEntrar" placeholder="Senha" size="20"/>
    <input type="submit" name="tEntrar" id="cEntrar" value="Entrar"/>
    <p style = text-align:right>
        <%

            String msg = (String) request.getAttribute("mensagemErro");

            if (msg != null) {
                out.println(msg);
            }
            String saiu = (String) request.getAttribute("saiu");

            if (saiu != null) {
                out.println(saiu);
            }
        %>
    </p>
</form>
