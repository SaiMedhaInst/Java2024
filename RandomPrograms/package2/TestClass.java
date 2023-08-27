import java.io.FileInputStream;

class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(String errMessage) {
        super(errMessage);
    }
}



class TestClass  {

	public static void main(String args[])
	{
        int a = 10;

            System.out.println(a/10);
            throw new StudentNotFoundException("divide by zero");

        //  FileInputStream GFG
        //     = new FileInputStream("/Desktop/GFG.txt");
     
	}
}


