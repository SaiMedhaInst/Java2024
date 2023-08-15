## Types of Statements 

### SEQUENTIAL STATEMENTS
➢ Linear Execution of a program or line by line execution of program.

➢ The flow of the program will be interrupted when there's an error or exception.

### CONTROL STATEMENTS.
 - Flow of Execution is decided based on control expression value
 - Control expression value will always be a boolean type either true or false.
 - If **TRUE , some block will be executed** . If **False some other block** will be
executed.
**TYPES**

➢ **if** 
```java
if(condition) {
//body
}
```
➢ **if else**
```java
if(condition) {
//body of true condition
}
else {
//body for false condition
}
```
➢ **if else if else if …. else**
```java
if(condition) {
	//body for if condition is true
}
else if(condition) {
	//body if above condition is false and current condition is true.
}
else if(condition) {
	//body if above condition is false and current condition is true.
}
else if(condition) {
	//body if above condition is false and current condition is true.
}
else{
	//body for above when all condition were false.
}
```
➢ **if if if if … else (multiple if's)**
```java
if(condition) {
	//body 
}
if(condition) {
	//body 
}
if(condition) {
	//body 
}
if(condition) {
	//body 
}
else{
	//body if above condition is false.
}
```
		➢ nested if
		
		➢ nested if else
		
		➢ nested if else if

❖ Note that **if is in lowercase letters**. Uppercase letters (If or IF) will generate an
error.

❖  Scope of block/code is represented **using {} curly brackets**

❖ For if , else , else if no **need of {} if the body has only one statement**

❖ Formulating Control Expression we can use any operator which gives
**boolean value.**

❖ Use multiple if statements whenever we want to execute all if block's
irrespective of whether the previous if block is true or false.

❖ Every and every condition is checked , if true will execute the body , else
check the next condition.

 - **🔥 Guess the output 🔥**

```java
		int flag = 1;
		if(flag) {
			System.out.println("true block");
			}
		else{
			System.out.println("false");
		}

```

- 
```java
        int a = 0;
        if(++a > 0) {
            System.out.println("true block");
            }
        else{
            System.out.println("false");
        }
```

- 
```java
        int a = 0;
        if((a =5)> 0) {
            ++a;
            }
        else{
           --a;
        }
        System.out.println(a);
```


------------------------------------------------------------------
### SWITCH

- The switch statement selects one of many code blocks to be
executed.
- switch expression must be of **byte, short, int, long** (with its Wrapper
type), enums and string
- case values **must be unique & must be of switch expression type only.**
- The case value must be literal or constant. It doesn't allow variables &
duplicates.
- No Need to write a **break statement for default**, when written as
the last statement.
- Break saves a lot of execution time , because it "ignores" the
execution of all the rest of the case in the switch block
- If **we skip the break statement , all cases will be printed after the true
condition**

**Syntax**
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
```

**Nested Switch**
```java
int year = 3;
int marks = 80;

switch(year) //Switch expression
{
	//Case statements
	case 1: System.out.println("First year students");
		break;
	case 2: System.out.println("Second year students");
		break;
	case 3: switch(marks) {
				case 50: System.out.println("You are not eligible for scholarship");
					break;
				case 80: System.out.println("Congrats!!!!! you are eligible for scholarship");
					break;
			}
		break;
	//Default case statement
	default: System.out.println("Please enter valid year");
}
```

--------------------------------------------------------------------------------

##  LOOPS
- The Flow of the program is a **process of repetitive statements or iterations to
do a particular task.**
- TYPES
	**- for loop**
		- Simple for loop
		- for each
		- Labelled for loop
	**- while loop**
	**- do while loop**

### **FOR LOOP.**
- for loop is used to iterate a part of the program several times.
- If the **number of iterations is fixed, it is recommended to use a for loop.**

**Syntax**
```java
for(initialization; condition; increment/decrement){    
//statement or code to be executed 
}
```

🔥  for(;;) → will run into **infinite loop**

🔥 Condition must be **boolean type**

🔥 We can initialize two variables and incre/decre variables at a time in for loop declaration

```java
int i,j;
for(i=0,j=0;i<10;i++,j++) { //valid
	System.out.println(i+" "+j);
}
``` 

🔥 We can't declare and initialize  two variables at a time  individually
```java
for(int i=0,int j=0;i<10;i++,j++) { //invalid
	System.out.println(i+" "+j);
}
```

🔥  Below is the valid one

```java
for(int  i=0,j=0;i<10;i++,j++) { //valid
System.out.println(i+" "+j);
}
``` 

**🔥 GUESS THE OUTPUT 🔥**
```java
	int i = 0;
	for(i=0;i<10;i++);
		System.out.println(i);
		
```

```java
   int i = 2;
   for(;i<10;i+=2);
   {
       System.out.println(i);
   }
```

### While Loop
- While loop is used to iterate a part of the program several items as
long as the condition is true.
- Choose WHILE LOOP , **when we don't know no. of the iterations.**
- Condition must be **boolean type**
```java
while (boolean condition)
{
loop statements...
update_expression;
}
```
- **Not Incrementing/Decrementing of index variables** will raise an infinite
loop.

- **{} curly brackets for block of scope is not mandatory** when we have
only **one statement/instruction inside the body** of for/while/dowhile
loops.
- In Nested LOOPS , **for one each iteration of OUTER LOOP** , **the
INNER LOOP has to complete all its iterations**

**Infinite loops**
```java
        int i =0;
        while (i<=10);
        {
            System.out.println(i); // not incrementing index var
        }
		
		int i = 10;
        while (i>=0);
        {
            System.out.println(i); // not decrementing index var
        }
	
	 while(true) { // always condition is true.
		 System.out.println("hello am while loop ");
		}
```


**🔥 GUESS THE OUTPUT 🔥**
```java
int i =0;
while (i<=10);
{
	i++;
	System.out.println(i);
}
```


**DO WHILE LOOP**

◆ **do-while loop is an Exit control loop**. 

- Therefore, unlike for or while
loop, a do-while check for the condition after executing the statements
of the loop body.

◆ **Even if the condition is false , the loop will execute at least one time.**

◆ If you **pass true in the do-while loop**, it will be an infinitive do-while
loop.


```java
do
{
    // Loop Body
    Update_expression
}

// Condition check
while (test_expression);
```
----------------------------------------------------
**LABELLED LOOP.**

◆ It is a good practice to label a loop when using a nested loop.

◆ We can also use labels with continue and break statements.

◆ Using **labelled break & continue we can directly break/continue outer
loop.**

**Syntax**
```java
labelname:    
    for(initialization; condition; incr/decr)  
    {    
    //loop body 
    }
```

**Example**
```java
     int i, j;
    outer:     //label
    for(i=1;i<=5;i++)
    {
        System.out.println();
        inner:      //label
        for(j=1;j<=10;j++)
        {
            if(i==3)
                break outer;
            System.out.print(j + " ");
    
        }
    }
```

**LOOPING STATEMENTS**

#### ◆ break
	● When a break is encountered inside a loop, the loop is
	immediately terminated , the program control resumes at the
	next statement outside the loop.

	●break is used to **break loop or switch statement.**

	●It breaks the current flow of the program at specified condition.

	●In the case of the **inner loop, it breaks only the inner loop.**

	● We can use break all types of loops

#### ◆ continue
		● The continue statement breaks one iteration (in the loop), 

		● if a specified condition occurs, and continues with the next
		iteration in the loop.


**🔥 GUESS THE OUTPUT 🔥**

```java
for (int i = 0; i < 100; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```

```java


for(int i=0;i<100;i++){
    System.out.println("inside for loop..");
    break;
}

for(int i=0;i<100;i++){
    break;
    System.out.println("inside for loop..");
}

```

**Continue**
```java

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

```

```java

for(int i=0;i<100;i++){
    System.out.println("inside for loop..");
    continue;
    System.out.println(i);
}


for(int i=0;i<100;i++){
   continue;
    System.out.println("inside for loop..");
}

```


