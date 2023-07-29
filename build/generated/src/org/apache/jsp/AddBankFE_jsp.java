package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBankFE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Bank Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <body>\n");
      out.write("        <div> <h1> Add Bank Details </h1> </div>\n");
      out.write("        <hr>\n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\" action=\"AddBankDet.jsp\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter the IFSC Code\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"ifsc\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Select the Bank Name\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"bankname\">\n");
      out.write("                                <option>Axis </option>\n");
      out.write("                                <option>SBI</option>\n");
      out.write("                                <option>HDFC</option>\n");
      out.write("                                <option>ICICI</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter the Branch Name\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"branchname\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><center><input type=\"submit\" value=\"Ädd Bank\"></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    </body>\n");
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
