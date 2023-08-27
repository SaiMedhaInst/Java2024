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

