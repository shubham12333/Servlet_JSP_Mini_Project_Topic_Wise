/**
 * 
 */

 function validate(frm){
	 alert("client side form validation are done");
	 
	 document.getElementById("pnameErr").innerHTML="";
	 document.getElementById("pageErr").innerHTML="";
	 document.getElementById("paddrsErr").innerHTML="";
	 
	 frm.vstatus.value="enabled";
	 
	 //read the form data
	 let name = frm.pname.value;
	 let age = frm.page.value;
	 let addrs = frm.addrs.value;
	 
	 let vflag= true;
	 
	 if(name=="")
	 {
		 document.getElementById("pnameErr").innerHTML="<b> Person name is required </b>";
		 vflag=false;
	 }
	 else if(name.length<5)
	 {
		 document.getElementById("pname.Err").innerHTML="<b> Person name should contain min of 5 letters </b>";
		 vflag=false;
	 }
	 if(age=="")
	 {
		 document.getElementById("pageErr").innerHTML="<b> Persona age is Required </b>";
		 vflag=false;
	 }
	 else if(isNaN(age))
	 {
		 document.getElementById("pageErr").innerHTML="<b> Person age must be numeric value </b>";
		 vflag=false;
	 }
	 else if(age<=0 ||age>=126)
	 {
		 document.getElementById("pageErr").innerHTML="<b> Person age must be in the range of 0 to 125 </b>";
		 vflag=false;
	 }
	 
	 if(addrs=="")
	 {
		 document.getElementById("paddrsErr").innerHTML="<b> Person address is Required </b>";
		 vflag=false;
	 }
	 return vflag;
 }
 