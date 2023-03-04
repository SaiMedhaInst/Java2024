## JAVA EXCEPTION PROPAGATION

- An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method. 
- If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.

**NOTE**: By default Unchecked Exceptions are forwarded in calling chain (propagated).

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

- In the above example exception occurs in the m() method where it is not handled, so it is propagated to the previous n() method where it is not handled, again it is propagated to the p() method where exception is handled.

![N|Solid](https://i.imgur.com/BOOapSJ.png)


**Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).**

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
- It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

- **Exception Handling is mainly used to handle the checked exceptions**. If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used. 

**syntax**
```java
return_type method_name() throws exception_class_name{  
//method code  
}  
```



**Which exception should be declared?**
 - Ans: Checked exception only, because:
    **unchecked exception**: under our control so we can correct our code.
    **error**: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.


 **Example-1**
```java
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
} 
```

**Rule: If we are calling a method that declares an exception, we must either caught or declare the exception.**


There are two cases:
**Case 1**: We have caught the exception i.e. we have handled the exception using try/catch block.
**Case 2**: We have declared the exception i.e. specified throws keyword with the method.

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
- In case we declare the exception, if exception does not occur, the code will be executed fine.
- In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.

**A) If exception does not occur**

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

**B) If exception occurs**

```java
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
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

#### Try these?
**Can we rethrow an exception?**


### THROW VS THROWS

![N|Solid](https://i.imgur.com/4j4tQGh.png)

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

**Java throw and throws Example**
```java
public class TestThrowAndThrows  
{  
    // defining a user-defined method  
    // which throws ArithmeticException  
    static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method");  
        }  
    }  
} 

```


#### FINAL, FINALLY AND FINALIZE
- The final, finally, and finalize are keywords in Java that are used in exception handling. Each of these keywords has a different functionality. 
- The basic difference between final, finally and finalize is that the 
    - **final** is an access modifier
    - **finally** is the block in Exception Handling
    - **finalize** is the method of object class.

![N|Solid](https://i.imgur.com/nHDBNmf.png)


**Java final Example**

```java
public class Demo {  
    final double pi = 3.14;  
    void display() {  
        pi = 55.14;  
    }
    public static void main(String[] args) {  
    Demo obj = new Demo();
    obj.display();  
    }  
}
```

**Java finally Example**
```java
public class FinallyExample {    
      public static void main(String args[]){   
      try {    
         System.out.println("Inside try block");  
        int data=25/0;    
        System.out.println(data);    
      }   
      catch (ArithmeticException e){  
        System.out.println("Exception handled");  
        System.out.println(e);  
      }   
      finally {  
        System.out.println("finally block is always executed");  
      }    
      System.out.println("rest of the code...");    
      }    
    }

```

**Java finalize Example**

```java
public class FinalizeExample {    
     public static void main(String[] args)     
    {     
        FinalizeExample obj = new FinalizeExample();        
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
}

```

### EXCEPTION HANDLING WITH METHOD OVERRIDING.

Some of the rules are listed below:
**If the superclass method does not declare an exception**
- If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.

**If the superclass method declares an exception**
- If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

##### **If the superclass method does not declare an exception.**

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

** sub class overidden method can declare unchecked exception.**
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

##### **If the superclass method declares an exception**
- If the superclass method declares an exception, 
    - subclass overridden method can declare the same subclass exception 
    - or no exception but cannot declare parent exception.

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

**subclass overridden method declares subclass exception**
```java
import java.io.*;    
class Parent{    
  void msg()throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
class Child4 extends Parent{    
  void msg()throws ArithmeticException {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent p = new Child4();    
     
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

- In Java, we can create our own exceptions that are derived classes of the Exception class. Creating our own Exception is known as custom exception or user-defined exception. 
- Basically, Java custom exceptions are used to customize the exception according to user need.
- In order to create custom exception, we need to extend Exception class that belongs to java.lang package.

**syntax**
```java
public class StudentNotFound extends Exception {  
    public StudentNotFound(String errorMessage) {  
        super(errorMessage);  
    }  
}
```

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