package com.neosoft;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SearchTag extends SimpleTagSupport{
	
	private String text;
	private int caseNumber;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}

	@Override
	public void doTag() throws JspException, IOException {
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		
		JspWriter out = getJspContext().getOut();
		
		String msg = sw.toString();
		int caseN = caseNumber;
		String searchText = text;
		int count = 0;
		String temp[] = msg.split(" ");
		if(caseN == 0) {
			for(int i = 0; i< temp.length; i++) {
				if(searchText.equals(temp[i])) {
					count ++;
				}
			}
		}
		else if(caseN == 1) {
			for(int i = 0; i< temp.length; i++) {
				if(searchText.toLowerCase().equals(temp[i].toLowerCase())) {
					count ++;
				}
			}
		}
		out.print(searchText+" : "+count);
	}
	
	

}
