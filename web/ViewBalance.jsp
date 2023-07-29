<%-- 
    Document   : ViewBalance
    Created on : 3 Nov, 2022, 12:44:58 PM
    Author     : BASAVARAJU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="database.ConnectBankDatabase"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Balance</title>
    </head>
    <body>
        <%! Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        long aadharid=0;
%>
        <%
        con=ConnectBankDatabase.connectBankDB();
        String email=session.getAttribute("email").toString();
        String sql="select aadharid from customer where email=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, email);
        rs=ps.executeQuery();
        if(rs.next())
        {
            aadharid=rs.getLong("aadharid");
        }
        rs.close();
       ps.close();
        String sql2="select c.aadharid, cname, ac.currentbal "
                + "from customer c, account ac where c.aadharid=? and c.aadharid=ac.aadharid";
            ps=con.prepareStatement(sql2);
            ps.setLong(1,aadharid );
            rs=ps.executeQuery();
        %>
        <Table border="1">
            <tr>
                <th>Name</th>
                <th>Current Bal</th>
            </tr>
             <% if(rs.next())
            {%>
            <tr>
                <td><%=rs.getString("cname")%></td>
                <td><%=rs.getDouble("ac.currentbal")%></td>
                </tr>
            <%}%>
        </Table>
     
                
     <%  con.close(); %>
    </body>
</html>
