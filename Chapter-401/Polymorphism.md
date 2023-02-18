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

##### Try this?
- Can we override static method?
- Can we override java main method?