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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"img/fondo.jpg\">\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("        <!<!-- En el acction colocar el nombre del controlador, para este caso \r\n");
      out.write("            es recibir.do (la extension.do no importa solo indica que es servlet)-->\r\n");
      out.write("  \r\n");
      out.write("            <style>\r\n");
      out.write("    \r\n");
      out.write("    html{\r\n");
      out.write("        min-height: 100%;\r\n");
      out.write("        max-width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    div{\r\n");
      out.write("        border-radius: 5%;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    h1{\r\n");
      out.write("      color: white;\r\n");
      out.write("    }\r\n");
      out.write("    label{\r\n");
      out.write("      color: white;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("  \r\n");
      out.write("  <form action=\"recibir.do\" method=\"POST\">\r\n");
      out.write("        <div class=\"row justify-content-center \">\r\n");
      out.write("            <div class=\"col-md-6 bg-dark\">\r\n");
      out.write("              \r\n");
      out.write("        <h1 class=\"text-center fw-bolder\">Registro de personas</h1>\r\n");
      out.write("        <hr class=\"bg-white\" size=\"10\">\r\n");
      out.write("                \r\n");
      out.write("        <div class=\"row-md-4\">\r\n");
      out.write("                    <label for=\"colFormLabel\" class=\"row-sm-2 row-form-label\"><h6>DUI</h6></label>\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <input type=\"text\" value=\"\" class=\"form-control\" name=\"txtDui\" placeholder=\"Ingrese el DUI de la persona\" aria-label=\"dui\" aria-describedby=\"basic-addon1\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row-md-4\">\r\n");
      out.write("                    <label for=\"colFormLabel\" class=\"row-sm-2 row-form-label\"><h6>Nombre</h6></label>\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <input type=\"text\" value=\"\" class=\"form-control\" name=\"txtNombres\" placeholder=\"Ingrese los nombres de la persona\" aria-label=\"nombre\" aria-describedby=\"basic-addon1\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row-md-4\">\r\n");
      out.write("                    <label for=\"colFormLabel\" class=\"row-sm-2 row-form-label\"><h6>Apellidos</h6></label>\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <input type=\"text\" value=\"\" class=\"form-control\" name=\"txtApellidos\" placeholder=\"Ingrese los apellidos de la persona\" aria-label=\"apellidos\" aria-describedby=\"basic-addon1\" required>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    <hr class=\"bg-white\" size=\"10\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <center>\r\n");
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" value=\"Registrar\" />\r\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"mostrar.do\" role=\"button\">Consultar</a>\r\n");
      out.write("                            </center>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <br>\r\n");
      out.write("        </form>   \r\n");
      out.write("</div>\r\n");
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
