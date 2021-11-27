<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="static java.lang.Math.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

  int p = Integer.parseInt(request.getParameter("amount"));
  int n = Integer.parseInt(request.getParameter("year"));
  int r = Integer.parseInt(request.getParameter("rate"));
  
  


%>

<%! float findEmi(Float p,Float t,Float r){
	float emi;
    
   r = r / (12 * 100);
   
   t = t * 12; 
    
    
    emi = (p * r * (float)Math.pow(1 + r, t))
            / (float)(Math.pow(1 + r, t-1));
 
   
    return emi;
    
	} %> <br>
	
	
	<%= "Hi, Your monthly EMI will be: " + findEmi((float)p,(float)n,(float)r) %> <br>







</body>
</html>