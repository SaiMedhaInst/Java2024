# Strings In Java.?
[![N|Solid](https://qavalidation.com/wp-content/uploads/2018/06/java-Strings-and-methods-1614x807.png)](https://www.java.com/en/)

- A String variable contains a collection of characters surrounded by double quotes: 
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
#### String Concatenation
    - The + operator can be used between strings to combine them. This is called concatenation:
    
```java
String firstName = "SaiMedha";
String lastName = "ECET Institution"
System.out.println(firstName + " " + lastName);


String firstName = "Kumar ";
String lastName = "Rajamoni";
System.out.println(firstName.concat(lastName));

//If you add two numbers, the result will be a number:
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)

//If you add two strings, the result will be a string concatenation:
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)

//If you add a number and a string, the result will be a string concatenation:
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)


```
    
### String Methods.
`A String in Java is actually an object, which contain methods that can perform certain operations on strings.`
1. length()
    ```java
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    
    ```

2.  toUpperCase() and toLowerCase()
    ```java
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase());   // Outputs "hello world"
    ```

3. charAt() and isEmpty() and indexOf()
```java
String myStr = "Hello";
char result = myStr.charAt(0);
System.out.println(result);
System.out.println(myStr.charAt(2))

//The index of the first character is 0, the second character is 1, and so on.
//IndexOutOfBoundsException - if index is negative or not less than the length of the specified string


String myStr1 = "Hello";
String myStr2 = "";
System.out.println(myStr1.isEmpty());
System.out.println(myStr2.isEmpty());

//indexOf()- The indexOf() method returns the position of the first occurrence of specified character(s) in a string.

String myStr = "Hello planet earth, you are a great planet.";
System.out.println(myStr.indexOf("planet"));
System.out.println(myStr.indexOf("e", 5));

```

4. trim()  & equals() & hashCode() , replace()
```java
//The trim() method removes whitespace from both ends of a string.

String myStr = "       Hello World!       ";
System.out.println(myStr);
System.out.println(myStr.trim());

//equals() - The equals() method compares two strings, and returns true if the strings are equal, and false if not.

String myStr1 = "Hello";
String myStr2 = "Hello";
String myStr3 = "Another String";
System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
System.out.println(myStr1.equals(myStr3)); // false.

// equalsIgnoreCase()  Compare strings to find out if they are equal, ignoring case differences:
System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false


/* hashCode() :
The hash code for a String object is computed like this: 
s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation
*/

String myStr = "Hello";
System.out.println(myStr.hashCode());

// replace() : searches a string for a specified character, and returns a new string where the specified character(s) are replaced.

String myStr = "Hello";
System.out.println(myStr.replace('l', 'p'));


```
5. startsWith() ,  endsWith()
```java 

//startsWith() : The startsWith() method checks whether a string starts with the specified character(s).

String myStr = "Hello";
System.out.println(myStr.startsWith("Hel"));   // true
System.out.println(myStr.startsWith("llo"));   // false
System.out.println(myStr.startsWith("o"));     // false

//The endsWith() : method checks whether a string ends with the specified character(s).
String myStr = "Hello";
System.out.println(myStr.endsWith("Hel"));   // false
System.out.println(myStr.endsWith("llo"));   // true
System.out.println(myStr.endsWith("o"));     // true

```

6. valueOf()  , toString() , compareTo() ,  toString() , split() , matches()
```java
- valueOf() method converts different types of values into string. 
- By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.

    boolean b1=true;  
    byte b2=11;    
    short sh = 12;  
    int i = 13;  
    long l = 14L;  
    float f = 15.5f;  
    double d = 16.5d;  
    char chr[]={'j','a','v','a'};  
    StringValueOfExample5 obj=new StringValueOfExample5();  
    String s1 = String.valueOf(b1);    
    String s2 = String.valueOf(b2);    
    String s3 = String.valueOf(sh);    
    String s4 = String.valueOf(i);    
    String s5 = String.valueOf(l);    
    String s6 = String.valueOf(f);    
    String s7 = String.valueOf(d);    
    String s8 = String.valueOf(chr);    
    String s9 = String.valueOf(obj);    
    System.out.println(s1);  
    System.out.println(s2);  
    System.out.println(s3);  
    System.out.println(s4);  
    System.out.println(s5);  
    System.out.println(s6);  
    System.out.println(s7);  
    System.out.println(s8);  
    System.out.println(s9);  

// toString() :  returns the String representation of the object. 
-   If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output,

// compareTo() 
String myStr1 = "Hello";
String myStr2 = "Hello";
System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

   - The method returns 0 if the string is equal to the other string. 
   - A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
   
   Tip: Use compareToIgnoreCase() to compare two strings lexicographyically, ignoring lower case and upper case differences.

    Tip: Use the equals() method to compare two strings without consideration of Unicode values.
    
    
// split() : method splits this string against given regular expression and returns a char array.

String s1="java is interpreted and robust Language.";  
String[] words=s1.split("\\s");
System.out.println(words);

//The matches() method checks whether the string matches the given regular expression or not.
    
    // a regex pattern for four letter string that starts with 'J' and end with 'a'
    String regex = "^J..a$";
    System.out.println("Java".matches(regex));
    System.out.println("Kumarrajamoni".matches("[A-Za-z]*"));
    
    // a search pattern for only numbers
    String regex = "^[0-9]+$";
    System.out.println("123a".matches(regex)); // false
    System.out.println("98416".matches(regex)); // true
    System.out.println("98 41".matches(regex)); // false
```

#### StringBuffer
- StringBuffer is a peer class of String that provides much of the functionality of strings
- the string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences. 
- StringBuffer may have characters and substrings inserted in the middle or appended to the end.

construtors :
    - StringBuffer s = new StringBuffer();
    - StringBuffer s = new StringBuffer(20);
    - StringBuffer s = new StringBuffer("GeeksforGeeks");
    
[![N|Solid](https://i.imgur.com/lf2dpdB.png)](https://www.java.com/en/)

#### methods 
1 . The append() method concatenates the given argument with this string.
   ```java
    StringBuffer sb = new StringBuffer("Hello ");
    sb.append("Java"); // now original string is changed
    System.out.println(sb);
```

2.insert() method inserts the given string with this string at the given position. 
```java
StringBuffer sb = new StringBuffer("Hello ");
sb.insert(1, "Java");
// Now original string is changed
System.out.println(sb);
```

- replace() : replaces the given string from the specified beginIndex and endIndex-1.
- delete(): method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1
- reverse() method of StringBuilder class reverses the current string.


```java
    StringBuffer sb=new StringBuffer("Hello"); 
    sb.replace(1,3,"Java"); 
    System.out.println(sb);
    
    StringBuffer sb=new StringBuffer("Hello"); 
    sb.delete(1,3); 
    System.out.println(sb);
    
    StringBuffer sb = new StringBuffer("Hello");
    sb.reverse();
    System.out.println(sb);
```

### String Builder.
- StringBuilder in Java represents a mutable sequence of character

[![N|Solid](https://i.imgur.com/SL75qm7.png)](https://www.java.com/en/)

```java
    StringBuilder builder=new StringBuilder("hello");  
    builder.append("java");  
    System.out.println(builder);  
```

### String vs StringBuffer vs StringBuilder.

[![N|Solid](https://i.imgur.com/6Ia6hOR.png)](https://www.java.com/en/)




    
    
    
## License

MIT

**Anil K Rajamoni!**

