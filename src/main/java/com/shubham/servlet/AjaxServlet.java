package com.shubham.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	Map<String,Integer> m1=new HashMap<String, Integer>();
    public AjaxServlet() {
        super();
       m1.put("nikhil",35);
       m1.put("Shubham",28);
       m1.put("Emanuel",27);
       m1.put("Arun",25);
       m1.put("Tejas",22);
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();	
	 String name=request.getParameter("n1");
	
	
	if(m1.keySet().stream().filter(e->e.equals(name)).collect(Collectors.toList()).size()==1) {
        
        out.write("You are  " +m1.get(name) + " years of age ");
        }else {
        out.write("Name does not exist");
        }
	}

}
