
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    Frame frameObj;

    // constructor  
    GridLayoutExample() {
        frameObj = new Frame();

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

  
        frameObj.add(btn1);frameObj.add(btn2);frameObj.add(btn3);frameObj.add(btn4);
        frameObj.add(btn5);frameObj.add(btn6);frameObj.add(btn7);frameObj.add(btn8);
        frameObj.add(btn9);

        // setting the grid layout using the parameterless constructor    
        frameObj.setLayout(new GridLayout(3,3,20,25));


        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }

    // main method  
    public static void main(String argvs[]) {
        new GridLayoutExample();
    }
}