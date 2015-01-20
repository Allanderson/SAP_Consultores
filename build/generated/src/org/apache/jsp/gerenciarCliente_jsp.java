package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang= \"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Gerenciar Cliente</title>\r\n");
      out.write("\t\t<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estiloGerenciarCliente.css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            @font-face{\r\n");
      out.write("                font-family: 'FonteLogo';\r\n");
      out.write("                src:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
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
      out.write("            <header id=\"boasVindas\">\r\n");
      out.write("               <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"bemVindo\">\r\n");
      out.write("                        Olá&nbsp;  \r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td id=\"nomeCliente\">\r\n");
      out.write("                        ");
      out.print( session.getAttribute("usuario") );
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>            \r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <header id=\"botaoSair\">\r\n");
      out.write("                <form id=\"sair\" action=\"Logoff\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" name=\"tSair\" id=\"cSair\" value=\"Sair\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <nav id=\"inicio\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\">\r\n");
      out.write("                        <a href=\"administrador.jsp\"><strong>Início</strong></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <nav id=\"gerenciarProduto\">                \t\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\">\r\n");
      out.write("                        <a href=\"gerenciarProduto.jsp\"><strong>Gerenciar Produto</strong></a>                    \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <nav id=\"gerenciarCliente\">      \r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\">\r\n");
      out.write("                        <a href=\"gerenciarCliente.jsp\"><strong>Gerenciar Cliente</strong></a>                 \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <nav id=\"gerenciarVenda\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\">\r\n");
      out.write("                        <a href=\"gerenciarVenda.jsp\"><strong>Gerenciar Venda</strong></a>                    \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>        \r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div id=\"conteudoDosClientes\">\r\n");
      out.write("                <h2 id=\"listarTodosOsClientes\">Listar Todos os Clientes</h2>\r\n");
      out.write("                <h3>Ao Clicar em <u>\"Listar Cliente\"</u> Será Exibida Uma<br/>&emsp;Lista Com Todos os Seus Clientes</h3>\r\n");
      out.write("\r\n");
      out.write("                <form id=\"listarClientes\" method=\"post\" >\r\n");
      out.write("                    <input type=\"image\" src=\"imagens/listarClientes.jpg\" name=\"tListarClientes\" id=\"cListarClientes\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <iframe src=\"tabelaComClientes.jsp\" name=\"janela\" id=\"frame-listarClientes\"></iframe>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <h2 id=\"removerCliente\">Remover Cliente</h2>\r\n");
      out.write("                <form id=\"removerCliente\" method=\"post\" action=\"RemoverClientes\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <legend>Remova Aqui Seus Clientes</legend>\r\n");
      out.write("                        <table id=\"removerCliente\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cNomeClienteRemove\">Nome do Cliente:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"gerenciarCliente\" name=\"NomeClienteRemover\" id=\"cNomeClienteRemove\" size=\"30\" maxlength=\"80\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cSobreNomeClienteRemove\">Sobrenome do Cliente:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"gerenciarCliente\" name=\"SobrenomeClienteRemover\" id=\"cSobreNomeClienteRemove\" size=\"30\" \r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"50\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cEmailClienteRemove\">Email do Cliente:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"gerenciarCliente\" name=\"EmailClienteRemover\" id=\"cEmailClienteRemove\" size=\"30\" maxlength=\"80\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"submit\" name=\"tRemover\" id=\"cRemover\" value=\"Remover\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <h2>Atualizar Cadastro do Cliente</h2>\r\n");
      out.write("                <h3>Preencha os Campos Que Deseja Alterar No Cadastro Do Cliente</h3>\r\n");
      out.write("                <form id=\"atualizarCadastroCliente\" method=\"post\" action=\"AtualizarDadosCliente\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <legend>Atualize o Cadastro do Seu Cliente</legend>\r\n");
      out.write("                        <table id=\"atualizarCadastroCliente\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cNomeCliente\">Identificador:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"gerenciarCliente\" name=\"NomeCliente\" id=\"cNomeCliente\" size=\"30\" maxlength=\"80\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cEnderecoCliente\">Endereço:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"gerenciarCliente\" name=\"EnderecoCliente\" id=\"cEnderecoCliente\" size=\"30\" maxlength=\"80\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cComplementoCliente\">Complemento:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"gerenciarCliente\" name=\"ComplementoCliente\" id=\"cComplementoCliente\" size=\"30\" maxlength=\"50\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cTelefoneCliente\">Telefone:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"gerenciarCliente\" name=\"TelefoneCliente\" id=\"cTelefoneCliente\" size=\"30\" maxlength=\"15\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"cEmailCliente\">Email:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"gerenciarCliente\" name=\"EmailCliente\" id=\"cEmailCliente\" size=\"30\" maxlength=\"80\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>                       \r\n");
      out.write("                        <input type=\"submit\"  value =\"Atualizar\" id=\"cAtualizar\" />\r\n");
      out.write("                        <input type=\"reset\" id=\"cLimpar\" value = \"limpar\" />                              \r\n");
      out.write("\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <footer id=\"rodape\">\r\n");
      out.write("                <br />\r\n");
      out.write("                Copyright &copy; 2014\r\n");
      out.write("            </footer>\r\n");
      out.write("            <br />\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
