import java.awt.*;
import java.awt.event.*;
public class AWTDemo extends Frame implements ActionListener{
    
  TextField  tf ;
  Button b;
  AWTDemo(){

       b = new Button("Click Me.");
       tf = new TextField();
       tf.setBounds(60,50,170,20); 
       b.setBounds(30,100,80,30);  
        add(b);
        add(tf);

      b.setBackground(Color.RED);
      b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
          tf.setText("hellloooooo worlddd..");
        }
      });


      setSize(300,300); 
      setTitle("This is our basic AWT example");  
      setLayout(null);  
      setVisible(true); 


    }

   
    public static void main(String[] args) {
      new AWTDemo();
    }
}
