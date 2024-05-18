package com.nt.listeners;

import java.util.Date;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionMonitorListener implements HttpSessionListener
{
	private long start,end;
	
	public SessionMonitorListener() 
	{
		System.out.println("Session Monitor Listener :: 0-param Constructor ");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) 
	{
		System.out.println("SessionMonitorListener.sessionCreated()");
		start = System.currentTimeMillis();
		System.out.println("Session Started at :: "+new Date());
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		System.out.println("SessionMonitorListener.sessionDestroyed()");
		end = System.currentTimeMillis();
		System.out.println("Session ended at :: "+new Date());
		System.out.println("The Session Duration is :: "+(end-start)+" ms");
	}
}
