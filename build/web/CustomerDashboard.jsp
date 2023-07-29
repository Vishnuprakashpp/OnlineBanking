<%-- 
    Document   : CustomerDashboard
    Created on : 31 Oct, 2022, 11:48:58 AM
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
        <title>Customer Dashboard</title>
    </head>
    <body>
        <%! Connection con=null;
        PreparedStatement ps=null;
        %>
        <div>
            <% 
                String email=session.getAttribute("email").toString(); 
                String sql="SELECT cname from customer where email=?";
                con=ConnectBankDatabase.connectBankDB();
                ps=con.prepareStatement(sql);
                ps.setString(1, email);
                ResultSet rs=ps.executeQuery();
                
            %>
            <%if(rs.next()){ %>
            <h1 align="right">User:<%=rs.getString("cname")%></h1>
            <%}
            con.close();
            %>
        <hr>
        </div>
        <div>
            <button><a href="AddBenificierFE.jsp">Add Benificier Account</button>
            <button><a href="TransferMoney.jsp">Transfer</a> </button>
            <button><a href="ViewBalance.jsp">View Balance</a></button>
            <button><a href="index.html">Logout</a></button>
            
        </div>
    </body>
</html>
