package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.ConnectBankDatabase;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class CustomerDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con=null;
        PreparedStatement ps=null;
        
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
      out.write("        <title>Customer Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
 
                String email=session.getAttribute("email").toString(); 
                String sql="SELECT cname from customer where email=?";
                con=ConnectBankDatabase.connectBankDB();
                ps=con.prepareStatement(sql);
                ps.setString(1, email);
                ResultSet rs=ps.executeQuery();
                
            
      out.write("\n");
      out.write("            ");
if(rs.next()){ 
      out.write("\n");
      out.write("            <h1 align=\"right\">User:");
      out.print(rs.getString("cname"));
      out.write("</h1>\n");
      out.write("            ");
}
            con.close();
            
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <button><a href=\"AddBenificierFE.jsp\">Add Benificier Account</button>\n");
      out.write("            <button><a href=\"TransferMoney.jsp\">Transfer</a> </button>\n");
      out.write("            <button><a href=\"ViewBalance.jsp\">View Balance</a></button>\n");
      out.write("            <button><a href=\"index.html\">Logout</a></button>\n");
      out.write("            \n");
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
