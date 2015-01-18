package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html\">\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>\n");
      out.write("            SAP Consultores\n");
      out.write("            <link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\n");
      out.write("        </title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estilo.css\"/>\n");
      out.write("        <!--  <link rel=\"stylesheet\" type=\"text/css\" href = \"css/bootstrap.min.css\"/>  -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <style>@font-face{\n");
      out.write("                font-family: 'FonteLogo';\n");
      out.write("                src:url(fonte/bubblegum-sans-regular.otf);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"corpo\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <header id=\"cabecalho\">\n");
      out.write("                <img src=\"imagens/libelula.jpg\"/>\n");
      out.write("                <nav id=\"nomeLogo\">\n");
      out.write("                    <h2>SAP</h2>\n");
      out.write("                    <h3> Consultores </h3>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!--Formuláro de entrada no sistema falta colocar a ação do formulário-->\n");
      out.write("            <form id=\"formEntrar\" method=\"post\" action=\"LoginCliente\">\n");
      out.write("                <label for=\"cemailentrar\">Email:&nbsp;</label><input type=\"email\" name=\"temailentrar\" id=\"cemailentrar\" size=\"20\" maxlength=\"50\" />\n");
      out.write("                &nbsp;\n");
      out.write("                <label for=\"csenhaentrar\">Senha:&nbsp;</label><input type=\"password\" name=\"tsenhaentrar\" id=\"csenhaentrar\" size=\"20\" \n");
      out.write("                                                                     maxlength=\"15\"/>&nbsp;\n");
      out.write("                <input type=\"image\" src=\"imagens/botao_entrar.png\" id=\"centrar\" />\n");
      out.write("            </form> \n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <header id=\"cadastrarAdministrador\">\n");
      out.write("                Administrador Cadastre-se <a href=\"cadastroAdministrador.jsp\">Aqui</a>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!--Formulario de cadastro dos clientes--> \n");
      out.write("            <form  id=\"formCadastro\" method = \"POST\" action =\"CadastroCliente\">  \n");
      out.write("                <h1>Cadastro do Cliente</h1>\n");
      out.write("                <fieldset id=\"dadospessoais\">\n");
      out.write("                    <legend id=\"dadospessoais\">\n");
      out.write("                        <strong>Dados Pessoais</strong>\n");
      out.write("                    </legend>\n");
      out.write("                    <table id=\"dadospessoais\">\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"cnomecadastro\">Nome:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"inputdadospessoais\" name=\"nome\" id=\"cnomecadastro\" size=\"30\" maxlength=\"50\" \n");
      out.write("                                   placeholder=\"Digite seu nome\" required = \"required\" />\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"csobrenome\">Sobrenome:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"inputdadospessoais\" name=\"sobrenome\" id=\"csobrenome\" size=\"30\" maxlength=\"50\" \n");
      out.write("                                   placeholder=\"Digite seu sobre nome\" required = \"required\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"cendereco\">Endereço:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"inputdadospessoais\" name=\"endereco\" id=\"cendereco\" size=\"30\" maxlength=\"100\" \n");
      out.write("                                   placeholder=\"Rua, Av, etc required = \"required\"\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"ccomplemento\">Complemento:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"inputdadospessoais\" name=\"complemento\" id=\"ccomplemento\" size=\"30\" maxlength=\"50\" \n");
      out.write("                                   placeholder=\"Ponto de referência\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"ctelefone\">Telefone:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"inputdadospessoais\" name=\"telefone\" id=\"ctelefone\" size=\"30\" maxlength=\"20\" \n");
      out.write("                                   placeholder=\"(0xx)9999-9999\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"cemail\">Email:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" class=\"inputdadospessoais\" name=\"email\" id=\"cemail\" size=\"30\" maxlength=\"50\" \n");
      out.write("                                   placeholder=\"Ex: consultores@gmail.com\" required = \"required\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"csenha\">Senha:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"senha\" class=\"inputdadospessoais\" id=\"csenha\" size=\"30\" maxlength=\"15\" \n");
      out.write("                                   placeholder=\"Até 15 dígitos\" required = \"required\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <p>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"cconfirmasenha\">Confirmar Senha:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"confirmarsenha\" id=\"cconfirmasenha\" class=\"inputdadospessoais\" size=\"30\" maxlength=\"15\" \n");
      out.write("                                   placeholder=\"Repita a senha\" required = \"required\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </p>\n");
      out.write("                        </tr> \n");
      out.write("                    </table>\n");
      out.write("                    <nav id=\"botoessubmitcadastro\">\t\t\n");
      out.write("                        <input type=\"submit\"  value = \"Enviar\" id=\"cCadastrar\" />\n");
      out.write("                        <input type=\"reset\" value = \"Limpar\" id=\"cLimpar\" /> \n");
      out.write("                    </nav> \n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <footer id=\"rodape\">\n");
      out.write("                <br />\n");
      out.write("                Copyright &copy; 2014 - by Allanderson, Aziclévio e João Paulo<br />\n");
      out.write("                Atualizado em 20 de Agosto de 2014\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
