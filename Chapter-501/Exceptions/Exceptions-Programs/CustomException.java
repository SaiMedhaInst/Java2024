class StudentNotFoundException extends Exception{
  public StudentNotFoundException(String msg){
    super(msg);
  }
}


public class CustomException {


  public static void display() throws StudentNotFoundException{
    throw new StudentNotFoundException("student not found....");
  }
  public static void main(String[] args) {
    
    try{display();}
    catch(StudentNotFoundException e){System.out.println(e);}
  }
}
