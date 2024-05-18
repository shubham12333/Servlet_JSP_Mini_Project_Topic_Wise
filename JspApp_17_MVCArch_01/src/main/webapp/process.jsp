

<%@page import="com.sp.service.*,com.sp.beans.*" %>

<!-- Read form data and write into Java Bean Class Object -->

<jsp:useBean id="emp" class="com.sp.beans.Employee" scope="request"/>

<jsp:setProperty property="*" name="emp"/>    

<!-- Create Serivce Class Object -->

<jsp:useBean id="service" class="com.sp.service.PaySlipGeneratorService" scope="application"/>

<%//invoke b. method
	service.GeneratePaySlip(emp);
%>

<!-- call getter and setter methods on java class bean class obj to display the results -->
<pre style="text-align: center; font-size:25px;">
<i >employee id           </i>::<b style="color: green"><jsp:getProperty property="empNumber" name="emp"/></b>  <br>
<i >employee Name   </i>::<b style="color: green">      <jsp:getProperty property="empName" name="emp"/></b>    <br>
<i >employee Address      </i>::<b style="color: green"><jsp:getProperty property="empAddress" name="emp"/></b> <br>
<i >employee Salary       </i>::<b style="color: green"><jsp:getProperty property="empSalary" name="emp"/></b>  <br>
<i >employee Gross Salary </i>::<b style="color: green"><jsp:getProperty property="grossSalary" name="emp"/></b><br>
<i >employee net Salary   </i>::<b style="color: green"><jsp:getProperty property="netSalary" name="emp"/></b>  <br>
 
 </pre>
 <br><br>	
 <b style="color: green"></b>
 <a href="EmployeeDetails.html" style="text-align: center; display: inline-block;">Home</a>