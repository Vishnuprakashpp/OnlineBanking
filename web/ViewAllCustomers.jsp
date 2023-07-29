<%-- 
    Document   : ViewAllCustomers
    Created on : 3 Nov, 2022, 10:01:59 AM
    Author     : BASAVARAJU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="database.ConnectBankDatabase"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div>
            <h1>Customer Details</h1>
        </div>
        <hr>
        
            <%! Connection con = null;
                Statement stmt;
                ResultSet rs=null;
                int count=0;
            %>
            <% con = ConnectBankDatabase.connectBankDB();
                stmt = con.createStatement();
                String sql = "SELECT c.aadharid, cname, email, mno, pancard,currentbal "
                        + "FROM customer c,account a WHERE c.aadharid=a.aadharid";
                String sql2="select count(*) as noofrec from customer";
                rs = stmt.executeQuery(sql);
            %>
            <div class="container mt-3">
            <table class="table table-hover">
                <thead class="table table-success">
                    <tr>
                        <th> Aadhar No. </th> 
                        <th>Name</th>
                        <th>Email</th>
                        <th>Mobile No.</th>
                        <th>Pan Card</th>
                        <th>Curent Balance</th>
                        <th>Close Account </th>
                    </tr> 
                </thead>
                <%
                    while (rs.next()) {
                        
                %>   
                <tbody>
                    <tr class="table table-primary">
                        <td><%=rs.getLong("aadharid")%></td>
                        <td><%=rs.getString("cname")%></td>
                        <td><%=rs.getString("email")%></td>
                        <td><%=rs.getLong("mno")%></td>
                        <td><%=rs.getString("pancard")%></td>
                        <td><%= rs.getDouble("currentbal")%></td>
                        <td><a href="DeleteCustomer.jsp?aid=<%=rs.getLong("aadharid")%>">Close</a></td>
                    </tr>
                </tbody>
                    <%}
                    //stmt.close();
                    rs.close();
                    
                    rs=stmt.executeQuery(sql2);
                    if(rs.next()){
                         count=rs.getInt(1);
                }
                rs.close();
                    con.close();
                    %>
                    <tr class="table table-info"><td colspan="6"><center><b>Total No.of Customers:<%=count%></center></b></td></tr>
                    </div>
                    </body>
                    </html>
