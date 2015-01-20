package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html\">\r\n");
      out.write("<html lang = \"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Cadastro do Administrador</title>\r\n");
      out.write("\t\t<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estiloCadastroAdministrador.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <style>@font-face{\r\n");
      out.write("                font-family: 'FonteLogo';\r\n");
      out.write("                src:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"corpo\">\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <header id=\"cabecalho\">\r\n");
      out.write("                <img src=\"imagens/libelula.jpg\"/>\r\n");
      out.write("                <nav id=\"nomeLogo\">\r\n");
      out.write("                    <h2>SAP</h2>\r\n");
      out.write("                    <h3> Consultores </h3>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <form id=\"formEntrar\" method = \"POST\" action = \"LoginAdministrador\" >\r\n");
      out.write("                <label for=\"cemailentrar\">Email:&nbsp;</label>\r\n");
      out.write("\t\t\t\t<input type=\"email\" name=\"temailentrar\" id=\"cemailentrar\" size=\"20\" maxlength=\"50\" />&nbsp;\r\n");
      out.write("                <label for=\"csenhaentrar\">Senha:&nbsp;</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"tsenhaentrar\" id=\"csenhaentrar\" size=\"20\" maxlength=\"15\"/>&nbsp;\r\n");
      out.write("                <input type=\"image\" src=\"imagens/botao_entrar.png\" id=\"centrar\" />\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write(" \r\n");
      out.write("            <form  id=\"formcadastro\" method = \"POST\" action =\"CadastrarAdministrador\">\r\n");
      out.write("                <h1>Cadastro do Administrador</h1>\r\n");
      out.write("                    <fieldset id=\"dadospessoais\">\r\n");
      out.write("                        <legend id=\"dadospessoais\">\r\n");
      out.write("                            <strong>Dados Pessoais</strong>\r\n");
      out.write("                        </legend>\r\n");
      out.write("                        <table id=\"dadospessoais\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cnomecadastro\">Nome:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputdadospesoais\" name=\"nome\" id=\"cnomecadastro\" size=\"30\" maxlength=\"50\" \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Digite seu nome\"  required = \"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"csobrenome\">Sobrenome:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"inputdadospesoais\" name=\"sobrenome\" id=\"csobrenome\" size=\"30\" maxlength=\"50\" \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Digite seu sobre nome\" required = \"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cemail\">Email:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"inputdadospesoais\" name=\"email\" id=\"cemail\" size=\"30\" maxlength=\"50\" \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Ex: consultores@gmail.com\" required = \"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr> \r\n");
      out.write("                                <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"csenha\">Senha:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"senha\" class=\"inputdadospesoais\" id=\"csenha\" size=\"30\" maxlength=\"15\" \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Até 15 dígitos\" required = \"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cconfirmasenha\">Confirmar Senha:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"confirmarsenha\" id=\"cconfirmasenha\" class=\"inputdadospesoais\" size=\"30\" maxlength=\"15\" \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Repita a senha\" required = \"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </tr> \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <nav id=\"botoessubmitcadastro\">\t\t\r\n");
      out.write("                            <input type=\"submit\" value = \"Enviar\" id=\"ccadastrar\" />\r\n");
      out.write("                            <input type=\"reset\" value = \"Limpar\" id=\"climpar\" /> \r\n");
      out.write("                        </nav> \r\n");
      out.write("                    </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <footer id=\"rodape\">\r\n");
      out.write("                <br />\r\n");
      out.write("                Copyright &copy; 2014\r\n");
      out.write("            </footer>\r\n");
      out.write("            \r\n");
      out.write("            <br />\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
