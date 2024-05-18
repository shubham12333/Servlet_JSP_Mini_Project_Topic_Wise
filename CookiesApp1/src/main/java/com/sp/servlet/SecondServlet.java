package com.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//Print Writer Object
		PrintWriter pw = resp.getWriter();
		
		//set Content Type
		resp.setContentType("text/html");
		
		//read Cookies
		
		Cookie cks[] = req.getCookies();
		
		if(cks!=null)
		{
			pw.println("<table align = 'center' border='1'>");
			pw.println("<tr><th> Cookie Name </th> <th> Cookie Values </th></tr>");
			
			for(Cookie ck : cks)
			{
				pw.println("<tr><td>"+ck.getName()+"</td><td>"+ck.getValue()+"</td></tr>");
			}//for
		}//if
		pw.println("</table>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
