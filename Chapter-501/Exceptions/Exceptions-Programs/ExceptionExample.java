import java.io.*;

class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str){  
        // Calling constructor of parent Exception  
        super(str);  
    } 

  }
public class ExceptionExample{ 
  
  public static void validate(int age) {  
    if(age<18) {  
        //throw Arithmetic exception if not eligible to vote  
        throw new ArithmeticException("Person is not eligible to vote");    
    }  
    else {  
        System.out.println("Person is eligible to vote!!");  
    }  
}

public static void m1() throws FileNotFoundException {  
  FileReader file = new FileReader("C:\\Users\\ACER\\Desktop\\abc.txt");  
  BufferedReader fileInput = new BufferedReader(file);  
  throw new FileNotFoundException();  
} 

public static void m2(){
  try  {  
    throw new UserDefinedException("This is user-defined exception");  
}  
catch (UserDefinedException ude) {  
    System.out.println("Caught the exception"); 
    System.out.println(ude.getMessage());  
}  
}

  public static void main(String args[]){  
    
    // validate(23);
    // try{m1();}
    // catch(Exception e){System.out.println(e);}
    
    m2()
    
    System.out.println("rest of the code...");   
  }  
}