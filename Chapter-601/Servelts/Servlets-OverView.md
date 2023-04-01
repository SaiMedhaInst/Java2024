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
)
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



