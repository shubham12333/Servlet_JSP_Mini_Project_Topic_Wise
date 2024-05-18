package com.sp.pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/actionurl")
public class Today_Date_Print extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		Date d = new Date();
		int month = d.getDate();
		pw.println("Date "+d.getDate()+"<br>");
		pw.println("Month "+(d.getMonth()+1)+"<br>");
		pw.println("Year : "+(d.getYear()+1900)+"<br>"); 
		pw.println(d.getHours());

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
}
