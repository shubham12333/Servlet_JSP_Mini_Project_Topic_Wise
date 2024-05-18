package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//get PrintWriter
		PrintWriter pw = resp.getWriter();
		
		//set Content Type
		resp.setContentType("text/html");
		
		//read Form1/Req 1 Data
		String name = req.getParameter("name");
		String address = req.getParameter("addrs");
		int age =Integer.parseInt(req.getParameter("age"));
		String ms = req.getParameter("ms");
		
		//Create HttpSession Object
		HttpSession ses =  req.getSession(true);
		
		ses.setAttribute("name",name);
		ses.setAttribute("addrs",address);
		ses.setAttribute("age", age);
		ses.setAttribute("ms",ms);
		
		//Collecting the Session Id OF SessionOject , Creating Inmemory Cookies having
		//the Session Id and Sending that InMemory Cookies to browser as response will be
		//done automatically by the Servlet Container the momenet HttpSessio Object is Created.
		
		//generate form2 dynamically based on the marital status
		
		if(ms.equalsIgnoreCase("married"))
		{
			pw.println("<h1 style= 'color:red;text-align:center'>person Information gathering -Form2 </h1>");
			pw.println("<form action='secondurl' method='post'>");
			pw.println("<table bgcolor='cyan' align = 'center'>");
			pw.println("<tr><td> Spouse Name : </td> <td><input type = 'text' name = 'f2t1'></td></tr>");
			pw.println("<tr><td> No. Of Kids : </td> <td><input type = 'text' name = 'f2t2'></td></tr>");
			pw.println("<tr> <td colspan='2'> <input type = 'submit' value = 'Submit' >      </td></tr>");
			pw.println("</table>");
			pw.println("</form>");
		}
		else
		{
			pw.println("<h1 style= 'color:red;text-align:center'>person Information gathering -Form2 </h1>");
			pw.println("<form action='secondurl' method='post'>");
			pw.println("<table bgcolor='cyan' align = 'center'>");
			pw.println("<tr><td>When Do You want to Marray : </td> <td><input type = 'text' name = 'f2t1'></td></tr>");
			pw.println("<tr><td>Why Do You Want to Marry : </td> <td><input type = 'text' name = 'f2t2'></td></tr>");
			pw.println("<tr> <td colspan='2'> <input type = 'submit' value = 'Submit'> </td> </tr> ");
			pw.println("</table>");
			pw.println("</form>");
		}
		
		pw.println("<br><br><b> Session Id of the Session Object :: "+ses.getId()+"</b>");
		
		//close the Stream
		pw.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
	}
}
