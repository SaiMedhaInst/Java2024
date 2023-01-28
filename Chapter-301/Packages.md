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

#### 2) Using packagename.classname
- when we use import package.classname then only declared class of this package will be accessible.

```java
//save by A.java  
  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}

//save by B.java  
package mypack;  
import pack.A;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  

```

#### 3) Using fully qualified name
- when we  use fully qualified name then only declared class of this package will be accessible. - Now there is no need to import. 
- Butwe need to use fully qualified name every time when you are accessing the class or interface.

**It is generally used when two packages have same class name**
    e.g. java.util and 
    java.sql packages 
    contain Date class.
    
```java
//save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
} 

//save by B.java  
package mypack;  
class B{  
  public static void main(String args[]){  
   pack.A obj = new pack.A();//using fully qualified name  
   obj.msg();  
  }  
}


```

`Note: If you import a package, subpackages will not be imported.`

### Subpackage in java
- Package inside the package is called the subpackage. It should be created to categorize the package further.
- Suppose, Sun Microsystem has definded a package named java that contains many classes like System, String, Reader, Writer, Socket etc. 
- These classes represent a particular group e.g. Reader and Writer classes are for Input/Output operation, Socket and ServerSocket classes are for networking etc and so on. 
- So, Sun has subcategorized the java package into subpackages such as lang, net, io etc. and put the Input/Output related classes in io package, Server and ServerSocket classes in net packages and so on.

**note:** 
The standard of defining package is domain.company.package 
e.g. com.saimedha.ecet
    com.saiemdha.gate
    com.saimedha.govt
    
    
```java
package com.javatpoint.core;  
class Simple{  
  public static void main(String args[]){  
   System.out.println("Hello subpackage");  
  }  
} 
```

#### Ways to load the class files or jar files?
- There are two ways to load the class files temporary and permanent.
- **Temporary**
        - By setting the classpath in the command prompt
        - By -classpath switch
- **Permanent**
    - By setting the classpath in the environment variables
    - By creating the jar file, that contains all the class files, and copying the jar file in the jre/lib/ext folder.


### What is Classpath?
- Java Virtual Machine(JVM) uses classpath to locate the class files to execute the code.
- If  classpath is not set and the class file is not present in the same directory as your java file, then JVM will be unable to find the required class file, and it will throw an error (java.lang.ClassNotFoundException).

##### Ways to Set a Classpath 
There are five different ways to set a classpath. These are:
-cp
-classpath
–classpath
Temporary settings by using the ‘set classpath’ command
Permanent settings using environment variable window

**Command Line Settings –** 

- >java -cp <directory_location> <class name>
- >java -classpath <directory_location> <class name>
- >java --class-path <directory_location> <class name>

- If we want to access classpath for all command lines, we must set the classpath command option.
The limitation of the “set classpath” command option is the classpath settings are available only for the current command prompt
- >set classpath=<directory_location>

**Permanent Settings:**
- Firstly, Right Click on “This PC”.
- Click Properties.
- Click “Advanced System Settings”.
- Click “Environment Variables”.
- In the “User Variable Section”, click the “New” button.
- Enter Variable name :classpath [Don’t give space between class path] Variable value:<directory_location>(for example in my F:\workspace\bin)
- Click OK->OK->OK.
- Close all windows, open a new command prompt, and run the java command.