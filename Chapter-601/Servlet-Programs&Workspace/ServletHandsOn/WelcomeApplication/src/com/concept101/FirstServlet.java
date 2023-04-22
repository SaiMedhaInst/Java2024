package com.concept101;

import javax.servlet.*;
import java.io.*;


public class FirstServlet implements Servlet{

	ServletConfig config = null;

	  public void init(ServletConfig config) {
	    this.config = config;
	    System.out.println("servlet is initialized");
	  }

	  public void service(ServletRequest req, ServletResponse res)
	  throws IOException, ServletException {

	    res.setContentType("text/html");

	    PrintWriter out = res.getWriter();
	    out.print("<html><body bgcolor=red>");
	    out.print("<h1><b><center>hello  everyone ... simple servlet</b></center></h1>");
	    out.print("</body></html>");

	  }
	  public void destroy() {
	    System.out.println("servlet is destroyed");
	  }
	  public ServletConfig getServletConfig() {
	    return config;
	  }
	  public String getServletInfo() {
	    return "copyright 2007-1010";
	  }

	
}
