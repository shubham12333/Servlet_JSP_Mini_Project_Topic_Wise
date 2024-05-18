package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ArithmeticServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		//get Print Writer
		PrintWriter pw = res.getWriter();
		
		//set content type
		res.setContentType("text/html");
		
		//read additional req param val.
		
		String s1val = req.getParameter("s1");
		
		float val1 =0.0f , val2 = 0.0f;
		
		if(!s1val.equalsIgnoreCase("link1") && !s1val.equalsIgnoreCase("link2"))
		{
			val1 = Float.parseFloat(req.getParameter("t1"));
			val2 = Float.parseFloat(req.getParameter("t2"));
			
		}
		
		//get System Date and Time
		
		LocalDateTime ldt =  LocalDateTime.now();
		//differentiatie the logic for multiple submit buttons and hyperlinks 
		
		if(s1val.equalsIgnoreCase("add"))
		{
			pw.println("<h1 style ='color:green;text-align:center'>Addition :: "+(val1+val2)+"</h1>");
		}
		else if(s1val.equalsIgnoreCase("sub"))
		{
			pw.println("<h1 style ='color:green;text-align:center'>Subtraction :: "+(val1-val2)+"</h1>");
		}
		else if(s1val.equalsIgnoreCase("mul"))
		{
			pw.println("<h1 style ='color:green;text-align:center'>Multiplication :: "+(val1*val2)+"</h1>");
		}
		else if(s1val.equalsIgnoreCase("div"))
		{
			pw.println("<h1 style ='color:green;text-align:center'>Divison :: "+(val1/val2)+"</h1>");
		}
		
		pw.println("<br><br> <a href='input.html>home</a>");
		
		pw.close();
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException
	{
		doGet(req,res);
	}
}
