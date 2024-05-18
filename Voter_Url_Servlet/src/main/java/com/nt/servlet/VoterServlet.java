package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse rep) throws ServletException, IOException
	{
		//get PrintWriter Stream Object
		PrintWriter pw = rep.getWriter();
		
		// set content type
		rep.setContentType("text/html");
		
		// read form data from the req obj as the request param values
		String name  =  req.getParameter("pname");
		String tage  =  req.getParameter("page");
		String addrs =  req.getParameter("paddrs");
		// read the hidden box values
		String vstatus = req.getParameter("vstatus");
		System.out.println("Client side Validation Status : "+vstatus);
		
		int age = 0;
		if(vstatus.equalsIgnoreCase("disabled"))
		{
			//Enable Server Side Form Validation logics
			System.out.println("Voter Servlet :: Server side form Validations  ");
			
			List<String>errorsList = new ArrayList();
			if(name==null||name.equals("")||name.length()==0)
			{
				errorsList.add("Person name is required");
			}//if
			else if(name.length()<5)
			{
				errorsList.add("Person name must contain >=5 letters");
			}
			
			if(tage==null||tage.equalsIgnoreCase("")||tage.length()==0)
			{
				errorsList.add("Person age is required");
			}
			else
			{
				try
				{
					age=Integer.parseInt(tage);
					if(age<=0||age>=126)
					{
						errorsList.add("Person age must be in Range of 1 to 125");
					}
				}
				catch(NumberFormatException nfe)
				{
					errorsList.add("Person age must be numeric value");
				}
			}
			
			if(addrs==null||addrs.equalsIgnoreCase("")||addrs.length()==0)
			{
				errorsList.add("person address  is required");
			}
			
			//print the errror message
		
			if(errorsList.size()!=0)
			{
				pw.println("<ul style ='color : red'>");
				
				/*for (String errMsg:errorsList)
				{
					pw.println("<li>"+errMsg+"</li>");
				}*/
				
				errorsList.forEach(msg->{
					pw.println("<li>"+msg+"</li>");
				});
				
				System.out.println("Server side form validations are done");
				pw.println("</ul>");
				
				pw.println("<br> <a href='input.html'>home </a>");
				
				return ;
			}
			
		}//if
		else
		{
			age = Integer.parseInt(tage);
		}
	
	if(age>=18)
	{
		pw.println("<h1 style ='color:green'> Mr/Miss?Mrs."+name+"u r eligible for Voting </h1>");
	}
	else
	{
		pw.println("<h1 style ='color:red'> Mr/Miss?Mrs."+name+"u r not eligible for Voting </h1>");
	}
	
	//add graphical hyperlink
	pw.println("<a href = 'input.html'> <button></button>");
	
	pw.close();
	
}
	public void doPost(HttpServletRequest req , HttpServletResponse rep) throws ServletException, IOException
	{
		doGet(req,rep);
	}
}