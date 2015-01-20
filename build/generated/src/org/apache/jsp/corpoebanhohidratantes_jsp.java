package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class corpoebanhohidratantes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Corpo e Banho Hidratantes</title>\r\n");
      out.write("\t\t<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href = \"estilo/estilohidratantes.css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            @font-face{\r\n");
      out.write("                font-family: 'FonteLogo';\r\n");
      out.write("                src:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes01 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Nativa-SPA-Locao-Cremosa-Hidratante-Exotica-Ameixa-400ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes02 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Cuide-se-Bem-Locao-Hidratante-Nutritiva-Camomila-e-Malva-400ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes03 {    \r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Egeo-Dolce-Hidratante-de-Banho-Marshmallow-250g.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes04 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Egeo-Dolce-Merengue-Mousse-Creme-Hidratante-Des-Corporal-250g.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes05 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Floratta-in-Blue-Creme-Hidratante-200ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes06 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Floratta-in-Gold-Creme-Hidratante-200ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes07 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Floratta-in-Rose-Creme-Hidratante-200ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes08 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Lily-Essence-Creme-Acetinado-Hidratante-Corporal-250g.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            ul#album-corpoebanho-hidratantes li#hidratantes09 {\r\n");
      out.write("                background: url(\"corpoebanhohidratantes/Nativa-SPA-Locao-Cremosa-Hidratante-Nutritiva-Acai-400ml.jpg\") no-repeat;\r\n");
      out.write("                background-position: 50% 50%;\r\n");
      out.write("                background-size: 400px 400px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <header id=\"boasVindas\">\r\n");
      out.write("                <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"bemVindo\">\r\n");
      out.write("                        Olá&nbsp; \r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td id=\"nomeCliente\">\r\n");
      out.write("                       ");
      out.print( session.getAttribute("usuario"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </header>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <header id=\"botaoSair\">\r\n");
      out.write("                <form id=\"sair\" action=\"Logoff\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" name=\"tSair\" id=\"cSair\" value=\"Sair\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("            </header>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("            <nav id=\"inicio\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"cliente.jsp\"><strong>Início</strong></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            \r\n");
      out.write("            <nav id=\"perfumaria\">               \t\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\"><a href=\"#\"><strong>Perfumaria</strong></a>\r\n");
      out.write("                \t<ul>\r\n");
      out.write("                            <li><a href=\"perfumariafeminino.jsp\"><strong>Feminino</strong></a></li>\r\n");
      out.write("                            <li><a href=\"perfumariamasculino.jsp\"><strong>Masculino</strong></a></li>\r\n");
      out.write("                            <li><a href=\"perfumariajovensecrianca.jsp\"><strong>Jovens e Crianças</strong></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("         \r\n");
      out.write("            <nav id=\"corpobanho\">      \r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"itemmenu\"><a href=\"#\"><strong>Corpo e Banho</strong></a>\r\n");
      out.write("               \t\t<ul>\r\n");
      out.write("                            <li><a href=\"corpoebanhohidratantes.jsp\"><strong>Hidratantes</strong></a></li>\r\n");
      out.write("                            <li><a href=\"corpoebanhosabonetes.jsp\"><strong>Sabonetes</strong></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("         \r\n");
      out.write("            <nav id=\"cabelo\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\"><strong>Cabelo</strong></a>\r\n");
      out.write("               \t\t<ul>\r\n");
      out.write("                            <li><a href=\"cabeloshampoo.jsp\"><strong>Shampoo</strong></a></li>\r\n");
      out.write("                         <li><a href=\"cabelocondicionador.jsp\"><strong>Condicionador</strong></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>        \r\n");
      out.write("            </nav>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("            \r\n");
      out.write("            <section id=\"corpol-full\">\r\n");
      out.write("                <article id=\"noticia-principal\">\r\n");
      out.write("                    <header id=\"cabecalho-artigo\">\r\n");
      out.write("                        <hgroup>\r\n");
      out.write("                            <h3>Corpo e Banho > Hidratantes</h3>\r\n");
      out.write("                            <h1>Galeria de Corpo e Banho Hidratantes</h1>\r\n");
      out.write("                            <h2>Passe o Mouse Por Cima das Imagens Para Ver Mais Detalhes dos Produtos</h2>                        \r\n");
      out.write("                        </hgroup>\r\n");
      out.write("                    </header>     \r\n");
      out.write("            \r\n");
      out.write("                    <ul id=\"album-corpoebanho-hidratantes\">\r\n");
      out.write("                        <li id=\"hidratantes01\"><span>Nativa SPA  Ameixa 400ml R$33,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes02\"><span>Camomila e Malva 400ml R$25,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes03\"><span>Egeo Dolce 250g R$35,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes04\"><span>Egeo Dolce Merengue 250g R$45,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes05\"><span>Floratta In Blue 200ml R$32,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes06\"><span>Floratta In Gold 200ml R$32,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes07\"><span>Floratta In Rose 200g R$32,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes08\"><span>Lily Essence 250g R$60,00</span></li>\r\n");
      out.write("                        <li id=\"hidratantes09\"><span>Nativa SPA  Açaí 400ml R$32,00</span></li>\r\n");
      out.write("                    </ul>                   \r\n");
      out.write("                </article>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <footer id=\"rodape\">\r\n");
      out.write("                <br />\r\n");
      out.write("                Copyright &copy; 2014\r\n");
      out.write("            </footer>\r\n");
      out.write("            <br />\r\n");
      out.write("    \r\n");
      out.write("        </div>\r\n");
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
