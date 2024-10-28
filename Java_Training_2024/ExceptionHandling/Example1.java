import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Example1 {
    public static void main(String[] args)  {
        /*
		System.out.println(Integer.MAX_VALUE);
        int arr[] = new int[Integer.MAX_VALUE];
        System.out.println(arr[0]);
		*/
		
		/* 
		FileOutputStream fos = new FileOutputStream("test.txt");
		fos.write("Hello World Java".getBytes());
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("Addition " + (num1 + num2));
		System.out.println("Division " + (num1 / (num2 - (num1 + num1))));
		System.out.println("Multiplication " + (num1 * num2));
	*/
	int data = 100;
		try {
			// code which may thrown an exception
			int result = data/10;
			System.out.println(result);

			String name = null;
			System.out.println(name.length());
		} catch(Exception ex) {
			System.out.println("Exception occurred: Error Message: " + ex.getMessage());
			System.out.println("Exception Class Name: " + ex.getClass().getName());
		}
		System.out.println(data+data*data);															
		System.out.println("Hello Welcome to Exceptional Handling..");  
        

		// 
		try {
			File file = new File("Example.txt");
			if (file.createNewFile()) 
				System.out.println("new file created");
			else    
				System.out.println("file exists already");
		} catch(IOException ex) {
			System.out.println("Exception occurred: error msg: " + ex.getMessage());
		}
		System.out.println("file operation is completed.");

	}
}