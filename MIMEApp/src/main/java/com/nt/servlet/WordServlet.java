//WordServlet.java

package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;


public class WordServlet extends HttpServlet
{
	//2nd service(-,-) method overriding
	protected void service(HttpServletRequest req , HttpServletResponse res)throws ServletException , IOException
	{
		//set response content type
		res.setContentType("application/vnd.ms-word");
		//get PrintWriter Stream
		PrintWriter pw = res.getWriter();
		//display the contnet as db table
		pw.println("<table align = 'center' border= '1' bgcolor = 'cayan'>");
		pw.println("<tr><th>TeamName</th><th>Year</th><th>Place</th></tr>");
		pw.println("<tr><td>India</td> <td> 2007 </td> <td>South Africa</td>");
		pw.println("<tr><td>Pakistan</td> <td> 2009 </td> <td>England</td>");
		pw.println("<tr><td>England</td> <td> 2010 </td> <td>west Indies</td>");
		pw.println("<tr><td>West Indies</td> <td> 2012</td> <td>Australia</td>");
		pw.println("</table>");
		
		//clse the stream
		pw.close();
	}
}
