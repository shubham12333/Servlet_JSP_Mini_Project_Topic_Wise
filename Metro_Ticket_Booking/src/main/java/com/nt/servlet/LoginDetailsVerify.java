package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginurl")
public class LoginDetailsVerify extends HttpServlet 
{
	public static final String Get_Data = "SELECT USER_ID,PASSWORD FROM LOGIN_DETAILS_FETCH WHERE USER_ID = (?) and PASSWORD = (?)";
	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException 
	{
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		PrintWriter out = resp.getWriter();
		
		String l_id = req.getParameter("Login_id");
		
		String passwd = req.getParameter("password");
		
   		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(Connection conn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","9907829926");
			PreparedStatement ps = conn.prepareStatement(Get_Data);
			)
		{
			ps.setString(1,l_id);
			ps.setString(2, passwd);
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				if(l_id.equals(rs.getString(1)) && passwd.equals(rs.getString(2)))
				{
					pw.println("<body style = 'background-color:lightblue;'></body>");
			        out.println("<html>");
			        out.println("<head><title>Login Successful</title></head>");
			        out.println("<body>");
			        out.println("<style>");
			        out.println("body{backgroudn-image :url('111.jpg');}");
			        out.println("</style>");
			        out.println("<h1 style='color:green;text-align:center;'>");
			        out.println("Login Successful!");
			        out.println("</h1>");
			        out.println("</body>");
			        out.println("</html>");
					pw.println("<h1 style='color:green;font-size:25;text-align:center'> Login SuccessFull </h1>");
					
					
				}
				else
				{
					pw.println("<h1 style='color:red;font-size:25;text-align:center'> Data Not Found Please Enter Correct Details</h1>");
					
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			out.close();
			pw.close();
		}
		
		
		
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException
	{
		doGet(req,resp);
	}
}
