package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8242988260558909598L;

	//you don't have to create this object (req, res) yourself
	//this object will be created by TomCat
	//you just need to get a reference of it 
	
	//method name has to be "service"
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		//getParamater will give you a string
		//that's why we use parseInt method
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		PrintWriter out=res.getWriter();
		
		out.println("result is : "+k);
	}

}
