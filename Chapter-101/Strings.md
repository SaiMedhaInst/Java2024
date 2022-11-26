# Strings In Java.?
[![N|Solid](https://qavalidation.com/wp-content/uploads/2018/06/java-Strings-and-methods-1614x807.png)](https://www.java.com/en/)

- Strings are used for storing text.
- Non Primitive DataType.
- Stores group of characters 
- A String variable contains a collection of characters surrounded by double quotes:
- In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string

```java 
String greeting = "Hello";

char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);  
```
`Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object`

There are two ways to create String object:
##### By string literal
```java
String s="welcome";  

/* Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
*/


String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  
```

[![N|Solid](https://static.javatpoint.com/core/images/java-string.png)](https://www.java.com/en/)

##### By new keyword
```java
String s=new String("Welcome");//creates two objects and one reference variable  
```

In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

```java

String s1="java";//creating string by Java string literal    
char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);//converting char array to string    
String s3=new String("example");//creating Java string by new keyword    
System.out.println(s1);    
System.out.println(s2);    
System.out.println(s3);    

```





    
    
    
## License

MIT

**Anil K Rajamoni!**

