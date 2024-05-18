package com.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet 
{
	 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException,ServletException
	 {
		 PrintWriter pw = res.getWriter();
		 
		 //set Content Type
		 res.setContentType("text/html");
		 
		 //read form1/req1 Data
		 
		 String name = req.getParameter("name");
		 String addrss  = req.getParameter("address");
		 String age = req.getParameter("age");
		 
		 String ms = req.getParameter("ms");
		 
		 //read form2/re2 Data
		 
		 String f2val1 = req.getParameter("f2t1");
		 String f2val2 = req.getParameter("f2t2");
		 
		 pw.println("<h1 style = 'color:red'>Form1/Request 	1 Data :: "+name+"....."+addrss+"....."+age+"...."+ms+"</h1>");
		 pw.println("<h1 style = 'color:red'>Form2/Request 2 Data ::"+f2val1+"....."+f2val2+"</h1>");
		 
		 
		 pw.println("<h2 style='text-align:center;'><a href = 'input.html'>Home</a></h2>");
	 }
	 
	 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException,ServletException
	 {
		 doGet(req,res);
	 }
}
