package com.sp.beans;

import java.io.Serializable;

public class Employee implements Serializable
{	
	private int empNumber;
	private String empName;
	private String empAddress;
	private float empSalary;
	private float grossSalary;
	private float netSalary;
	
	/**
	 * @return the empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}
	/**
	 * @param empNumber the empNumber to set
	 */
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	/**
	 * @return the empSalary
	 */
	public float getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	/**
	 * @return the grossSalary
	 */
	public float getGrossSalary() {
		return grossSalary;
	}
	/**
	 * @param grossSalary the grossSalary to set
	 */
	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}
	/**
	 * @return the netSalary
	 */
	public float getNetSalary() {
		return netSalary;
	}
	/**
	 * @param netSalary the netSalary to set
	 */
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	
	
}
