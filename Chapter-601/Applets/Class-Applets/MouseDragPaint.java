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