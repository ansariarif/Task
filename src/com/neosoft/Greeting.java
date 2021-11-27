package com.neosoft;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalTime;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Greeting extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		
		Calendar c = Calendar.getInstance();
		String greet = "";
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		if(timeOfDay >= 5 && timeOfDay < 12){
			greet="Good Morning";
		} else if(timeOfDay >= 12 && timeOfDay < 16){
			greet="Good Afternoon";
		} else if(timeOfDay >= 16 && timeOfDay < 21){
			greet="Good Evening";
		} else if(timeOfDay >= 21 && timeOfDay < 24){
			greet="Good Night";
		}
		
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		
		JspWriter out = getJspContext().getOut();
		out.print(sw.toString()+"  : "+greet+" "+LocalTime.now());
	   
	}

}
