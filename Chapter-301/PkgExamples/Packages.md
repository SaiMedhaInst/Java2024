### PACKAGES IN JAVA
- A java package is a group of similar types of classes, interfaces and sub-packages.
- Package in java can be categorized in two form, 
   - built-in package 
  - user-defined package.
- There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
- The package keyword is used to create a package in java.
#### Advantage of Java Package
1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
2) Java package provides access protection.
3) Java package removes naming collision

[![N|Solid](https://static.javatpoint.com/images/package.JPG)](https://www.java.com/en/)


```java

//save as Simple.java  
package mypack;  
public class Simple{  
 public static void main(String args[]){  
    System.out.println("Welcome to Java Packages Sessions...");  
   }  
}  

```

##### How to compile java package?

**javac -d directory javafilename**  
**javac -d . Simple.java**

To Compile: javac -d . Simple.java
To Run: java mypack.Simple

#### access package.
There are three ways to access the package from outside the package.
- import package.*;
- import package.classname;
- fully qualified name.

#### 1) Using packagename.*
- package.* then all the classes and interfaces of this package will be accessible but not subpackages.
- The import keyword is used to make the classes and interface of another package accessible to the current package.

```java
//save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}
```

```java
//save by B.java  
package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  

```



    