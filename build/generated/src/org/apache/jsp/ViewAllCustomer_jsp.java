package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.ConnectBankDatabase;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class ViewAllCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
         Connection con=null;
         ResultSet rs=null;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer Details</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            con=ConnectBankDatabase.connectBankDB();
            String sql="select aadharid,cname, email, dob,address, mno, pancard from customer";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            
        
      out.write("\n");
      out.write("         <div class=\"container mt-3\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead class=\"table table-success\"> \n");
      out.write("                <tr>\n");
      out.write("                <th>Aadhar id</th>\n");
      out.write("                <th>Customer Name</th>\n");
      out.write("                <th>E-Mail ID</th>\n");
      out.write("                <th>DOB</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>MNO</th>\n");
      out.write("                <th>Pan Card</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("            </tr>\n");
      out.write("                </thead>\n");
      out.write("        ");
 while (rs.next()){ 
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("        <tr class=\"table table-primary\"> \n");
      out.write("            <td>");
      out.print(rs.getLong(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getLong(6));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("            <td><a href=\"DeleteCustomer.jsp?aadharid=");
      out.print(rs.getLong(1));
      out.write("\">Delete</a></td>\n");
      out.write("            <td><a href=\"UpdateCustomer.jsp?aadharid=");
      out.print(rs.getLong(1));
      out.write("&cname=");
      out.print(rs.getString(2));
      out.write("&email=");
      out.print(rs.getString(3));
      out.write("&dob=");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("                   &address=");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                   &mno=");
      out.print(rs.getLong(6));
      out.write("\n");
      out.write("                   &pancard=");
      out.print(rs.getString(7));
      out.write("\">Update</a></td>\n");
      out.write("        </tr>\n");
      out.write("        </tbody>\n");
      out.write("        ");
}
        con.close();
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <button onclick=\"window.print()\">Print</button>\n");
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
