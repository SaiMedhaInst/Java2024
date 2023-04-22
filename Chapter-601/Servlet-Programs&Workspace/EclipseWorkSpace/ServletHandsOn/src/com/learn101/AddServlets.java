package com.learn101;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class AddServlets extends HttpServlet{
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException{
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int add = n1 + n2;
		
		System.out.println("result is ==> "+ add);
		
		//printing on webpage.
		PrintWriter out = res.getWriter();
		out.printf("%d + %d = %d",n1,n2,add);
		
/*		RequestDispatcher rd = req.getRequestDispatcher("sq");
		
		//send data to another servlet..
		req.setAttribute("add", add);
		
		//forward both req and res object.
		rd.forward(req, res);
		*/
	}
}
