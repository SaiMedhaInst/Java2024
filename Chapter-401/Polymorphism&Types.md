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

- 
