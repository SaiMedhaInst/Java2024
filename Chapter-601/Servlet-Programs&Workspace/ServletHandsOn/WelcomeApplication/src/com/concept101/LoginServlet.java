package com.concept101;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(n.equals("kumar")&& p.equals("kumar123")){  
	        RequestDispatcher rd=request.getRequestDispatcher("welcomeuser");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/loginform.html");  
	        rd.include(request, response);  
	                      
	        }  
	    }  
}
