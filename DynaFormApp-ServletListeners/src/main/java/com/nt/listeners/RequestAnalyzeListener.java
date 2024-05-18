package com.nt.listeners;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class RequestAnalyzeListener implements ServletRequestListener
{
	private long start , end;
	@Override
	public void requestInitialized(ServletRequestEvent sre) 
	{
		System.out.println("RequestAnalyzeListener.requestInitialized()");
		start = System.currentTimeMillis();
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) 
	{
		System.out.println("RequestAnalyzeListener.requestDestroyed()");
		end = System.currentTimeMillis();
		//get Request Object from the Event Class
		ServletRequest req = sre.getServletRequest();
		HttpServletRequest hreq = (HttpServletRequest)req;
		System.out.println(hreq.getRequestURI()+" url Request has been taken "+(end-start)+ "mili Seconds to Process the Request");
	}
}
