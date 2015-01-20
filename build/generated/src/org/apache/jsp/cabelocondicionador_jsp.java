package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cabelocondicionador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Cabelo Condicionador</title>\r\n");
      out.write("<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estilocondicionador.css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("    @font-face{\r\n");
      out.write("\tfont-family: 'FonteLogo';\r\n");
      out.write("\tsrc:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("\t}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador01 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Baby-Boti-Condicionador-Suave-200ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador02 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Capricho-Condicionador-Antifrizz-200ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador03 {    \r\n");
      out.write("    background: url(\"cabelocondicionador/Cuide-se-Bem-Condicionador-Fios-Hidratados-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador04 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Exotico-Restauracao-dos-Fios-Ameixa-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador05 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Intenso-Forca-para-os-Fios-Amora+Sandalo-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador06 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Protecao-dos-Fios-Jabuticaba+Castanha-do-Para-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador07 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Purificante-Brilho-e-Maciez-Verbena+Aloe-Vera-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador08 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Refrescante-Purificacao-da-Raiz-Melissa+Alecrim-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("ul#album-cabelo-condicionador li#condicionador09 {\r\n");
      out.write("    background: url(\"cabelocondicionador/Nativa-SPA-Condicionador-Revitalizante-Equilibrio-dos-Fios-Blueberry-250ml.jpg\") no-repeat;\r\n");
      out.write("    background-position: 50% 50%;\r\n");
      out.write("    background-size: 400px 400px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"corpo\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <header id=\"cabecalho\">\r\n");
      out.write("            <img src=\"imagens/libelula.jpg\"/>\r\n");
      out.write("            <nav id=\"nomeLogo\">\r\n");
      out.write("                <h2>SAP</h2>\r\n");
      out.write("                <h3> Consultores </h3>\r\n");
      out.write("            </nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("         \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <header id=\"boasVindas\">\r\n");
      out.write("             <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"bemVindo\">\r\n");
      out.write("                        Olá!&nbsp; \r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td id=\"nomeCliente\">\r\n");
      out.write("                        \r\n");
      out.write("                        ");
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
      out.write("                <input type=\"submit\"  name=\"tSair\" id=\"cSair\" value=\"Sair\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <nav id=\"inicio\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"cliente.jsp\"><strong>Início</strong></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        <nav id=\"perfumaria\"> \r\n");
      out.write("               \t\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"itemmenu\"><a href=\"#\"><strong>Perfumaria</strong></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"perfumariafeminino.jsp\"><strong>Feminino</strong></a></li>\r\n");
      out.write("                        <li><a href=\"perfumariamasculino.jsp\"><strong>Masculino</strong></a></li>\r\n");
      out.write("                        <li><a href=\"perfumariajovensecrianca.jsp\"><strong>Jovens e Crianças</strong></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("               \t</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("         \r\n");
      out.write("        <nav id=\"corpobanho\">      \r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li class=\"itemmenu\"><a href=\"#\"><strong>Corpo e Banho</strong></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                    \t<li><a href=\"corpoebanhohidratantes.jsp\"><strong>Hidratantes</strong></a></li>\r\n");
      out.write("                        <li><a href=\"corpoebanhosabonetes.jsp\"><strong>Sabonetes</strong></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("            \t</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("         \r\n");
      out.write("        <nav id=\"cabelo\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\"><strong>Cabelo</strong></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                    \t<li><a href=\"cabeloshampoo.jsp\"><strong>Shampoo</strong></a></li>\r\n");
      out.write("                        <li><a href=\"cabelocondicionador.jsp\"><strong>Condicionador</strong></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>        \r\n");
      out.write("    \t</nav>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("           \r\n");
      out.write("        <section id=\"corpol-full\">\r\n");
      out.write("            <article id=\"noticia-principal\">\r\n");
      out.write("                <header id=\"cabecalho-artigo\">\r\n");
      out.write("                    <hgroup>\r\n");
      out.write("                        <h3>Cabelo > Condicionador</h3>\r\n");
      out.write("                        <h1>Galeria de Cabelo Condicionador</h1>\r\n");
      out.write("                        <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        \r\n");
      out.write("                    </hgroup>\r\n");
      out.write("                </header>     \r\n");
      out.write("            \r\n");
      out.write("                <ul id=\"album-cabelo-condicionador\">\r\n");
      out.write("                    <li id=\"condicionador01\"><span>Baby Boti Condicionador 200ml R$18,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador02\"><span>Capricho Antifrizz 200ml R$16,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador03\"><span>Fios Hidratados 250ml R$17,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador04\"><span>Restauração Ameixa 250ml R$25,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador05\"><span>Fotificação Amora 250ml R$25,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador06\"><span>Proteção Jabuticaba 250ml R$25,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador07\"><span>Brilho e Maciez Verbana250ml R$25,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador08\"><span>Purificação Alecrim 250ml R$25,00</span></li>\r\n");
      out.write("                    <li id=\"condicionador09\"><span>Revitalizante 250ml R$25,00</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                   \r\n");
      out.write("            </article>\r\n");
      out.write("        </section>     \r\n");
      out.write("     \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <footer id=\"rodape\">\r\n");
      out.write("            <br />\r\n");
      out.write("            Copyright &copy; 2014\r\n");
      out.write("        </footer>\r\n");
      out.write("       \r\n");
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
