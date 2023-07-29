<%-- 
    Document   : TransferMoney
    Created on : 31 Oct, 2022, 11:56:55 AM
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
        <title>Transfer Money</title>
    </head>
    <body>
        <%! Connection con = null;
            PreparedStatement ps = null;
            long aadharno = 0;
        %>
        <%
            con = ConnectBankDatabase.connectBankDB();
            String email = session.getAttribute("email").toString();
            //out.println(email);
            String sql1 = "select aadharid from customer where email=?";
            String sql2 = "select accountno from benificier where aadhardid=?";
            ps = con.prepareStatement(sql1);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aadharno = rs.getLong("aadharid");
            }
            ps.close();
            rs.close();
            ps = con.prepareStatement(sql2);
            ps.setLong(1, aadharno);
            rs = ps.executeQuery();
        %>
        <h1>Transer Money</h1>
            <form method="post" action="UpdateMoney.jsp">
            <table border="1">
                <tr>
                    <th>Select the Benificier Account Number of Receiver:</th>
                    <td><% while (rs.next()) {%>
                        <input type="radio"  name="bacountno" value="<%=rs.getLong("accountno")%>"><%=rs.getLong("accountno")%></input>
                        <%}
                            ps.close();
                            rs.close();
                            con.close();%>
                    </td>              
                </tr>
                <tr>
                    <th>Enter the Amount to be Transfer:</th>
                    <td><input type="text" name="amount"></td>
                </tr>
                <tr>
                    <th>Enter the Account Number of Sender:</th>
                    <td><input type="text" name="sendaccountno"></td>
                </tr>
                <tr>
                    <td colspan="2">
                <center><input type="submit" value="Send Money"></center>
                </tr>
            </table>
    </body>
</html>
