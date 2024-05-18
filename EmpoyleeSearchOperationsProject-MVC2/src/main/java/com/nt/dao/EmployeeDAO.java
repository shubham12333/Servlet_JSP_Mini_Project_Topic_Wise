package com.nt.dao;

import java.util.List;

import com.nt.beans.Employee;

public interface EmployeeDAO 
{
	public List<Employee> searchEmployeesByDesg(String desg) throws Exception;
}
