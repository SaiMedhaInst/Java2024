# What is Variable.?

[![N|Solid](https://www.stechies.com/userfiles/images/varaible-integer.jpg)](https://www.java.com/en/)

Variables are containers for storing data values.

In Java, there are different types of variables, for example:

`String` - stores text, such as "Hello". String values are surrounded by double quotes
`int` - stores integers (whole numbers), without decimals, such as 123 or -123
`float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
`char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
`boolean` - stores values with two states: true or false

To create a variable, you must specify the type and assign it a value:
```
type variableName = value;
```

```java
String name = "John";
System.out.println(name);
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```
`Final Variable`
If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

#### Rules to Declare a Variable 

- A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
- The first character must not be a digit.
- Blank spaces cannot be used in variable names.
- Java keywords cannot be used as variable names.
- Variable names are case-sensitive.
- There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
- Variable names always should exist on the left-hand side of assignment operators.

valid variables:
      ```  myvar
        myVar
        MYVAR
        _myVar
        $myVar
        myVar1
        myVar_1
        ```
        
## Keywords?

[![N|Solid](https://data-flair.training/blogs/wp-content/uploads/sites/2/2018/05/java-keywords.webp)](https://www.java.com/en/)
`assert`	For debugging

`strictfp`	Restrict the precision and rounding of floating point calculations

`super`	Refers to superclass (parent) objects

`synchronized`	A non-access modifier, which specifies that methods can only be accessed by one thread at a time

`this`	Refers to the current object in a method or constructor

`throw`	Creates a custom error

`throws`	Indicates what exceptions may be thrown by a method

`transient`	A non-accesss modifier, which specifies that an attribute is not part of an object's persistent state

`volatile`	Indicates that an attribute is not cached thread-locally, and is always read from the "main memory"

`final`	A non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override)

`finally`	Used with exceptions, a block of code that will be executed no matter if there is an exception or not

`implements`	Implements an interface

`void`	Specifies that a method should not have a return value

`Note: true, false, and null are not keywords, but they are literals and reserved words that cannot be used as identifiers.`

### Types of Variables
###### Local Variables
- These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
- The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
- Initialization of the local variable is mandatory before using it in the defined scope.

```java
import java.io.*;

class Variable {
	public static void main(String[] args)
	{
		int var = 10; // Declared a Local Variable
		// This variable is local to this main method only
		System.out.println("Local Variable: " + var);
	}
}

```
###### Instance Variables.
>Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 
- As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
- Unlike local variables, we may use access specifiers for instance variables.
- If we do not specify any access specifier, then the default access specifier will be used.
- Initialization of an instance variable is not mandatory. 
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

