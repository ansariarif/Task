<html>

<head>

<title>Home Jsp</title>
</head>

<body>


    <!-- scriptlet tag -->
    
   <%
   out.print("today date is: "+new java.util.Date().toString()+"<br>"); 
   String uname = request.getParameter("uname");
   String upass = request.getParameter("upass");
   out.print("welcome:"+uname+"<br>");
   out.print("welcome hi: "+upass);
   %>
   
   <br>
   
   <!-- expression tag -->
   
   <%="hi" %><br>
   <%=new java.util.Date().toString() %> <br>
   <%=request.getParameter("uname") %> <br>
   
   <br><br>
   
   <!-- declaration tag -->
   
   <%! int x = 100; %>
   <%= "value of x:"+x %>
   <br>
   <%! int cube(int num){
	   return num*num*num;
   } %>
   <%="cube of 5:"+cube(5) %> <br>
   <% out.print("cube of 6 : "+cube(6)); %>

</body>

</html>