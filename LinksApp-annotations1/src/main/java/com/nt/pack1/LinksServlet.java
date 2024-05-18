package com.nt.pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/linksurl")
//@WebServlet(value="/linksurl")
//@WebServlet(urlPatterns = {"/linksurl","/linksurl1"})
public class LinksServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException
	{
		//get Print Writer Object
		PrintWriter pw = res.getWriter();
		
		//set Response Content Type
		res.setContentType("text/html");
		
		//read additional req param value
		String pval = req.getParameter("s1");
		
		//get All Locals in this world
		Locale locales[] = Locale.getAvailableLocales();
		
		//write b. logic
		
		if(pval.equalsIgnoreCase("link1"))
		{
			pw.println("<h1> all the language are </h1>");
			for(Locale l :locales)
			{
				pw.println(l.getDisplayLanguage()+",");
			}
		}
		else if(pval.equalsIgnoreCase("link2"))
		{
			pw.println("<h1> all the Countries are </h1>");
			for(Locale l:locales)
			{
				pw.println(l.getDisplayCountry()+",");
			}
		}
		else
		{
			//get System Date and Time
			
			LocalDateTime ldt = LocalDateTime.now();
			//get current  month
		//	int month = ldt.getMonth();
		}
		
	/*	if(month>=1 && month<=3)
		{
			pw.println();
		}*/
		
		
	}
	
}
