package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import database.ConnectBankDatabase;

public final class AddAdminFE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADD ADMIN DETAILS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            Connection con=ConnectBankDatabase.connectBankDB();
            String sql="select ifsc from bank";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
        
      out.write("\n");
      out.write("        <div><h1>ADD ADMIN DETAILS</h1></div>\n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\" action=\"AddAdmin.jsp\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter Admin ID:\n");
      out.write("                        </th> \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"aid\"><br><br>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter Email ID:\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" name=\"eid\"><br><br>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter Password: \n");
      out.write("                        </th> \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"pwd\"><br><br>\n");
      out.write("                        </td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter the Role\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                           <input type=\"radio\" name=\"Manager\" value=\"manager\"> Manager\n");
      out.write("                            <input type=\"radio\" name=\"Manager\" value=\"Cashier\"> Cashier\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <th>\n");
      out.write("                           Select the IFSC Code\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"ifsc\">\n");
      out.write("                                ");
while(rs.next())
                                {
                                    out.println("<option>"+rs.getInt(1)+"</option>");
                                }
                                con.close();
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter the Branch Address\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"address\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Enter the Name\n");
      out.write("                        </th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td colspan=\"2\"><center><input type=\"submit\" value=\"Ädd Admin\"></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("           </form>\n");
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
