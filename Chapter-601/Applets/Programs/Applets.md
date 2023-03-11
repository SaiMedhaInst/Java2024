##### APPLETS.

#### TYPES OF APPLICATIONS.
**Standalone Application**
- A standalone application is one that can be executed independently and would execute and produce some output either as a UI or on the JVM console.
- Any java class with a main method can be considered a mini standalone java application.
- ex: Vlc media player , Adobe photoshop , Notepad++.

**Enterprise Application**
- Enterprise application is a comprehensive software platform operating in the business environment; it is a complex and scalable software connected to all function areas of the business.
- Enterprise application software is designed to support all functions of the business.
- ex: SAP , Salesforce. Oracle ORM 

**Web Applications**
- A web application (web app) is an application program that is stored on a remote server and delivered over the internet through a browser interface.
- ex: online forms, shopping carts, video streaming, social media, games, and e-mail.


#### INTRODUCTION.
- An applet is a Java program that can be embedded into a web page. 
- It runs inside the web browser and works at client side. 
- An applet is embedded in an HTML page using the APPLET or OBJECT tag and hosted on a web server.
- Applets are used to make the website more dynamic and entertaining.

**Advantages**
- It works at client side so less response time.
- Secured
- It can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc.

**Drawback**
- Plugin is required at client browser to execute applet.

**NOTE** 
- Package does GUI support:
        - **AWT(Abstract Window Toolkit)**
        - **Swing**.
- All applets are sub-classes (either directly or indirectly) of java.applet.Applet class.
- Applets are not stand-alone programs. Instead, they run within either a web browser or an applet viewer. JDK provides a standard applet viewer tool called applet viewer.
- In general, execution of an applet does not begin at main() method.
- Output of an applet window is not performed by System.out.println(). Rather it is handled with various AWT methods, such as drawString().

**Hierarchy of Applet**

![N|Solid](https://static.javatpoint.com/java/awt/images/java-awt.png)

- Applet class extends Panel. Panel class extends Container which is the subclass of Component.

**Lifecycle**
Applet is initialized.
Applet is started.
Applet is painted.
Applet is stopped.
Applet is destroyed.

![N|Solid](https://i.imgur.com/iv7DiRh.png)

![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/Java-Applet-Lifecycle.png)

-  When an applet begins, the following methods are called, in this sequence: 
init( ) start( ) paint( )
- When an applet is terminated, the following sequence of method calls takes place:  stop( ) destroy( )

**public void init()**: 
- is used to initialized the Applet. It is invoked only once.
-  The init( ) method is the first method to be called. 
-  This is where you should initialize variables.

**public void start():** 
- is invoked after the init() method or browser is maximized. 
- It is used to start the Applet.
- start( ) is called each time an applet’s HTML document is displayed onscreen. So, if a user leaves a web page and comes back, the applet resumes execution at start( ).

**public void paint(Graphics g):**
-  is used to paint the Applet. It provides Graphics class object that can be used for drawing oval, rectangle, arc etc.
- The paint( ) method is called each time an AWT-based applet’s output must be redrawn.
- paint( ) is also called when the applet begins execution. Whatever the cause, whenever the applet must redraw its output, paint( ) is called. 
- 

**public void stop():**
-  is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.
-The stop( ) method is called when a web browser leaves the HTML document containing the applet—when it goes to another page.

**public void destroy():** 
- is used to destroy the Applet. It is invoked only once.
- The destroy( ) method is called when the environment determines that your applet needs to be removed completely from memory. 
- The stop( ) method is always called before destroy( ).

**Java Plug-in software is responsible to manage the life cycle of an applet**

**NOTE**
- Java applet is deprecated, which means it’s no longer recommended for use and may be removed in  future versions of the language. 
- However, it is still supported in current versions of Java.  
- As applets are no longer widely used, Java developers are encouraged to use alternative technologies  such as web-based applications or JavaScript.
- Nevertheless, the applet technology is still available  for those who need it, but it’s not recommended for new projects.


#### How to run an Applet?
- **required java version : <=java8**
There are two ways to run an applet
- By html file.
- By appletViewer tool (for testing purpose).

**By html file.**
```java
//First.java  
import java.applet.Applet;  
import java.awt.Graphics;  
public class First extends Applet{  
    public void paint(Graphics g){  
        g.drawString("welcome",150,150);  
    } 
}  
```

**Note: class must be public because its object is created by Java Plugin software that resides on the browser.**

```html
//myapplet.html
<html>  
<body>  
<applet code="First.class" width="300" height="300">  
</applet>  
</body>  
</html>  
```

**Attributes in applet tag:**
- code: It specifies the name of the applet class to load into the browser.
- width: It specifies the width of an applet.
- height: It sets the height of an applet.


**compiling**: javac <FileName>.java
**running**: appletviewer <FileName>.html

**2. Using an Applet Viewer to run the applet:**
- It is a java application that allows you to view applets
- It’s similar to a mini-browser that will enable you to see how an applet might appear in a browser.
-  It recognizes the APPLET tag and uses it during the creation process. 
- The APPLET tag should be written in the source code file, with comments around it.

*steps*
- Write HTML APPLET tag in comments in the source file.
- Compile the applet source code using javac.
- Use applet viewer ClassName.class to view the applet.

```java
import java.awt.*;
import java.applet.*;
public class DemoApplet extends Applet{
	String msg="";
	public void init(){
		msg="Hello Geeks";
	}
	public void start(){
		msg=msg+",Welcome to GeeksForGeeks";
	}
	public void paint(Graphics g){
		g.drawString(msg,20,20);
	}
}
/*
<applet code="DemoApplet" width=300 height=100>
</applet>
*/
```
**compiling**: javac DemoApplet.java
**running**: appletviewer DemoApplet.java

#### Displaying Graphics in Applet
- java.awt.Graphics class provides many methods for graphics programming.

**methods**

**public abstract void drawString(String str, int x, int y):** is used to draw the specified string.
**public void drawRect(int x, int y, int width, int height):** draws a rectangle with the specified width and height.
**public abstract void fillRect(int x, int y, int width, int height):** is used to fill rectangle with the default color and specified width and height.
**public abstract void drawOval(int x, int y, int width, int height):** is used to draw oval with the specified width and height.
**public abstract void fillOval(int x, int y, int width, int height):** is used to fill oval with the default color and specified width and height.
**public abstract void drawLine(int x1, int y1, int x2, int y2):** is used to draw line between the points(x1, y1) and (x2, y2).
**public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer):** is used draw the specified image.
**public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle):** is used draw a circular or elliptical arc.
**public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
**public abstract void setColor(Color c):** is used to set the graphics current color to the specified color.
**public abstract void setFont(Font font):** is used to set the graphics current font to the specified font.

```java
/*
 <html>  
<body>  
<applet code="GraphicsDemo.class" width="300" height="300">  
</applet>  
</body>  
</html> 
 */
public class GraphicsDemo extends Applet{  
  
public void paint(Graphics g){  
  g.setColor(Color.red);  
  g.drawString("Welcome",50, 50);  
  g.drawLine(20,30,20,300);  
  g.drawRect(70,100,30,30);  
  g.fillRect(170,100,30,30);  
  g.drawOval(70,200,30,30);  
    
  g.setColor(Color.pink);  
  g.fillOval(170,200,30,30);  
  g.drawArc(90,150,30,30,30,270);  
  g.fillArc(270,150,30,30,0,180);  
}  
}  
 
```


### Displaying Image in Applet
- Applet is mostly used in games and animation. For this purpose image is required to be displayed. The java.awt.Graphics class provide a method drawImage() to display the image.
- The java.applet.Applet class provides getImage() method that returns the object of Image.


**public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer):** is used draw the specified image.



**public Image getImage(URL u, String image){}**
**public URL getDocumentBase():** is used to return the URL of the document in which applet is embedded.
**public URL getCodeBase():** is used to return the base URL.


```java
/*
<html>  
<body>  
<applet code="DisplayImage.class" width="300" height="300">  
</applet>  
</body>  
</html>  
*/
import java.awt.*;  
import java.applet.*;  
public class DisplayImage extends Applet {  
  Image picture;  
  
  public void init() {  
    String imgUrl = "https://images.unsplash.com/photo-1678462172400-74d993672630?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80";
    
    picture = getImage(getDocumentBase(), imgUrl);  
  } 
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
  }  

```


### EventHandling in Applet.
- As we perform event handling in AWT or Swing, we can perform it in applet also

```java

import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  

/*
 <html>  
<body>  
<applet code="EventApplet.class" width="300" height="300">  
</applet>  
</body>  
</html>  
 */
public class EventApplet extends Applet implements ActionListener{  
Button b;  
TextField tf;  
  
public void init(){  
tf=new TextField();  
tf.setBounds(30,40,150,20);  
  
b=new Button("Click");  
b.setBounds(80,150,60,50);  
  
add(b);add(tf);  
b.addActionListener(this);  
  
setLayout(null);  
}  
  
 public void actionPerformed(ActionEvent e){  
  tf.setText("Welcome");  
 }   
}

```

##### JApplet class in Applet
- As we prefer Swing to AWT. Now we can use JApplet that can have all the controls of swing. The JApplet class extends the Applet class.

##### Painting in Applet.
- We can perform painting operation in applet by the mouseDragged() method of MouseMotionListener.

```java
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*; 

/*
 <html>  
<body>  
<applet code="MouseDragPaint.class" width="300" height="300">  
</applet>  
</body>  
</html>  
  
 */

public class MouseDragPaint extends Applet implements MouseMotionListener {
  public void init(){  
    addMouseMotionListener(this);  
    setBackground(Color.red);  
    }  
      
    public void mouseDragged(MouseEvent me){  
    Graphics g=getGraphics();  
    g.setColor(Color.white);  
    g.fillOval(me.getX(),me.getY(),5,5);  
    }  
    public void mouseMoved(MouseEvent me){}  
      
}
```

#### Digital clock in Applet.
- Digital clock can be created by using the Calendar and SimpleDateFormat class

```java
import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
  
public class DigitalClock extends Applet implements Runnable {  
  
   Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
  
   public void init() {  
      setBackground( Color.green);  
   }  
  
   public void start() {  
        t = new Thread( this );  
        t.start();  
   }  
  
    
   public void run() {  
      try {  
         while (true) {  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
            
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  

            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
    
  public void paint( Graphics g ) {  
      g.setColor( Color.blue );  
      g.drawString( timeString, 50, 50 );  
   }  
}  

```

##### Applet Communication
- java.applet.AppletContext class provides the facility of communication between applets. We provide the name of applet through the HTML file. It provides getApplet() method that returns the object of Applet
- **syntax**
 public Applet getApplet(String name){}  

```java
import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class ContextApplet extends Applet implements ActionListener{  
Button b;  
  
public void init(){  
b=new Button("Click");  
b.setBounds(50,50,60,50);  
  
add(b);  
b.addActionListener(this);  
}  
  
public void actionPerformed(ActionEvent e){  
  
AppletContext ctx=getAppletContext();  
Applet a=ctx.getApplet("app2");  
a.setBackground(Color.yellow);  
}  

/*

<html>  
<body>  
<applet code="ContextApplet.class" width="150" height="150" name="app1">  
</applet>  
  
<applet code="First.class" width="150" height="150" name="app2">  
</applet>  
</body>  
</html> 

*/

```

#### Parameter in Applet.
- We can get any information from the HTML file as a parameter. For this purpose, Applet class provides a method named getParameter().

- **public String getParameter(String parameterName)**

```java
import java.applet.Applet;  
import java.awt.Graphics;  
  
public class UseParam extends Applet{  
  
public void paint(Graphics g){  
String str=getParameter("msg");  
g.drawString(str,50, 50);  
}  
  
}  
```

```html
<html>  
<body>  
<applet code="UseParam.class" width="300" height="300">  
<param name="msg" value="Welcome to applet">  
</applet>  
</body>  
</html> 
```
