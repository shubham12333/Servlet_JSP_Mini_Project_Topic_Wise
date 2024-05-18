package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet 
{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		//get PrintWriter object from the respons object
		PrintWriter pw = res.getWriter();
		
		//set content Type
		res.setContentType("text/html");
		
		//write the b. logic
		
		LocalDateTime idt = LocalDateTime.now();
		//get cuurent hour of the day
		
		int hour = idt.getHour();
		String msg = null;
		
		if(hour<12)
		{
			msg = "Good Morning";
		}
		else if(hour<16)
		{
			msg = "Good Afternoon";
		}
		else if(hour<20)
		{
			msg = "Good Evening";
		}
		else
		{
			msg = "Good Night";
		}
		pw.println("<h1 style='color:green;text-align:center'>"+msg+"</h1>");
		
		//add the hyperlink
		pw.println("<a href='http://localhost:3030/WishMessageApp-HTMLtoServletInteraction/page.html'>home</a>");	
		pw.close();
	}
}
