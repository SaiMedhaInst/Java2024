package FilesIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // read the existing file 
        File file = new File("example.txt");
        System.out.println(file.exists());

        FileInputStream fis = new FileInputStream(file);
        //System.out.println(fis.read());
        //System.out.println(fis.read()); // the next byte of data, or -1 if the end of the file is reached.

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char)ch);
        }
        //System.out.println(fis.read());
        //fis.close();

        System.out.println("******************************");
        // Write the data 
        FileOutputStream fos = new FileOutputStream(file, true);
        //fos.write(new byte[] {65, 66,67,68,97,98,99,100}); 
        fos.write("\nHello Surya, Welcome".getBytes());
        fos.close();


        // BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char)bis.read());
    }
}
