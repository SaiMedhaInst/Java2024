package FilesIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilesExamples3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
		// FileReader and FileWriter
	/*	
		File file = new File("example.txt");
        FileReader fr = new FileReader(file);
        System.out.println((char)fr.read());

       	try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
			writer.newLine();	
            writer.write("Hello, BufferedWriter!");
            writer.newLine();
			writer.write("Reading this with BufferedReader.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	*/

	// ObjectInputStream,ObjectOutputStream
		// Serilization
		Person person = new Person("Surya", 22);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
		oos.writeObject(person);
		
		// Deserilization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
		Person deserilizedObject = (Person)ois.readObject();
		System.out.println(deserilizedObject);
    }
}
