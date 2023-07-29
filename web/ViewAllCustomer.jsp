<%-- 
    Document   : ViewAllCustomer
    Created on : Nov 28, 2022, 12:43:40 PM
    Author     : Basavaraju
--%>

<%@page import="database.ConnectBankDatabase"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Details</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%! 
         Connection con=null;
         ResultSet rs=null;
         Statement stmt=null;
        %>
        <%
            con=ConnectBankDatabase.connectBankDB();
            String sql="select aadharid,cname, email, dob,address, mno, pancard from customer";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            
        %>
         <div class="container mt-3">
            <table class="table">
                <thead class="table table-success"> 
                <tr>
                <th>Aadhar id</th>
                <th>Customer Name</th>
                <th>E-Mail ID</th>
                <th>DOB</th>
                <th>Address</th>
                <th>MNO</th>
                <th>Pan Card</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
                </thead>
        <% while (rs.next()){ %>
        <tbody>
        <tr class="table table-primary"> 
            <td><%=rs.getLong(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getLong(6)%></td>
            <td><%=rs.getString(7)%></td>
            <td><a href="DeleteCustomer.jsp?aadharid=<%=rs.getLong(1)%>">Delete</a></td>
            <td><a href="UpdateCustomer.jsp?aadharid=<%=rs.getLong(1)%>&cname=<%=rs.getString(2)%>&email=<%=rs.getString(3)%>&dob=<%=rs.getString(4)%>
                   &address=<%=rs.getString(5)%>&mno=<%=rs.getLong(6)%>&pancard=<%=rs.getString(7)%>">Update</a></td>
        </tr>
        </tbody>
        <%}
        con.close();
        %>
        </table>
        </div>
        <button onclick="window.print()">Print</button>
    </body>
</html>
