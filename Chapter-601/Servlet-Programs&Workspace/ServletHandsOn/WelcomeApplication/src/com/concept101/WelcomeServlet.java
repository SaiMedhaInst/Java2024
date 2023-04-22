package com.concept101;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    out.print("<html><body bgcolor=yellow> <h1> <center>");
	    out.print("Hey  Welcome .... "+n);
	    out.print("</center></h1></body></html>");
	    } 
	
}
