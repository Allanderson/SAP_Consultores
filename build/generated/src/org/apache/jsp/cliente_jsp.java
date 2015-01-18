package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang = \"pt-br\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estilocliente.css\"/>\n");
      out.write("<title>Área do Cliente</title>\n");
      out.write("\n");
      out.write("<style>@font-face{\n");
      out.write("    font-family: 'FonteLogo';\n");
      out.write("        src:url(fonte/bubblegum-sans-regular.otf);\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"corpo\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <header id=\"cabecalho\">\n");
      out.write("            <img src=\"imagens/libelula.jpg\"/>\n");
      out.write("            <nav id=\"nomeLogo\">\n");
      out.write("                <h2>SAP</h2>\n");
      out.write("        \t<h3> Consultores </h3>\n");
      out.write("            </nav>\n");
      out.write("\t</header>\n");
      out.write("         \n");
      out.write("        ");
      out.write("\n");
      out.write("        <header id=\"boasVindas\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"bemVindo\">\n");
      out.write("                        <h1>Olá&nbsp;</h1>  \n");
      out.write("                    </td>\n");
      out.write("                    <td id=\"nomeCliente\">\n");
      out.write("                        <h1>");
      out.print( session.getAttribute("usuario"));
      out.write("</h1>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <header id=\"botaoSair\">\n");
      out.write("            <form id=\"sair\" action=\"Logoff\" method=\"post\">\n");
      out.write("                <input type=\"submit\" name=\"tSair\" id=\"cSair\" value=\"Sair\"/>\n");
      out.write("            </form>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\t<section id=\"areacompras\">\n");
      out.write("            <nav id=\"menucompras\"> \n");
      out.write("                <h1>Compras</h1>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><strong>Minhas Compras</strong></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"comprasAtuais.jsp\"><strong>Compras Atuais</strong></a></li>\n");
      out.write("                            <li><a href=\"comprasPassadas.jsp\"><strong>Compras passadas</strong></a></li>                  \n");
      out.write("                        </ul>\n");
      out.write("                    </li>         \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\t\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("        \n");
      out.write("            <div id=\"divida\">\n");
      out.write("   \t\t<table id=\"minhadivida\">\n");
      out.write("                    <tr>\n");
      out.write("    \t\t\t<td id=\"mdivida\"><strong>Minha Dívida</strong></td>\n");
      out.write("                        <td id=\"valor\">R$ 100,00</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br />\n");
      out.write("            \n");
      out.write("            <div id=\"pagamento\">\n");
      out.write("                <table id=\"pagamento\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><strong>Último Pagamento</strong></td>\n");
      out.write("                        <td>14/07/2014</td>\n");
      out.write("                        <td>R$ 350,00</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("        </section>\n");
      out.write("    \n");
      out.write("        ");
      out.write("\n");
      out.write("        <aside id=\"areaprodutos\"> \n");
      out.write("            <h1>Produtos</h1>\n");
      out.write("        </aside>\n");
      out.write("    \t\n");
      out.write("    \t<nav id=\"perfumaria\">                \t\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"itemmenu\"><a href=\"#\"><strong>Perfumaria</strong></a>\n");
      out.write("                \t<ul>\n");
      out.write("                    \t<li><a href=\"perfumariafeminino.jsp\"><strong>Feminino</strong></a></li>\n");
      out.write("                        <li><a href=\"perfumariamasculino.jsp\"><strong>Masculino</strong></a></li>\n");
      out.write("                        <li><a href=\"perfumariajovensecrianca.jsp\"><strong>Jovens e Crianças</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("               \t</li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("        <nav id=\"corpobanho\">      \n");
      out.write("            <ul>\n");
      out.write("            \t<li class=\"itemmenu\"><a href=\"#\"><strong>Corpo e Banho</strong></a>\n");
      out.write("                    <ul>\n");
      out.write("                    \t<li><a href=\"corpoebanhohidratantes.jsp\"><strong>Hidratantes</strong></a></li>\n");
      out.write("                        <li><a href=\"corpoebanhosabonetes.jsp\"><strong>Sabonetes</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("            \t</li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("        <nav id=\"cabelo\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\"><strong>Cabelo</strong></a>\n");
      out.write("                    <ul>\n");
      out.write("                    \t<li><a href=\"cabeloshampoo.jsp\"><strong>Shampoo</strong></a></li>\n");
      out.write("                        <li><a href=\"cabelocondicionador.jsp\"><strong>Condicionador</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>        \n");
      out.write("    \t</nav>\n");
      out.write("\t\n");
      out.write("        ");
      out.write("\n");
      out.write("\t<footer id=\"rodape\">\n");
      out.write("            <br />\n");
      out.write("            Copyright &copy; 2014 - by Allanderson, Aziclévio e João Paulo<br />\n");
      out.write("            Atualizado em 20 de Agosto de 2014\n");
      out.write("\t</footer>\n");
      out.write("        \n");
      out.write("\t<br />\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
