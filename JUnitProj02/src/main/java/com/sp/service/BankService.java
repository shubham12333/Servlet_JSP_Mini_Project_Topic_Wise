package com.sp.service;

public class BankService
{
	public double calcInterestAmount(double pamt,double rate,double time)
	{
		if(pamt<=0||rate<=0||time<=0)
			throw new IllegalAccessError("Invalid input");
		return pamt*rate*time/100.0f;
	}
	
	
}
