<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is Html Tag</h1>
<% out.print("this is custom TAG using JSP"); %>

<% 
	String name = request.getParameter("uname");
	out.print("welcome"+name);
	%>
	
	Current Time: <%= java.util.Calendar.getInstance().getTime() %> 
</body>
</html>