// import statements  
import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {

    Frame frameObj;

    // constructor    
    FlowLayoutExample() {
        // creating a frame object  
        frameObj = new Frame();

        // creating the buttons  
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b10 = new Button("10");


        // adding the buttons to frame        
        frameObj.add(b1);frameObj.add(b2);frameObj.add(b3);
        frameObj.add(b4);frameObj.add(b5);frameObj.add(b6);
        frameObj.add(b7);frameObj.add(b8);frameObj.add(b9);
        frameObj.add(b10);


        // alignment is center horizontal as well as the vertical gap is 5 units. 
        frameObj.setLayout(new FlowLayout());
        // frameObj.setLayout(new FlowLayout(FlowLayout.RIGHT));    

        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }

    // main method  
    public static void main(String argvs[]) {
        new FlowLayoutExample();
    }
}