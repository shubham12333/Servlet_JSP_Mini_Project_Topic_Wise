

<% 
	float price = 600.0f;
	float discount = price * 0.3f;
	float final_price = price-discount;
%>


<jsp:forward page = "b.jsp">
	<jsp:param value = "CRJ-by HS" name="bookname"/>
	<jsp:param value ="<%=final_price%>" name="netPrice"/>
</jsp:forward>

<b>end of JSP Pages</b>