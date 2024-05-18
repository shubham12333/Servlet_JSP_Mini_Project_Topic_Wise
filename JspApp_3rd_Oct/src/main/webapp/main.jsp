

<%@page errorPage="ErrorPage.jsp" %>

<%
		String x = "Hello";
		
		x = x.concat("World");
%>

x value :: <%=x%>
