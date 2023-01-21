### NESTED METHODS
- Calling a method inside another another is called nested methods.

syntax:
```java
   
    public  void m1(){
        System.out.println("Hi am m1 method");
        m2();
    }

    public void m2() {
        System.out.println("Hi am m2method");
    }
    
```

###  Recursion Methods
- Recursion is the technique of making a function call itself. 
- This technique provides a way to break complicated problems down into simple problems which are easier to solve.

```java

public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

```