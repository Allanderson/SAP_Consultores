package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comprasPassadas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>Compras Passadas</title>\r\n");
      out.write("\t<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estiloComprasPassadas.css\"/>\r\n");
      out.write("    <style>\r\n");
      out.write("        @font-face{\r\n");
      out.write("        font-family: 'FonteLogo';\r\n");
      out.write("        src:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"corpo\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <header id=\"cabecalho\">\r\n");
      out.write("            <img src=\"imagens/libelula.jpg\"/>\r\n");
      out.write("            <nav id=\"nomeLogo\">\r\n");
      out.write("                <h2>SAP</h2>\r\n");
      out.write("        \t<h3> Consultores </h3>\r\n");
      out.write("            </nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <header id=\"boasVindas\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"bemVindo\">\r\n");
      out.write("                       Olá&nbsp;\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td id=\"nomeCliente\">\r\n");
      out.write("                       ");
      out.print( session.getAttribute("usuario"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <header id=\"botaoSair\">\r\n");
      out.write("            <form id=\"sair\" action=\"Logoff\" method=\"post\">\r\n");
      out.write("                <input type=\"submit\" name=\"tSair\" id=\"cSair\" value=\"Sair\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\t<section id=\"areacompras\">\r\n");
      out.write("            <nav id=\"menucompras\"> \r\n");
      out.write("               \r\n");
      out.write("                <ul id=\"inicio\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"cliente.jsp\"><strong><center>Início</center></strong></a>                       \r\n");
      out.write("                    </li>         \r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("                <ul id=\"comprasAtuais\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"comprasAtuais.jsp\"><strong>Compras Atuais</strong></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("                <ul id=\"comprasPassadas\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"comprasPassadas.jsp\"><strong>Compras Passadas</strong></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <aside id=\"mensagemLateral\">\r\n");
      out.write("            <h3>Confira as suas compras Passadas</h3>\r\n");
      out.write("        </aside>\r\n");
      out.write("        \r\n");
      out.write("        <iframe src=\"tabelaComprasPassadas.jsp\" name=\"janela\" id=\"frame-comprasPassadas\"></iframe>\r\n");
      out.write("           \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <footer id=\"rodape\">\r\n");
      out.write("            <br />\r\n");
      out.write("            Copyright &copy; 2014\r\n");
      out.write("        </footer>\r\n");
      out.write("        <br />\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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