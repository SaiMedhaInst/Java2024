## Arrays in Java

[![N|Solid](https://simplesnippets.tech/wp-content/uploads/2018/04/java-arrays-diagram.jpg)](https://www.java.com/en/)


- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
- To declare an array, define the variable type with square brackets:
- In Java, all arrays are dynamically allocated. 
- Arrays are stored in contagious memory [consecutive memory locations].
- Java array can also be used as a static field, a local variable, or a method parameter.
- The size of an array must be specified by int or short value and not long.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces Cloneable and java.io.Serializable. 
- The size of the array cannot be altered(once initialized).  However, an array reference can be made to point to another array.

#### Note
- An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array. 
- In the case of primitive data types, the actual values are stored in contiguous memory locations. In the case of class objects, the actual objects are stored in a heap segment. 

### Creating, initializing, and accessing an Array

##### One-Dimensional Arrays: 

- An array declaration has two components: the type and the name
- type declares the element type of the array

##### Declaration

```java
type var-name[];
OR
type[] var-name;


// both are valid declarations
int intArray[]; 
or int[] intArray; 

byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type
```

##### Instantiating
- When an array is declared, only a reference of an array is created. 
- To create or give memory to the array, you create an array like this: 
- The general form of new as it applies to one-dimensional arrays 

```java
var-name = new type [size];

int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array

int[] intArray = new int[20]; // combining both statements in one

```

 - type specifies the type of data being allocated
 - size determines the number of elements in the array, 
 - var-name is the name of the array variable that is linked to the array. 
 - To use new to allocate an array, you must specify the type and number of elements to allocate.
- The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types)

##### Array Literal

> In a situation where the size of the array and variables of the array are already known, array literals can be used. 

- The length of this array determines the length of the created array.
- There is no need to write the new int[] part in the latest versions of Java.

```java

 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal
 
 // in latest versions of java
 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 
 ```
 
 
#### Accessing elements of a Array.
 - Each element in the array is accessed via its index. 
 - The index begins with 0 and ends at (total array size)-1
 -  JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of an array.
 ```java
 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// change the element 
cars[0] = "Opel";
System.out.println(cars[0]);

//length
System.out.println(cars.length);

System.out.println(cars[2]);
System.out.println(cars[5]);


```




```


## License

MIT

**Anil K Rajamoni!**

