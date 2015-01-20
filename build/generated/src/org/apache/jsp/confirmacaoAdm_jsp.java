package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmacaoAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Confirmação de Cadastro</title>\r\n");
      out.write("\t\t<link rel = \"shortcut icon\" href = \"imagens/libelula.jpg\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("            @font-face{\r\n");
      out.write("                font-family: 'FonteLogo';\r\n");
      out.write("                src:url(fonte/bubblegum-sans-regular.otf);\r\n");
      out.write("            }\r\n");
      out.write("            body{\r\n");
      out.write("                background: #dddddd;\r\n");
      out.write("                font-family: Verdana, Sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatação do corpo da página*/\r\n");
      out.write("            #corpo {\r\n");
      out.write("                border-radius: 20px;;\r\n");
      out.write("                width: 1050px;\r\n");
      out.write("                margin: 0px auto 0px auto;\r\n");
      out.write("                background-color: #FFFFFF;\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatação do cabeçalho onde se encontra o nome do sistema*/\r\n");
      out.write("            header#cabecalho {\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("                width: 1000px;\r\n");
      out.write("                height: 120px;\r\n");
      out.write("                margin: -10px auto -27px auto;\r\n");
      out.write("                border-bottom: 1px solid #606060;\t\t\t\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatação da imagem do logo*/\r\n");
      out.write("            header#cabecalho img{\r\n");
      out.write("                width: 80px;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatação do nome do sistema*/\r\n");
      out.write("            nav#nomeLogo h2{\r\n");
      out.write("                font-family: 'FonteLogo', sans-serif;\r\n");
      out.write("                color: #606060;\r\n");
      out.write("                font-size: 30pt;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                left: 85px;\r\n");
      out.write("                top: -95px;\t\t\t\t\t\t\t\r\n");
      out.write("            }\r\n");
      out.write("            nav#nomeLogo h3 {\r\n");
      out.write("                font-family: 'FonteLogo', sans-serif;\r\n");
      out.write("                color: #606060;\r\n");
      out.write("                font-size: 28pt;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                left: 20px;\r\n");
      out.write("                top: -130px;\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatação da mensagem de agradeciomento do cadastro*/\r\n");
      out.write("            header#agradecimento h1 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-family:Arial;\r\n");
      out.write("                font-size:30pt;\r\n");
      out.write("                color: blue;\r\n");
      out.write("                text-shadow: 2px 2px 2px black;\r\n");
      out.write("                padding: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            header#agradecimento h2 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-family:Arial;\r\n");
      out.write("                font-size:30pt;\r\n");
      out.write("                color: blue;\r\n");
      out.write("                text-shadow: 2px 2px 2px black;\r\n");
      out.write("            }\r\n");
      out.write("            /*Formatacção do formulário entrar*/\r\n");
      out.write("            form#formEntrar {\r\n");
      out.write("                display: block;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 550px;\r\n");
      out.write("                top: 40px;\r\n");
      out.write("                font-family: sans-serif;\r\n");
      out.write("                color: #606060;\r\n");
      out.write("            }\r\n");
      out.write("            form#formEntrar label{\r\n");
      out.write("                font-weight:bold;\r\n");
      out.write("            }\r\n");
      out.write("            input#csenhaentrar {\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                box-shadow: 0px 0px 5px rgba(0,0,0,.5);\r\n");
      out.write("                font-size:12pt;\r\n");
      out.write("            }\r\n");
      out.write("            input#cemailentrar {\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                box-shadow: 0px 0px 5px rgba(0,0,0,.5);\r\n");
      out.write("                font-size: 12pt;\r\n");
      out.write("            }\r\n");
      out.write("            input#centrar {\r\n");
      out.write("                height:25pt;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                top:10px;\r\n");
      out.write("            }\r\n");
      out.write("            footer#rodape {\r\n");
      out.write("                background-color: #FFF;\r\n");
      out.write("                width: 1000px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                margin: 0px auto 10px auto;\r\n");
      out.write("                border-top: 1px solid #606060;\t\r\n");
      out.write("                text-align: center;\t\r\n");
      out.write("                font-family: Arial, sans-serif;\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
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
      out.write("            <!--Formuláro de entrada no sistema falta colocar a ação do formulário-->\r\n");
      out.write("            <form id=\"formEntrar\" method=\"post\" action=\"LoginAdministrador\">\r\n");
      out.write("                <label for=\"cemailentrar\">Email:&nbsp;</label>\r\n");
      out.write("\t\t\t\t<input type=\"email\" name=\"temailentrar\" id=\"cemailentrar\" size=\"20\" maxlength=\"50\" />&nbsp;\r\n");
      out.write("                <label for=\"csenhaentrar\">Senha:&nbsp;</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"tsenhaentrar\" id=\"csenhaentrar\" size=\"20\" maxlength=\"15\"/>&nbsp;\r\n");
      out.write("                <input type=\"image\" src=\"imagens/botao_entrar.png\" id=\"centrar\" />\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <header id=\"agradecimento\">   \r\n");
      out.write("                <h1>Obrigado!</h1>    \r\n");
      out.write("                <h2>Seu Cadastro foi realizado com sucesso!</h2>\r\n");
      out.write("            </header>\r\n");
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
