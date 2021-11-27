<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@ taglib uri="WEB-INF/custom.tld" prefix="mytag" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>custom Tag</title>
</head>
<body>

<mytag:CurrentDateTime/> <br>

<mytag:CurrentTime>Current Time is </mytag:CurrentTime> <br>

<mytag:RepeatText frequency="10">Java</mytag:RepeatText> <br>

<mytag:greeting>Good Afternon</mytag:greeting> <br>

<mytag:Search caseNumber="0" text="Java">Java is godd . java always good</mytag:Search>
 

</body>
</html>