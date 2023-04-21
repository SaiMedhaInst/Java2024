## SYNCHRONIZATION IN JAVA
- Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
- Java Synchronization is better option where we want to allow only one thread to access the shared resource.

**Why use Synchronization?**
The synchronization is mainly used to
- To prevent thread interference.
- To prevent consistency problem.

**Types of Synchronization**
There are two types of synchronization
- Process Synchronization
- Thread Synchronization

**Thread Synchronization**
There are two types of thread synchronization mutual exclusive and inter-thread communication.

1.**Mutual Exclusive**
- Synchronized method.
- Synchronized block.
- Static synchronization.

2.**Cooperation (Inter-thread communication in java)**


**Mutual Exclusive**
> Mutual Exclusive helps keep threads from interfering with one another while sharing data. It can be achieved by using the following three ways:
- By Using Synchronized Method
- By Using Synchronized Block
- By Using Static Synchronization

**Concept of Lock in Java**
- Synchronization is built around an internal entity known as the lock or monitor. 
- Every object has a lock associated with it. 
- By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.
- From Java 5 the package java.util.concurrent.locks contains several lock implementations.

#### Synchronized Method
**example, with no synchronization**
```java
class Table {
    void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
```

**Example with Synchronized Method**
- If ywe declare any method as synchronized, it is known as synchronized method.
- Synchronized method is used to lock an object for any shared resource.
- When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.

```java
class Table {
    synchronized void printTable(int n) { //synchronized method  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization2 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
```
**synchronized method by using annonymous class**

```java
class Table {
    synchronized void printTable(int n) { //synchronized method  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class TestSynchronization3 {
    public static void main(String args[]) {
        final Table obj = new Table(); //only one object  

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
```

#### SYNCHRONIZED BLOCK IN JAVA.
- Synchronized block can be used to perform synchronization on any specific resource of the method.
- Suppose we have 50 lines of code in our method, but we want to synchronize only 5 lines, in such cases, we can use synchronized block.
- If we put all the codes of the method in the synchronized block, it will work same as the synchronized method.

**Points to Remember**
- Synchronized block is used to lock an object for any shared resource.
- Scope of synchronized block is smaller than the method.
- A Java synchronized block doesn't allow more than one JVM, to provide access control to a shared resource.
- The system performance may degrade because of the slower working of synchronized keyword.
- Java synchronized block is more efficient than Java synchronized method.

**Syntax**
```java
synchronized (object reference expression) {     
  //code block     
} 
```

**Example-1**
```java
class Table {
    void printTable(int n) {
        synchronized(this) { //synchronized block    
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronizedBlock1 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object    
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
```

**Example-2**
```java
class Sender {
    public void SenderMsg(String msg) {
        System.out.println("\nSending a Message: " + msg);
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
 
class SenderWThreads extends Thread {
    private String msg;
    Sender sd;

    SenderWThreads(String m, Sender obj) {
        msg = m;
        sd = obj;
    }

    public void run() {
        synchronized(sd) { 
            sd.SenderMsg(msg);
        }
    }
}
  
public class ShynchronizedMultithreading {
    public static void main(String args[]) {
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hola ", sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to Java Concepts", sender);

     
        sender1.start();
        sender2.start();

    
        try {
            sender1.join();
            sender2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
```

#### Static Synchronization
- If we make any static method as synchronized, the lock will be on the class not on object.
- ![ScreenShot](https://i.imgur.com/KrwkZik.png)

**Problem without static synchronization**
- Suppose there are two objects of a shared class (e.g. Table) named object1 and object2. 
- In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock. 
- But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock. 
- We don't want interference between t1 and t3 or t2 and t4. Static synchronization solves this problem.

```java
class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {}
        }
    }
}

public class TestSynchronization4 {
    public static void main(String t[]) {
        Thread t1 = new Thread(){
             public void run() {
                Table.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                Table.printTable(10);
            }
        };
        Thread t3 = new Thread(){
            public void run() {
                Table.printTable(15);
            }
        };
        Thread t4 = new Thread(){
            public void run() {
                Table.printTable(20);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
```

### Deadlock in Java.
- Deadlock in Java is a part of multithreading. 
- Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. 
- Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

- ![ScreenShot](https://i.imgur.com/664wJuQ.png)
```java
public class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "SAIMEDHA ECET";
        final String resource2 = "SAIMEDHA GATE";
    
		//  // t1 tries to lock resource1 then resource2  
        Thread t1 = new Thread() {
            public void run() {
                synchronized(resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized(resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1  
        Thread t2 = new Thread() {
            public void run() {
                synchronized(resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized(resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
```

**How to Avoid Deadlock in Java?**
- Deadlocks cannot be completely resolved. But we can avoid them by following basic rules mentioned below:

**Avoid Nested Locks:** 
- We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. 
- It normally happens when you give locks to multiple threads.

**Avoid Unnecessary Locks:** 
- The locks should be given to the important threads. 
- Giving locks to the unnecessary threads that cause the deadlock condition.

**Using Thread Join:** 
- A deadlock usually happens when one thread is waiting for the other to finish. 
- In this case, we can use join with a maximum time that a thread will take.

## INTER-THREAD COMMUNICATION IN JAVA
- Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.
- Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
- It is implemented by following methods of Object class:
    - wait()
    - notify()
    - notifyAll()

**1) wait() method**
- The wait() method causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
- The current thread must own this object's monitor, so it must be called from the synchronized method only otherwise it will throw exception.

**Methods**
- public final void wait()throws InterruptedException  :	It waits until object is notified.
- public final void wait(long timeout)throws InterruptedException :	It waits for the specified amount of time.

**2) notify() method**
- The notify() method wakes up a single thread that is waiting on this object's monitor. 
- If any threads are waiting on this object, one of them is chosen to be awakened. 
- The choice is arbitrary and occurs at the discretion of the implementation.

Syntax:
```java
public final void notify()  
```

**3) notifyAll() method**
- Wakes up all threads that are waiting on this object's monitor.
Syntax:
```java
public final void notifyAll()  
```

![ScreenShot](https://i.imgur.com/La1lXwG.png)

### Difference between wait and sleep?
![ScreenShot](https://i.imgur.com/iNwlkn2.png)

**Example**
```java
class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {}
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

class Test {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }
}
```


### Interrupting a Thread:
- If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
- calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException. 
- If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.

**Methods**
- public void interrupt()
- public static boolean interrupted()
- public boolean isInterrupted()

```java
class TestInterruptingThread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..." + e);
        }

    }

    public static void main(String args[]) {
        TestInterruptingThread1 t1 = new TestInterruptingThread1();
        t1.start();
        try {
            t1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }

    }
}
```

- void interrupt() - Interrupts the thread.
- static boolean interrupted() - Tests whether the current thread has been interrupted.
- boolean isInterrupted() - Tests whether the thread has been interrupted.

```java
public class TestInterruptingThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            if (Thread.interrupted()) {
                System.out.println("code for interrupted thread");
            } else {
                System.out.println("code for normal thread");
            }
        }
    }

    public static void main(String args[]) {

        TestInterruptingThread4 t1 = new TestInterruptingThread4();
        TestInterruptingThread4 t2 = new TestInterruptingThread4();

        t1.start();
        t1.interrupt();

        t2.start();

    }
}   
```


### Thread yield method()
   
- The yield() method of thread class causes the currently executing thread object to temporarily pause and allow other threads to execute.

syntax:
```java
   public static void yield()  
``` 

**Example**

- Suppose there are three threads t1, t2, and t3. 
- Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state. 
- The completion time for thread t1 is 5 hours and the completion time for t2 is 5 minutes.
- Since t1 will complete its execution after 5 hours,t2 has to wait for 5 hours to just finish 5 minutes job. 
- In such scenarios where one thread is taking too much time to complete its execution, 
-  we need a way to prevent the execution of a thread in between if something important is pending. 
- yield() helps us in doing.

```java
public class JavaYieldExp extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<2 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        JavaYieldExp t1 = new JavaYieldExp();  
        JavaYieldExp t2 = new JavaYieldExp();  
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<2; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
} 
```


   
