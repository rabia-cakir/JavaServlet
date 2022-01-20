package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1634438063377664991L;

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		k=k*k;
		
		//this is how you get the writer object so that you can print something on the page
		PrintWriter out = res.getWriter();
		out.println("result is : "+k);
		
		
	}
}
