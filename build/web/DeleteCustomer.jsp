<%-- 
    Document   : DeleteCustomer
    Created on : 3 Nov, 2022, 10:46:00 AM
    Author     : BASAVARAJU
--%>

<%@page import="database.ConnectBankDatabase"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Close Account</title>
    </head>
    <body>
        <%!Connection con = null;
            PreparedStatement pst = null;
          //  long aadharid = 0;
        %>
        <%
            con=ConnectBankDatabase.connectBankDB();
          long  aadharid = Long.parseLong(request.getParameter("aadharid"));
       //     out.println("aadharid"+aadharid);aadharid
          String sql = "delete from customer where aadharid='"+aadharid+"'";
            pst = con.prepareStatement(sql);
          //  pst.setLong(1, aadharid);
            int i = pst.executeUpdate();
            if (i > 0) 
            {
                out.println("<script>alert('Acount Closed Successfully!');</script>");
              //  request.getRequestDispatcher("AdminDashboard.jsp").include(request, response);
           }
            con.close();
        %>
    </body>
</html>
