## JSP
- JSP technology is used to create web application just like Servlet technology. 
- It can be thought of as an extension to Servlet because it provides more functionality than servlet such as expression language, JSTL, etc.
- A JSP page consists of HTML tags and JSP tags.
- The JSP pages are easier to maintain than Servlet because we can separate designing and development. 
- It provides some additional features such as Expression Language, Custom Tags, etc.

**Advantages**
- 1) Extension to Servlet
- 2) Easy to maintain
- 3) Fast Development: No need to recompile and redeploy
- 4) Less code than Servlet

### The Lifecycle of a JSP Page
The JSP pages follow these phases:

- Translation of JSP Page
- Compilation of JSP Page
- Classloading (the classloader loads class file)
- Instantiation (Object of the Generated Servlet is created).
- Initialization ( the container invokes jspInit() method).
- Request processing ( the container invokes _jspService() method).
- Destroy ( the container invokes jspDestroy() method).

![](https://i.imgur.com/UytBOd6.png)

**Example**

```jsp
<html>  
<body>  
<% out.print(2*5); %>  
</body>  
</html>  
```

### The JSP API

The JSP API consists of two packages:
- javax.servlet.jsp
- javax.servlet.jsp.tagext

**javax.servlet.jsp package**
- The javax.servlet.jsp package has two interfaces and classes.
- The two interfaces are as follows:
    - JspPage
    - HttpJspPage
- The classes are as follows:
    - JspWriter
    - PageContext
    - JspFactory
    - JspEngineInfo
    - JspException
    - JspError


## **JSP Scripting elements**
- The scripting elements provides the ability to insert java code inside the jsp. 
- There are three types of scripting elements:
    - scriptlet tag
    - expression tag
    - declaration tag

**scriptlet tag**
- A scriptlet tag is used to execute java source code
- The jsp scriptlet tag can only declare variables not methods.
- The declaration of scriptlet tag is placed inside the _jspService() method.
```java
<%  java source code %>  
```

```jsp
<html>  
<body>  
<% out.print("welcome to jsp"); %>  
</body>  
</html>  
```

**JSP expression tag**
- The code placed within JSP expression tag is written to the output stream of the response. 
- So you need not write out.print() to write data. It is mainly used to print the values of variable or method.

```jsp
<html>  
<body>  
<%= "welcome to jsp" %>  
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>  
</html>  
```

**JSP Declaration Tag**
- The JSP declaration tag is used to declare fields and methods.
- The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.
- So it doesn't get memory at each request.
- 	The jsp declaration tag can declare variables as well as methods.
- 	The declaration of jsp declaration tag is placed outside the _jspService() method.
- syntax
```jsp
<html>  
<body>  
<%! int data=50; %>  
<%= "Value of the variable is:"+data %>  
</body>  
</html>



<html>  
<body>  
<%!   
int cube(int n){  
return n*n*n*;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  
</body>  
</html>  
```

## JSP Implicit Objects
- There are 9 jsp implicit objects. These objects are created by the web container that are available to all the jsp pages.
- The available implicit objects are out, request, config, session, application etc.

![](https://i.imgur.com/9CMyAYT.png)

**1) JSP out implicit object**
- For writing any data to the buffer, JSP provides an implicit object named out. 
- It is the object of JspWriter. 
- In case of servlet you need to write:
    - PrintWriter out=response.getWriter();  
    - But in JSP, you don't need to write this code.

**JSP request implicit object**
- The JSP request is an implicit object of type HttpServletRequest i.e. created for each jsp request by the web container. 
- It can be used to get request information such as parameter, header information, remote address, server name, server port, content type, character encoding etc.
- It can also be used to set, get and remove attributes from the jsp request scope.

```html
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form> 

<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
```

**3) JSP response implicit object**
- In JSP, response is an implicit object of type HttpServletResponse. 
- The instance of HttpServletResponse is created by the web container for each jsp request.
- It can be used to add or manipulate response such as redirect response to another resource, send error etc.

```html
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  


<%   
response.sendRedirect("http://www.google.com");  
%>  
```

**4) JSP config implicit object**
- In JSP, config is an implicit object of type ServletConfig. 
- This object can be used to get initialization parameter for a particular JSP page. 
- The config object is created by the web container for each jsp page.

```html
<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  
```

**5) JSP application implicit object**
- In JSP, application is an implicit object of type ServletContext.
- The instance of ServletContext is created only once by the web container when application or project is deployed on the server.
- This object can be used to get initialization parameter from configuaration file (web.xml). 
- It can also be used to get, set or remove attribute from the application scope.
- This initialization parameter can be used by all jsp pages.

```html
<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=application.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  
```


**6) session implicit object**
- In JSP, session is an implicit object of type HttpSession.
- The Java developer can use this object to set,get or remove attribute or to get session information.

```jsp
<html>  
<body>  
<%   
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
session.setAttribute("user",name);  
<a href="second.jsp">second jsp page</a>  
%>  
</body>  
</html>  
```

```html
<html>  
<body>  
<%   
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);  
%>  
</body>  
</html>  
```

**7) exception implicit object**
- In JSP, exception is an implicit object of type java.lang.Throwable class. 
- This object can be used to print the exception. 
- But it can only be used in error pages.
- It is better to learn it after page directive.

process.jsp
```html
<%@ page errorPage="error.jsp" %>  
<%  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
 
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
%>  
```

error.jsp
```html
<%@ page isErrorPage="true" %>  
<h3>Sorry an exception occured!</h3>  
Exception is: <%= exception %>  
```

## JSP directives
- The jsp directives are messages that tells the web container how to translate a JSP page into the corresponding servlet.
- There are three types of directives:
    - page directive
    - include directive
    - taglib directive

syntax:
```html
<%@ directive attribute="value" %>  
```

### JSP page directive
syntax
```html
<%@ page attribute="value" %>  
```
- Attributes of JSP page directive
    - import , contentType , extends , info ,buffer,language
    - isELIgnored , isThreadSafe , autoFlush
    - session
    - pageEncoding
    - errorPage , isErrorPage 

**1)import**
- The import attribute is used to import class,interface or all the members of a package.
- It is similar to import keyword in java class or interface.

**2)contentType**
- The contentType attribute defines the MIME(Multipurpose Internet Mail Extension) type of the HTTP response.
- The default value is "text/html;charset=ISO-8859-1".

**3)extends**
- The extends attribute defines the parent class that will be inherited by the generated servlet.
- It is rarely used.

**4)info**
- This attribute simply sets the information of the JSP page which is retrieved later by using getServletInfo() method of Servlet interface.

**5)buffer**
- The buffer attribute sets the buffer size in kilobytes to handle output generated by the JSP page.The default size of the buffer is 8Kb.

**6)language**
- The language attribute specifies the scripting language used in the JSP page. The default value is "java".


**7)errorPage**
- The errorPage attribute is used to define the error page, if exception occurs in the current page, it will be redirected to the error page.

**8)isErrorPage**
- The isErrorPage attribute is used to declare that the current page is the error page.
- The exception object can only be used in the error page.

```html
<html>  
<body>  
<%@ page contentType=application/msword %>  
<%@ page info="written by kumar.." %>  
<%@ page import="java.util.Date" %>  
<%@ page buffer="16kb" %>  

<%@ page errorPage="myerrorpage.jsp" %>  
<%@ page isErrorPage="true" %>  
Today is: <%= new Date() %>  
</body>  
</html> 
```

### Jsp Include Directive
- The include directive is used to include the contents of any resource it may be jsp file, html file or text file.
- Provides Code Reusability
- Syntax
```html
<%@ include file="resourceName" %>  
```

```html
<html>  
<body>  
<%@ include file="header.html" %>  
Today is: <%= java.util.Calendar.getInstance().getTime() %>  
</body>  
</html>  
```

### JSP Taglib directive
- The JSP taglib directive is used to define a tag library that defines many tags. 
- We use the TLD (Tag Library Descriptor) file to define the tags.
syntax:
```html
<%@ taglib uri="uriofthetaglibrary" prefix="prefixoftaglibrary" %>  
```
Example
```html
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
    <p><a href="<s:url action='hello'/>">Hello World</a></p>
  </body>
</html>
```

### JSP Action Tags
- There are many JSP action tags or elements. Each JSP action tag is used to perform some specific tasks.
- The action tags are used to control the flow between pages and to use Java Bean. 

![](https://i.imgur.com/95quNLi.png)


## Custom Tags in JSP
- Custom tags are user-defined tags. 
- They eliminates the possibility of scriptlet tag and separates the business logic from the JSP page.
- The same business logic can be used many times by the use of custom tag.

**Advantages**
- Eliminates the need of scriptlet tag
- Separation of business logic from JSP
- Re-usability

```jsp
<prefix:tagname attr1=value1....attrn=valuen />  

<prefix:tagname attr1=value1....attrn=valuen >  
body code  
</prefix:tagname>  

```

**For creating any custom tag, we need to follow following steps:**

- Create the Tag handler class and perform action at the start or at the end of the tag.
- Create the Tag Library Descriptor (TLD) file and define tags
- Create the JSP file that uses the Custom tag defined in the TLD file