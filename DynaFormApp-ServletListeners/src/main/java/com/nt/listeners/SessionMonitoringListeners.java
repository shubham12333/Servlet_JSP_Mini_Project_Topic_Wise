package com.nt.listeners;

import java.util.Date;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionMonitoringListeners implements HttpSessionListener
{
	private long start , end ;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) 
	{
		System.out.println("SessionMonitoringListeners.sessionCreated()");
		System.out.println("Session Object is Created :: "+new Date());
		start = System.currentTimeMillis();
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		System.out.println("SessionMonitoringListeners.sessionDestroyed()");
		System.out.println("Session Object is Destroyed :: "+new Date());
		end = System.currentTimeMillis();
		//Get Session id
		String id = se.getSession().getId();
		System.out.println("______"+id+" session duration is "+(end-start)+"ms");
	}
}
