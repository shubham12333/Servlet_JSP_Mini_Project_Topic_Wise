package com.nt.service;

import java.util.List;

import com.nt.beans.Employee;

public interface EmployeeMgmtService 
{
	public List<Employee> fetchEmployeesByDesg(String desg) throws Exception;
	
	
}
