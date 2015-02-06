            <%-- Formulário de entrada do sistema --%>
            <form id="formEntrar" method="post" action="logar">
                <label for="cEmailEntrar">Login:</label><input type="text" autofocus="" required="true" name="tEmailEntrar" id="cEmailEntrar" placeholder="Usuário" size="20"/> 
                <label for="cSenhaEntrar"> Senha:</label><input type="password" required="true" name="tSenhaEntrar" id="cSenhaEntrar" placeholder="Senha" size="20"/>
                <input type="submit" name="tEntrar" id="cEntrar" value="Entrar"/>
            </form>