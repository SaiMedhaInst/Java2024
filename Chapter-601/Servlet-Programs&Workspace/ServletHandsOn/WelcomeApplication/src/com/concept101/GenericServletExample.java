package com.concept101;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class GenericServletExample extends HttpServlet{
	
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException{
		

	    res.setContentType("text/html");

	    PrintWriter out = res.getWriter();
	    out.print("<html><body bgcolor=yellow>");
	    out.print("<b><center>hello generic servlet</b></center>");
	    out.print("</body></html>");
	    
	    
		
	}

}
