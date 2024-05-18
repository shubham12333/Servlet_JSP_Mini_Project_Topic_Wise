package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Customer_Details extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse rep) throws ServletException , IOException
	{
		PrintWriter pw = rep.getWriter();
		
		//set response type
		rep.setContentType("text/html");
		
		//read form data
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long mobile_number = Long.parseLong(req.getParameter("mobile_number"));
		String Address =  req.getParameter("addrss");
		String gender = req.getParameter("gender");
		String qualification = req.getParameter("qlfy");
		
		pw.println(name);
		pw.println(email);
		pw.println(mobile_number);
		pw.println(Address);
		pw.println(gender);
		pw.println(qualification);
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse rep) throws ServletException , IOException
	{
		doGet(req, rep);
	}
}
