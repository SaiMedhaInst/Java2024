import java.util.Date; // import all classes of package
import java.io.File;
import java.io.IOException;
public class Welcome {
	
	public static void main(String[] args) throws IOException // Main driver method
	{
		System.out.println("Welcome to Java World"); // Print statement
		Date now  = new Date();
		System.out.println("Current Date : " + now);
		
		// file creation 
		File file = new File("C:\\Users\\akraj\\OneDrive\\Desktop\\Java2024\\addition.py");
		
		boolean isCreated = file.createNewFile(); // creates new files
		System.out.println(" Is File created " + isCreated);
		
	}
	
	
}