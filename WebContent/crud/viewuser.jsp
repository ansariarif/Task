<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.neosoft.crud.*,java.util.*"%>
	

<!--  To make below work: Download jar and add it to lib 
https://mvnrepository.com/artifact/javax.servlet/jstl/1.2
 -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>
	<h1>Users List</h1>

	<%
	List<User> users = UserController.getAll();
	request.setAttribute("users", users);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Country</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.getId()}</td>
				<td>${user.getName()}</td>
				<td>${user.getPassword()}</td>
				<td>${user.getEmail()}</td>
				<td>${user.getGender()}</td>
				<td>${user.getCountry()}</td>
				<td><a href="editform.jsp?id=${user.getId()}">Edit</a></td>
				<td><a href="deleteuser.jsp?id=${user.getId()}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

	<br>
	<a href="userform.html">Add User</a>



</body>
</html>