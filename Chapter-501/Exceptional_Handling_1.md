## EXCEPTION HANDLING IN JAVA
- The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
- Exception is an abnormal condition.
> Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

- **Exception** is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. 
- Exceptions can be caught and handled by the program. 
- When an exception occurs within a method, it creates an object. This object is called the exception object. 
- It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.


- **Errors** represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. 
- Errors are usually beyond the control of the programmer, and we should not try to handle errors.


**Advantage of Exception Handling**
- The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions. 


**Major reasons why an exception Occurs**
- Invalid user input
- Device failure
- Loss of network connection
- Physical limitations (out of disk memory)
- Code errors
- Opening an unavailable file


**Error**: An Error indicates a serious problem that a reasonable application should not try to catch.
**Exception**: Exception indicates conditions that a reasonable application might try to catch.


### Exception Hierarchy.
- All exception and error types are subclasses of class **Throwable**, which is the base class of the hierarchy
![N|Solid](https://i.imgur.com/ijWkRja.png)

#### Types of Exceptions 
- Java defines several types of exceptions that relate to its various class libraries. Java also allows users to define their own exceptions.

**Exceptions can be categorized in two ways:**


![N|Solid](https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png)
1. **Built-in Exceptions**
    - **Checked Exception**
        - The classes that **directly inherit the Throwable class except RuntimeException and Error** are known as **checked exceptions.** 
        - For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
        - Also called as compile time exceptions
    - **Unchecked Exception** 
        - The classes that **inherit the RuntimeException are known as unchecked exceptions**.
        - For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.   

2. **User-Defined** Exceptions
    - Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’. 

**The advantages of Exception Handling**
- Provision to Complete Program Execution
- Easy Identification of Program Code and Error-Handling Code
- Propagation of Errors
- Meaningful Error Reporting
- Identifying Error Types

**Java provides five keywords that are used to handle the exception.**

**try** :	
- The "try" keyword is used to specify a block where we should place an exception code. 
- It means we can't use try block alone. 
- The try block must be followed by either catch or finally.

**catch**:
- The "catch" block is used to handle the exception. 
- It must be preceded by try block which means we can't use catch block alone. 
- It can be followed by finally block later.

**finally**:
- The "finally" block is used to execute the necessary code of the program. 
- It is executed whether an exception is handled or not.

**throw**:
- The "throw" keyword is used to throw an exception.

**throws**:
- The "throws" keyword is used to declare exceptions. 
- It specifies that there may occur an exception in the method. 
- It doesn't throw an exception. It is always used with method signature.

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

```java
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data = 100;
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

**Common Scenarios of Java Exceptions**
**1) A scenario where ArithmeticException occurs**
If we divide any number by zero, there occurs an ArithmeticException.
```java 
int a=50/0;//ArithmeticException  
```
**2) A scenario where NullPointerException occurs**
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

```java 
String name=null;  
System.out.println(name.length());//NullPointerException  
```

**3) A scenario where NumberFormatException occurs**
- If the formatting of any variable or number is mismatched, it may result into NumberFormatException.
- Suppose we have a string variable that has characters; converting this variable into digit will cause NumberFormatException.

```java
String s="Mr.Bean";  
int i=Integer.parseInt(s);//NumberFormatException  
```
**4) A scenario where ArrayIndexOutOfBoundsException occurs**
When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. there may be other reasons to occur ArrayIndexOutOfBoundsException. 
```java
int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  
```

#### Java try & catch block
- **Java try block** is used to enclose the code that might throw an exception. It must be used within the method.
- If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it is recommended not to keep the code in try block that will not throw an exception.
- Java try block must be followed by either catch or finally block.
 


- **Java catch block** is used to handle the Exception by declaring the type of exception within the parameter.
- The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.
- The catch block must be used after the try block only. You can use multiple catch block with a single try block.

**syntax**
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
   
![N|Solid](https://i.imgur.com/pVk3uZA.png)

- The JVM firstly checks whether the exception is handled or not.
- If exception is not handled, JVM provides a default exception handler that performs the following tasks:
    - **Prints out exception description**.
    - **Prints the stack trace (Hierarchy of methods where the exception occurred)**.
    - **Causes the program to terminate**.
- But if the application programmer/user handles the exception, the normal flow of the application is maintained, i.e., rest of the code is executed.

**Example-1**
```java
public class TryCatchExample3 {  
  
    public static void main(String[] args) {  
        try  {  
        int data = 50;
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
        try  {  
        int data = 50;
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


### Java Multi-catch block
- A try block can be followed by one or more catch blocks. 
- Each catch block must contain a different exception handler. 
- So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

**NOTE**
- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.


![N|Solid](https://i.imgur.com/f7LjFkb.png)

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
class MultipleCatchBlock5{    
  public static void main(String args[]){    
   try{    
    int a[]=new int[5];    
    a[5]=30/0;    
   }    
   catch(Exception e){System.out.println("common task completed");}    
   catch(ArithmeticException e){System.out.println("task1 is completed");}    
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
   System.out.println("rest of the code...");    
 }    
}   
```

### Java Nested try block
- In Java, using a try block inside another try block is permitted. It is called as nested try block. 

- For example, the **inner try block can be used to handle ArrayIndexOutOfBoundsException** while the **outer try block can handle the ArithemeticException** (division by zero).

- Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.

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

### Java finally block
- Java finally block is a block used to execute important code such as closing the connection, etc.
- Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

**Note**: If you don't handle the exception, before terminating the program, JVM executes finally block (if any).

![N|Solid](https://i.imgur.com/vEHFbpu.png)

**Why use Java finally block?**
- finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
- The important statements to be printed can be placed in the finally block.

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

**Rule**: 
- For each try block there can be zero or more catch blocks, but only one finally block.
- Note: The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).

### Java throw Exception.
- In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.
- The Java throw keyword is used to throw an exception explicitly.
- We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception

```java
throw new exception_class("error message");  
throw new IOException("sorry device error");  
```

**Where the Instance must be of type Throwable or subclass of Throwable. 
For example, Exception is the sub class of Throwable and the user-defined exceptions usually extend the Exception class.**

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
- we can declared user-defined exceptions by extending Exception parent class and define constructor.
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