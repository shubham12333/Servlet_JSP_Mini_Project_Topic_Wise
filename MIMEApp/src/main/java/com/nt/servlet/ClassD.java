package com.nt.servlet;

public class ClassD 
{
	int meth1()
	{
		System.out.println("meth1 Called");
		return 10;	
	}
	
	void meth2(int x)
	{
		System.out.println("Meth2() called");
		System.out.println(x+x);
	}
	
	public static void main(String[] args) 
	{
	ClassD dobj = new ClassD();

	dobj.meth1();
	
	System.out.println("=============================");
	System.out.println(90+dobj.meth1());//90+10
	
	dobj.meth2(50);
	
	}
	
}
