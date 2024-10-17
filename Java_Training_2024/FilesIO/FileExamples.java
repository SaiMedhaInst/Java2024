package FilesIO;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {

        // directory 
        String directorName = "dummytest";
        String currentDir = System.getProperty("user.dir");
        String directoryPath = currentDir + File.separator + directorName;
        System.out.println("directory path: " + directoryPath);

        File directory = new File(directoryPath);
        System.out.println(directory.exists());
        if (directory.mkdir()) {
            System.out.println("directory created..");
        } else {
            System.out.println("already directory exists..");
        }

        System.out.println("*******************");
        // File 
        File file = new File("example.txt");
        System.out.println(file.exists());
        if (file.createNewFile()) {
            System.out.println("file is created..");
        } else {
            System.out.println("file already exists..");
        }

        // create 100 files with following naming test1.txt, test2.txt.... text100.txt 
        for(int i = 1; i<=100; i++) {
            String fileName = "test-" + i + ".txt";
            File f = new File(fileName);
            if (file.exists())
                f.delete();
        }

        System.out.println("*************");
        
        // Know about the file 
        File f2 = new File("example.txt");
        System.out.println(f2.exists());
        System.out.println(f2.length());
        System.out.println(f2.lastModified());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.getAbsolutePath());
    }
}
