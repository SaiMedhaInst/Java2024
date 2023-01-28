## Access Modifiers in Java
- There are two types of modifiers in Java: 
-   access modifiers 
-   non-access modifiers.
- Specifies the accessibility 
    - scope of a field, method, constructor, or class. 
    - We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

**There are four types of Java access modifiers:**

**Private**: 
            - The access level is only within the class. 
            - It cannot be accessed from outside the class.

**Default**: 
    - The access level  is only within the package. 
    - cannot be accessed from outside the package. 
    - If you do not specify any access level, it will be the default.

**Protected:** 
    - The access level is within the package and outside the package through child class. 
    - If you do not make the child class, it cannot be accessed from outside the package.

**Public:** 
    - The access level is everywhere. 
    - It can be accessed from within the class, outside the class, within the package and outside the package.

![N|Solid](https://i.imgur.com/q8n9x5d.png)


### 1) Private

```java

class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
  
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}


class A{  
private A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}  

```

`NOTE: A class cannot be private or protected except nested class.`

#### 2) Default

```java

/save by A.java  
package pack;  
class A{  
  void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
import pack.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  

```

### 3) Protected

- The protected access modifier is accessible within package and outside the package but through inheritance only.
- The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
- It provides more accessibility than the default modifer
- 
```java

//save by A.java  
package pack;  
public class A{  
protected void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
import pack.*;  
  
class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }  
}

```

### 4) Public.
- The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
```java

package pack;  
public class A{  
public void msg(){System.out.println("Hello");}  
} 

package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  


```


