package com.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		//read Form 1 Data
		
		String name = request.getParameter("name");
		String addrs = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String ms = request.getParameter("ms");
		
		//Genrate the Form2 
		
		if(ms.equalsIgnoreCase("married"))
		{
			pw.println("<h1 style = 'color:red;text-align:center;'>person Information Gathering -Form 2 </h1>");
			pw.println("<form action = 'secondurl' method='post'>");
			pw.println("<table bgcolor='cyan' align = 'center'>");
			pw.println("<tr> <td> spouse name :: </td>  <td> <input type='text' name='f2t1'></td> </tr>");
			pw.println("<tr> <td> No Of Kids  :: </td>  <td> <input type='text' name='f2t2'></td> </tr>");
			pw.println("<tr> <td colspan = '2'> <input type = 'submit' value='Submit'> </td> </tr>");
			pw.println("</table>");
		}
		else
		{
			pw.println("<h1 style = 'color:red;text-align:center;'>person Information Gathering -Form 2 </h1>");
			pw.println("<form action = 'secondurl' method='post'>");
			pw.println("<table bgcolor='cyan' align = 'center'>");
			pw.println("<tr> <td>When Do you Want To Marry:: </td>  <td> <input type='text' name='f2t1'></td> </tr>");
			pw.println("<tr> <td>Why Do you Want To Marry:: </td>  <td> <input type='text' name='f2t2'></td> </tr>");
			pw.println("<tr> <td colspan = '2'> <input type = 'submit' value='Submit'> </td> </tr>");
			pw.println("</table>");
		}
		
		pw.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
