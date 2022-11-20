package com.shubham.tags;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTagMaster extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();
		
		try {
		out.print(Calendar.getInstance().getTime());
		}catch(IOException ex) {}
		return EVAL_PAGE;
	}

}
