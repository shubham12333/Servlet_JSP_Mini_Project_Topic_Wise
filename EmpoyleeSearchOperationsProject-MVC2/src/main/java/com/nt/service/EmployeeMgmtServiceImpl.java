package com.nt.service;

import java.util.List;

import com.nt.beans.Employee;
import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOServiceImpl;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService 
{
	private EmployeeDAO empDAO;
	
	public EmployeeMgmtServiceImpl()
	{
		empDAO = new EmployeeDAOServiceImpl();
	}

	public List<Employee> fetchEmployeesByDesg(String desg) throws Exception
	{
		//use DAO
		List<Employee> list = empDAO.searchEmployeesByDesg(desg);
		list.forEach(emp->{
			//calculate the 
			double grossSalary = emp.getSalary()+emp.getSalary()*0.3f;
			double netSalary = grossSalary-(grossSalary*0.1);
			//set gorss Salary . net Salary to back to emp Object
			emp.setGrossSalary(grossSalary);
			emp.setNetSalary(netSalary);
		});
		return list;
	}//method
}
