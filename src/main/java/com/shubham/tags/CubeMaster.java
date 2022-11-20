package com.shubham.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CubeMaster extends TagSupport{

	private int number;
	
	public void setNumber(int number) {
		this.number=number;
	}

	@Override
	public int doStartTag() throws JspException {
		
		   JspWriter out=pageContext.getOut();
	        try
	        {
	        //out.print(Calendar.getInstance().getTime());
	            out.print(this.number*this.number*this.number);
	    }catch(IOException e)
	        {
	        
	        }
	    return EVAL_PAGE;
	}
	}
	

