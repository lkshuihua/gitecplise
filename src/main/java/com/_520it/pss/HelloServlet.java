package com._520it.pss;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hello world");
		req.setAttribute("jining", "hello world2");
		System.out.println("commit sectond shyji");System.out.println("hot_fix");
		System.out.println("master2");
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
	}

}
