package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userdetails")

public class Details_And_Choosing_Station extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse resp)throws ServletException , IOException
	{
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		String name = req.getParameter("fullName");
		
		String email = req.getParameter("email");
		
		String phone = req.getParameter("phone");
		
		String dest = req.getParameter("destination");
		
		pw.println(name+"</br>");
		pw.println(email+"</br>");
		pw.println(phone+"</br>");
		pw.println(dest+"</br>");
		
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse resp)throws ServletException , IOException
	{
		doGet(req,resp);
	}
}
