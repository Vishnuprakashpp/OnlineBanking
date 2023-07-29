package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import database.ConnectBankDatabase;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class TransferMoney_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con=null;
            PreparedStatement ps=null;
            long aadharno=0;
            
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
      out.write("        <title>Transfer Money</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");

            con=ConnectBankDatabase.connectBankDB();
            String email=session.getAttribute("email").toString();
            //out.println(email);
            String sql1="select aadharid from customer where email=?";
            String sql2="select accountno from benificier where aadhardid=?";
            ps=con.prepareStatement(sql1);
            ps.setString(1, email);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                aadharno=rs.getLong("aadharid");
            }
            ps.close();
            rs.close();
            ps=con.prepareStatement(sql2);
            ps.setLong(1, aadharno);
            rs=ps.executeQuery();
           
            
      out.write("\n");
      out.write("     <h1>Transer Money</h1>\n");
      out.write("        <form method=\"post\" action=\"UpdateMoney.jsp\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Select the Benificier Account Number of Receiver:</th>\n");
      out.write("                    <td>");
 while(rs.next()){
      out.write("\n");
      out.write("                      <input type=\"radio\"  name=\"bacountno\" value=\"");
      out.print(rs.getLong("accountno"));
      out.write('"');
      out.write('>');
      out.print(rs.getLong("accountno"));
      out.write("</input>\n");
      out.write("                       \n");
      out.write("                       ");
}
                       ps.close();
                       rs.close();
                       con.close();
      out.write("\n");
      out.write("                    </td>               </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Enter the Amount to be Transfer:</th>\n");
      out.write("                    <td><input type=\"text\" name=\"amount\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Enter the Account Number of Sender:</th>\n");
      out.write("                    <td><input type=\"text\" name=\"sendaccountno\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                <center><input type=\"submit\" value=\"Send Money\"></center>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("</body>\n");
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
