package com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8242988260558909598L;


	//doPost method is called through service method
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		//getParamater will give you a string
		//that's why we use parseInt method
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		HttpSession session=req.getSession(); 
		session.setAttribute("k", k);
		res.sendRedirect("sq");
		
		//request dispatcher : we are dispatching the request from one servlet to the servlet
		
		//RequestDispatcher rd=req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
	}
	

	
	
}
