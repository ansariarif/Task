<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Tag Test</title>
</head>
<body>

<!-- html comment -->
<h2>Welcome</h2>
<%-- JSP forword
 
<jsp:forward page="directive.jsp">
  <jsp:param value="101" name="param1"/>
</jsp:forward>

--%>

<%--
<jsp:include page="directive.jsp"></jsp:include>
--%>

<jsp:useBean id="user" class="com.neosoft.User"/>
<jsp:setProperty name="user" property="uname" value="admin"/>

<jsp:setProperty name="user" property="upass" value="admin123"/>

<%
	String uname = request.getParameter("uname");
	String upass = request.getParameter("upass");

	if (uname.equals(user.getUname()) && upass.equals(user.getUpass())) {
	%>
	<h3>Welcome to my web site!!</h3>
	<jsp:getProperty property="uname" name="user" />
	<jsp:include page="directive.jsp" />
	<%
	} else {
	%>
	<jsp:forward page="login.html"></jsp:forward>
	<%
	}
	%>



</body>
</html>