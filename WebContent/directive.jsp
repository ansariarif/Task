<%@ page import="java.util.Date, java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="jsp page by neosoft" buffer="16kb" errorPage="MyErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directives Test</title>
</head>
<body>
  <%@ include file="header.html" %>
  
  Today is: <%=new Date() %>
  <%= getServletInfo() %>
  
  <%=request.getParameter("param1") %>


</body>
</html>