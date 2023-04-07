## Polymorphism in Java

> Polymorphism in Java is a concept by which we can perform a single action in different ways. 
- Polymorphism is derived from 2 Greek words: poly and morphs. 
- The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

- There are two types of polymorphism in Java: 
    - compile-time polymorphism 
    - runtime polymorphism. 
    - We can perform polymorphism in java by method overloading and method overriding.

##### Runtime Polymorphism in Java.
- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

- In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.


![N|Solid](https://i.imgur.com/OL8UchJ.png)

**For upcasting, we can use the reference variable of class type or an interface type.**

```java
class A{}  
class B extends A{}  
A a=new B();//upcasting  


interface I{}  
class A{}  
class B extends A implements I{}  

I i = new B()
```


```java
class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
} 
```

```java

class Bank{  
float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends Bank{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends Bank{  
float getRateOfInterest(){return 9.7f;}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Bank b;  
b=new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new AXIS();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
} 

```

**Java Runtime Polymorphism with Data Member**
- Runtime polymorphism can't be achieved by data members.

```java

class Bike{  
 int speedlimit=90;  
}  
class Honda3 extends Bike{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println(obj.speedlimit);//90  
}  

```

**Java Runtime Polymorphism with Multilevel Inheritance**
```java
class Animal{  
void eat(){System.out.println("eating");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating fruits");}  
}  
class BabyDog extends Dog{  
void eat(){System.out.println("drinking milk");}  
public static void main(String args[]){  
Animal a1,a2,a3;  
a1=new Animal();  
a2=new Dog();  
a3=new BabyDog();  
a1.eat();  
a2.eat();  
a3.eat();  
}  
} 

```

### Static Binding and Dynamic Binding
> Connecting a method call to the method body is known as binding.

There are two types of binding
- Static Binding (also known as Early Binding).
        - type of object is determined at compile time 
- Dynamic Binding (also known as Late Binding).
        - type of object is determined at run-time 


##### static binding
- When type of the object is determined at compiled time(by the compiler), it is known as static binding.
- If there is any private, final or static method in a class, there is static binding.
```java
class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog d1=new Dog();  
  d1.eat();  
 }  
} 
```
##### dynamic binding
- When type of the object is determined at run-time, it is known as dynamic binding.
```java
class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
} 

```

#### JAVA INSTANCEOF
- The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
- The instanceof in java is also known as type comparison operator because it compares the instance with type. 
- It returns either true or false. 
- If we apply the instanceof operator with any variable that has null value, it returns false.

```java
class Simple{  
 public static void main(String args[]){  
 Simple s=new Simple();  
 System.out.println(s instanceof Simple);//true  
 }  
} 
```

```java
class Animal{}  
class Dog extends Animal{//Dog inherits Animal  
  
 public static void main(String args[]){  
 Dog d=new Dog();  
 System.out.println(d instanceof Animal);//true  
 }  
} 

class Dog2{  
 public static void main(String args[]){  
  Dog2 d=null;  
  System.out.println(d instanceof Dog2);//false  
 }  
}  
```

**An object of subclass type is also a type of parent class. For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.**

#### Downcasting with java instanceof operator.
- When Subclass type refers to the object of Parent class, it is known as downcasting. 
- If we perform it directly, compiler gives Compilation error. 
- If you perform it by typecasting, ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible
```java
Dog d=new Animal();//Compilation error  

Dog d=(Dog)new Animal();  
//Compiles successfully but ClassCastException is thrown at runtime  

```

**Possibility of downcasting with instanceof**

```java
class Animal { }  
class Dog3 extends Animal {  
  static void method(Animal a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
  public static void main (String [] args) {  
    Animal a  = new Dog3();  
    Animal a1 = new Animal();
    Dog3 dog3 = new Dog3();

    // Dog3 dog32 = (Dog3)new Animal();

    System.out.println(a instanceof Animal);
    System.out.println(a instanceof Dog3);
    System.out.println(a1 instanceof Animal);
    System.out.println(a1 instanceof Dog3);
    System.out.println(dog3 instanceof Dog3);
    System.out.println(dog3 instanceof Animal);

    Dog3.method(a);  
  }  
 }

```




