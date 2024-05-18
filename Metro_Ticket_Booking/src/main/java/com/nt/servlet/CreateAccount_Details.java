package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userdburl")
public class CreateAccount_Details extends HttpServlet 
{
	private static final String Insert_Data ="INSERT INTO LOGIN_DETAILS_FETCH values(?,?)";
	
	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		try(	PrintWriter pw = resp.getWriter();
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","9907829926");
				PreparedStatement ps = con.prepareStatement(Insert_Data);
			)
		{
			String user = req.getParameter("Username");
			
			String password = req.getParameter("Password");
			
			ps.setString(1, user);
			ps.setString(2, password);
			
		
		     int result = ps.executeUpdate();
		     
		     if(result==1)
		     {
		    	 pw.println("<body style='background-image:url('111.jpg');'></body>");
		    	 pw.println("<h1 style='font-size:50px;color:blue;text-align:center;'>"+"Account Created SuccessFully"+"<h1>");
		    	 
		    	 pw.println("<h1 style='text-align:center'>Click to Go on <a href='login.html'>Login Page</a>  </h1>");
		     }
		     else
		     {
		    	 pw.println("Account Not Created");
		     }
		     
		     
		     
		     
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req , HttpServletResponse resp)throws ServletException,IOException
	{
		doGet(req,resp);
	}
}
