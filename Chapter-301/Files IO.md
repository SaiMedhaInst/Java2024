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

**Example-3**
```java
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        File dir = new File("D:\\SaiMedha\\Java-ECET\\FilesPractise");
        File files[] = dir.listFiles();
        for (File file: files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite() + "   
                Is Hidden: "+file.isHidden()+"
                Length: "+file.length()+"
                bytes ");  
            }
        }
    }
}
}
```

## Java I/O
- Java I/O (Input and Output) is used to process the input and produce the output.
- Java uses the concept of a stream to make I/O operation fast. 
- The java.io package contains all the classes required for input and output operations.
- We can perform file handling in Java by Java I/O API.
### **Stream**
- A stream is a sequence of data. In Java, a stream is composed of bytes. 
- In Java, 3 streams are created for us automatically. All these streams are attached with the console.
    - 1) System.out: standard output stream
    - 2) System.in: standard input stream
    - 3) System.err: standard error stream

### **OutputStream vs InputStream**
- OutputStream
Java application uses an output stream to write data to a destination; it may be a file, an array, peripheral device or socket.

- InputStream
Java application uses an input stream to read data from a source; it may be a file, an array, peripheral device or socket.

![](https://i.imgur.com/QA8QdWl.png)

### **OutputStream class**
- OutputStream class is an abstract class. 
- It is the superclass of all classes representing an output stream of bytes. 
- An output stream accepts output bytes and sends them to some resource

**methods**
- 1) public void write(int)throws IOException
- 2) public void write(byte[])throws IOException
- 3) public void flush()throws IOException
- 4) public void close()throws IOException

**OutputStream Hierarchy**
![](https://i.imgur.com/ZU0P61i.png)

### **InputStream class**
- InputStream class is an abstract class. 
- It is the superclass of all classes representing an input stream of bytes.

**methods**
- 1) public abstract int read()throws IOException
- 2) public int available()throws IOException
- 3) public void close()throws IOException

**InputStream Hierarchy**
![](https://i.imgur.com/l7biSH8.png)

### **FileOutputStream Class**
- Java FileOutputStream is an output stream used for writing data to a file.
- Using FileOutputStream we can write primitive values/byte-oriented/character-oriented 
- For character-oriented data, it is preferred to use FileWriter than FileOutputStream
```java
public class FileOutputStream extends OutputStream  
```

**methods**
![](https://i.imgur.com/Z3njw04.png)

```java
import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\SaiMedha\\Java-ECET\\FilesPractise\\test1.txt");
            
            //storing primitives
            fout.write(65);

            //storing byte data
            byte[] data = {97,78,104,89};
            fout.write(data);

            //storing strings/characters
            fout.write("\nHello Welcome to file operations".getBytes());

            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### **FileInputStream Class**
- Java FileInputStream class obtains input bytes from a file. 
- It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. 
- we can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.

```java
public class FileInputStream extends InputStream  
```

**Methods**
![](https://i.imgur.com/WR8cDJ4.png)

**Example**
```java
import java.io.FileInputStream;
public class DataStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = fin.read();
            //reading only first location data .
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

```java
import java.io.FileInputStream;
public class DataStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```