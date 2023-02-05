## CONSTRUCTORS in JAVA
- constructors in Java is a terminology used to construct something in our programs.
- A constructor in Java is a special method that is used to initialize objects. 
- The constructor is called when an object of a class is created. 
- It can be used to set initial values for object attributes. 
- In Java, a constructor is a block of codes similar to the method. 
- It is called when an instance of the class is created. 
- At the time of calling the constructor, memory for the object is allocated in the memory. 
- Every time an object is created using the new() keyword, at least one constructor is called.
- By default JVM will invoke default constructor( which has empty body) when class doesn't have any constructors declared.
- 
***Note: It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor (constructor with no-arguments) if your class doesn’t have any.***

##### How Constructors are Different From Methods in Java? 
- Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
- Constructors do not return any type while method(s) have the return type or void if does not return any value.
- Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

```java

import java.io.*;

class Student {
	Student() { super(); }
	public static void main(String[] args)
	{
		Student geek = new Student();
	}
}

```

- The first line of a constructor is a call to super() or this(), (a call to a constructor of a super-class or an overloaded constructor),
-  every class in java is the subclass of a class object even if we don’t say extends object in our class definition.
-  

#### When Constructor is called? 
- Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class. 

- Rules for writing constructors are as follows:
- 1.The constructor(s) of a class must have the same name as the class name in which it resides.
- 2.A constructor in Java can not be abstract, final, static, or Synchronized.
- 3.Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

### Types of Constructors in Java

### No-argument constructor
- A constructor that has no parameter is known as the No-argument or Zero argument constructor. 
- If we don’t define a constructor in a class, then the compiler creates a constructor(with no arguments and empty body) for the class. 
- And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor. 

```java

class Student {
    int rollno;
    String name;
    public Student(){
        System.out.println("No-Args Constructor called"); 
    }
}
public class Main{
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.rollno);
        System.out.println(s.name);
    }
}

```


### Parameterized Constructor
- A constructor that has parameters is known as parameterized constructor. 
- If we want to initialize fields of the class with our own values, then use a parameterized constructor.
```java

class Student {
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){
        Student s = new Student(1,"kumar");
        Student s1 = new Student(2,"Ram");
    }
}

```

**NOTE**
**Does constructor return any value?**
>There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.

### Default Constructor

- A constructor that has no parameters and no body is known as default the constructor. 
- A default constructor is invisible. 
- And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor. It is taken out. 
- It is being overloaded and called a parameterized constructor. - The default constructor changed into the parameterized constructor. But Parameterized constructor can’t change the default constructor.

```java

import java.io.*;
class Simple {
	Simple {  }
	public static void main(String[] args)
	{

		GFG hello = new GFG();
	}
}

```

### CONSTRUCTOR OVERLOADING
- Constructor overloading refers to the use of more than one constructor in an instance class.
- Each overloaded constructor must have different signatures

```java

import java.io.*;

class Simple {

	Simple(String name)
	{
		System.out.println("Constructor with one "	+ "argument - String : " + name);
	}

	// constructor with two arguments
	Simple(String name, int age)
	{
		System.out.println(	"Constructor with two arguments : "
			+ " String and Integer : " + name + " " + age);
	}

	// Constructor with one argument but with different
	// type than previous..
	Simple(long id)
	{
		System.out.println(	"Constructor with one argument : "
			+ "Long : " + id);
	}
}

class Test {
	public static void main(String[] args)
	{
		Simple s1 = new Simple("Kumar");
		Simple s2 = new Simple("Avan", 26);
		Simple s3 = new Simple(325614567);
	}
}



```

