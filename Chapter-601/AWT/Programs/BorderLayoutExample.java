import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    Frame f;
    BorderLayoutExample() {
        f = new Frame();

        //setting the layout.

        f.setLayout(new BorderLayout(20, 15));  
        // creating buttons  
        Button b1 = new Button("NORTH");; 
        Button b2 = new Button("SOUTH");;
        Button b3 = new Button("EAST");; 
        Button b4 = new Button("WEST");;
        Button b5 = new Button("CENTER");; 

        f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
        f.add(b2, BorderLayout.SOUTH); // b2 will be placed in the South Direction    
        f.add(b3, BorderLayout.EAST); // b2 will be placed in the East Direction    
        f.add(b4, BorderLayout.WEST); // b2 will be placed in the West Direction    
        f.add(b5, BorderLayout.CENTER); // b2 will be placed in the Center    

        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}