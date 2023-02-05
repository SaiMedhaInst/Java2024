### CLASS
- Class is a user-defined data type which defines its properties and its functions. 
- Class is the only logical representation of the data
- Class is specification or blueprint for the class
- we use **class** keyword to declare classes in java
- A class is a group of objects which have common properties.

A class in Java can contain:
-- Fields
-- Methods
-- Constructors
-- Blocks
-- Nested class and interface

```java
class <class_name>{  
    fields;  
    methods;  
}  
```

- Variables 
-- **instance variables**
        declared inside class outside method/block/constructor
        memory allocation happens at object creation
-- **class variables** 
    delcared with static keyword
    memory allocation happens during runtime 


- *In Java, a method is like a function which is used to expose the behavior of an object.and perform specific task/job*
    Advantage of Method
        ->Code Reusability
        ->Code Optimization

### OBJECT 
- Object is a run-time entity. 
- It is an instance of the class. 
- An object can represent a person, place or any other item. An object can operate on both data members and member functions. 

**An object has three characteristics:**

**State:** represents the data (value) of an object.
**Behavior:** represents the behavior (functionality) of an object such as deposit, withdraw, etc.
**Identity:** An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

ex: *For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.*

- Creation/Creating a object to a class is called **instantiation** which means to call the constructor of a class that creates an instance or object of the type of that class
-  It occupies the initial memory for the object and returns a reference.
- The new keyword is used to allocate memory at runtime. 
- All objects get memory in Heap memory area.
**syntax:**

```java

public class Pen {

    private String color;
    private float price;
    public void job(){
        System.out.println("my job is writing...");
    }
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "red";
        p.price=15.5f;
        p.job();
    }
}

```

### 3 Ways to initialize object
There are 3 ways to initialize object in Java.
- Initializing an object means storing data into the object
**1. By reference variable**
```java

class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 }  
} 
```
**2. By method**
```java
class Student{  
 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void displayInformation(){
    System.out.println(rollno+" "+name);
     }
 }  
}  
class TestStudent4{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  
```

![N|Solid](https://i.imgur.com/cBDMcjr.png)


**3. By constructor**
**Note:**
- It is not necessary to write a constructor for a class. 
- It is because java compiler creates a default constructor (constructor with no-arguments) if a class doesn’t have any.
- During instantiation  automatically default-constructor is invoked by jvm.

```java

public class Student {
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public static void main(String[] args) {
        Student s = new Student(1,"kumar");
        Student s1 = new Student(2,"Ram");
    }
}

```

### What are the different ways to create an object in Java?
There are many ways to create an object in java. They are:
- By new keyword
- By newInstance() method
- By clone() method
- By deserialization
- By factory method

### Anonymous object
- Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.
- If you have to use an object only once, an anonymous object is a good approach
```java

class Calculation{  
 void fact(int  n){  
  int fact=1;  
  for(int i=1;i<=n;i++){  
   fact=fact*i;  
  }  
 System.out.println("factorial is "+fact);  
}  
public static void main(String args[]){  
    new Calculation().fact(5);//calling method with anonymous object  
    }  
}
```




