

<jsp:useBean id="st" class="com.sp.beans.Student_Info" scope = "session"/>


<!-- Set values to the bean Properties -->

<jsp:setProperty property="sno" name="st" value="1001"/>
<jsp:setProperty property="sname" name="st" value="Shubham"/>
<jsp:setProperty property="sadd" name="st" value="Indore"/>
<jsp:setProperty property="avg" name="st" value="89.66"/>
<br>
<b>Values are set to bean properties</b>