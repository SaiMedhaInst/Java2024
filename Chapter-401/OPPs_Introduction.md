#### OOPs INTRODUCTION

**The programming paradigm where everything is represented as an object is known as a truly object-oriented programming language.**

> The main aim of object-oriented programming is to implement real-world entities, for example, object, classes, abstraction, inheritance, polymorphism, etc.

- Simula is considered the first object-oriented programming language. 
- Smalltalk is considered the first truly object-oriented programming language.
- The popular object-oriented languages are Java, C#, PHP, Python, C++, etc.


> Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. 



![N|Solid](https://i.imgur.com/mfCgUeM.png)
    
- It simplifies software development and maintenance by providing some concepts
        - Object
        - Class
        - Inheritance
        - Polymorphism
        - Abstraction
        - Encapsulation
 - Apart from these concepts, there are some other terms which are used in Object-Oriented design:
    - Coupling ,Cohesion, Composition
    - Association . Aggregation.

### WHY OOPs?
1) OOP provides a clear modular structure for programs
2) OOP makes it easy to maintain and modify existing code
3) OOP provides a good framework for code libraries where supplied software components can be easily adapted and modified by the programmer.
4)Code Resusablity
5)It is suitable for realword problems and real world works

**Class**
- Class is a user-defined data type which defines its properties and its functions. 
- Class is the only logical representation of the data.
- Collection of objects is called class. It is a logical entity.
- Class is considered as blueprint of object , it defines specification of object.
- For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. 
- The class does not occupy any memory space till the time an object is instantiated. 
- To Declare a class in JAVA we use **class** keyword

**Object**:
-  A real-world entity such as a pen, chair, table, computer, watch, etc. 
- Object is a run-time entity. 
- It is an instance of the class. 
- An object can represent a person, place or any other item.
- An object can operate on both data members and member functions. 
- Object is created/instantiated using new operator with class-name
-ex: **ClassName objName = new ClassName()**

![N|Solid](https://i.imgur.com/Tu9rbt6.png)

**Note :
When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.**

#### this keyword
-  ‘this’ keyword in Java that refers to the current instance of the class. 
-  In OOPS it is used to: 
        - pass the current object as a parameter to another method 
        - refer to the current class instance variable

#### INHERITANCE
- It's a process of inheriting properties from one class to another class 
- When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
- It provides code reusability. 
- It is used to achieve runtime polymorphism.

![N|Solid](https://miro.medium.com/max/1067/1*Aylp8PfhkHlUyv3Di_yRsw.png)

### POLYMORPHISM

![N|Solid](https://www.sitesbay.com/java/images/real-life-example-of-polymorphism2.png)

- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
- The word “poly” means many and “morphs” means forms, So it means many forms.
- If one task is performed in different ways, it is known as polymorphism. 
- In Java, we use method overloading and method overriding to achieve polymorphism.
- A person at the same time can have different characteristics.
-   Like a man at the same time is a father, a husband, an employee. So the same person possesses different behavior in different situations. This is called polymorphism. 
- In Java polymorphism is mainly divided into two types: 
        Compile-time Polymorphism
        Runtime Polymorphism


### ABSTRACTION
- Hiding internal details and showing functionality is known as abstraction. 
- For example phone call, we don't know the internal processing.
- In Java, we use abstract class and interface to achieve abstraction.


![N|Solid](https://www.codesdope.com/pa-images-bucket/courses/java/p29.png)

### ENCAPSULATION
*Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.*

A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.

![N|Solid](https://www.scientecheasy.com/wp-content/uploads/2018/06/encapsulation-in-java.png)

### COUPLING
- Coupling refers to the knowledge or information or dependency of another class. 
- Coupling is nothing but the dependency of one class on the other. If one object in a code uses the other object in the program
- In Java, we use private, protected, and public modifiers to display the visibility level of a class, method, and field. 
- You can use interfaces for the weaker coupling because there is no concrete implementation.

### COHESION
- Cohesion in Java is the Object-Oriented principle most closely associated with making sure that a class is designed with a single, well-focused purpose.
- Cohesion refers to the level of a component which performs a single well-defined task. A single well-defined task is done by a highly cohesive method. 
- The weakly cohesive method will split the task into separate parts. 
- The java.io package is a highly cohesive package because it has I/O related classes and interface.
- However, the java.util package is a weakly cohesive package because it has unrelated classes and interfaces.
- 
### ASSOCIATION

Association represents the relationship between the objects. Here, one object can be associated with one object or many objects. There can be four types of association between the objects:
    - One to One
    - One to Many
    - Many to One
    - Many to Many

![N|Solid](https://www.scientecheasy.com/wp-content/uploads/2021/03/java-association-example.png)

**examples**:  For example, One country can have one prime minister (one to one), and a prime minister can have many ministers (one to many). Also, many MP's can have one prime minister (many to one), and many ministers can have many departments (many to many).

### AGGREGATION
- Aggregation is a way to achieve Association. 
- Aggregation represents the relationship where one object contains other objects as a part of its state. 
- It represents the weak relationship between objects. 
- It is also termed as a has-a relationship in Java. 
- Like, inheritance represents the is-a relationship. It is another way to reuse objects.
- 

### COMPOSITION
- The composition is also a way to achieve Association. 
- The composition represents the relationship where one object contains other objects as a part of its state. 
- There is a strong relationship between the containing object and the dependent object. 
- It is the state where containing objects do not have an independent existence. If you delete the parent object, all the child objects will be deleted automatically.

![N|Solid](https://javagoal.com/wp-content/uploads/2020/04/12-1.png)


## OOPs VS PROCEDURE-ORIENTED 
- OOPs makes development and maintenance easier, whereas, in a procedure-oriented programming language, it is not easy to manage if code grows as project size increases.
- OOPs provides data hiding, whereas, in a procedure-oriented programming language, global data can be accessed from anywhere.
- OOPs provides the ability to simulate real-world event much more effectively. We can provide the solution of real word problems.

