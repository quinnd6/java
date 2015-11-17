package com.gontuseries.studentadmissioncontroller;


import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day on which the request is made
		
		if(dayOfWeek == 1) //1 means Sunday, 2 means Monday...
		{
			response.getWriter().write("The website is closed on Sunday; Please try accessing it "+ 
												" on any other week day");
			return false;
		}
		return true;
	}
}
