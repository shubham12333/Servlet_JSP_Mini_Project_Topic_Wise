package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		
		//set Content Type
		res.setContentType("text/html");
		
		//read the data from the req object as the request param value
		
		String name = req.getParameter("pname");
		String page = req.getParameter("page");
		String address  = req.getParameter("paddrs");
		
		int age = Integer.parseInt(page);
		
		//b. logic
		
		if(age>=18)
			pw.println("<h1 style='color:green'>Mr/Miss/Mrs."+name+" you are eligible for Voting");
		else
			pw.println("<h1 style='color:red'>Mr/Miss/Mrs."+name+" you are not eligible for Voting Wait for Another "+(18-age)+" years <br>");
		
		pw.println("<a href='input.html'><img src ='images/home.jpg' width='150' height = '150'></a>");
		
		pw.close();
	}
}
