import java.awt.*;  
import java.awt.event.*;
public class AwtApp extends Frame implements ActionListener {  
  
TextField  firstNameTF,lastNameTF,dobTF,Success ;
AwtApp(){  
Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label lastName = new Label("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  
  
firstNameTF = new TextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
lastNameTF = new TextField();  
lastNameTF.setBounds(120, 80, 100, 20);  
  
dobTF = new TextField();  
dobTF.setBounds(120, 110, 100, 20);  
  
Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 160, 100, 30);  
  
Button reset = new Button("Reset");  
reset.setBounds(120,160,100,30);  

Success = new TextField();

Success.setBounds(150,200,200,50);
add(firstName);  
add(lastName);  
add(dob);  
add(firstNameTF);  
add(lastNameTF);  
add(dobTF); 
add(sbmt);  
add(reset);  

add(Success); 
  
//register
reset.addActionListener(this);
sbmt.addActionListener(this);

setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  

public void actionPerformed(ActionEvent ae){

  if (ae.getActionCommand().equals("Submit")){
    Success.setText("detailed stored...");
  }
  else{
    firstNameTF.setText(" ");
    lastNameTF.setText(" ");
    dobTF.setText(" ");
  }
 
  

}
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtApp awt = new AwtApp();    
}  
}  
