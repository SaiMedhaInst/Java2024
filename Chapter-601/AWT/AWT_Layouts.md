## LayoutManagers
- The LayoutManagers are used to arrange components in a particular manner.
- The Java LayoutManagers facilitates us to control the positioning and size of the components in GUI forms. 
- LayoutManager is an interface that is implemented by all the classes of layout managers. 
- There are the following classes that represent the layout managers:
    - java.awt.BorderLayout
    - java.awt.FlowLayout
    - java.awt.GridLayout
    - java.awt.CardLayout
    - java.awt.GridBagLayout
    - javax.swing.BoxLayout
    - javax.swing.GroupLayout
    - javax.swing.ScrollPaneLayout
    - javax.swing.SpringLayout etc.

#### Java BorderLayout
- The BorderLayout is used to arrange the components in five regions: north, south, east, west, and center. Each region (area) may contain one component only. 
- It is the default layout of a frame or window. 
- The BorderLayout provides five constants for each region:
    - public static final int NORTH
    - public static final int SOUTH
    - public static final int EAST
    - public static final int WEST
    - public static final int CENTER
 
**Constructors**
- **BorderLayout():** creates a border layout but with no gaps between the components.
- **BorderLayout(int hgap, int vgap):** creates a border layout with the given horizontal and vertical gaps between the components.

**EXAMPLES**

```java
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    Frame f;
    BorderLayoutExample() {
        f = new Frame();

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

```
   
#### Java GridLayout
- The Java GridLayout class is used to arrange the components in a rectangular grid. 
- One component is displayed in each rectangle.

**Constructors**
- **GridLayout():** creates a grid layout with one column per component in a row.
- **GridLayout(int rows, int columns)**: creates a grid layout with the given rows and columns but no gaps between the components.
- **GridLayout(int rows, int columns, int hgap, int vgap):** creates a grid layout with the given rows and columns along with given horizontal and vertical gaps.

```java

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
        frameObj.setLayout(new GridLayout());


        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }

    // main method  
    public static void main(String argvs[]) {
        new GridLayoutExample();
    }
}

```

### Java FlowLayout.
- The Java FlowLayout class is used to arrange the components in a line, one after another (in a flow). 
- It is the default layout of the applet or panel.

**Fields**
- public static final int LEFT
- public static final int RIGHT
- public static final int CENTER
- public static final int LEADING
- public static final int TRAILING


**Constructors**
**FlowLayout():** creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
**FlowLayout(int align):** creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
**FlowLayout(int align, int hgap, int vgap):** creates a flow layout with the given alignment and the given horizontal and vertical gap


**Example**

```java
import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {

    Frame frameObj;
 
    FlowLayoutExample() {

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

    public static void main(String argvs[]) {
        new FlowLayoutExample();
    }
}
```

### Java BoxLayout.
- The Java BoxLayout class is used to arrange the components either vertically or horizontally. For this purpose, the BoxLayout class provides four constants.

**Fields**
- public static final int X_AXIS
- public static final int Y_AXIS
- public static final int LINE_AXIS
- public static final int PAGE_AXIS

**Construtors**
**BoxLayout(Container c, int axis):** creates a box layout that arranges the components with the given axis.


**Example**
```java
    import java.awt.*;
    import javax.swing.*;

    public class BoxLayoutExample1 extends Frame {
        Button buttons[];

        public BoxLayoutExample1() {
            buttons = new Button[5];

            for (int i = 0; i < 5; i++) {
                buttons[i] = new Button("Button " + (i + 1));
                // adding the buttons so that it can be displayed  
                add(buttons[i]);
            }
            // the buttons will be placed horizontally  
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            //setLayout (new BoxLayout(this, BoxLayout.X_AXIS));
            setSize(400, 400);
            setVisible(true);
        }
        // main method  
        public static void main(String args[]) {
            BoxLayoutExample1 b = new BoxLayoutExample1();
        }
    }
```

### Java CardLayout
- The Java CardLayout class manages the components in such a manner that only one component is visible at a time. 
- It treats each component as a card that is why it is known as CardLayout.


**Construtors**
- **CardLayout():** creates a card layout with zero horizontal and vertical gap.
- **CardLayout(int hgap, int vgap):** creates a card layout with the given horizontal and vertical gap.

**Methods**
- public void next(Container parent)
- public void previous(Container parent)
- public void first(Container parent)
- public void last(Container parent)
- public void show(Container parent, String name)

**Example**
```java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample1 extends JFrame implements ActionListener {

    CardLayout crd;
    JButton btn1, btn2, btn3;
    Container cPane;

   
    CardLayoutExample1() {

        cPane = getContentPane();
        crd = new CardLayout();
        cPane.setLayout(crd);
        

        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");

        // adding listeners to it  
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        cPane.add("a", btn1); // first card is the button btn1  
        cPane.add("b", btn2); // first card is the button btn2  
        cPane.add("c", btn3); // first card is the button btn3  

    }
    public void actionPerformed(ActionEvent e) {
    
        crd.next(cPane);
    }

    public static void main(String argvs[]) {
        CardLayoutExample1 crdl = new CardLayoutExample1();

        crdl.setSize(300, 300);
        crdl.setVisible(true);
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

```

## Java GridBagLayout
- The Java GridBagLayout class is used to align components vertically, horizontally or along their baseline.
- The components may not be of the same size. Each GridBagLayout object maintains a dynamic, rectangular grid of cells. 
- Each component occupies one or more cells known as its display area. Each component associates an instance of GridBagConstraints.

**construtor**
- GridBagLayout(): The parameterless constructor is used to create a grid bag layout manager.

**GridBagLayout Fields**
- double[] columnWeights
- double[] rowWeights
- int[] columnWidths
- int[] rowHeights
- protected GridBagConstraints defaultConstraints
- protected GridBagLayoutInfo layoutInfo
- protected static int MAXGRIDSIZE
- protected static int MINSIZE
- protected static int PREFERREDSIZE

**GridBagLayout Methods**
- void 	addLayoutComponent(Component comp, Object constraints)
    - It adds specified component to the layout, using the specified constraints object. 
- protected void arrangeGrid(Container parent)
    -  Lays out the grid.
- GridBagConstraints 	getConstraints(Component comp)
    - It is for getting the constraints for the specified component.
- int[][]  getLayoutDimensions() 
    - It determines column widths and row heights for the layout grid.   


**Example**

```java
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
public class GridBagLayoutExample extends JFrame {
    public static void main(String[] args) {
        GridBagLayoutExample a = new GridBagLayoutExample();
    }
    public GridBagLayoutExample() {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);
        setTitle("GridBag Layout Example");
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new Button("Button One"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new Button("Button two"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new Button("Button Three"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new Button("Button Four"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(new Button("Button Five"), gbc);
        setSize(300, 300);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}

```


### GroupLayout
- GroupLayout groups its components and places them in a Container hierarchically. The grouping is done by instances of the Group class.
- Group is an abstract class, and two concrete classes which implement this Group class are SequentialGroup and ParallelGroup.
- SequentialGroup positions its child sequentially one after another whereas ParallelGroup aligns its child on top of each other.

**Fields**
- static int DEFAULT_SIZE
- static int PREFERRED_SIZE

**Constructors**
- GroupLayout(Container host) 	It creates a GroupLayout for the specified Container.


**Example**
```java
// import statements  
import java.awt.*;
import javax.swing.*;
public class GroupExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);

        JLabel clickMe = new JLabel("Click Here");
        JButton button = new JButton("This Button");

        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
            .addComponent(clickMe)
            .addGap(10, 20, 100)
            .addComponent(button));
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(clickMe)
            .addComponent(button));
        frame.pack();
        frame.setVisible(true);
    }
}

```

