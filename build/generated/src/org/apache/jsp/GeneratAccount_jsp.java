package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.ConnectBankDatabase;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class GeneratAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con=null;
            Statement stmt=null; 
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Generate Account </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");

                con=ConnectBankDatabase.connectBankDB();
             String sql="select ifsc from bank";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);    
            
      out.write("\n");
      out.write("        <div>\n");
      out.write("        <h1>Generate Account Number</h1>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\" action =\"GenerateAccountBE.jsp\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Enter the Account Number</th>\n");
      out.write("                        <td><input type=\"text\" name=\"accountno\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Enter the Aaadhar Number</th>\n");
      out.write("                        <td><input type=\"text\" name=\"aadharno\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Select the IFSC code</th>\n");
      out.write("                                <td><select name=\"ifsc\">\n");
      out.write("                               ");
while(rs.next()){        
                               out.println("<option>+rs.getInt(1)+</option>");
                               }
                               con.close();
      out.write("\n");
      out.write("                                </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Select the Date</th>\n");
      out.write("                        <td><input type=\"date\" name=\"dot\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
