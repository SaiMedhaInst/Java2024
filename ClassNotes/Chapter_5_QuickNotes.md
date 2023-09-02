## EXCEPTION HANDLING IN JAVA

-   One of the powerful mechanism ***to handle the runtime errors so that the normal flow of the application can be maintained.***

- **Exception** is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that ***disrupts the normal flow of the program’s instructions.***

- **Errors** represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.


> Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.


**IMP POINTS**
-   Exceptions can be caught and handled by the program.
-   When an exception occurs within a method, it creates an object. **This object is called the exception object.**
-   It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.
- We can handles exceptions but not runtime errors like MemoryOutOfBound, StackOverFlow etc

 **Major reasons why an exception Occurs**

-   Invalid user input
-   Device failure
-   Loss of network connection
-   Physical limitations (out of disk memory)
-   Code errors
-   Opening an unavailable file

🔥 **Error**: An Error indicates a serious problem that a reasonable application should not try to catch. 


🔥 **Exception**: Exception indicates conditions that a reasonable application might try to catch.

----------------------------------------------------
### Exception Hierarchy.


- All exception and error types are subclasses of class **Throwable**, which is the base class of the hierarchy

![enter image description here](https://camo.githubusercontent.com/b0309e39d420a47ee3a5505c64091f8258cd351cf0e9026792d536a9c79196c6/68747470733a2f2f692e696d6775722e636f6d2f696a576b526a612e706e67)

![enter image description here](https://camo.githubusercontent.com/75506522055568a21f4c3cedaef919ad5cf81bc892615cd910334108d683eb19/68747470733a2f2f7374617469632e6a61766174706f696e742e636f6d2f636f72652f696d616765732f6869657261726368792d6f662d657863657074696f6e2d68616e646c696e672e706e67)


-   **Built-in Exceptions**
    
    -   **Checked Exception**
        -   The classes that **directly inherit the Throwable class except RuntimeException and Error** are known as **checked exceptions.**
        -   For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
        -   Also called as **compile time exceptions**
    -   **Unchecked Exception**
        -   The classes that **inherit the RuntimeException are known as unchecked exceptions**.
        -   For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.


-   **User-Defined** Exceptions
    
    -   Sometimes, the built-in exceptions in Java are not able to describe a certain situation. 
    - In such cases, users can also create own  exceptions, **which are called ‘user-defined Exceptions’.**


### Exception Handling keywords


**try** :

-   The "try" keyword is used to specify a block where we should place an exception code.
-   It means we can't use try block alone.
-   *The try block must be followed by either catch or finally.*

**catch**:

-   The "catch" *block is used to handle the exception.*
-   It must be ***preceded by try block which means we can't use catch block alone.***
-   It can be followed by finally block later.

**finally**:

-   The "finally" block is used to execute the necessary code of the program.
-   ***It is executed whether an exception is handled or not.***

**throw**:

-   The "throw" keyword is used to throw an exception.

**throws**:

-   The "throws" keyword is used to declare exceptions.
-   It specifies that **there may occur an exception in the method.**
-   It doesn't throw an exception.
-  It is always used with method signature.




```java
public class JavaExceptionExample{  
  public static void main(String args[]){  
      int data = 100;
      int result = data/0;
      System.out.println(data);
      System.out.println(data+data*data);
       System.out.println("Hello Exceptional Handling..");  
  }  
}
```

**Exception Handled Code**

```java
public class JavaExceptionExample{  
  public static void main(String args[]){  
    
   int data = 100;
   try{  
      int result = data/0;  
   }catch(ArithmeticException e){
        System.out.println(e);
   }  
   //rest code of the program   
    System.out.println("rest of the code...");
    System.out.println(data+data*data);
    System.out.println("Hello Exceptional Handling..");  
  }  
} 
```
-------------------------------------


**Common Scenarios of Java Exceptions**

**1) A scenario where ArithmeticException occurs** If we divide any number by zero, there occurs an ArithmeticException.

```java
int a=50/0;//ArithmeticException  
```

**2) A scenario where NullPointerException occurs** If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

```java
String name=null;  
System.out.println(name.length());//NullPointerException  
```

**3) A scenario where NumberFormatException occurs**

-   If the formatting of any variable or number is mismatched, it may result into NumberFormatException.
-   Suppose we have a string variable that has characters; converting this variable into digit will cause NumberFormatException.

```java
String s="Kumar";  
int i=Integer.parseInt(s);//NumberFormatException  
```

**4) A scenario where ArrayIndexOutOfBoundsException occurs** When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
	- Accessing Invalid Index location.


### try & catch block

- **Java try block** is used to enclose the code that might throw an exception. It must be used within the method.
- **Java catch block** is used to handle the Exception by declaring the type of exception within the parameter.


```java
try{    
//code that may throw an exception 
}catch(Exception_Class_Name reference){
    //handle the exception.
}   

try{    
//code that may throw an exception 
}finally{
    //executed whether an exception is occured or not in both the cases.
}
```


![enter image description here](https://camo.githubusercontent.com/7f0add4a2a861039b78f82a5f348d51ec4fc88919dc495691a2e57b6c42e0860/68747470733a2f2f692e696d6775722e636f6d2f70566b33755a412e706e67)


**Example-1**
```java
public class TryCatchExample3 {  
  
    public static void main(String[] args) {  
         int data = 50;
        try  {  
        int res=data/0; //may throw exception if exception occurs, the remaining statement will not exceute  
          System.out.println("data is: "+ data);
          System.out.println("Addition is:  "+ (data+data));
        }  
         // handling the exception   
        catch(ArithmeticException e) {  
            System.out.println(e);  
        }  
          
    }  
      
}
```

**Example-2**
```java
public class TryCatchExample4 {  
  
    public static void main(String[] args) {  
       int data = 50;
        try  {  
        int res=50/0; //may throw exception   
        }  
        // handling the exception by using Exception class      
        catch(Exception e)  {  
            System.out.println(e); 
            System.out.println("Can't divided by zero");  
        }  
        System.out.println("rest of the code");  
        System.out.println("data is: "+ data);
        System.out.println("Addition is:  "+ (data+data));
    }  
      
}
```

**Example-3**
```java
public class TryCatchExample6 {  
    public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  {  
        data=i/j;   
        }  
        catch(Exception e) {  
            System.out.println(i/(j+2));  
        }  
    }  
}
```

**Example-4**
```java
public class TryCatchExample7 {  
    public static void main(String[] args) {  
          
        try {  
        int data1=50/0;
        }  
        catch(Exception e)  {  
        int data2=50/0; 
        }  
    System.out.println("rest of the code");  
    }  
} 
```

**Example-5**
```java
public class TryCatchExample8 {  
    public static void main(String[] args) {  
        try  {  
        int data=50/0; 
        }  
        catch(ArrayIndexOutOfBoundsException e)  {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    } 
}
```

----------------------------

### Multi-catch block

-   A try block can be followed by one or more catch blocks.
-   Each catch block must contain a different exception handler.

🔴**NOTE**🔴

- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks **must be ordered from most specific to most general**

**Example-1**
```java
public class MultipleCatchBlock1 {  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e) {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e) {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}
```

**Example-2**
```java
public class MultipleCatchBlock4 {  
    public static void main(String[] args) {  
           try{    
                String s=null;  
                System.out.println(s.length());  
               }    
               catch(ArithmeticException e)  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e) {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e) {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
} 
```

**Example-3**



```java
public class MultipleCatchBlock4 {  
    public static void main(String[] args) {  
           try{    
                String s=null;  
                System.out.println(s.length());  
               }    
               catch(ArithmeticException e)  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e) {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e) {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
} 
```

**Example-4**

```java

public class NestedTryBlock{    
 public static void main(String args[]){   
 
  try{   //outer try block   
    try{     //inner try block 1   
         System.out.println("going to divide by 0");    
         int b =39/0;    
     }  
    catch(ArithmeticException e) {   //catch block of inner try block 1  
         System.out.println(e);  
        }    
    
    try{    //inner try block 2  
        int a[]=new int[5];    
        //assigning the value out of array bounds  
        a[5]=4;    
     }  
    catch(ArrayIndexOutOfBoundsException e)  {  //catch block of inner try block 2
       System.out.println(e);  
    }    

    System.out.println("other statement");    
  }  
  //catch block of outer try block  
  catch(Exception e)  {  
    System.out.println("handled the exception (outer catch)");  
  }   
  System.out.println("normal flow..");    
 }    
}  
```


### finally block

- Java finally block is a block used to **execute important code such as closing the connections**, DB , Streams, Files etc.

- Java finally block is always executed whether an exception is handled or not
- finally block in Java c**an be used to put "cleanup" code such as closing a file, closing connection**, etc.

![enter image description here](https://camo.githubusercontent.com/e5b0cd8df5089adab974ba9a60af63e810f9e60f640e27e87ca27c0cd889715e/68747470733a2f2f692e696d6775722e636f6d2f764548466270752e706e67)

**Example-1**
```java
class TestFinallyBlock {    
  public static void main(String args[]){    
  try{    
    int data=25/5;    
    System.out.println(data);    
  }    
  catch(NullPointerException e){  
    System.out.println(e);  
    }    
//executed regardless of exception occurred or not  
 finally {  
    System.out.println("finally block is always executed");  
}    
    
System.out.println("rest of phe code...");    
  }    
}  

```

**Example-2**
```java

public class TestFinallyBlock1{    
      public static void main(String args[]){   
      try {    
       int data=25/0;    
       System.out.println(data);    
      }    
      catch(NullPointerException e){  
        System.out.println(e);  
      }   

      finally {  
        System.out.println("finally block is always executed");  
      } 
      System.out.println("rest of the code...");    
      }    
    }  
```


🔴 For each try block there ***can be zero or more catch blocks, but only one finally block.***

🔴  The finally block **will not be executed if the program exits (either by calling System.exit()** or by causing a fatal error that causes the process to abort).

-----------------------------
### throw Exception.
- In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.

-   The ***Java throw keyword is used to throw an exception explicitly.***
-   We can throw either checked or unchecked exceptions in Java by throw keyword. 
- It is mainly ***used to throw a custom exception***

```java
throw new StudentNotFound("Couldn't found student with ID");  
throw new IOException("sorry device error");  
```

- Where the Instance must be of type Throwable or subclass of Throwable. 
- For example, Exception is the sub class of Throwable and **the user-defined exceptions usually extend the Exception class.**


**Example 1: Throwing Unchecked Exception**

```java

public class TestThrow1 {   
 
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String args[]){  
        validate(13);  
        System.out.println("rest of the code...");    
  }    
} 

```

**Example 2: Throwing Checked Exception**
```java
import java.io.*;  
public class TestThrow2 {   
  
    public static void method() throws FileNotFoundException {  
        FileReader file = new FileReader("C:\\Users\\ACER\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
        throw new FileNotFoundException();  
    }  
    //main method  
    public static void main(String args[]){  
        try  {  
            method();  
        }   
        catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}
```

**Example 3: Throwing User-defined Exception**

we can declared user-defined exceptions by extending Exception parent class and define constructor.

```java
// class represents user-defined exception  
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str){  
        // Calling constructor of parent Exception  
        super(str);  
    } 

```

```java

public class TestThrow3  {  
    public static void main(String args[])  {  
        try  {  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude) {  
            System.out.println("Caught the exception"); 
            System.out.println(ude.getMessage());  
        }  
    }  
}
```



### NOTE

🔴  If we throw a checked exception using throw keyword, it is must to handle the exception using catch block or the **method must declare it using throws declaration.**
    
🔴  Every subclass of **Error and RuntimeException is an unchecked exception** in Java. A checked exception is everything else under the Throwable class.

-----------------------------------

### JAVA EXCEPTION PROPAGATION

-   ***An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method.***
-   If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.


🔴 By default Unchecked Exceptions are forwarded in calling chain (propagated).
🔴 By default, Checked Exceptions are not forwarded in calling chain (propagated).


**unchecked exception**
```java
class TestExceptionPropagation1{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}
```


**checked exception**
```java
class TestExceptionPropagation2{  
  void m(){  
    throw new java.io.IOException("device error");//checked exception 
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}
```


### JAVA THROWS KEYWORD.

- The Java throws keyword is used to declare an exception.

**syntax**

```java
return_type method_name() throws exception_class_name{  
//method code 
}
```

**Which exception should be declared?**

-   Ans: Checked exception only, because: **unchecked exception**: under our control so we can correct our code. 

**error**: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

🔥 **NOTE** 🔥

- *If we are calling a method that declares an exception, we must either caught or declare the exception.*

**Case 1: Handle Exception Using try-catch block**
```java
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
} 
```

**Case 2: Declare Exception**

```java
import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class Test{  
   public static void main(String args[])throws IOException{//declare exception 
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}
```


### THROW VS THROWS
![enter image description here](https://camo.githubusercontent.com/04967c54a7e3b2fa96374ce1396bd930665b221876af267cf941b0ca9905d3c9/68747470733a2f2f692e696d6775722e636f6d2f346a34745147682e706e67)

**Java throw Example**

```java
public class Test {  
    //defining a method  
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
            Test obj = new Test();  
            obj.checkNum(-3);  
            System.out.println("Rest of the code..");  
    }  
}  
```

**Java throws Example** 

```java

public class Test {  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
        Test obj = new Test();  
        try {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("\nNumber cannot be divided by 0");  
        }  
        System.out.println("Rest of the code..");  
    }  
}

```

-------------------------------------
#### FINAL, FINALLY AND FINALIZE

-   The final, finally, and finalize are keywords in Java that are used in exception handling. Each of these keywords has a different functionality.
-   The basic difference between final, finally and finalize is that the
    -   **final** is an access modifier
    -   **finally** is the block in Exception Handling
    -   **finalize** is the method of object class.
![enter image description here](https://camo.githubusercontent.com/38712b126947015b60ea7f5d2487712ad80db560be912b9a60d70f3ef2ba997a/68747470733a2f2f692e696d6775722e636f6d2f6e4844424e6d662e706e67)
----------------------------------
### EXCEPTION HANDLING WITH METHOD OVERRIDING.


**case-1**
**- If the super class method does not declare an exception**, 
	- subclass overridden method cannot declare the checked exception 
	- But it can declare unchecked exception.

```java
import java.io.*;    
class Parent{   
  
  // defining the method   
  void msg() {  
    System.out.println("parent method");  
    }    
}    
    
public class Child extends Parent{    
  
  // overriding the method in child class  
  // gives compile time error  
  void msg() throws IOException {    
    System.out.println("TestExceptionChild");    
  }  
  
  public static void main(String args[]) {    
   Parent p = new Child();    
   p.msg();    
  }    
}
```

***sub class overridden method can declare unchecked exception.***


```java
import java.io.*;    
class Parent{    
  void msg() {  
    System.out.println("parent method");  
  }    
}    
    
class Child1 extends Parent{    
  void msg()throws ArithmeticException {    
    System.out.println("child method");    
  }    
  
  public static void main(String args[]) {    
   Parent p = new Child1();    
   p.msg();    
  }    
} 

```

**CASE-2**

- If the super class method declares an exception,
	- **subclass overridden method can declare 
		- Same Exception 
		- Subclass exception  OR **no exception**
	-  **But cannot declare parent exception.**


**subclass overridden method declares parent exception** 

```java
import java.io.*;    
class Parent{    
  void msg()throws ArithmeticException {  
    System.out.println("parent method");  
  }    
}    
    
public class TestExceptionChild2 extends Parent{    
  void msg()throws Exception {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]) {    
   Parent p = new TestExceptionChild2();    
   try {    
   p.msg();    
   }  
   catch (Exception e){}   
  }    
}
```

**subclass overridden method declares same exception**

```java
import java.io.*;    
class Parent{    
  void msg() throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
public class Child3 extends Parent {    
  void msg()throws Exception {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent p = new Child3();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}
```

**subclass overridden method declares no exception**
```java
import java.io.*;    
class Parent {    
  void msg()throws Exception{  
    System.out.println("parent method");  
  }    
}    
    
class Child5 extends Parent{    
  void msg() {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent p = new Child5();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}  
       
  }    
} 

```


### JAVA CUSTOM EXCEPTIONS.

-   In Java, we can create our own exceptions that are derived classes of the Exception class Or RuntimeException class. **Creating our own Exception is known as custom exception or user-defined exception.**
- 
-   Basically, Java custom exceptions are used to customize the exception according to user need.
- 
-   In order to create custom exception, we need to **extend Exception class that belongs to java.lang package.**


**syntax** 

```java
public class StudentNotFound extends Exception {  
    public StudentNotFound(String errorMessage) {  
        super(errorMessage);  
    }  
}
```

**Example**
```java
 
class InvalidAgeException  extends Exception  {  
    public InvalidAgeException (String str)  {  
        super(str);  
    }  
}  

public class TestCustomException1  {  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
        throw new InvalidAgeException("age is not valid to vote");    
    } else {   
        System.out.println("welcome to vote");   
        }   
     }    
    public static void main(String args[]){  
        try {  
            validate(13);  
        }  
        catch (InvalidAgeException ex) {  
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);  
        } 
        System.out.println("rest of the code...");    
    }  
} 
```


🔥 User Defined Exceptions are ***checked*** when it **extends Exception class** , 

🔥  User Defined Exceptions **acts as unchecked when it extends  RunTimeException.**




--------------------------------

## THREADS 

**What is Multi Threading ?**

-   Multithreading in Java is a **process of executing multiple threads simultaneously.**
-   A ***thread is a lightweight sub-process***, the smallest unit of processing.
- **Advantages**
	- we can perform many operations together, so it saves time.
	- **Threads are independent**, so it doesn't affect other threads if an exception occurs in a single thread.
	- Threads allows a program **to operate more efficiently** by doing multiple things at the same time.
	- Threads can be used to **perform complicated tasks in the background** without interrupting the main program.

**What is Multitasking?**
- Multitasking i**s a process of executing multiple tasks simultaneously.** 
- We use multitasking to utilize the CPU. 
- Multitasking can be achieved in two ways:
	-  Process-based Multitasking (**Multiprocessing**)
	-   Thread-based Multitasking (**Multithreading**)

🔥**Process-based Multitasking (Multiprocessing)**

-   Each process has an address in memory.  In other words, *each process allocates a separate memory area.*
-   **A process is heavyweight.**
-   Cost of communication between the process is high.
-   Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc


🔥 **Thread-based Multitasking (Multithreading)**

-   **Threads share the same address space.**
-   *A thread is lightweight.*
-   Cost of communication between the thread is low.

----------------------------------

### **What is Thread & Thread Class ?**
- ***A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.***
- **A thread is executed inside the process.** 
- There is context-switching between the threads. There can be multiple processes inside the OS, and one process can have multiple threads.

![enter image description here](https://camo.githubusercontent.com/94ef8f9182ee8c15570ae60c204286427e1b2c019e7f0b2c72d338324effa122/68747470733a2f2f692e696d6775722e636f6d2f487668587a43672e706e67)

### JAVA THREAD CLASS.

-   Java provides ***Thread class to achieve thread programming.***
-   Thread class provides constructors and methods to create and perform operations on a thread.
>  Thread class extends Object class and implements Runnable interface.
- Thread class belongs to **java.lang.Thread**

**methods**
-   **void start()** : It is used to start the execution of the thread.
-   **void run()** : It is used to do an action for a thread.
-   **static void sleep()** : It sleeps a thread for the specified amount of time.
-   **static Thread currentThread()** : It returns a reference to the currently executing thread object.
-   **void join()** : It waits for a thread to die.
-   **void stop()** : It is used to stop the thread.
-   **void destroy()** : It is used to destroy the thread group and all of its subgroups.
-   **void notify()** : It is used to give the notification for only one thread which is waiting for a particular object.
-   **void notifyAll()** : It is used to give the notification to all waiting threads of a particular object.
-   **void interrupt()** : It interrupts the thread.
-   **static void yield()** : It causes the currently executing thread object to pause and allow other threads to execute temporarily.

---------------------------------

### LIFE CYCLE OF A THREAD
In Java, a thread always exists in any one of the following states. These states are:

-   New
-   Active
-   Blocked / Waiting
-   Timed Waiting
-   Terminated

![enter image description here](https://camo.githubusercontent.com/8ed758e06e95065677a835e1f9d0e07042a05f6d077ab6b98d06636b7822234c/68747470733a2f2f692e696d6775722e636f6d2f6435664d514e532e706e67)
**New** : Whenever a new thread is created, it is always in the new state.

**Active**: When a thread invokes the start() method, it **moves from the new state to the active state**
	. The active state contains two states within it: one is runnable, and the other is running.

-   **Runnable**: A thread, that is ***ready to run is then moved to the runnable state.***
    
    -   It is the duty of the thread scheduler to provide the thread time to run.
-   **Running**: When the thread gets the CPU, **it moves from the runnable to the running state.**
    
    -   Generally, the most common change in the state of a thread is from runnable to running and again back to runnable.

**Blocked or Waiting**: ***Whenever a thread is inactive for a span of time*** (not permanently) then, either the thread is in the blocked state or is in the waiting state.

**Timed Waiting**: Sometimes, waiting leads to starvation.

-   For example, a thread (its name is A) has entered the critical section of a code and is not willing to leave that critical section.
-   In such a scenario, another thread (its name is B) has to wait forever, which leads to starvation.
-   To avoid such scenario, a timed waiting state is given to thread B. Thus, thread lies in the waiting state for a specific span of time, and not forever.

```java
A real example of timed waiting is when we invoke the sleep() method on a specific thread. 
The sleep() method puts the thread in the timed wait state. 
After the time runs out, the thread wakes up and start its execution from when it has left earlier.

````

**Terminated:** A thread reaches the termination state because of the following reasons:

-   When a **thread has finished its job**, then it exists or terminates normally.
-   **Abnormal termination**: It occurs when some unusual events such as an unhandled exception or segmentation fault.
-   A terminated thread means the thread is no more in the system. 
- In other words, the thread is dead, and there is no way one can respawn (active after kill) the dead thread.

**NOTE**

-   The main difference between **waiting** and **timed waiting** is the time constraint.
-   Waiting has no time constraint, whereas timed waiting has the time constraint.
-   A thread invoking the following method reaches the timed waiting state.
    -   sleep
    -   join with timeout
    -   wait with timeout
    -   parkUntil
    -   parkNanos


🔥In Java, one can get the current state of a thread using the **Thread.getState() method.**

---------------------------------
###  Ways to create a Thread 

There are two ways to create a thread:

-   By **extending Thread class**
-   By **implementing Runnable interface.**

### **Thread class:**

-   Thread class provide constructors and methods to create and perform operations on a thread.
- Thread class extends Object class and implements Runnable interface.

**constructors**

-   Thread()
-   Thread(String name)
-   Thread(Runnable r)
-   Thread(Runnable r,String name)

**methods of Thread class**

-   run() , start(), sleep() , join() , getPriority() , getName()
-   isAlive() , yield() , suspend() , resume() , stop() , interrupt()


```java

class MailThread extends Thread {
    public MailThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Invoking run method of : "+ Thread.currentThread().getName());
    }
}
public class Example {
    public static void main(String[] args) {
        MailThread m = new MailThread("mailThread"); // object creation
        m.start(); // calling start(), will automatically invoke run()
    }

}
```

**Guess the output**
```java
class MailThread extends Thread {
    public void run() {
        System.out.println("Invoking run method of : "+ Thread.currentThread().getName());
    }
}
public class Example {
    public static void main(String[] args) throws InterruptedException{
        MailThread m = new MailThread(); 
        System.out.println(m.getState());
        m.start(); 
        System.out.println(m.getState());
        m.join();
        System.out.println(m.getState());

    }

}
```


-   The **start() method of Thread class is used to start a newly created thread.**
-   It performs the following tasks:
    -   A new thread starts(with new callstack).
    -   The thread moves from New state to the Runnable state.
    -   When the thread gets a chance to execute, its target run() method will run.

-------------------

### **Runnable interface:**
- The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
- Runnable interface have only one method named run().
	-   public void run(): is used to perform action for a thread.

```java
class MailThread implements Runnable {
    public void run() {
        System.out.println("Invoking run method of : "+ Thread.currentThread().getName());
    }
}
public class Example {
    public static void main(String[] args) throws InterruptedException{
      MailThread mThread = new MailThread();
      Thread thread = new Thread(mThread); // passing runnable instance
      thread.start();
    }

}
```

🔴If we are not extending the Thread class, **class object would not be treated as a thread object**. So we need to explicitly create the Thread class object.

🔴 We are passing the **object of class that implements Runnable** so that class run() method may execute.




**Guess the output**

```java
public class Example {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread("Exam Thread");
        thread.start();
        System.out.println("Name: "+ thread.getName());
        System.out.println("STATE: "+ thread.getState());
        System.out.println("Priority: "+ thread.getPriority());
        System.out.println("ID: "+ thread.getId());
        System.out.println("Address: "+ thread.hashCode());
    }

}
```

```java
class StreamThread implements Runnable {
    public void run() {
        System.out.println("run method() : processing streaming of data.");
    }
}
public class Example {
    public static void main(String[] args) throws InterruptedException{
       Runnable r = new StreamThread();
       Thread thread = new Thread(r, "streamThread");
       System.out.println(thread.getState());
       thread.start();
       System.out.println(thread.getState());

    }
}
```

--------------------

#### **THREAD SCHEDULER IN JAVA**
- A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
-   In Java, a **thread is only chosen by a thread scheduler if it is in the runnable state.**
-   However, if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones.
-   There are some criteria that decide which thread will execute first There are two factors for scheduling a thread i.e. Priority and Time of arrival.
- Examples 
	- **First Come First Serve Scheduling**
	- **Time-slicing scheduling**
	- **Preemptive-Priority Scheduling**



-------------------------

## Thread.sleep()

-   The **method sleep() is being used to halt the working of a thread for a given amount of time.**
-   The time up to which the thread remains in the sleeping state is known as the **sleeping time of the thread.**
-   After the sleeping time is over, the thread starts its execution from where it has left.

**methods**
```java
public static void sleep(long mls) throws InterruptedException   
public static void sleep(long mls, int n) throws InterruptedException   


mls: The time in milliseconds is represented by the parameter mls. 
The duration for which the thread will sleep is given by the method sleep().

n: It shows the additional time up to which the programmer or developer wants the thread to be in the sleeping state. 
The range of n is from 0 to 999999.

```


```java
 class TestThread extends Thread{  
 public void run(){  
   for(int i=1;i<=5;i++) {
    try{
        Thread.sleep(2000);
    } catch(Exception ex) {
        System.out.println(ex);
    }
    System.out.println("Processing "+ i + "-bytes of data");
   }
 } 
}
class StreamThread implements Runnable {
    public void run() {
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Streaming "+ i + "-bytes of data.");
        }  
    }
}
public class Example {
    public static void main(String[] args){
       Runnable r = new StreamThread();
       Thread thread = new Thread(r, "streamThread");
       thread.start();
	   
       TestThread testThread = new TestThread();
       testThread.start();
        
    }
}
```

**NOTE**
-   Whenever the Thread.sleep() method executes, it always halts the execution of the current thread.
-   Whenever **another thread does interruption while the current thread is already in the sleep mode, then the InterruptedException is thrown.**

🔥 When the sleeping time is negative throws the **exception IllegalArguementException**

------------------------

### Try these

**Can we start a thread twice?**
```java
public class TestThread extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestThread t1=new TestThread ();  
  t1.start();  
  t1.start();  	
 }  
}
```

**can we call run() method directly instead start() method?**

```java

class TestThread extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{
		    Thread.sleep(500);
	    }
	  catch(InterruptedException e){
		   System.out.println(e);
	   }  
   System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestThread t1=new TestThread ();  
  TestThread t2=new TestThread ();  
   
  t1.run();  
  t2.run();  
 }  
}
```

-------------------------------
## Java join() method
- **java.lang.Thread** class provides the join() method **which allows one thread to wait until another thread completes its execution..**

-   If it is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
-   If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period.
-   However, **as with sleep, join is dependent on the OS for timing**, so you should not assume that join will wait exactly as long as you specify

**methods**

**1. join():**

-   It will put the current thread on wait until the thread on which it is called is dead.
-   If thread is interrupted then it will throw InterruptedException.

```java
public final void join() throws InterruptedException  
```

**2. join(long millis)**

-   It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds)

```java
public final synchronized void join(long millis) throws InterruptedException,
```

**join(long millis, int nanos):**

-   It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).

```java
public final synchronized void join(long millis, int nanos) throws InterruptedException,
```
**Example**

```java
import java.io.*;  
class ThreadJoin extends Thread  {  
	public void run(){  
		for (int j = 0; j < 2; j++){  
			try {  
					Thread.sleep(300);  
					System.out.println("The current thread name is: " + Thread.currentThread().getName());  
				}  
			catch(Exception e){  
					System.out.println("The exception has been caught: " + e);  
				}  
			System.out.println( j );  
			}  
		}  
	}  
public class ThreadJoinExample  {  
	public static void main (String argvs[]){  
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin();  
		
		th1.start();  
		try {  
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());
			th1.join();  
		} catch(Exception e){  
			System.out.println("The exception has been caught " + e);  
		}  
 
		th2.start();
		try{  
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			th2.join();  
			} catch(Exception e){  
			System.out.println("The exception has been caught " + e);
			}  
		th3.start();  
	}  
}  

```
**Example-2**

```java
class ABC extends Thread {  
	Thread threadToInterrupt; 
	public void run(){  
	threadToInterrupt.interrupt();  
	}  
}  
public class ThreadJoinExample1  {  
	public static void main(String[] argvs) {  

		try{  
			ABC th1 = new ABC();  
			th1.threadToInterrupt = Thread.currentThread();  
			th1.start();  
			th1.join();  
		}catch (InterruptedException ex) {  
			System.out.println("The exception has been caught. " + ex);  
		}  
	}  
}  

```

**Example-3**
```java
class TestJoinMethod extends Thread{
	public void run(){    
		for(int i=1;i<=5;i++){    
			try{    
				Thread.sleep(500);    
			}catch(Exception e){System.out.println(e);}    
		System.out.println("Current Thread "+ Thread.currentThread().getName() + ":" + i);    
	}    
 } 
}

public class Example {
    public static void main(String[] args){
        TestJoinMethod t1=new TestJoinMethod ();    
        TestJoinMethod t2=new TestJoinMethod ();    
        TestJoinMethod t3=new TestJoinMethod ();    
        t1.start();    
        try{    
            t1.join(1500);    
        }catch(Exception e){System.out.println(e);}    
        
        t2.start();    
        t3.start();      
    }

}  
```


🔥 The Thread class provides methods **to change and get the name of a thread**. 

🔥 By default, each thread has a name, i.e. thread-0, thread-1 and so on.

```java
public String getName(): //is used to return the name of a thread. 
public void setName(String name):// is used to change the name of a thread.
```


🔥 The **currentThread() method** returns a reference of the currently executing thread.

```java
public static Thread currentThread()
```


🔥 Each thread has a priority, Priorities are represented by a number between 1 and 10.
```java
public final int getPriority()
public final void setPriority(int newPriority)

-   public static int MIN_PRIORITY  1
-   public static int NORM_PRIORITY  5
-   public static int MAX_PRIORITY  10
```

🔥 When we set invalid priority (not in the range of 1-10) throws **IllegalArgumentException**

🔥 **DAEMON THREAD** : Daemon thread in Java is a service provider thread that provides services to the user thread.

🔥 There are many java daemon threads running automatically e.g. gc, finalizer etc

**methods**
```java
-   public void setDaemon(boolean status)
-   public boolean isDaemon()
```

🔥 Java Thread pool represents a **group of worker threads that are waiting for the job** and reused many times.

**Methods**

**newFixedThreadPool(int s):** The method creates a thread pool of the fixed size s.

**newCachedThreadPool():**: The method creates a new thread pool that creates the new threads when needed but will still use the previously created thread whenever they are available to use.

**newSingleThreadExecutor():**: The method creates a new thread.


------------

### ThreadGroup in Java.
-   A ThreadGroup represents a set of threads.
-   Java provides a convenient way to group multiple threads in a single object. 
- In such a way, we can suspend, resume or interrupt a group of threads by a single method call.
-   Note: **Now suspend(), resume() and stop() methods are deprecated.**
-   Java thread group is implemented by **java.lang.ThreadGroup class.**
-   A thread group can also include the other thread group.
-   The thread group creates a tree in which every thread group except the initial thread group has a parent.
-   A thread is allowed to access information about its own thread group.

**Constructors**

1.  **ThreadGroup(String name)** creates a thread group with given name.
2.  **ThreadGroup(ThreadGroup parent, String name)** creates a thread group with a given parent group and name.

--------------------


### Java Runtime class

-   Java Runtime class is used to interact with java runtime environment.
-   Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc.
-   There is only one instance of java.lang.Runtime class is available for one java application.
-   The Runtime.getRuntime() method returns the singleton instance of Runtime class.

**Methods**

-   public static Runtime getRuntime() returns the instance of Runtime class.
-   public void exit(int status) terminates the current virtual machine.
-   public void addShutdownHook(Thread hook) registers new hook thread.
-   public Process exec(String command)throws IOException executes given command in a separate process.
-   public int availableProcessors() returns no. of available processors.
-   public long freeMemory() returns amount of free memory in JVM.
-   public long totalMemory() returns amount of total memory in JVM.


--------------------

## SYNCHRONIZATION IN JAVA

- Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
- Java Synchronization is better option where we want to allow only one thread to access the shared resource.

**Why use Synchronization?**
 The synchronization is mainly used to
-   To prevent **thread interference.**
-   To prevent **consistency problem**.


**Thread Synchronization** 

There are two types of thread synchronization mutual exclusive and inter-thread communication.
1.**Mutual Exclusive**

-   Synchronized method.
-   Synchronized block.
-   Static synchronization.

**Mutual Exclusive**

> Mutual Exclusive helps keep threads from interfering with one another while sharing data. It can be achieved by using the following three ways:

-   By Using Synchronized Method
-   By Using Synchronized Block
-   By Using Static Synchronization

**Concept of Lock in Java**

-   **Synchronization is built around an internal entity known as the lock or monitor.**
-   Every object has a lock associated with it.
-   By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.
-   From Java 5 the **package java.util.concurrent.locks contains several lock implementations.**

#### Synchronized Method


**example, with no synchronization**
```java
class Table {
    void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
```

**Example with Synchronized Method**

-   If we declare any method as **synchronized, it is known as synchronized method.**
-   Synchronized method is **used to lock an object for any shared resource.**
-   When a *thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.*

```java
class Table {
    synchronized void printTable(int n) { //synchronized method  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization2 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
```


**Guess the output**
```java
class Table {
    synchronized void printTable(int n) { //synchronized method  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class TestSynchronization3 {
    public static void main(String args[]) {
        final Table obj = new Table(); //only one object  

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
```


#### SYNCHRONIZED BLOCK IN JAVA.

-   Synchronized block can be **used to perform synchronization on any specific resource of the method.**
- 
**Points to Remember**

-   Synchronized block is used to lock an object for any shared resource.
-   **Scope of synchronized block is smaller than the method.**
```java
synchronized (object reference expression) {     
  //code block 
}
```

**Example**
```java
class Sender {
    public void SenderMsg(String msg) {
        System.out.println("\nSending a Message: " + msg);
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
 
class SenderWThreads extends Thread {
    private String msg;
    Sender sd;

    SenderWThreads(String m, Sender obj) {
        msg = m;
        sd = obj;
    }

    public void run() {
        synchronized(sd) { 
            sd.SenderMsg(msg);
        }
    }
}
  
public class ShynchronizedMultithreading {
    public static void main(String args[]) {
        Sender sender = new Sender();
        SenderWThreads senderT1 = new SenderWThreads("Hola ", sender);
        SenderWThreads senderT2= new SenderWThreads("Welcome to Java Concepts", sender);

     
        senderT1 .start();
        senderT2.start();

    
        try {
            senderT1 .join();
            senderT2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
```
---------------
#### Static Synchronization

If we make any static method as synchronized, the lock will be on the class not on object.

![enter image description here](https://camo.githubusercontent.com/4520d988499a1a9c1e9bdccabb7e5a50983fc5cb11b1f2596ebb36cce6ecb517/68747470733a2f2f692e696d6775722e636f6d2f4b72776b5a696b2e706e67)
**Problem without static synchronization**

-   Suppose there are two objects of a shared class (e.g. Table) named object1 and object2.
-   In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
-   But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.
-   We don't want interference between t1 and t3 or t2 and t4. 
- Static synchronization solves this problem.


```java
class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {}
        }
    }
}

public class TestSynchronization4 {
    public static void main(String t[]) {
        Thread t1 = new Thread(){
             public void run() {
                Table.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                Table.printTable(10);
            }
        };
        Thread t3 = new Thread(){
            public void run() {
                Table.printTable(15);
            }
        };
        Thread t4 = new Thread(){
            public void run() {
                Table.printTable(20);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

```


--------------

----------------

### Deadlock in Java.


 -   Deadlock in Java is a  *part of multithreading.*

    
-   Deadlock can occur in a ***situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread.***
    
-   Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

![enter image description here](https://camo.githubusercontent.com/fb282b48f4e506973804e3b43b311211fd06157dad5c49ea87d1015cd19467d0/68747470733a2f2f692e696d6775722e636f6d2f363634774a75512e706e67)

```java
public class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "SAIMEDHA ECET";
        final String resource2 = "SAIMEDHA GATE";
    
		//  // t1 tries to lock resource1 then resource2  
        Thread t1 = new Thread() {
            public void run() {
                synchronized(resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized(resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1  
        Thread t2 = new Thread() {
            public void run() {
                synchronized(resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized(resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
```

**How to Avoid Deadlock in Java?**
Deadlocks cannot be completely resolved. But we can avoid them by following basic rules mentioned below:

**Avoid Nested Locks:**

-   We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition.
-   It normally happens when you give locks to multiple threads.

**Avoid Unnecessary Locks:**

-   The locks should be given to the important threads.
-   Giving locks to the unnecessary threads that cause the deadlock condition.

**Using Thread Join:**

-   A deadlock usually happens when one thread is waiting for the other to finish.
-   In this case, we can use join with a maximum time that a thread will take.


--------------------
2. ## INTER-THREAD COMMUNICATION IN JAVA

- Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.

-   **Cooperation (Inter-thread communication)** is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
-   It is implemented by following methods of Object class:
    -   wait()
    -   notify()
    -   notifyAll()

**1) wait() method**

-   The wait() method causes ***current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.***

-   The current thread must own this object's monitor, so it must be called from the synchronized method only otherwise it will throw exception.

**Methods**


```java
public final void wait()throws InterruptedException : It waits until object is notified. public 

public final void wait(long timeout)throws InterruptedException : It waits for the specified amount of time.

```


**2) notify() method**

-   The notify() method ***wakes up a single thread that is waiting on this object's monitor.***
-   If any threads are waiting on this object, one of them is chosen to be awakened.
-   The choice is arbitrary and occurs at the discretion of the implementation.

```java
public final void notify()
```


**notifyAll() method**

-   Wakes up all threads that are waiting on this object's monitor
```java
public final void notifyAll()  
```

### Difference between wait and sleep?
![enter image description here](https://camo.githubusercontent.com/1be34d30c3641e79470acfcde50532741de78777248d2ea75a76ee001fb10654/68747470733a2f2f692e696d6775722e636f6d2f694e776c6b6e322e706e67)

**Example**
```java
class Customer {
    int currentAmount= 10000;

    synchronized void withdraw(int requestedAmount) {
        System.out.println("going to withdraw...");

        if (requestedAmount > this.currentAmount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {}
        }
        this.currentAmount -= requestedAmount ;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amountToBeAdded) {
        System.out.println("going to deposit...");
        this.currentAmount+= amountToBeAdded;
        System.out.println("deposit completed... ");
        notify();
    }
}

class Test {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }
}
```


--------------

### Interrupting a Thread

-   If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
-   ***calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.***
-   If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.

**Methods**
-   public void interrupt()
-   public static boolean interrupted()
-   public boolean isInterrupted()

```java
class TestInterruptingThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..." + e);
        }

    }

    public static void main(String args[]) {
        TestInterruptingThread t1 = new TestInterruptingThread ();
        t1.start();
        try {
            t1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }

    }
}
```

-   **void interrupt()** - Interrupts the thread.
-   **static boolean interrupted()** - Tests whether the current thread has been interrupted.
-   **boolean isInterrupted()** - Tests whether the thread has been interrupted.

```java
public class TestInterruptingThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            if (Thread.interrupted()) {
                System.out.println("code for interrupted thread");
            } else {
                System.out.println("code for normal thread");
            }
        }
    }

    public static void main(String args[]) {

        TestInterruptingThread4 t1 = new TestInterruptingThread4();
        TestInterruptingThread4 t2 = new TestInterruptingThread4();

        t1.start();
        t1.interrupt();

        t2.start();

    }
}   
```
---------
### Thread yield method()

- The yield() method of thread class ***causes the currently executing thread object to temporarily pause and allow other threads to execute.***

```java
   public static void yield()  
``` 

**Example**
-   Suppose there are three threads t1, t2, and t3.
-   Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state.
-   The completion time for thread t1 is 5 hours and the completion time for t2 is 5 minutes.
-   Since t1 will complete its execution after 5 hours,t2 has to wait for 5 hours to just finish 5 minutes job.
-   In such scenarios where one thread is taking too much time to complete its execution,
-   we need a way to prevent the execution of a thread in between if something important is pending.
-   yield() helps us in doing.

```java
public class JavaYieldExp extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<2 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        JavaYieldExp t1 = new JavaYieldExp();  
        JavaYieldExp t2 = new JavaYieldExp();  
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<2; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
} 
```


## yeild() vs join() vs sleep() 
![enter image description here](https://i.imgur.com/Q2kcHVb.png)




