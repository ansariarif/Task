<%@ page import="java.util.Date, java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="MyErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 	String name = request.getParameter("txtuser");
 	String mobile = request.getParameter("mobile");
 	String email = request.getParameter("email");
	String gender = request.getParameter("gender").toUpperCase();
	String course = request.getParameter("course").toUpperCase();
	
	validateEmail(email)
;
	
 %>
 <%! void validateEmail(String email) throws Exception{
	if(!email.matches("[0-9a-zA-Z+-_.]+@[a-zA-Z]+[.]{1}[a-zA-z]+")) {
		throw new Exception("Invalid Email");
	}else{
		int ind = email.lastIndexOf("@");
		int ind1 = email.lastIndexOf(".");
		String domain = email.substring(ind+1,ind1);
		if(!domain.equals("gmail")){
			throw new Exception("Email is not from domain gmail");
		}
	}
}	
	%>
<table>
    <tr>
        <th>Name : </th>
        <td><%= name %></td>
    </tr>
    <tr>
        <th>Mobile : </th>
        <td><%= mobile %></td>
    </tr>
    <tr>
        <th>email : </th>
        <td><%= email %></td>
    </tr>
    <tr>
        <th>Gender : </th>
        <td><%= gender %></td>
    </tr>
    <tr>
        <th>Course : </th>
        <td><%= course %></td>
    </tr>
    <tr>
        <th>Date : </th>
    </tr><tr>
        <th>Time : </th>
      
    </tr>
</table>
   

</body>
</html>