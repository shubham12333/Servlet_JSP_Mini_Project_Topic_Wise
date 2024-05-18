package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/studdburl")
public class StudentRegistrationServlet 
{
	private static final String Select_Query = "INSERT INTO STUDENT VALUES(SNO_SEQ.NEXTVAL,?,?,?)";
	
	public void doGet(HttpServletRequest req ,HttpServletResponse resp ) throws IOException,ServletException
	{
		//get PrintWriter Object
		PrintWriter pw  = resp.getWriter();
		
		//set Response content Type
		resp.setContentType("text/html");
		
		//read form data
		//int std_id = Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("sname");
		String addrs = req.getParameter("sadd");
		float avg = Float.parseFloat(req.getParameter("avg"));
		
		//write the jdbc code to isert data itot table
		
		try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","9907829926");
				)
		{
			PreparedStatement ps = conn.prepareStatement(Select_Query);
			
			//ps.setInt(1, std_id);
			ps.setString(2, name);
			ps.setString(3, addrs);
			ps.setFloat(4, avg);
			
			//execute Query
			
			int count = ps.executeUpdate();
			
			if(count!=0)
			{
				pw.println("<h1> Student Registration done SuccessFully</h1>");
			}
			else
			{
				pw.println("<h1> Student Registration Not done SuccessFully</h1>");
			}
		}
		catch(SQLException sqe)
		{
			sqe.printStackTrace();
			pw.println("DB Problem :: "+sqe.getMessage());
		}
		catch(Exception e)
		{
			pw.println("Error ");
			e.printStackTrace();
			pw.println("Problem in establising the Connection "+e.getMessage());
			
		}
		
		pw.println("<h1 style='text-align:center;color:red;'> home</h1>");
	}
	
	public void doPost(HttpServletRequest req ,HttpServletResponse resp ) throws IOException, ServletException
	{
		doGet(req,resp);
	}
	
	private Connection makeConnection() throws Exception
	{
		//establish the Connection with Jndi Registry
		InitialContext  ic= new InitialContext();
		
		//perfom jndi loopup Operation 
		
		DataSource ds = (DataSource)ic.lookup("DsJndi");
		
		//get pooled jdbc con Object
		
		Connection conn = ds.getConnection();
		
		return conn; 
	}
}
