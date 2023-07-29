<%-- 
    Document   : UpdateCustomerBE
    Created on : 29 Nov, 2022, 10:45:58 AM
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
        <title>Update Customer Details</title>
    </head>
    <body>
        <h1>Update Details</h1>
        <%! Connection con = null;
            PreparedStatement pst = null;
        %>
        <%
            con = ConnectBankDatabase.connectBankDB();
            long aadharid = Long.parseLong(request.getParameter("aadharid"));
            String cname = request.getParameter("cname");
            String emailid = request.getParameter("emailid");
          //  String pwd = request.getParameter("pwd");
            String dob = request.getParameter("dob");
            String address = request.getParameter("address");
            long mno = Long.parseLong(request.getParameter("mno"));
           out.println("MNO:"+mno);
            String pancard = request.getParameter("pancard");
            String sql = "update CUSTOMER set cname=?,email=?,dob=?,address=?,mno=?,pancard=? where aadharid=?";
            pst = con.prepareStatement(sql);
            pst.setLong(7,aadharid);
            pst.setString(1, cname);
            pst.setString(2, emailid);
            pst.setString(3, dob);
            pst.setString(4, address);
            pst.setLong(5, mno);
            pst.setString(6, pancard);
            int i = pst.executeUpdate();
            
        %>
        <% if(i>0){%>
        <h1> Details Updated to Database </h1>
        <% } else{ %>
        <h1> Details not Updated</h1>
        <% }
        con.close();
        %>
    </body>
</html>
