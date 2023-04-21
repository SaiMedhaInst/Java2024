import java.awt.*;    
public class TextAreaExample    
{    

     TextAreaExample() {    

        Frame f = new Frame();    
        TextArea area = new TextArea("Welcome to SaiMedha");    
        area.setBounds(10, 30, 300, 300);    
        f.add(area);  
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
   new TextAreaExample();    
}    
}