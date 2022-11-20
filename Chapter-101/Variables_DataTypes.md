- Its default value is 0.
- Instance variables can be accessed only by creating objects.

```java
import java.io.*;
class A {
	public String name; // Declared Instance Variable
	public A()
	{ // Default Constructor
		this.name = "Kumar Y"; // initializing Instance Variable
	}
	public static void main(String[] args)
	{

		// Object Creation
		A name = new A();
		System.out.println("Geek name is: " + name.geek);
	}
}
```

##### Static Variables
> Static variables are also known as class variables. 

- These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
- Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
- Static variables are created at the start of program execution and destroyed automatically when execution ends.
- `Initialization of a static variable is not mandatory. Its default value is 0.`
If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.

```java
import java.io.*;
class A {

public static String name = "Kumar Y";		 //Declared static variable
	public static void main (String[] args) {
		System.out.println(" Name is : "+A.geek);
	}
}
```
