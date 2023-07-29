package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.ConnectBankDatabase;
import java.sql.Statement;
import java.sql.Connection;

public final class ViewAllCustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con = null;
                Statement stmt;
                ResultSet rs=null;
                int count=0;
            
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Customer Details</h1>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
 con = ConnectBankDatabase.connectBankDB();
                stmt = con.createStatement();
                String sql = "SELECT c.aadharid, cname, email, mno, pancard,currentbal "
                        + "FROM customer c,account a WHERE c.aadharid=a.aadharid";
                String sql2="select count(*) as noofrec from customer";
                rs = stmt.executeQuery(sql);
            
      out.write("\n");
      out.write("            <div class=\"container mt-3\">\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <thead class=\"table table-success\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th> Aadhar No. </th> \n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Mobile No.</th>\n");
      out.write("                        <th>Pan Card</th>\n");
      out.write("                        <th>Curent Balance</th>\n");
      out.write("                        <th>Close Account </th>\n");
      out.write("                    </tr> \n");
      out.write("                </thead>\n");
      out.write("                ");

                    while (rs.next()) {
                        
                
      out.write("   \n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"table table-primary\">\n");
      out.write("                        <td>");
      out.print(rs.getLong("aadharid"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("cname"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getLong("mno"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("pancard"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getDouble("currentbal"));
      out.write("</td>\n");
      out.write("                        <td><a href=\"DeleteCustomer.jsp?aid=");
      out.print(rs.getLong("aadharid"));
      out.write("\">Close</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
}
                    //stmt.close();
                    rs.close();
                    
                    rs=stmt.executeQuery(sql2);
                    if(rs.next()){
                         count=rs.getInt(1);
                }
                rs.close();
                    con.close();
                    
      out.write("\n");
      out.write("                    <tr class=\"table table-info\"><td colspan=\"6\"><center><b>Total No.of Customers:");
      out.print(count);
      out.write("</center></b></td></tr>\n");
      out.write("                    </div>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
