package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AllCompsServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse rep) throws ServletException,IOException
	{
		//Print Writer 
		PrintWriter pw = rep.getWriter();
		
		//set content type
		rep.setContentType("text/html");
		
		//read from data
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String addrss = req.getParameter("paddrs");
		String gender = req.getParameter("gender");
		String hobbies = req.getParameter("hb");
		String ms = req.getParameter("ms");
		String qulification = req.getParameter("qlfy");
		String[] favPlaces = req.getParameterValues("favPlaces");
		long mobile_number = Long.parseLong(req.getParameter("mobileno"));
		String color = req.getParameter("faColor");
		String dob = req.getParameter("dob");
		String tob = req.getParameter("tob");
		int fnumber = Integer.parseInt(req.getParameter("fname"));
		String email = req.getParameter("mailid");
		String freedomweek = req.getParameter("freedomWeek");
		String InstaUrl = req.getParameter("InstUrl");
		String fav_s_S = req.getParameter("ss");
		//long sl = Long.parseLong(req.getParameter("income"));)
		
		if(gender.equalsIgnoreCase("M"))
		{
		if(age<5)
		{
		    pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are baby boy!!!");
		}
		else if(age<12)
		{
			pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are small boy!!!");
		}
		else if(age<18)
		{
			pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are teenage boy!!!");
		}
		else if(age<35)
		{
			pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are ypung boy!!!");
		}
		else if(age<50)
		{
			pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are middle-aged man!!!");
		}
		else
		{
			pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are old age");
		}
		}
		else
		{
			if(age<5)
			{
			    pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are baby girl!!!");
			}
			else if(age<12)
			{
				pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are small girl!!!");
			}
			else if(age<18)
			{
				pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are teenage girl!!!");
			}
			else if(age<35)
			{
				pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are ypung girl!!!");
			}
			else if(age<50)
			{
				pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are middle-aged women!!!");
			}
			else
			{
				pw.println("<h1 style='color:red;text-align:center;'>Master."+name+" you are old age");
			}
		}
		pw.println("<h1 style='color:red;text-align:center;'>Form data is </h1>");
		pw.println("<b> name :: "+name+"</b><br>");
		pw.println("<b> age  :: "+age+"</b><br>");
		pw.println("<b>  :: "+name+"</b><br>");
		pw.println("<a href = 'input.html'>home</a>");
		pw.println("<b>  Address :: "+addrss+"</b><br>");
		pw.println("<b>  Gender :: "+gender+"</b><br>");
		pw.println("<b> Hobies :: "+hobbies+"</b><br>");
		pw.println("<b>  Marittal Status :: "+ms+"</b><br>");
		pw.println("<b>  Qualification :: "+qulification+"</b><br>");
		pw.println("<b>  Favorite Places :: "+favPlaces+"</b><br>");
		pw.println("<b> Mobile Number :: "+mobile_number+"</b><br>");
		pw.println("<b>  Fav Color:: "+color+"</b><br>");
		pw.println("<b>  DOB:: "+dob+"</b><br>");
		pw.println("<b>  TOB:: "+tob+"</b><br>");
		pw.println("<b> Fav Number :: "+fnumber+"</b><br>");
		pw.println("<b>  Email ID :: "+email+"</b><br>");
		pw.println("<b>  Independence Week :: "+freedomweek+"</b><br>");
		pw.println("<b>  Insta Url:: "+InstaUrl+"</b><br>");
		pw.println("<b>  Fav. Search String :: "+fav_s_S+"</b><br>");
		pw.println("<a  style = 'color:red;text-align:center;'href = 'input.html'>home</a>");
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse rep) throws ServletException , IOException
	{
		doGet(req, rep);
	}
}
