import java.awt.*;
import java.awt.event.*;

public class ChoiceExample2 {

  
    ChoiceExample2() {

        
        Frame f = new Frame();
        final Label label = new Label();
         
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        Button b = new Button("Show"); 
        b.setBounds(200, 100, 50, 20);

        final Choice c = new Choice();

        c.setBounds(100, 100, 75, 75);
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("Python");
        c.add("Android");

    
        f.add(c);f.add(label); f.add(b);
        f.setSize(400, 400);f.setLayout(null);f.setVisible(true);

        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: " + c.getItem(c.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String args[]) {
        new ChoiceExample2();
    }
}