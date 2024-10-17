package FilesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
            if (Character.isDigit(ch))
                System.out.print((char)ch);
        }

    }
}
