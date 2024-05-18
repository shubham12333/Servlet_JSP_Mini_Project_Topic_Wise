package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.beans.Employee;

public class EmployeeDAOServiceImpl implements EmployeeDAO 
{
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB =? ORDER BY SAL";
	
	
	private Connection makeConnection()throws Exception
	{
		System.out.println("connection created 1");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","9907829926");
		
		return con;
	}
	
	@Override
	public List<Employee> searchEmployeesByDesg(String desg)throws Exception
	{
		
		List<Employee> list = null;
		//get The Connection Object
		
		try(Connection con = makeConnection();
			//create the PreparedStatement object
				PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS);)
		{
			//set the query Values Params
			ps.setString(1,desg);
			//execute the SQL Query
			
			try(ResultSet rs = ps.executeQuery())
			{
				
				//copy each records of RS into Employee Class Object
				list = new ArrayList();
				while(rs.next())
				{
			    Employee emp = new Employee(); 
			    emp.setEmpNO(rs.getInt(1));
			    emp.setEmpName(rs.getString(2));
			    emp.setDesg(rs.getString(3));
			    emp.setSalary(rs.getDouble(4));
			    	//add the Model class Object to List Collection
			    list.add(emp);
			    
				}//while
				
			}//try2
		}//try1
		catch(SQLException se)
		{
		      throw se;
		}
		catch(Exception e)
		{
			 throw e;
		}
		
		return list;
	}
}

