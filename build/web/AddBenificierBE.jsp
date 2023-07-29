<%-- 
    Document   : AddBenificierBE
    Created on : 31 Oct, 2022, 10:16:08 AM
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
        <title>Transer Money</title>
    </head>
    <body>
        <%! Connection con = null;
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
        %>
        <%
            String email=session.getAttribute("email").toString();
            
            con = ConnectBankDatabase.connectBankDB();
            long accountno = Long.parseLong(request.getParameter("bacntno"));
            int ifsc = Integer.parseInt(request.getParameter("ifsc"));
            String sql = "SELECT c.aadharid from account ac,customer c where c.aadharid=ac.aadharid and email=?";
            String sql2 = "SELECT bankname,branchname from bank where ifsc=?";
            ps1 = con.prepareStatement(sql);
            ps2 = con.prepareStatement(sql2);
            ps1.setString(1, email);
            ps2.setInt(1, ifsc);
            ResultSet rs1 = ps1.executeQuery();
           ResultSet rs2 = ps2.executeQuery();
        
            long aadharid = 0;
            if (rs1.next()) {
                aadharid = rs1.getLong("aadharid");
              //  rs1.close();
            } else {
                out.println("<script>alert('Invalid Account Number');</script>");
            }
            out.println("aadharid"+aadharid);
           
            if(rs2.next()) {
                String branch = rs2.getString("branchname");
                String bankname = rs2.getString("bankname");
                
            } else {
                out.println("<script>alert('Invalid IFSC Code Selected');</script>");
            }
           String sql3 = "INSERT INTO benificier VALUES(?,?,?)";
            ps3 = con.prepareStatement(sql3);
            ps3.setLong(1,accountno);
            ps3.setInt(2,ifsc);
         
            ps3.setLong(3, aadharid);
            int i=ps3.executeUpdate();
            if(i>0)
            {
                out.println("<script>alert('Benificier Account Added Succesfully');</script>");
            }
           else
            {
                out.println("<script>alert('Benificier Account Not Addded');</script>");
            }
            ps3.close();
            con.close();
        %>
    </body>
</html>
