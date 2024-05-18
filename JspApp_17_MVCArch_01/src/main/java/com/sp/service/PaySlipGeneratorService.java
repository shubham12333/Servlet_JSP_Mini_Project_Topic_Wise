package com.sp.service;

import com.sp.beans.Employee;

public class PaySlipGeneratorService
{
	public void GeneratePaySlip(Employee emp)
	{
		//Calaculate Gross Salary and netSalary
		
		float grossSalary = emp.getEmpSalary()+emp.getEmpSalary()*0.5f;//50% on basic Salary
		float netSalary  = grossSalary-(grossSalary*0.2f);
		
		emp.setGrossSalary(grossSalary);
		emp.setNetSalary(netSalary);
	}
}
