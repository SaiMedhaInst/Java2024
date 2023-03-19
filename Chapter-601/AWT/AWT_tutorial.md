## Java AWT 
- Java AWT (Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or windows-based applications in Java.
- Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. 
- AWT is heavy weight i.e. its components are using the resources of underlying operating system (OS).
- The java.awt package provides classes for AWT API such as TextField, Label, TextArea, RadioButton, CheckBox, Choice, List etc.

**Why AWT is platform dependent?**
- Java AWT calls the native platform (operating systems) subroutine for creating API components like TextField, ChechBox, button, etc.
    - For example, an AWT GUI with components like TextField, label and button will have different look and feel for the different platforms like Windows, MAC OS, and Unix. 
    - The reason for this is the platforms have different view for their native components and AWT directly calls the native subroutine that creates those components.
- In simple words, an AWT application will look like a windows application in Windows OS whereas it will look like a Mac application in the MAC OS.

##### Java AWT Hierarchy

![N|Solid](https://i.imgur.com/87LKbeG.png)

**Components**
- All the elements like the button, text fields, scroll bars, etc. are called components. In Java AWT, there are classes for each component

**Container**
- The Container is a component in AWT that can contain another components like buttons, textfields, labels etc. The classes that extends Container class are known as container such as Frame, Dialog and Panel.
- It is basically a screen where the where the components are placed at their specific locations. Thus it contains and controls the layout of components.


**Types of containers:**
There are four types of containers in Java AWT:
- Window
    - Doesn't have no borders and menu bars. You must use frame, dialog or another window for creating a window. We need to create an instance of Window class to create this container. 
- Panel
    -  doesn't contain title bar, border or menu bar. It is generic container for holding the component
- Frame
    - Have title bar and border and can have menu bars. 
    - It can have other components like button, text field, scrollbar etc.
    - Frame is most widely used container while developing an AWT application.
- Dialog

**Methods**
- public void add(Component c)
- public void setSize(int width,int height)
- public void setLayout(LayoutManager m)
- public void setVisible(boolean status)

**To create simple AWT exampleclass, we need a frame. There are two ways to create a GUI using Frame in AWT.**

- By extending Frame class (inheritance)
- By creating the object of Frame class (association)

**Using Inheritance**
```java
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
```

**AWT Example by Association**
```java
 
import java.awt.*;    
class AWTExample2 {    
   AWTExample2() {  
      Frame f = new Frame();  
      Label l = new Label("Employee id:");   
      Button b = new Button("Submit"); 
      TextField t = new TextField();  
      
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);  
      
      f.add(b);  
      f.add(l);  
      f.add(t);  
     
      f.setSize(400,300);  
      f.setTitle("Employee info");   
      f.setLayout(null);
      f.setVisible(true);  
}    
  

public static void main(String args[]) {    
AWTExample2 awt_obj = new AWTExample2();    
    }  
}    
```


#### Event and Listener (Java Event Handling).

- Changing the state of an object is known as an event. 
- For example, click on button, dragging mouse etc. 
- The java.awt.event package provides many event classes and Listener interfaces for event handling.

![N|Solid](https://i.imgur.com/lVp6N1N.png)

**Steps to perform Event Handling**
- Register the component with the Listener

**Button** 
public void addActionListener(ActionListener a){}
**MenuItem**
public void addActionListener(ActionListener a){}
**TextField**
public void addActionListener(ActionListener a){}
public void addTextListener(TextListener a){}
**TextArea**
public void addTextListener(TextListener a){}
**Checkbox**
public void addItemListener(ItemListener a){}
**Choice**
public void addItemListener(ItemListener a){}
**List**
- public void addActionListener(ActionListener a){}
- public void addItemListener(ItemListener a){}

**Action Listener Example**
```java
import java.awt.*;  
import java.awt.event.*;  
class AEvent extends Frame implements ActionListener{  
TextField tf;  
AEvent(){  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    Button b=new Button("click me");  
    b.setBounds(100,120,80,30);  
      
    //register listener  
    b.addActionListener(this);//passing current instance  
 
    add(b);add(tf);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    tf.setText("Welcome");  
}  
    public static void main(String args[]){  
        new AEvent();  
    }  
} 
```

** Java event handling by anonymous class**
```java
import java.awt.*;  
import java.awt.event.*;  
class AEvent3 extends Frame{  
TextField tf;  
AEvent3(){  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    Button b=new Button("click me");  
    b.setBounds(50,120,80,30);  
      
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(){  
        tf.setText("hello");  
        }  
        });  
    add(b);add(tf);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}  
public static void main(String args[]){  
    new AEvent3();  
}  
}  
```

#### AWT Button
- A button is basically a control component with a label that generates an event when pushed. 
- The Button class is used to create a labeled button that has platform independent implementation. 
- The application result in some action when the button is pushed.

- To perform an action on a button being pressed and released, the ActionListener interface needs to be implemented. 
- The registered new listener can receive events from the button by calling addActionListener method of the button. 

**syntax**

```java
public class Button extends Component implements Accessible  
```

**Constructors**
- Button( ): It constructs a new button with an empty string i.e. it has no label.
- Button (String text) : It constructs a new button with given string as its label.

**Methods**
- void setText (String text)
- String getText()
- void setLabel (String label)
- String getLabel()
- void addActionListener(ActionListener l)
- void removeActionListener (ActionListener l)

**NOTE**: The Button class inherits methods from java.awt.Component and java.lang.Object classes.

```java
import java.awt.*;    
public class ButtonExample {    
public static void main (String[] args) {   
  
    // create instance of frame with the label   
    Frame f = new Frame("Button Example");    
  
    // create instance of button with label  
    Button b = new Button("Click Here");   
  
    // set the position for the button in frame   
    b.setBounds(50,100,80,30);    
  
    // add button to the frame  
    f.add(b);    
    // set size, layout and visibility of frame  
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
}    
}  
```

**AWT Button Example with ActionListener**

```java
// importing necessary libraries  
import java.awt.*;    
import java.awt.event.*;    
public class ButtonExample3 {    
public static void main(String[] args) {    
    // create instance of frame with the label   
    Frame f = new Frame("Button Example");    
    final TextField tf=new TextField();    
    tf.setBounds(50,50, 150,20);  
    // create instance of button with label  
    Button b=new Button("Click Here");    
    // set the position for the button in frame   
    b.setBounds(50,100,60,30);   
    b.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {    
            tf.setText("Welcome to SaiMedha.");    
        }    
    });  
// adding button the frame  
    f.add(b);  
// adding textfield the frame  
    f.add(tf);    
// setting size, layout and visibility   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
}    
}

```


### Java AWT Label
- The object of the Label class is a component for placing text in a container. 
- It is used to display a single line of read only text. 
- The text can be changed by a programmer but a user cannot edit it directly.
- It is called a passive control as it does not create any event when it is accessed.

```java
public class Label extends Component implements Accessible  
```

**Fields**
The java.awt.Component class has following fields:
- static int LEFT: It specifies that the label should be left justified.
- static int RIGHT: It specifies that the label should be right justified.
- static int CENTER: It specifies that the label should be placed in center.
        

**Constructors**
- Label() : 	It constructs an empty label.
- Label(String text) : It constructs a label with the given string (left justified by default).
- 	Label(String text, int alignement) : It constructs a label with the specified string and the specified alignment.

**Methods**
- void setText(String text)
- void setAlignment(int alignment)
- String getText()
- int getAlignment()	
- void addNotify()
- AccessibleContext getAccessibleContext()
- protected String paramString()

The above methods are inherited by the following classes: 
- java.awt.Component
- java.lang.Object

```java
import java.awt.*;    
  
public class LabelExample {    
public static void main(String args[]){   
   
    Frame f = new Frame ("Label example");  
    Label l1, l2;    
   
    l1 = new Label ("First Label.");   
    l2 = new Label ("Second Label.");   
   
    l1.setBounds(50, 100, 100, 30);    
    l2.setBounds(50, 150, 100, 30);  
    
    f.add(l1);  
    f.add(l2);   
 
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);    
}    
}    
```

**Example with Action Lister**
```java

import java.awt.*;    
import java.awt.event.*;    
  
 
public class LabelExample2 extends Frame implements ActionListener{    
      
    TextField tf;   
    Label l;   
    Button b;   
	
    LabelExample2() {    
        tf = new TextField();    
        tf.setBounds(50, 50, 150, 20);   
  
        l = new Label();    
        l.setBounds(50, 100, 250, 20);    
  
        b = new Button("Find IP");    
        b.setBounds(50,150,60,30);    
        b.addActionListener(this);   
        add(b);  
        add(tf);  
        add(l);   
        setSize(400,400);    
        setLayout(null);    
        setVisible(true);    
    }    
    public void actionPerformed(ActionEvent e) {    
        try {    
			String host = tf.getText();    
			String ip = java.net.InetAddress.getByName(host).getHostAddress();    
			l.setText("IP of "+host+" is: "+ip);    
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    
    }    
    public static void main(String[] args) {    
        new LabelExample2();    
    }    
}    

```

## Java AWT TextField.
- The object of a TextField class is a text component that allows a user to enter a single line text and edit it. 
- It inherits TextComponent class, which further inherits Component class.
- When we enter a key in the text field (like key pressed, key released or key typed), the event is sent to TextField. 
- Then the KeyEvent is passed to the registered KeyListener. It can also be done using ActionEvent; if the ActionEvent is enabled on the text field, then the ActionEvent may be fired by pressing return key. The event is handled by the ActionListener interface.  

```java
public class TextField extends TextComponent  
```

**constructors**
- **TextField()**	It constructs a new text field component.
- 	**TextField(String text)**	It constructs a new text field initialized with the given string text to be displayed.
- 	**TextField(int columns)**	It constructs a new textfield (empty) with given number of columns.
- 	**TextField(String text, int columns)**	It constructs a new text field with the given text and given number of columns (width).

**Methods**
- void addNotify() : 	It creates the peer of text field.
- 	boolean echoCharIsSet() : 	It tells whether text field has character set for echoing or not.
- 	void addActionListener(ActionListener l)	: It adds the specified action listener to receive action events from the text field.
-  int getColumns() : 	It fetches the number of columns in text field.
-  	Dimension getMinimumSize() : It fetches the minimum dimensions for the text field.
-   Dimension getMinimumSize(int columns)
-   void setColumns(int columns) : It sets the number of columns in text field.
-   void setText(String t) : It sets the text presented by this text component to the specified text.
-   protected String paramString() : It returns a string representing state of the text field.

**The AWT TextField class inherits the methods from below classes:**
- java.awt.TextComponent
- java.awt.Component
- java.lang.Object


**TextField Example**

```java
import java.awt.*;   
public class TextFieldExample1 {  
    public static void main(String args[]) {    
    Frame f = new Frame("TextField Example");    

    TextField t1, t2;    
    t1 = new TextField("Welcome to SaiMedha.");    
    t1.setBounds(50, 100, 200, 30);    
    t2 = new TextField("AWT Tutorial");    
    t2.setBounds(50, 150, 200, 30);    
    f.add(t1);  
    f.add(t2);   
    
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);    
}    
} 
```

**TextField Example with ActionListener*
```java
  
import java.awt.*;    
import java.awt.event.*;    

public class TextFieldExample2 extends Frame implements ActionListener {    

    TextField tf1, tf2, tf3;    
    Button b1, b2;   
 
    TextFieldExample2() {    
       
        tf1 = new TextField();    
        tf1.setBounds(50, 50, 150, 20);    
        tf2 = new TextField();    
        tf2.setBounds(50, 100, 150, 20);    
        tf3 = new TextField();    
        tf3.setBounds(50, 150, 150, 20);  
        tf3.setEditable(false);  
		
        b1 = new Button("+");    
        b1.setBounds(50, 200, 50, 50);  
        b2 = new Button("-");    
        b2.setBounds(120,200,50,50);    
      
        b1.addActionListener(this);    
        b2.addActionListener(this);    
      
        add(tf1);  
        add(tf2);  
        add(tf3);  
        add(b1);  
        add(b2);   
       
        setSize(300,300);    
        setLayout(null);    
        setVisible(true);    
    }  
     
    public void actionPerformed(ActionEvent e) {    
        String s1 = tf1.getText();    
        String s2 = tf2.getText();    
        int a = Integer.parseInt(s1);    
        int b = Integer.parseInt(s2);    
        int c = 0;    
        if (e.getSource() == b1){    
            c = a + b;    
        }  
        else if (e.getSource() == b2){    
            c = a - b;    
        }    
        String result = String.valueOf(c);    
        tf3.setText(result);    
    }   
   
public static void main(String[] args) {    
    new TextFieldExample2();    
}    
}    
```

## Java AWT TextArea
- The object of a TextArea class is a multiline region that displays text. It allows the editing of multiple line text. It inherits TextComponent class.
- The text area allows us to type as much text as we want. 
- When the text in the text area becomes larger than the viewable area, the scroll bar appears automatically which helps us to scroll the text up and down, or right and left.

```java
public class TextArea extends TextComponent  
```

**Fields**
- static int SCROLLBARS_BOTH - It creates and displays both horizontal and vertical scrollbars.
- static int SCROLLBARS_HORIZONTAL_ONLY - It creates and displays only the horizontal scrollbar.
- static int SCROLLBARS_VERTICAL_ONLY - It creates and displays only the vertical scrollbar.
- static int SCROLLBARS_NONE - It doesn't create or display any scrollbar in the text area.

**Constructors:**
- **TextArea()** : 	It constructs a new and empty text area with no text in it.
- **TextArea (String text)**	It constructs a new text area and displays the specified text in it.
- **TextArea (int row, int column)**	It constructs a new text area with specified number of rows and columns and empty string as text.
- **TextArea (String text, int row, int column)**	It constructs a new text area with the specified text in the text area and specified number of rows and columns.
- **TextArea (String text, int row, int column, int scrollbars)**	It construcst a new text area with specified text in text area and specified number of rows and columns and visibility.


**The methods of TextArea class are inherited from following classes:**

- java.awt.TextComponent
- java.awt.Component
- java.lang.Object

**Methods**
- void addNotify()
- void append(String str)
- int getScrollbarVisibility()
- int getRows()
- void insert(String str, int pos)
- void setColumns(int columns)
- void setRows(int rows)
- void replaceRange(String str, int start, int end)
- protected String paramString() : It returns a string representing the state of this TextArea.

** TextArea Example**

```java

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

```

**TextArea Example with ActionListener**
```java
 import java.awt.*;    
import java.awt.event.*;    
  
public class TextAreaExample2 extends Frame implements ActionListener {    
 
	Label l1, l2;    
	TextArea area;    
	Button b;    

	TextAreaExample2() {    
		l1 = new Label();    
		l1.setBounds(50, 50, 100, 30);    
		l2 = new Label();    
		l2.setBounds(160, 50, 100, 30);    
		area = new TextArea();    
		area.setBounds(20, 100, 300, 300);    
		b = new Button("Count Words");    
		b.setBounds(100, 400, 100, 30);    

		b.addActionListener(this);    

		add(l1);  add(l2);  add(area);  add(b);    

    setSize(400, 450);    setLayout(null);     setVisible(true);    
}    

public void actionPerformed(ActionEvent e) {    
    String text = area.getText();    
    String words[]=text.split("\\s");    
    l1.setText("Words: "+words.length);    
    l2.setText("Characters: "+text.length());    
}    

public static void main(String[] args) {    
    new TextAreaExample2();    
}    
}   

```


**AWT Checkbox**
- The Checkbox class is used to create a checkbox. 
- It is used to turn an option on (true) or off (false). 
- Clicking on a Checkbox changes its state from "on" to "off" or from "off" to "on".

```java
public class Checkbox extends Component implements ItemSelectable, Accessible  
```

**Constructors**
- **Checkbox()**:	It constructs a checkbox with no string as the label.
- **Checkbox(String label):**	It constructs a checkbox with the given label.
- **Checkbox(String label, boolean state):**	It constructs a checkbox with the given label and sets the given state.
- **Checkbox(String label, boolean state, CheckboxGroup group):**	It constructs a checkbox with the given label, set the given state in the specified checkbox group.
- **Checkbox(String label, CheckboxGroup group, boolean state):**	It constructs a checkbox with the given label, in the given checkbox group and set to the specified state.

**The methods of Checkbox class are inherited by following classes:**
- java.awt.Component
- java.lang.Object

**Methods**
- void addItemListener(ItemListener IL) : It adds the given item listener to get the item events from the checkbox.
- String getLabel(): It fetched the label of checkbox.
- void setLabel(String label): It sets the checkbox's label to the string argument.
- void setState(boolean state): 	It sets the state of checkbox to the specified state.
- Object[] getSelectedObjects(): It returns an array (size 1) containing checkbox label and returns null if checkbox is not selected.

** Checkbox Example**
```java
import java.awt.*;
public class CheckboxExample1 {

    CheckboxExample1() {
        Frame f = new Frame("Checkbox Example");

        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Java", true);

        checkbox2.setBounds(100, 150, 50, 50);

        f.add(checkbox1);f.add(checkbox2);
        
        f.setSize(400, 400);f.setLayout(null);f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckboxExample1();
    }
}

```

**Checkbox Example with ItemListene**
```java
import java.awt.*;
import java.awt.event.*;
public class CheckboxExample2 {
 
    CheckboxExample2() {
       
        Frame f = new Frame("CheckBox Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        
        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100, 150, 50, 50);
        
        f.add(checkbox1);f.add(checkbox2);f.add(label);

        
        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: " +
                    (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: " +
                    (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
      
        f.setSize(400, 400); f.setLayout(null);f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new CheckboxExample2();
    }
}

```

## AWT CheckboxGroup
- The object of CheckboxGroup class is used to group together a set of Checkbox. 
- At a time only one check box button is allowed to be in "on" state and remaining check box button in "off" state. 
- It inherits the object class.

**Note**:  CheckboxGroup enables you to create radio buttons in AWT. There is no special control for creating radio buttons in AWT.

```java
public class CheckboxGroup extends Object implements Serializable  
```

```java
import java.awt.*;
public class CheckboxGroupExample {
    CheckboxGroupExample() {
        Frame f = new Frame("CheckboxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);
        checkBox1.setBounds(100, 100, 50, 50);
        Checkbox checkBox2 = new Checkbox("Java", cbg, true);
        checkBox2.setBounds(100, 150, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new CheckboxGroupExample();
    }
}
```

**CheckboxGroup Example with ItemListener**
```java
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroupExample {
    CheckboxGroupExample() {
        Frame f = new Frame("CheckboxGroup Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);
        checkBox1.setBounds(100, 100, 50, 50);
        Checkbox checkBox2 = new Checkbox("Java", cbg, false);
        checkBox2.setBounds(100, 150, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(label);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox: Checked");
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox: Checked");
            }
        });
    }
    public static void main(String args[]) {
        new CheckboxGroupExample();
    }
}
```

## AWT Choice
- The object of Choice class is used to show popup menu of choices. Choice selected by user is shown on the top of a menu. It inherits Component class.

```java
public class Choice extends Component implements ItemSelectable, Accessible  
```

**Constructor**
- Choice():	It constructs a new choice menu.

**The methods of Choice class are inherited by following classes:**
- java.awt.Component
- java.lang.Object

**Methods**
- 	void add(String item): It adds an item to the choice menu.
- 	void addItemListener(ItemListener l)	It adds the item listener that receives item events from the choice menu.
- String getItem(int index)	It gets the item (string) at the given index position in the choice menu.
- int getItemCount()	It returns the number of items of the choice menu.
- int getSelectedIndex()	Returns the index of the currently selected item
- String getSelectedItem()	Gets a representation of the current choice as a string.
- void insert(String item, int index)	Inserts the item into this choice at the specified position.
- void remove(int position)	It removes an item from the choice menu at the given index position.
- void remove(String item)	It removes the first occurrence of the item from choice menu.
- void removeAll()	It removes all the items from the choice menu.


**Choice Example**
```java
 import java.awt.*;
public class ChoiceExample1 {
    ChoiceExample1() {
        Frame f = new Frame();
        Choice c = new Choice();  
        c.setBounds(100, 100, 75, 75);

      
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");

   
        f.add(c);  f.setSize(400, 400);f.setLayout(null);f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new ChoiceExample1();
    }
}

```

**AWT Choice Example with ActionListener**

```java
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

```

## AWT List
- The object of List class represents a list of text items. With the help of the List class, user can choose either one item or multiple items. It inherits the Component class.

```java
public class List extends Component implements ItemSelectable, Accessible  
```

**Constructors**
**1.	List()**	It constructs a new scrolling list.
**2.	List(int row_num)**	It constructs a new scrolling list initialized with the given number of rows visible.
**3.	List(int row_num, Boolean multipleMode)**	It constructs a new scrolling list initialized which displays the given number of rows.

**The List class methods are inherited by following classes:**
- java.awt.Component
- java.lang.Object

**Methods**
- void add(String item)	It adds the specified item into the end of scrolling list.
- void add(String item, int index)	It adds the specified item into list at the given index position.
- void addActionListener(ActionListener l)	It adds the specified action listener to receive action events from list.
- void addItemListener(ItemListener l)	It adds specified item listener to receive item events from list.
- void deselect(int index)	It deselects the item at given index position.
- String getItem(int index)	It fetches the item related to given index position.
- int getItemCount()	It gets the count/number of items in the list.
- String[] getItems()	It fetched the items from the list.
- int getRows()	It fetches the count of visible rows in the list.
- int getSelectedIndex()	It fetches the index of selected item of list.
- void replaceItem(String newVal, int index)	It replaces the item at the given index in list with the new string specified.

**List Example**
```java
import java.awt.*;
import java.awt.event.*;

public class ListExample2 {
    ListExample2() {
      
        Frame f = new Frame();
     
        final Label label = new Label();
          
        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);

  
        Button b = new Button("Show");   
        b.setBounds(200, 150, 80, 30);
		
        final List l1 = new List(4, false);
        l1.setBounds(100, 100, 70, 70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");


        final List l2 = new List(4, true);
        l2.setBounds(100, 200, 70, 70);
        l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add("CodeIgniter");

        f.add(l1);f.add(l2);f.add(label);f.add(b);
        f.setSize(450, 450);f.setLayout(null);f.setVisible(true)
 
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: " + l1.getItem(l1.getSelectedIndex());
                data += ", Framework Selected:";
                for (String frame: l2.getSelectedItems()) {
                    data += frame + " ";
                }
                label.setText(data);
            }
        });
    }

    // main method  
    public static void main(String args[]) {
        new ListExample2();
    }
}

```

##  AWT Scrollbar
- The object of Scrollbar class is used to add horizontal and vertical scrollbar. Scrollbar is a GUI component allows us to see invisible number of rows and columns.

- It can be added to top-level container like Frame or a component like Panel. The Scrollbar class extends the Component class.

```java
public class Scrollbar extends Component implements Adjustable, Accessible  
```

**Fields**

- static int HORIZONTAL - It is a constant to indicate a horizontal scroll bar.
- static int VERTICAL - It is a constant to indicate a vertical scroll bar.

**Constructors**
- **Scrollbar()**	Constructs a new vertical scroll bar.
- **Scrollbar(int orientation)**	Constructs a new scroll bar with the specified orientation.
- **Scrollbar(int orientation, int value, int visible, int minimum, int maximum)**	Constructs a new scroll bar with the specified orientation, initial value, visible amount, and minimum and maximum values.

Where the parameters,
- orientation: specifiey whether the scrollbar will be horizontal or vertical.
- Value: specify the starting position of the knob of Scrollbar on its track.
- Minimum: specify the minimum width of track on which scrollbar is moving.
- Maximum: specify the maximum width of track on which scrollbar is moving.
- 
**Scrollbar Example**
```java
import java.awt.*;
public class ScrollbarExample1 {
    ScrollbarExample1() {
        Frame f = new Frame("Scrollbar Example");
        
        Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);
        f.add(s); 
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new ScrollbarExample1();
    }
}
```

**Scrollbar Example with AdjustmentListener**

```java
import java.awt.*;
import java.awt.event.*;

public class ScrollbarExample2 {
    ScrollbarExample2() {
        Frame f = new Frame("Scrollbar Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        final Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);

        f.add(s);
        f.add(label);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:" + s.getValue());
            }
        });
    }
    public static void main(String args[]) {
        new ScrollbarExample2();
    }
}
```







