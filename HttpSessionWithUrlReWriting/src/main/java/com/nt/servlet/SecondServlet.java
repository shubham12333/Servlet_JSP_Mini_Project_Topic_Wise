package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//get PrintWriter 
		PrintWriter pw = resp.getWriter();
		//Set Response Content Type 
		resp.setContentType("text/html");
		//read form2/req2 data
		
		String f2val1 = req.getParameter("f2t1");
		String f2val2 = req.getParameter("f2t2");
		
		//get Access to the Session Object (this method internally reads inMemory Cookie Values
		//to get Session Id and uses that Session Id to the Access the Session Object 
		
		HttpSession ses = req.getSession(false);
		//read form1/req1 Data form Session Object as Session Attribute values
		String name = (String)ses.getAttribute("name");
		String addrss = (String) ses.getAttribute("addrs");
		int age = (Integer)ses.getAttribute("age");
		String ms = (String)ses.getAttribute("ms");
		
		pw.println("<h1 style = 'color : red'>Form 1 /Request 1 Data :: <br>");
		pw.println("<p style:'text-align:center;color:blue;font-size:large'><br>");
		pw.println("Person Name         : "+name+"<br>");
		pw.println("Person Address      : "+addrss+"<br>");
		pw.println("Person Age          : "+age+"<br>");
		pw.println("RelationShip Status : "+ms+"<br>");
		pw.println("<h2 style = 'color : red'>Form 2 / Request 2 Data :: "+f2val1+"..."+f2val2+"</h1>");
		pw.println("</p>");
		pw.println("<br> <br> <h2> <a href = 'person.html'> Home :: </a> </h2>");
		pw.println("<br> <br> <br> Session Id Of the Session Object :: "+ses.getId()+"</b>");
		
		ses.invalidate();
		
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}
}
