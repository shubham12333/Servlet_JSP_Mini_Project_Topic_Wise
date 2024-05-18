package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Season_Test_Alert extends HttpServlet 
{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//set PrintWriter object from the respone object
		PrintWriter pw = res.getWriter();
		//set Content Type		
	    res.setContentType("text/html");
	    
	    //write the b. logic
	    
	    LocalDateTime ldt = LocalDateTime.now();
	    
	    //set current month of the day
	    
	    int month = ldt.getMonthValue();
	    
	    String mon = null;
	    if(month<4)
	    	mon = "Season is Winter";
	    else if(month<8)
	    	mon = "Season is Summer";
	    else
	    	mon = "Seaosn is monsoon";
	    
	    pw.println("<h1 style='color:green;text-align:center'>"+mon+"</h1>");	
	    pw.println("<a href='http://localhost:3030/Season_Test_Alert/page.html'>home</a>");
	    pw.close();
		
	}
}
