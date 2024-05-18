
<!-- Create or Locate JavaBean Class Object -->

<jsp:useBean id="st" class="com.sp.beans.Student_Info" scope="session"/>

<p> <b>


sno :: <jsp:getProperty property="sno"   name="st"/> <br>
sname::<jsp:getProperty property="sname" name="st"/><br>
sadd ::<jsp:getProperty property="sadd"  name="st"/><br>
Avg :: <jsp:getProperty property="avg"   name="st"/> <br>
</b>
</p>
<br>
<b>Java Bean Class Object data is Retrieved and Displayed</b>