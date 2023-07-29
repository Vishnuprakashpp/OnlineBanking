<%-- 
    Document   : UpdateCustomer
    Created on : 29 Nov, 2022, 10:18:07 AM
    Author     : BASAVARAJU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update customer Details</h1>
        <hr>
        <div>
            <form method="post" action="UpdateCustomerBE.jsp">
                <table border="1">
                    <tr>
                        <th>Aadhar ID</th>
                        <td><input type="text" value="<%=request.getParameter("aadharid") %>"name="aadharid" readonly></td>
                    </tr>
                    <tr>
                        <th>Customer Name</th>
                        <td><input type="text" value="<%=request.getParameter("cname")%>" name="cname"></td>
                    </tr>
                    <tr>
                        <th>E-Mail ID</th>
                        <td><input type="email" value="<%=request.getParameter("email") %>" name="emailid"></td>
                    </tr>
                    
                    <tr>
                        <th>DOB</th>
                        <td><input type="text"  value="<%=request.getParameter("dob") %>"name="dob"></td>
                    </tr>
                      <tr>
                        <th>Mobile Number</th>
                        <td><input type="text" value="<%=request.getParameter("mno") %>"name="mno"></td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td><input type="text" value="<%=request.getParameter("address")%>" name="address"></td>
                    </tr>
                  
                    <tr>
                        <th>Pancard</th>
                        <td><input type="text" value="<%=request.getParameter("pancard")%>" name="pancard"></td>
                    </tr>
                    <tr>
                            <td colspan="2"><center><input type="submit" value="Update"></center></td>
                    </tr>
                </table>
            </form>
       

        </div>
    </body>
</html>
