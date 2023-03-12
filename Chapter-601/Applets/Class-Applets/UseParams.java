import java.applet.Applet;  
import java.awt.Graphics;  
  
public class UseParams extends Applet{  
  
public void paint(Graphics g){  
String str=getParameter("msg");  
g.drawString(str,50, 50);  
}  
  
}
/*
 <html>  
<body>  
<applet code="UseParams" width="300" height="300">  
<param name="msg" value="Welcome to SaiMedha">  
</applet>  
</body>  
</html> 
 */



