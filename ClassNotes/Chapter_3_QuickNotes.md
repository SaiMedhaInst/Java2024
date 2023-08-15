## PACKAGES IN JAVA

- A java package is a group of similar types of 
	- classes
	- interfaces
	-  sub-packages.
	- enums
- Package in java can be categorized in two form,
	-   **built-in package** : comes with jdk installation
	-   user-defined package. user has to define with **package keyword whenever required**

#### Advantages
1.  Java package is used to **categorize the classes and interfaces so that they can be easily maintained.**
2.  Java package provides **access protection.**
3.  Java package removes **naming collision**

- java is the **base package for all predefined packages**
- popular packages 
	- **java.lang package** : default package (no need of explicit importing)
		- System.class
		- String.class 
		- StringBuffer.class , StringBuilder.class 
		- Math.class
		- Exception.class 
		- Object.class
	 - **java.Util** package : Utility package
		 - ArrayList.class
		 - Map.class
		 - Scanner.class
		 - BufferReader.class


**Example**

```java
package mypack;  
public class Simple{  
 public static void main(String args[]){  
    System.out.println("Welcome to Java Packages Sessions...");  
   }  
}
```

##### How to compile java package?

**javac -d directory javafilename**

```java
javac -d . Simple.java
```
here **.** means path to store .class files
**Run**
```java
java mypack.Simple
```


### Importing 

There are three ways to access the package from outside the package.
**-   import package.*;**
```java
import java.util.*; // import all classes of util package but not sub packages.
```
**-   import package.classname;**
```java
import java.util.Scanner; // import only specific class Scanner.
```
**-   fully qualified name**
	- useful whenever two packages have same class name.
	
```java
class Simple{  
  public static void main(String args[]){  
   java.util.Scanner in = new java.util.Scanner(System.in);
  }  
}
```

**static import**
- static import is used to import the static methods of a class directly into other class.
- Here in example , addition() is static method.
```java
import static java.pack.Calculator.addition;
```

----------------------------------------

### What is Classpath?

-   Java Virtual Machine(JVM) uses **classpath to locate the class files to execute the code.**
-   If classpath is not set and the class file is not present in the same directory as your java file, then JVM will be unable to find the required class file, **and it will throw an error (java.lang.ClassNotFoundException)**.

------------------------

## Access Modifiers
--------------------------------------------------------------------------------------------------
- Access modifiers are used to control the scope of a field, method, class, constructor.
- Scope : visibility or accessibility
- There are two types of modifiers 
	- Access modifiers 
		- private 
		- default
		- protected 
		- public
		
	- No Access modifiers   
		- abstract 
		- final
		- static 



### **Access modifiers** 


![enter image description here](https://media.geeksforgeeks.org/wp-content/uploads/20220504160344/ModifiersTypesInJavapng.jpg)

#### **Valid Access modiers**

![enter image description here](http://www.btechsmartclass.com/java/java_images/java-access-specifiers.png)
	


## METHODS in JAVA
-------------------------------------------------

-   A method **is a way to perform some task.**
-   A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation
-   The method is **executed only when we call or invoke it.**
-   The most important method in Java is the **main() method.**
-   TWO PHASES for methods 
	- Declaration
	-  Calling


#### Method Declaration.
-   The method declaration provides information about method attributes, - **visibility, - return-type, - name, - arguments.**
-   It has six components that are known as method header
![enter image description here](https://camo.githubusercontent.com/d82c615293af8664dc038bdf53c0f585ae2bcce09b3f0f84cf69e820d76875ab/68747470733a2f2f7374617469632e6a61766174706f696e742e636f6d2f636f72652f696d616765732f6d6574686f642d696e2d6a6176612e706e67)

### Types of Methods

####  Predefined Methods

-   Already defined in the Java class libraries is known as predefined methods.
-   It is also known as the standard library method or built-in method.
-   We can directly call these methods in java program.
-   ex: length(), equals(), compareTo(), sqrt(),power(),max(),min()

####  User Defined Methods
- The method written by the user or programmer is known as a user-defined method. 
- These methods are modified according to the requirement.

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
	public static void findEvenOdd(int num)   //user defined method  
	{  
		if(num%2==0)   
		    System.out.println(num+" is even");   
		else   
		    System.out.println(num+" is odd");  
		}  
}  

```

####  Static Methods

-   Method declared with static keyword, and method bounded to class rather than instance of class.
-   Static methods invoked directly with class name without objects creations.
-   It can access static data members and also change the value of it.
-   It is used to create an instance method.
    -   ex: The best example of a static method is the main() method.
    
   🔴IMPORTANT❗🔴
   - **static blocks will execute first** before nonstatic blocks/methods.
   
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

####  Instance Methods
-   Instance methods are regular methods of a class declared with out static keyword, also know as non static methods.
-   Before calling or invoking the instance method, it is necessary to create an object of its class.
- Will have one copy of methods signature in each and very object.

####  Abstract Methods

-   These method does not have body is known as abstract method.
-   In other words, without **an implementation is known as abstract method.**
-   It always **declares in the abstract class.**
-   It means the **class itself must be abstract if it has abstract method.**
-   To create an abstract method, we use the **keyword abstract.**


```java

abstract class Demo //abstract class  
{   
abstract void display();  
}  
public class MyClass extends Demo  
{  
    void display()      //method impelmentation  
    {  
    System.out.println("Abstract method?");  
    }  
    public static void main(String args[])  
    {  
    Demo obj = new MyClass();  
    obj.display();  
    }  
}  
``` 

  
   🔴IMPORTANT❗🔴
- An abstract class **can have zero or more abstract methods** 
- It can have regular methods also.
- Child classes which extends Abstract class is responsible for providing implementation details for abstract methods.
**- Abstract class reference variable can store objects of child classes.**


---------------------------------------

####  Factory methods

-   It is a method that **returns an object to the class to which it belongs.**
-   All static methods are factory methods.
-  For example
 ```java
  NumberFormat obj = NumberFormat.getNumberInstance();
```


####  Nested methods
- Declaration method inside another method
- Calling a method inside another another is called nested methods.

```java
public static int operation(int a, int b) {
	private static int add(int a, int b) { 
		return a+b;
	}
	private static int multiply(int a, int b) { 
		return a*b;
	}
	return add(a,b) + multiply(a,b);
}
```

```java
   
    public  void m1(){
        System.out.println("Hi am m1 method");
        m2();
    }

    public void m2() {
        System.out.println("Hi am m2method");
    }
    
```


####  Recursive methods
- A function/method calling itself is know as recursive methods
- This technique provides a way to break complicated problems down into simple problems which are easier to solve
   
   🔴IMPORTANT❗🔴
   
- In Recursion **Base condition is very important** to stop method calling itself 
- Recursion method calls **use stack memory**, for very call one record/location will be created in stack memory.

```java

public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

``` 

-----------------------------------



  
   🔴IMPORTANT❗🔴
- **Object class methods**
	- public native int **hashCode()**;
	- public boolean **equals**(java.lang.Object);
	-  public java.lang.String **toString();**
	-  protected native java.lang.Object **clone()**
	-  public final native void **notify();**
	-  public final native void **notifyAll();**
	- public final void **wait()**
	-  protected void **finalize()** throws java.lang.Throwable;
