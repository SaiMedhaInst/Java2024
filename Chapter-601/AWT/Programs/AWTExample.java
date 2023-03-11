
import java.awt.*;    
  
public class AWTExample extends Frame {    
 
   AWTExample() {  
  
   
      Button b = new Button("Click Me!!");  
      b.setBounds(30,100,80,30);  
      add(b);  
	  
      setSize(300,300);  
 
      setTitle("This is our basic AWT example");   
         
      setLayout(null);  
      setVisible(true);  
}    
  

public static void main(String args[]) {   
  
AWTExample f = new AWTExample();    
  
}  
  
}   