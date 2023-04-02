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
