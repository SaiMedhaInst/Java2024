### Method Overloading in Java
> If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

- Method overloading increases the readability of the program.

##### Different ways to overload the method
There are two ways to overload the method in java
- By changing number of arguments
- By changing the data type

*** *In Java, Method Overloading is not possible by changing the return type of the method only.* ***

```java
class Addition{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
static double add(double a, double b){return a+b;}  
}  
class Test{  
public static void main(String[] args){  
System.out.println(Addition.add(11,11));  
System.out.println(Addition.add(11,11,11));  
}} 

```

**In java, method overloading is not possible by changing the return type of the method only because of ambiguity**

```java
class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}}  

//Compile Time Error: method add(int,int) is already defined in class Adder
```


### Try this?
```java

class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
} 


```

### Method Overloading and Type Promotion
- One type is promoted to another implicitly if no matching datatype is found

![N|Solid](https://i.imgur.com/t75RG26.png)



```java


class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  OverloadingCalculation1 obj=new OverloadingCalculation1();  
  obj.sum(20,20);
  obj.sum(20,20,20);  
  
  }  
}  

/* *********************************************************************** */

class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);
  }  
}

/* *********************************************************************** */

class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);
  }  
}

```

**NOTE**: One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.

### Method Overriding in Java.
- If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
- Have a ability that subclass provides the specific implementation.

#### Usage
- Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
- Method overriding is used for runtime polymorphism

#### Rules
- The method must have the same name as in the parent class
- The method must have the same parameter as in the parent class.
- There must be an IS-A relationship (inheritance).
- Overriden methods always must have greater or equal scope access modifier.(never assign weaker access modifier)

```java
class Vehicle{  
  
  void run(){System.out.println("Vehicle is running");}  
}  

class Bike2 extends Vehicle{  
  
  void run(){System.out.println("Bike is running safely");}  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();  
  obj.run();
  }  
}

```


```java

class Bank{  
int getRateOfInterest(){return 0;}  
}  
 
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  

class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  

```

##### Try this?
- Can we override static method?
- Can we override java main method?


### Covariant Return Type
> The covariant return type specifies that the return type may vary in the same direction as the subclass.

- Before Java5, it was not possible to override any method by changing the return type. 
- But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type.

```java
class A{    
A get(){return this;}    
}    
    
class B1 extends A{    
@Override  
B1 get(){return this;}    
void message(){System.out.println("welcome to covariant return type");}    
    
public static void main(String args[]){    
new B1().get().message();    
}    
}  

//As you can see in the above example, the return type of the get() method of A class is A 
//but the return type of the get() method of B class is B. Both methods have different return type but it is method overriding.
```

##### Advantages of Covariant Return Type
1) Covariant return type  makes the code more usable, readable, and maintainable.
2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.
3) Covariant return type helps in preventing the run-time ClassCastExceptions on returns.


### Super Keyword in Java
> The super keyword in Java is a reference variable which is used to refer immediate parent class object.
- Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

##### Usage
- super can be used to refer immediate parent class instance variable.
- super can be used to invoke immediate parent class method.
- super() can be used to invoke immediate parent class constructor.

###### 1) super is used to refer immediate parent class instance variable.
- We can use super keyword to access the data member or field of parent class. 
- It is used if parent class and child class have same fields.

```java

class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}
```

###### 2) super can be used to invoke parent class method.
- The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

```java
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
    super.eat();  
    bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}} 

```

super is used to invoke parent class constructor.

##### 3) super is used to invoke parent class constructor.
- The super keyword can also be used to invoke the parent class constructor.

```java
class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
super();  
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
Dog d=new Dog();  
}} 
```
**Note: super() is added in each class constructor automatically by compiler if there is no super() or this().**

![N|Solid](https://i.imgur.com/IL1ZacW.png)

```java

class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
System.out.println("dog is created");  
}  
}  
class TestSuper4{  
public static void main(String args[]){  
Dog d=new Dog();  
}

```

```java

class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Person{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp e1=new Emp(1,"ankit",45000f);  
e1.display();  
}}

```

#### Instance initializer block

> Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.

There are three places in java where you can perform operations:
- method
- constructor
- block

**Why use instance initializer block?**

Suppose we have to perform some operations while assigning value to instance data member e.g. a for loop to fill a complex array or error handling etc.

```java
class Bike{  
    int speed;  
      
    Bike(){System.out.println("speed is "+speed);}  
   
    {speed=100;}  
       
    public static void main(String args[]){  
    Bike b1=new Bike();  
    Bike b2=new Bike();  
    }      
}
```

**which one is invoked first, instance initializer block or constructor?**

```java

class Bike8{  
    int speed;  
      
    Bike8(){System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  
       
    public static void main(String args[]){  
    Bike8 b1=new Bike8();  
    Bike8 b2=new Bike8();  
    }      
}
```

**NOTE:  The java compiler copies the code of instance initializer block in every constructor.**

![N|Solid](https://i.imgur.com/PQ8YTSk.png)

#### Rules for instance initializer block :
- There are mainly three rules for the instance initializer block. They are as follows:
- The instance initializer block is created when instance of the class is created.
- The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
- The instance initializer block comes in the order in which they appear.

```java

class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
class B2 extends A{  
B2(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
B2 b=new B2();  
}  
}

```

#### Try these ?
```java

class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
  
class B3 extends A{  
B3(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
B3(int a){  
super();  
System.out.println("child class constructor invoked "+a);  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
B3 b1=new B3();  
B3 b2=new B3(10);  
}  
}  

```

#### Final Keyword In Java

>The final keyword in java is used to restrict the user. 
- The java final keyword can be used in many context. Final can be:
    - variable
    - method
    - class
- Types 
    - static final variable 
    - instance final variable.

**1) Java final variable**
- If we make any variable as final, you cannot change the value of final variable(It will be constant).

```java
class Bike9{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}//end of class  
```

**2) Java final method**
> If we make any method as final, we cannot override it.

```java

class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  
```java
** 3) Java final class**
> If you make any class  as final, you cannot extend it.
```java
final class Bike{}  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
} 
```

##### Try these 
- Is final method inherited?
- Can we initialize blank final variable?
- Can we declare a constructor final?
- Can we have static blank final variable?

