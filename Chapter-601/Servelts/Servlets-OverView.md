## Servlets In Java

- Servlet technology is used to create a web application (resides at server side and generates a dynamic web page).
- Servlet technology is robust and scalable because of java language. 
- Before Servlet, CGI (Common Gateway Interface) scripting language was common as a server-side programming language.
- There are many interfaces and classes in the Servlet API 
- such as 
    -  Servlet, 
    -  GenericServlet, 
    -  HttpServlet, 
    -  ServletRequest, 
    -  ServletResponse

### What is a Servlet?

- Servlet is a technology which is used to create a web application.
- Servlet is an API that provides many interfaces and classes including documentation.
- Servlet is an interface that must be implemented for creating any Servlet.
- Servlet is a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
- Servlet is a web component that is deployed on the server to create a dynamic web page

![ScreenShot](https://i.imgur.com/aVjk2jR.png).

**What is Web-App?**
>A web application is an application accessible from the web. A web application is composed of web components like Servlet, JSP, Filter, etc. and other elements such as HTML, CSS, and JavaScript. The web components typically execute in Web Server and respond to the HTTP request.

### CGI (Common Gateway Interface)
- CGI technology enables the web server to call an external program and pass HTTP request information to the external program to process the request. For each request, it starts a new process

![ScreenShot](https://i.imgur.com/eWc8VdC.png).

**CONS**
- If the number of clients increases, it takes more time for sending the response.
- For each request, it starts a process, and the web server is limited to start processes.
- It uses platform dependent language e.g. C, C++, perl.

**PROS OF SERVLETS**
![ScreenShot](https://i.imgur.com/qKaSgLC.png)
- The web container creates threads for handling the multiple requests to the Servlet. 
- Threads have many benefits over the Processes such as they share a common memory area, lightweight, cost of communication between the threads are low

**Better performance**: because it creates a thread for each request, not process.
**Portability**: because it uses Java language.
**Robust:** JVM manages Servlets, so we don't need to worry about the memory leak, garbage collection, etc.
**Secure:** because it uses java language.

### Web Terminology
- Website: static vs dynamic	It is a collection of related web pages that may contain text, images, audio and video.
- HTTP	It is the data communication protocol used to establish communication between client and server.
- HTTP Requests	It is the request send by the computer to a web server that contains all sorts of potentially interesting information.
- Container	It is used in java for dynamically generating the web pages on the server side.

![](https://i.imgur.com/E5rD0zR.png)

**HTTP (Hyper Text Transfer Protocol)**
- The Hypertext Transfer Protocol (HTTP) is application-level protocol for collaborative, distributed, hypermedia information systems. 
- It is the data communication protocol used to establish communication between client and server.
- HTTP is TCP/IP based communication protocol, which is used to deliver the data like image files, query results, HTML files etc on the World Wide Web (WWW) 
- with the default port is TCP 80. 
- It provides the standardized way for computers to communicate with each other.
- HTTP is request/response protocol which is based on client/server based architecture

![](https://i.imgur.com/QCK8Qb4.png)
**Basic Features of HTTP**
- HTTP is media independent
- HTTP is connectionless
- HTTP is stateless

**HTTP Requests**
- The request sent by the computer to a web server, contains all sorts of potentially interesting information; it is known as HTTP requests.

![](https://i.imgur.com/FFyiztz.png)



**Get vs. Post**

Two common methods for the request-response between a server and client are:

GET- It requests the data from a specified resource
POST- It submits the processed data to a specified resource


![](https://i.imgur.com/Fk2dwH5.png)


##### Servlet Container.
- It provides the runtime environment for JavaEE (j2ee) applications.
-  The client/user can request only a static WebPages from the server. If the user wants to read the web pages as per input then the servlet container is used in java.
-  The servlet container is the part of web server which can be run in a separate process.

![](https://i.imgur.com/wzfYWax.png)

**Servlet Container States**
- The servlet container is the part of web server which can be run in a separate process. We can classify the servlet container states in three types:

**Standalone**: It is typical Java-based servers in which the servlet container and the web servers are the integral part of a single program. For example:- Tomcat running by itself

**In-process:** It is separated from the web server, because a different program runs within the address space of the main server as a plug-in. For example:- Tomcat running inside the JBoss.

**Out-of-process:** The web server and servlet container are different programs which are run in a different process. For performing the communications between them, web server uses the plug-in provided by the servlet container.

**The Servlet Container performs many operations that are given below:**

- Life Cycle Management
- Multithreaded support
- Object Pooling
- Security etc.


#### Server: Web vs. Application

>Server is a device or a computer program that accepts and responds to the request made by other program, known as client. 
- It is used to manage the network resources and for running the program or software that provides services.

There are two types of servers:
- Web Server
- Application Server


**Web Server**
- Web server contains only web or servlet container. It can be used for servlet, jsp, struts, jsf etc. It can't be used for EJB.
- It is a computer where the web content can be stored. 
- In general web server can be used to host the web sites but there also used some other web servers also such as FTP, email, storage, gaming etc.
- Examples of Web Servers are: Apache Tomcat and Resin.

**Application Server**
- Application server contains Web and EJB containers.
- It can be used for servlet, jsp, struts, jsf, ejb etc. 
- It is a component based product that lies in the middle-tier of a server centric architecture.
- It provides the middleware services for state maintenance and security, along with persistence and data access. 
- It is a type of server designed to install, operate and host associated services and applications for the IT services, end users and organizations.

The Example of Application Servers are:
JBoss: Open-source server from JBoss community.
Glassfish: Provided by Sun Microsystem. Now acquired by Oracle.
Weblogic: Provided by Oracle. It more secured.
Websphere: Provided by IBM.

#### Content Type
- Content Type is also known as MIME (Multipurpose internet Mail Extension)Type. 
- It is a HTTP header that provides the description about what are you sending to the browser.
- MIME is an internet standard that is used for extending the limited capabilities of email by allowing the insertion of sounds, images and text in a message.
- The features provided by MIME to the email services are as given below:
    - It supports the non-ASCII characters
    - It supports the multiple attachments in a single message
    - It supports the attachment which contains executable audio, images and video files etc.
    - It supports the unlimited message length.

- List of Content Types
    - text/html
    - text/plain
    - application/msword
    - application/vnd.ms-excel
    - application/jar
    - application/pdf
    - images/jpeg
    - images/png
    - images/gif
    - audio/mp3
    - video/mp4

## Servlet API
- The *javax.servlet* and *javax.servlet.http* packages represent interfaces and classes for servlet api.
- The *javax.servlet* package contains many interfaces and classes that are used by the servlet or web container. These are not specific to any protocol.

The *javax.servlet.http* package contains interfaces and classes that are responsible for http requests only.

**Interfaces in javax.servlet package**
- Servlet
- ServletRequest
- ServletResponse
- RequestDispatcher
- ServletConfig
- ServletContext
- SingleThreadModel
- Filter
- FilterConfig
- FilterChain
- ServletRequestListener
- ServletRequestAttributeListener
- ServletContextListener
- ServletContextAttributeListener.

**Classes in javax.servlet package**

- GenericServlet
- ServletInputStream
- ServletOutputStream
- ServletRequestWrapper
- ServletResponseWrapper
- ServletRequestEvent
- ServletContextEvent
- ServletRequestAttributeEvent
- ServletContextAttributeEvent
- ServletException
- UnavailableExceptio

**Interfaces in javax.servlet.http package**
- HttpServletRequest
- HttpServletResponse
- HttpSession
- HttpSessionListener
- HttpSessionAttributeListener
- HttpSessionBindingListener
- HttpSessionActivationListener
- HttpSessionContext (deprecated now)

**Classes in javax.servlet.http package**

- HttpServlet
- Cookie
- HttpServletRequestWrapper
- HttpServletResponseWrapper
- HttpSessionEvent
- HttpSessionBindingEvent
- HttpUtils (deprecated now)

## Servlet Interface
- Servlet interface provides common behaviorto all the servlets.
- Servlet interface defines methods that all servlets must implement.

**Methods**
- public void init(ServletConfig config)
- public void service(ServletRequest request,ServletResponse response)
- public void destroy()
- public ServletConfig getServletConfig()
- public String getServletInfo()

```java

import java.io.*;
import javax.servlet.*;

public class First implements Servlet {
  ServletConfig config = null;

  public void init(ServletConfig config) {
    this.config = config;
    System.out.println("servlet is initialized");
  }

  public void service(ServletRequest req, ServletResponse res)
  throws IOException, ServletException {

    res.setContentType("text/html");

    PrintWriter out = res.getWriter();
    out.print("<html><body>");
    out.print("<b>hello simple servlet</b>");
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
```

## GenericServlet class

- GenericServlet class implements Servlet, ServletConfig and Serializable interfaces. 
- It provides the implementation of all the methods of these interfaces except the service method.
- GenericServlet class can handle any type of request so it is protocol-independent.

*Methods*

- **public void init(ServletConfig config)** is used to initialize the servlet.
- **public abstract void service(ServletRequest request, ServletResponse response)** provides service for the incoming request. It is invoked at each time when user requests for a servlet.
- **public void destroy()** is invoked only once throughout the life cycle and indicates that servlet is being destroyed.
- **public ServletConfig getServletConfig()** returns the object of ServletConfig.
- **public String getServletInfo()** returns information about servlet such as writer, copyright, version etc.
- **public void init()** it is a convenient method for the servlet programmers, now there is no need to call super.init(config)
- **public ServletContext getServletContext()** returns the object of ServletContext.
- **public String getInitParameter(String name)** returns the parameter value for the given parameter name.
- **public Enumeration getInitParameterNames()** returns all the parameters defined in the web.xml file.
- **public String getServletName()** returns the name of the servlet object.
- **public void log(String msg)** writes the given message in the servlet log file.
- **public void log(String msg,Throwable t)** writes the explanatory message in the servlet log file and a stack trace.

```java
import java.io.*;
import javax.servlet.*;

public class First extends GenericServlet {
  public void service(ServletRequest req, ServletResponse res)
  throws IOException, ServletException {

    res.setContentType("text/html");

    PrintWriter out = res.getWriter();
    out.print("<html><body>");
    out.print("<b>hello generic servlet</b>");
    out.print("</body></html>");
  }
}
```

## HttpServlet class
- The HttpServlet class extends the GenericServlet class and implements Serializable interface. It provides http specific methods such as doGet, doPost, doHead, doTrace etc.

**Methods**

- **public void service(ServletRequest req,ServletResponse res)** 
    - dispatches the request to the protected service method by converting the request and response object into http type.
- **protected void service(HttpServletRequest req, HttpServletResponse res)** 
    - receives the request from the service method, and dispatches the request to the doXXX() method depending on the incoming http request type.
- **protected void doGet(HttpServletRequest req, HttpServletResponse res)** 
    - handles the GET request. 
    - It is invoked by the web container.
- **protected void doPost(HttpServletRequest req, HttpServletResponse res)** 
    - handles the POST request. It is invoked by the web container.
- **protected void doHead(HttpServletRequest req, HttpServletResponse res)**** 
    - handles the HEAD request. It is invoked by the web container.
- **protected void doOptions(HttpServletRequest req, HttpServletResponse res)**
    - handles the OPTIONS request. It is invoked by the web container.
- **protected void doPut(HttpServletRequest req, HttpServletResponse res)** 
    - handles the PUT request. It is invoked by the web container.
- **protected void doTrace(HttpServletRequest req, HttpServletResponse res)** 
    - handles the TRACE request. It is invoked by the web container.
- **protected void doDelete(HttpServletRequest req, HttpServletResponse res)**
    - handles the DELETE request. It is invoked by the web container.
- **protected long getLastModified(HttpServletRequest req)** 
    - returns the time when HttpServletRequest was last modified since midnight

## Life Cycle of a Servlet
> The web container maintains the life cycle of a servlet instance. Let's see the life cycle of the servlet:
- Servlet class is loaded.
- Servlet instance is created.
- init method is invoked.
- service method is invoked.
- destroy method is invoked.

![](https://i.imgur.com/ddb7TrM.png)




 
![](https://i.imgur.com/ZgnlPxH.png)


**1) Servlet class is loaded**
- The classloader is responsible to load the servlet class.
- The servlet class is loaded when the first request for the servlet is received by the web container.

**2) Servlet instance is created**
- The web container creates the instance of a servlet after loading the servlet class. 
- The servlet instance is created only once in the servlet life cycle.

**3) init method is invoked**
- The web container calls the init method only once after creating the servlet instance. 
- The init method is used to initialize the servlet. 
- It is the life cycle method of the javax.servlet.Servlet interface
```java
public void init(ServletConfig config) throws ServletException  
```

**4) service method is invoked**
- The web container calls the service method each time when request for the servlet is received. - If servlet is not initialized, it follows the first three steps as described above then calls the service method. 
- If servlet is initialized, it calls the service method. 
- Notice that servlet is initialized only once.

```java
public void service(ServletRequest request, ServletResponse response)   
  throws ServletException, IOException  
```

**5) destroy method is invoked**
- The web container calls the destroy method before removing the servlet instance from the service. 
- It gives the servlet an opportunity to clean up any resource for example memory, thread etc. 
```java
public void destroy()  
```

## ServletRequest Interface
- An object of ServletRequest is used to provide the client request information to a servlet such as content type, content length, parameter names and values, header informations, attributes etc.

**Methods**
- public String getParameter(String name)
- public String[] getParameterValues(String name)
- java.util.Enumeration getParameterNames()
- public int getContentLength()
- public String getCharacterEncoding()
- public String getContentType()
- public ServletInputStream getInputStream() throws IOException
- public abstract String getServerName()
- public int getServerPort()


```html
<form action="welcome" method="get">  
Enter your name<input type="text" name="name"><br>  
<input type="submit" value="login">  
</form>  
```
```java
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServ extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();

    String name = req.getParameter("name"); //will return value  
    pw.println("Welcome " + name);

    pw.close();
  }
}
```


## RequestDispatcher in Servlet
- The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. 
- This interface can also be used to include the content of another resource also. It is one of the way of servlet collaboration.

**Methods**
- **public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException**
     - Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
- **public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException**
    - Includes the content of a resource (servlet, JSP page, or HTML file) in the response.

![](https://i.imgur.com/fulUJ7Y.png)


![](https://i.imgur.com/IgKgh18.png)

- The getRequestDispatcher() method of ServletRequest interface returns the object of RequestDispatcher. Syntax:
```java
public RequestDispatcher getRequestDispatcher(String resource);  
```

Example: 
```java
RequestDispatcher rd=request.getRequestDispatcher("servlet2");   //servlet2 url pattern
rd.forward(request, response);
```

**Example of RequestDispatcher interface**
![](https://i.imgur.com/fhz3DRd.png)

## SendRedirect in servlet

- The sendRedirect() method of HttpServletResponse interface can be used to redirect response to another resource, it may be servlet, jsp or html file.
- It accepts relative as well as absolute URL.
- It works at client side because it uses the url bar of the browser to make another request. So, it can work inside and outside the server.

![](https://i.imgur.com/0RxVB4w.png)

```java
public void sendRedirect(String URL)throws IOException;  
```


**Example**
```java
response.sendRedirect("http://www.saimedha.com");  
```

## ServletConfig Interface

- An object of ServletConfig is created by the web container for each servlet. 
- This object can be used to get configuration information from web.xml file.
- If the configuration information is modified from the web.xml file, we don't need to change the servlet. 
- So it is easier to manage the web application if any specific content is modified from time to time.
- The core advantage of ServletConfig is that you don't need to edit the servlet file if information is modified from the web.xml file.

**Methods**

**public String getInitParameter(String name)**:Returns the parameter value for the specified parameter name.
**public Enumeration getInitParameterNames()**:Returns an enumeration of all the initialization parameter names.
**public String getServletName():** Returns the name of the servlet.
**public ServletContext getServletContext():** Returns an object of ServletContext.

**Syntax**
```java
public ServletConfig getServletConfig();  
```

**Example**
```java
ServletConfig config=getServletConfig();  
```

**Initialization parameter**
```xml
<init-param>  
<param-name>username</param-name>  
<param-value>kumar</param-value>  
</init-param> 
```
## ServletContext Interface
- An object of ServletContext is created by the web container at time of deploying the project. - This object can be used to get configuration information from web.xml file. 
- There is only one ServletContext object per web application.
- Easy to maintain if any information is shared to all the servlet, it is better to make it available for all the servlet.
- We provide this information from the web.xml file, so if the information is changed, we don't need to modify the servlet. Thus it removes maintenance problem.

**Usage of ServletContext Interface**
- The object of ServletContext provides an interface between the container and servlet.
- The ServletContext object can be used to get configuration information from the web.xml file.
- The ServletContext object can be used to set, get or remove attribute from the web.xml file.
- The ServletContext object can be used to provide inter-application communication.

![](https://i.imgur.com/ypLN25w.png)

**methods**
- public String getInitParameter(String name)
- public Enumeration getInitParameterNames()
- public void setAttribute(String name,Object object)
- public Object getAttribute(String name)
- public Enumeration getInitParameterNames()
- public void removeAttribute(String name)

**Syntax**
```java
public ServletContext getServletContext()  
```

**Example**
```java

//getServletContext() method of ServletConfig interface returns the object of ServletContext.
//getServletContext() method of GenericServlet class returns the object of ServletContext.


//We can get the ServletContext object from ServletConfig object  
ServletContext application=getServletConfig().getServletContext();  
  
//Another convenient way to get the ServletContext object  
ServletContext application=getServletContext();  
```

**Initialization parameter**
- The context-param element, subelement of web-app, is used to define the initialization parameter in the application scope. 
- The param-name and param-value are the sub-elements of the context-param. 
- The param-name element defines parameter name and and param-value defines its value
```xml
  <context-param>  
    <param-name>parametername</param-name>  
    <param-value>parametervalue</param-value>  
  </context-param> 
```

### Attribute in Servlet
- An attribute in servlet is an object that can be set, get or removed from one of the following scopes:
    - request scope
    - session scope
    - application scope

**methods**
- public void setAttribute(String name,Object object)
- public Object getAttribute(String name)
- public Enumeration getInitParameterNames()
    - Returns the names of the context's initialization parameters as an Enumeration of String objects.
- public void removeAttribute(String name)


