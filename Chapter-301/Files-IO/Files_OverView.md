## FILES IN JAVA
- File handling is an important part of any application.
- Java has several methods for creating, reading, updating, and deleting files.
- The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.
- The File class have several methods for working with directories and files
    -    such as  creating new directories or files, 
        -    deleting and renaming directories or files, 
        -    listing the contents of a directory etc.

**Constructors**
- **File(File parent, String child)**	It creates a new File instance from a parent abstract pathname and a child pathname string.
- **File(String pathname)**	It creates a new File instance by converting the given pathname string into an abstract pathname.
- **File(String parent, String child)**	It creates a new File instance from a parent pathname string and a child pathname string.
- **File(URI uri)**	It creates a new File instance by converting the given file: URI into an abstract pathname.

**Methods**
- createTempFile(String prefix, String suffix)
- createNewFile()
- canWrite()
- canExecute()
- canRead()
- isAbsolute()
- isDirectory()
- isFile()
- getName()
- getParent()
- toPath() , toURI()
- listFiles()
- getFreeSpace()
- list(FilenameFilter filter)
- mkdir()

```java
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {

        try {
            File file = new File("javaFile123.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Example-2**

```java
import java.io.*;  
public class FileDemo2 {  
    public static void main(String[] args) {  
  
        String path = "";  
        boolean bool = false;  
        try {  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println(file);  
         
            File file2 = file.getCanonicalFile();  
            System.out.println(file2);  
            bool = file2.exists();  
        
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
          
            if (bool) {  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
```