<%@page isELIgnored="false" import="java.util.*,com.nt.beans.*" %>
<%
 //Set MIME Type
 response.setContentType("application/vnd.ms-excel");
 
 //make the output of this jsp page as the downloadable file
 
 response.setHeader("Content-Disposition","attachment;fileName=empsInfo.xls");
 //read the request param value
 List<Employee> list = (List<Employee>)request.getAttribute("empInfo");
 //read the request param value
 
 if(list.size()!=0 && list!=null)
 {
 %>
 
 <!--  Display the details in the form of html table -->
 <table border ="1" bgcolor="cyan" align="center">
 	<tr>
 		<th>empno</th> <th>ename</th> <th>Job</th> <th>Salary</th> <th>Gross Salary</th> <th>Net Salary</th> 
 	</tr>
 	<%
 		for(Employee emp:list)
 	{%>
 	<tr>
 		<td><%=emp.getEmpNO()%></td>
 		<td><%=emp.getEmpName()%></td>
 		<td><%=emp.getDesg()%></td>
 		<td><%=emp.getSalary()%></td>
 		<td><%=emp.getGrossSalary()%></td>
 		<td><%=emp.getNetSalary()%></td>
 	</tr>
 	
 	<%
 	}
 	%>
 </table>
 
 <%}
 		else {%>
 		<h1 style="color: red;text-align: center;"> No Employees are Found </h1>
 <%}%>
 
 
 
 
 
 
 