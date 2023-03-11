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