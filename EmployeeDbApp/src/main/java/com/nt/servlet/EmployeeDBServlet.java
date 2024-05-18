package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empdburl")
public class EmployeeDBServlet extends HttpServlet
{
	
	private static final String GET_EMP_DETAILS_BY_NO = "SELECT * FROM EMP WHERE EMPNO=?";
	public void doGet(HttpServletRequest  req, HttpServletResponse resp) throws ServletException,IOException
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
		
		try(PrintWriter pw = resp.getWriter();
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","9907829926");
				PreparedStatement ps = con.prepareStatement(GET_EMP_DETAILS_BY_NO);
				Scanner sc = new Scanner(System.in);
				)
		{
			int no = Integer.parseInt(req.getParameter("eno"));
					
			ps.setInt(1,no);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
			pw.println("<body style ='background-color: darkgray'>");
			pw.println("<h1 style='text-align:center;color:blue,background-color: #35424;'> Employee Details "+"</h1>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee Id                  : "+rs.getInt(1)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee Id                  : "+rs.getString(2)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Position                     : "+rs.getString(3)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee's Manager ID        : "+rs.getInt(4)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee's Joining Date      : "+rs.getDate(5)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee's Salary            : "+rs.getInt(6)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee's Commission        : "+rs.getInt(7)+"</p>");
			pw.println("<p style='text-align:center;color:black;font-size:35'> Employee's Department Number : "+rs.getInt(8)+"</p>");
			}
			else
			{
				pw.println("<p style='text-align:center;color:red;font-size:45'> Employee Not Found Please Enter Correct Emp Id : "+"</p>");
			}
			pw.println("<a  style = 'color:black;margin-left:40%;border-radius :3px;font-size:25px; text-decoration:none;'href = 'input.html'>Click to go to the Home Page</a>");
			pw.println("<a  style = 'color:black;margin-left:40%;border-radius :3px;font-size:25px; text-decoration:none;'href = 'booking.html'>Click to go to the Home Page</a>");
		}
		catch(SQLException e )
		{
			PrintWriter pw ;
			e.printStackTrace();
		}
		
		
	}
	public void doPost(HttpServletRequest  req, HttpServletResponse resp) throws ServletException,IOException
		{
			doGet(req,resp);
		}
	}

