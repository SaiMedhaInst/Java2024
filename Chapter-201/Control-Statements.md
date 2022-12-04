## Types of Statements 
1. SEQUENTIAL STATEMENTS
    - Linear Execution of a program or line by line execution of program.
    - The flow of the program will interrupted when there's error or exception.
    
    ```java
    int a = 10,b=20;
    System.out.print("Addition");
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a/10);
    System.out.println("Ternary")
    System.out.println(a>b?a:b)
    ```
2. CONTROL STATEMENTS.
    - Flow of Execution of the program is decided based on control expression value.
    - If TRUE , some block will be executed . If False some other block will be executed.
    ```java
    int age = 26;
    if (age>=18){
          System.out.println("Eligible to Vote");
    }
    else{
          System.out.println("Not Eligible to Vote");
    }
    ```
3. LOOPING STATEMENTS.
    - The Flow of the program is a process of repeative statements or iterations to do particular task.
    
    ```java
    Strings[] Languages = {"Java","Python","JavaScript","Scala","Ruby"}
    
    System.out.println("Looping elements..");
    for(String lang : Languages){
        System.out.println(lang)
    }
    ```


## CONTROL STATEMENTS.

- Control statements also called as decision making statements
- Based on the value of control expression the flow of the program will be decided.



Java has the following *conditional statements:*

- Use **if** to specify a block of code to be executed, if a specified condition is true
- Use **else** to specify a block of code to be executed, if the same condition is false
- Use **else if** to specify a new condition to test, if the first condition is false
- Use **switch** to specify many alternative blocks of code to be executed

### IF STATEMENT
- Use the **if** statement to specify a block of Java code to be executed if a **condition is true.**
- conditions in if block are written using relational or logical operators , which results always **true or false**

**SYNTAX**
```java
if (condition) {
  // block of code to be executed if the condition is true
}
```
- Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

```Java

if(true){
    System.out.println("true block...")
}

int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}

		
if('a'>'A'){
    System.out.println("greater..");
}

if((age>0) && (age%2==0)){
    System.out.println("Even age number");
}

```

**Can we write like this?**
```java
int age = 10;
if(age){
    System.out.println("true block and age positive");
}

if(age&2){
     System.out.println("applying bitwise and on age variable.");
}

public static boolean isEven(int num){
    return num%2==0?true:false;
}

if(isEven(10)){
    System.out.println("Even Number.")
}
```

### IF ELSE STATEMENT
- Use the else statement to specify a block of code to be executed if the condition is false.
**Syntax**
```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```    

[![N|Solid](https://tara.layak.in/images/stories/if_then_else_flow.gif)](https://www.java.com/en/)


```java

int number = 20;
if (number%2 == 0) {
  System.out.println("Even Number");
} else {
  System.out.println("Odd number");
}
```
##### Try this?
- Can we have more than one else block for one if block?

### ELSE IF STATEMENT
- Use the else if statement to specify a new condition if the first condition is false.

```java

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

```java
int marks = 85;
if (marks > 90) {
  System.out.println("A+");
} else if (marks>80) {
  System.out.println("A");
} else if (marks>70) {
  System.out.println("B");
} else if (marks>60) {
  System.out.println("C");
} else if (marks>=50 && marks<60) {
  System.out.println("D");
} else if (marks>40) {
  System.out.println("C");
}
else {
  System.out.println("Fail :(");
}

if(num%2==1)
    System.out.println("odd");
else if(num%2==0)
    System.out.println("even");
else if(num>=0)
     System.out.println("postive number");
else
     System.out.println("not postive number...");
    

```
##### Try this?
- Can we have more than two  **else if** conditions getting true? If yes which one will be evaluated?


### MULTIPLE IF STATEMENT's
- Use the mutliple if statements when ever you want to execute all if block's irrespective previous if block is true or false.
- Every and very condition is checked , if **true** will execute the body , else check next condition.

**SYNTAX**

```java
if (condition1) {
  // block of code to be executed if condition1 is true
} if (condition2) {
  // block of code to be executed if the conditionw is true 
} if(condition3) {
  // block of code to be executed if the condition3 is true
}
else{
    // block of code to be executed if the condition3 is false.
}



if(num%2==1)
    System.out.println("odd");
if(num%2==0)
    System.out.println("even");
if(num>=0)
     System.out.println("postive number");
else
     System.out.println("not postive number...");
 
```


### SWITCH CASE/STATEMENT
- Instead of writing many if..else statements, you can use the switch statement.
- The switch statement selects one of many code blocks to be executed:
- The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
- The case values must be unique. In case of duplicate value, it renders compile-time error.
- The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}



int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```

**How it works?**
    =>The switch expression is evaluated once.
    =>The value of the expression is compared with the values of each case.
    =>If there is a match, the associated block of code is executed.
    =>The **break and default** keywords are optional
    


[![N|Solid](https://static.javatpoint.com/core/images/java-switch-statement.png)](https://www.java.com/en/)


```java

int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}

```

##### Note:
- if the default statement is used as the last statement in a switch block, it does not need a break.
- A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
- If we skip break statement , all true cases will be printed.


## License

MIT

**Anil K Rajamoni!**

