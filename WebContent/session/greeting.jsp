<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%


		int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        
        out.print(" Hii  "+name);
        out.print("<br>");
       // out.print("Good Afternoon  ");
        
        if(timeOfDay >= 0 && timeOfDay < 12){
            out.print("Good maroning");        
        }else if(timeOfDay >= 12 && timeOfDay < 16){
        	 out.print("Good Afternoon"); 
        }else if(timeOfDay >= 16 && timeOfDay < 21){
        	 out.print("Good evening"); 
        }else if(timeOfDay >= 21 && timeOfDay < 24){
        	 out.print("Good Night"); 
        }
        
        
        if(gender.equals("male"))
        	out.print(" Sir ! ");
        else
        	out.print(" Madam !");
        Date date = new Date();
        out.print(" "+date.toString());
%>

  

</body>
</html>