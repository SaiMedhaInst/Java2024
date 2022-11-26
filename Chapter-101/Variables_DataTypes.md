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
		A a = new A();
		System.out.println("Geek name is: " + a.name);
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
		System.out.println(" Name is : "+A.name);
	}
}
```



## Date Types.
[![N|Solid](https://i.imgur.com/uvaumpE.png)](https://www.java.com/en/)

- Defines the types of data to hold in variables.
- Data types are divided into two groups:

    Primitive data types - includes `byte, short, int, long, float, double, boolean and char`
    Non-primitive data types - such as `String, Arrays and Classes`
    
    `
    By default all precious or fractional numbers are double in JAVA`

     Use float or double?`
    
    - The precision of a floating point value indicates how many digits the value can have after the decimal point. 
    The precision of float is only six or seven decimal digits, 
    while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
    
    ```java
    byte myNum = 100;
    System.out.println(myNum);
    
    short myNum = 5000;
    System.out.println(myNum);
    
    int myNum = 100000;
    System.out.println(myNum);
    
    long myNum = 15000000000L;
    System.out.println(myNum);
    
    float myNum = 5.75f;
    System.out.println(myNum);
    
    double myNum = 19.99d;
    System.out.println(myNum);
    
    float f1 = 35e3f;
    double d1 = 12E4d; //e" to indicate the power of 10:
    System.out.println(f1);
    System.out.println(d1);
    
    boolean isStudent = true;
    boolean isPrime = false;
    System.out.println(isStudent);     // Outputs true
    System.out.println(isPrime);  
    
    //Java has a boolean data type, which can only take the values true or false:
    
    //chars
    
    char myGrade = 'B';
    System.out.println(myGrade);
    
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);
    
    //STRINGS
    
    String greeting = "Hello World";
    System.out.println(greeting);
    
    ```

#### The main difference between primitive and non-primitive data types:

- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
- A primitive type has always a value, while non-primitive types can be null.
- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
- The size of a primitive type depends on the data type, while non-primitive types have all the same size.


## Java Type Casting
    > Type casting is when you assign a value of one primitive data type to another type.
    
In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
      `byte -> short -> char -> int -> long -> float -> double`

Narrowing Casting (manually) - converting a larger type to a smaller size type
    `double -> float -> long -> int -> char -> short -> byte`

```java
//Widening Casting

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    //Narrowing Casting
    
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
```


## Operators 
    >An operator, in computer programing, is a symbol that usually represents an action or process.
    
Operators are used to perform operations on variables and values.
    ex:     
    In the example below, we use the + operator to add together two values:
    `int x = 100 + 50;`
    
```java
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)
```

##### Java divides the operators into the following groups:

        1.Arithmetic operators
        2.Assignment operators
        3.Comparison operators
        4.Logical operators
        5.Bitwise operators
        
#### 1.Arithmetic operators

>Arithmetic operators are used to perform common mathematical operations.

[![N|Solid](https://i.imgur.com/dcvy8LE.png)](https://www.java.com/en/)

#### 2.Java Assignment Operators
>Assignment operators are used to assign values to variables.
[![N|Solid](https://i.imgur.com/Dx4ZPjL.png)](https://www.java.com/en/)

#### 3.Java Comparison Operators
>Comparison operators are used to compare two values.
The return value of a comparison is either true or false

```java
int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3
```

[![N|Solid](https://i.imgur.com/713pm23.png)](https://www.java.com/en/)

#### 4.Java Logical Operators
>You can also test for true or false values with logical operators.
Logical operators are used to determine the logic between variables or values:
Combine more than one conditions.
[![N|Solid](https://i.imgur.com/xOyHxk3.png)](https://www.java.com/en/)

#### 5.Bitwise Operators.
>Bitwise operators are used to performing the manipulation of individual bits of a number. They can be used with any integral type (char, short, int, etc.). They are used when performing update and query operations of the Binary indexed trees. 

###### 1. Bitwise OR (|) 
`This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0. `
```java
a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise OR Operation of 5 and 7
  0101
| 0111
 ________
  0111  = 7 (In decimal) 
  ```
###### 2. Bitwise AND (&)
`This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0. `

```java
a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise AND Operation of 5 and 7
  0101
& 0111
 ________
  0101  = 5 (In decimal)
```
###### 3. Bitwise XOR (^) 
`Binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0.` 

```java
a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise XOR Operation of 5 and 7
  0101
^ 0111
 ________
  0010  = 2 (In decimal) 
  ```
###### 4. Bitwise Complement (~)
`Unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.`
```java
a = 5 = 0101 (In Binary)

Bitwise Complement Operation of 5

~ 0101
 ________
  1010  = 10 (In decimal) 
  
  Note: Compiler will give 2’s complement of that number, i.e., 2’s complement of 10 will be -6.
  
    // bitwise not
     int a = 5;
    // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
    // will give 2's complement (32 bit) of 5 = -6
    System.out.println("~a = " + ~a);
```

#### 6.Ternary Operator
>Java ternary operator is the only conditional operator that takes three operands. It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming

[![N|Solid](https://media.geeksforgeeks.org/wp-content/uploads/20191122171059/Conditional-or-Ternary-Operator-__-in-Java.jpg)](https://www.java.com/en/)

```java
Syntax: 
variable = Expression1 ? Expression2: Expression3

if(Expression1)
{
    variable = Expression2;
}
else
{
    variable = Expression3;
}
```

```java
num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

/*
Since num1<num2, 
the second operation is performed
res = num1-num2 = -10 
*/

```

#### 7.Shift Operator in Java
>By shifting the bits of its first operand right or left, a shift operator performs bit manipulation on data
[![N|Solid](https://i.imgur.com/WoM0H4W.png)](https://www.java.com/en/)

###### 1. Signed Left Shift
This operator is represented by a symbol <<, read as double less than.
`formula: n*2^bits`
    ex: 2*2^2 = 8
```java
        int number = 2;
        // 2 bit left shift operation
        int Ans = number << 2;
        System.out.println(Ans);
```
###### 2.Signed Right Shift 
>The Right Shift Operator moves the bits of a number in a given number of places to the right. 

The >> sign represents the right shift operator, which is understood as double greater than
`formula: n/2^bits`
```java
        int number = 8;
        // 2 bit signed right shift
        int Ans = number >> 2;
        System.out.println(Ans); 
```
###### 3. Unsigned Right Shift 
> Unsigned Right Shift Operator moves the bits of the integer a given number of places to the right. 

The sign bit was filled with 0s. 
The Bitwise Zero Fill Right Shift Operator is represented by the symbol >>>.
```java
        byte num1 = 8;
        byte num2 = -8;
      
        System.out.println(num1 >>> 2);    //2
        System.out.println(num2 >>> 2);   //1073741822
        
```
## Java Operator Precedence
>The operator precedence represents how two expressions are bind together. In an expression, it determines the grouping of operators with operands and decides how an expression will evaluate.

While solving an expression two things must be kept in mind the first is a precedence and the second is associativity.

- Precedence is the priority for grouping different types of operators with their operands. 
- It is meaningful only if an expression has more than one operator with higher or lower precedence. 
- The operators having higher precedence are evaluated first
- We must follow associativity if an expression has more than two operators of the same precedence. In such a case, an expression can be solved either left-to-right or right-to-left

[![N|Solid](https://i.imgur.com/wTEZGQQ.png)](https://www.java.com/en/)
[![N|Solid](https://i.imgur.com/DRcDAJa.png)](https://www.java.com/en/)

```java
int exp = 1 + 5 * 3 ;
sop(exp);

You might be thinking that the answer would be 18 but not so. 
Because the multiplication (*) operator has higher precedence than the addition (+) operator. Hence, the expression first evaluates 5*3 and then evaluates the remaining expression i.e. 1+15. Therefore, the answer will be 16.

int exp2 = x + y * z / k;
In the above expression, * and / operations are performed before + because of precedence. y is multiplied by z before it is divided by k because of associativity. .; 

```

```java
    	int a = 10, b = 5, c = 1, result;
    	result = a-++c-++b;
    	
    	System.out.println(result);
    	
```

    
    
    
## License

MIT

**Anil K Rajamoni!**



