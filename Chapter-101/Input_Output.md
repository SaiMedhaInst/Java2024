## Input Taking in Java

#### 1. Scanner Class . 

[![N|Solid](http://www.cs.emory.edu/~cheung/Courses/170/Syllabus/04/FIGS/scanner.gif)](https://www.java.com/en/)


- Java Scanner class allows the user to take input from the console. 
- It belongs to java.util package. 
- It is used to read the input of primitive types like int, double, long, short, float, and byte.
- It is the easiest way to read input in Java program.

[![N|Solid](https://i.imgur.com/wWjXoU6.png)](https://www.java.com/en/)

```java

    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);

```

#### 2. BufferedReader
- It is a simple class that is used to read a sequence of characters. 
- It has a simple function that reads a character another read which reads, an array of characters, and a readLine() function which reads a line.

InputStreamReader() is a function that converts the input stream of bytes into a stream of characters so that it can be read as BufferedReader expects a stream of characters.

BufferedReader can throw checked Exceptions

```java

    BufferedReader bfn = new BufferedReader(
        new InputStreamReader(System.in));

    // String reading internally
    String str = bfn.readLine();

    // Integer reading internally
    int it = Integer.parseInt(bfn.readLine());

    // Printing String
    System.out.println("Entered String : " + str);

    // Printing Integer
    System.out.println("Entered Integer : " + it);

```
##### Differences.

[![N|Solid](https://i.imgur.com/EjL0nKn.png)](https://www.java.com/en/)



## OutPut in Java
[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/20191126125125/Java-Input-Output-Stream.jpg)](https://www.java.com/en/)

- System.in: 
-       standard input stream that is used to read characters from the keyboard or any other standard input device.
- System.out: 
-       standard output stream that is used to produce the result of a program on an output device like the computer screen.

- print():
    -  method in Java is used to display a text on the console. 
    - This text is passed as the parameter to this method in the form of String.
    -  This method prints the text on the console and the cursor remains at the end of the text at the console. 

- println(): 
   -    method in Java is also used to display a text on the console. 
   -    It prints the text on the console and the cursor moves to the start of the next line at the console. The next printing takes place from the next line.

- printf(): 
    -   This is the easiest of all methods as this is similar to printf in C. 
    -   Note that System.out.print() and System.out.println() take a single argument, but printf() may take multiple arguments. This is used to format the output in Java.
    -   %c character
        %d decimal (integer) number (base 10)
        %e exponential floating-point number
        %f floating-point number
        %i integer (base 10)
        %o octal number (base 8)
        %s String
        %u unsigned decimal (integer) number
        %x number in hexadecimal (base 16)
        %t formats date/time
        %% print a percent sign
        \% print a percent sign

Syntax:

   ` System.out.print(parameter);`
   ` System.out.println(parameter);`
   ` System.out.printf(parameter);`
   
```java

 System.out.print("SaiMedha ");
 System.out.print("Institution ");
 
System.out.println("Java ");
System.out.println("course ");

int x = 100;
System.out.printf("Printing simple"+ " integer: x = %d\n",x);

System.out.printf("Formatted with"+ " precision: PI = %.2f\n",Math.PI);

float n = 5.2f;

System.out.printf("Formatted to "+ "specific width: n = %.4f\n",n);

n = 2324435.3f;

// here number is formatted from
// right margin and occupies a
// width of 20 characters
System.out.printf("Formatted to "+ "right margin: n = %20.4f\n",n);


```

- System.err: 
    -   This is the standard error stream that is used to output all the error data that a program might throw, on a computer screen or any standard output device.
    -   
` System.err.println("GeeksForGeeks!");`

##### Note:
  - System.err and System.out both are defined in System class as reference variable of PrintStream class as:
    - public final static PrintStream out = null;
    - public final static PrintStream err = null;
 - Both outputs are displayed on the same console,
    
### difference.
[![N|Solid](https://i.imgur.com/5Sq2Mvu.png)](https://www.java.com/en/)

## License

MIT

**Anil K Rajamoni!**

