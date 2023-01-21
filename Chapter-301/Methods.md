## METHODS in JAVA
- A method is a way to perform some task.
- A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation
- Similarly, the method in Java is a collection of instructions that performs a specific task. 
-  It provides the easy modification and readability
- The method is executed only when we call or invoke it.
- The most important method in Java is the main() method.
- TWO PHASES for methods i.e Declaration and Calling

#### Method Declaration.
- The method declaration provides information about method attributes, 
        -  visibility, 
        - return-type, 
        - name, 
        - arguments. 
- It has six components that are known as method header

[![N|Solid](https://static.javatpoint.com/core/images/method-in-java.png)](https://www.java.com/en/)

**Method Signature**: Every method has a method signature. It includes the method name and parameter list.

**Access Specifier**: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:

- `Public`: The method is accessible by all classes when we use public specifier.
- `Private`:  The method is accessible only inside same class.
- `Protected`: The method is accessible within the same package or subclasses in a different package.
- `Default`: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.
**Non-access Modifiers:** static.  final. abstract. synchronized.transient. volatile.native.


**Return Type**: 
            - Return type is a data type that the method returns. 
            - It may have a primitive data type, object, collection, void, etc. 
            - If the method does not return anything, we use void keyword.

**Method Name**: A unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. 
    ex: Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.

**Parameter List**: 
        - It is the list of parameters separated by a comma and enclosed in the pair of parentheses. 
        - It contains the data type and variable name. 
        - If the method has no parameter, left the parentheses blank.

**Method Body**:It contains all the actions to be performed. It is enclosed within the pair of curly braces.

`Tip`: Naming a Method.

Single-word method name: sum(), area()
Multi-word method name: areaOfCircle(), stringComparision()


#### Method Calling
The method needs to be called for using its functionality. There can be three situations when a method is called: 
A method returns to the code that invoked it when:  

It completes all the statements in the method
It reaches a return statement
Throws an exception
## Types of Method
 There are two types of methods in Java:
### Predefined Method
- In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. 
- It is also known as the standard library method or built-in method. 
- We can directly call these methods in java program.
- ex: length(), equals(), compareTo(), sqrt(),power(),max(),min()

```java

// using the max() method of Math class  
System.out.print("The maximum number is: " + Math.max(9,7));  

```

### User-defined Method
- The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement.

```java

import java.util.Scanner;  
public class EvenOdd  
{  
public static void main (String args[])  
{  
   
    Scanner scan=new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    int num=scan.nextInt();  
    findEvenOdd(num);  
}  
//user defined method  
public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
    System.out.println(num+" is even");   
else   
    System.out.println(num+" is odd");  
}  
}  

```
### Static Method
- A method that has static keyword is known as static method.
- In other words, a method that belongs to a class rather than an instance of a class is known as a static method.
- The main advantage of a static method is that we can call it without creating an object.
- It can access static data members and also change the value of it. 
- It is used to create an instance method. 
- It is invoked by using the class name. 
    -   ex: The best example of a static method is the main() method.

note: static blocks will execute first before nonstatic blocks/methods.

```java

public class Display  
{  
    public static void main(String[] args)   
    {   
        show();  
    }  
    static void show()   
    {  
        System.out.println("It is an example of static method.");  
    }  
}  
```

### Instance Method
- The method of the class is known as an instance method. 
- It is a non-static method defined in the class.
- Before calling or invoking the instance method, it is necessary to create an object of its class.

```java

public class InstanceMethodExample  
{  
    public static void main(String [] args)  
    {  
    //Creating an object of the class  
    InstanceMethodExample obj = new InstanceMethodExample();  
    //invoking instance method   
    System.out.println("The sum is: "+obj.add(12, 13));  
    }  
    int s;  
    //user-defined method because we have not used static keyword  
    public int add(int a, int b)  
    {  
    s = a+b;  
    //returning the sum  
    return s;  
    }  
}  

```

### Abstract Method

- The method that does not has method body is known as abstract method.
- In other words, without an implementation is known as abstract method. 
- It always declares in the abstract class. 
- It means the class itself must be abstract if it has abstract method. 
- To create an abstract method, we use the keyword abstract.

```java

abstract class Demo //abstract class  
{  
//abstract method declaration  
abstract void display();  
}  
public class MyClass extends Demo  
{  
    //method impelmentation  
    void display()  
    {  
    System.out.println("Abstract method?");  
    }  
    public static void main(String args[])  
    {  
    //creating object of abstract class  
    Demo obj = new MyClass();  
    //invoking abstract method  
    obj.display();  
    }  
}  
```

### Factory method
- It is a method that returns an object to the class to which it belongs.
- All static methods are factory methods. 
For example, NumberFormat obj = NumberFormat.getNumberInstance();


