


<b>from a.jsp (Creating Context Attribute)  </b>

<!-- create PageContext attributes -->

<%

	pageContext.setAttribute("attr1","val1",pageContext.PAGE_SCOPE);//page Scope
	pageContext.setAttribute("attr2","val2",pageContext.REQUEST_SCOPE);//request Scope
	pageContext.setAttribute("attr3","val2",pageContext.SESSION_SCOPE);//session Scope
	pageContext.setAttribute("attr4","val4",pageContext.APPLICATION_SCOPE);//appication Scope

%>


<jsp:forward page="b.jsp"/>