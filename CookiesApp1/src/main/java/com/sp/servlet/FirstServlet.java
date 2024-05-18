package com.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//create 4 Cookies(2 InMemoryCookies , 2 Persistent Cookies)
		Cookie ck1 = new Cookie("TN","Chennai");
		Cookie ck2 = new Cookie("AP","No_Capital");
		//add cookie to the response
		resp.addCookie(ck1);resp.addCookie(ck2);//InMemoryCookies
		
		Cookie ck3 = new Cookie("MH","Mumbai");
		Cookie ck4 = new Cookie("MP","Bhopal");
		ck3.setMaxAge(60);ck4.setMaxAge(60);
		
		//add Cookie to the Response
		resp.addCookie(ck3);resp.addCookie(ck4);
		
		//get PrintWriter
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("Cookies are created");
		
		//
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req,resp);
	}
}
