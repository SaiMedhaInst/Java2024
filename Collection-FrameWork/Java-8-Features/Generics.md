# Generic 

### introduction

- Generics means **parameterized types**. 
- The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. 
- Using Generics, it is possible to create classes that work with different data types. 

- An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

![](https://i.imgur.com/mnU9o0P.png)

### Why Generics?

- The Object is the superclass of all other classes, and Object reference can refer to any object. 
- These features lack type safety. 
- Java is Strongly typed language.
- Generics add that type of safety feature. 

Generics in Java are similar to templates in C++. 

```
For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well. 
There are some fundamental differences between the two approaches to generic types. 
```

### Without Generic

![](https://i.imgur.com/OTCeDcH.png)

### Solution

![](https://i.imgur.com/OewltUI.png)
-----------------------------------------------------------------------------------------
### Observations

- Generics only accepts Wrapper Classes Types not primitives types.

- Before Java 5 , it is explicit(manual)
    - Boxing : primitive --> Wrapper
    - UnBoxing : Wrapper --> Primitive 
  
  
  
- With Generic introduction in java 5 , 
    - Auto Boxing , Auto UnBoxing is implicit. (automatic)


![](https://i.imgur.com/Pc72V7d.png)
----------------------------------------------------------------------------------------
### Type Erasure


- Bridge methods are the methods created by JVM automatically at runtime 
    ex: Default No Args Constructor in In Every User Defined Class. 

![](https://i.imgur.com/i8byUM4.png)

![](https://i.imgur.com/43G7cy4.png)

### Examples

- Parameter Type is bound to the only the expression 
   ``` java
    List<Integer> nums = new ArrayList<Integer>();
    ```
    
- Type Information and safety check is not applied for the instance/object when passed to Different method.

![](https://i.imgur.com/6tmSyjX.png)
![](https://i.imgur.com/7P8dDGT.png)


## Use - Case

![](https://i.imgur.com/bhdozhW.png)

![](https://i.imgur.com/kpc2WjP.png)

![](https://i.imgur.com/rZMk1XR.png)
