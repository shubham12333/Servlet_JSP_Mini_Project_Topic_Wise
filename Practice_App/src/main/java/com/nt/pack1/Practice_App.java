package com.nt.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Practice_App extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		//setting print Stream
		 PrintWriter  pw = res.getWriter();
		 
		 //set Content Type
		 res.setContentType("text/html");
		 
		 String name = req.getParameter("ename");
		 int mobile = Integer.parseInt(req.getParameter("mo_number"));
		 
		 if(name !="" || name != " ")
		 {
			 pw.println("Registration SuccessFully");
		 }
		 else
		 {
			 pw.println("Invlaid details");
		 }
		 pw.close();
	}
}