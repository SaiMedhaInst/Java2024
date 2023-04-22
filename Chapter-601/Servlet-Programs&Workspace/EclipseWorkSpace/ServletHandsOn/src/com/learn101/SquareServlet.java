package com.learn101;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class SquareServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException{
		
		
		PrintWriter out = res.getWriter();
		out.println("Hello to Square Servlet ... :)");
		
		//fetching the data.
		int data = (int) req.getAttribute("add");
		int result = data * data;
		
		out.println("Square of a Number : "+ result);
	}

}
