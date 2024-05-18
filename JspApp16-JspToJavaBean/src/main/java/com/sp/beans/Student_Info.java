package com.sp.beans;

import java.io.Serializable;

public class Student_Info implements Serializable 
{
	private int sno;
	private String sname;
	private String sadd;
	private float avg;
	
	public Student_Info()
	{
		System.out.println("Student_Info: 0 param Constructor ");
	} 
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	
	
	
}
