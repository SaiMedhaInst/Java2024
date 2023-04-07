## Abstract Classes and Methods
- Data abstraction is the process of hiding certain details and showing only essential information to the user.
- The abstract keyword is a non-access modifier, used for classes and methods

 **Abstract class**: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

**Abstract method**: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

- An abstract class can have both abstract and regular methods.
- To achieve security - hide certain details and only show the important details of an object.

##### 2Ways to achieve Abstraction
There are two ways to achieve abstraction in java
- Abstract class (0 to 100%)
- Interface (100%)

### Abstract class 
- A class which is declared as abstract is known as an abstract class. 
- It can have abstract and non-abstract methods. 
- It needs to be extended and its method implemented. 
- It cannot be instantiated.
**Points to Remember**
- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.

```java

abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

Animal myObj = new Animal(); // will generate an error
```