## THREAD PRIORITY
- Each thread has a priority. 
- Priorities are represented by a number between 1 and 10. 
- In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling). 
- Note that not only JVM a Java programmer can also assign the priorities of a thread explicitly in a Java program.

**Methods**
- **public final int getPriority():** 
    - The java.lang.Thread.getPriority() method returns the priority of the given thread.
- **public final void setPriority(int newPriority):**
    -  The java.lang.Thread.setPriority() method updates or assign the priority of the thread to newPriority. 
    -  The method throws IllegalArgumentException if the value newPriority goes out of the range, which is 1 (minimum) to 10 (maximum).
    

**constants**
- public static int MIN_PRIORITY - 1
- public static int NORM_PRIORITY - 5
- public static int MAX_PRIORITY - 10

```java
// Importing the required classes  
import java.lang.*;  
public class ThreadPriorityExample extends Thread{  
  
		public void run(){    
			System.out.println("Inside the run() method");  
		}  
   
		public static void main(String argvs[]){   
			ThreadPriorityExample th1 = new ThreadPriorityExample();  
			ThreadPriorityExample th2 = new ThreadPriorityExample();  
			ThreadPriorityExample th3 = new ThreadPriorityExample();  
 
			System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
			System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
			System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
			
			th1.setPriority(6);  
			th2.setPriority(3);  
			th3.setPriority(9);  
 
		System.out.println("Priority of the thread th1 is : " + th1.getPriority()); 
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
		System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
  
		// Displaying name of the currently executing thread   
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  

		Thread.currentThread().setPriority(10);  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	}  
}  
```

**Threads with same Priority**
```java
import java.lang.*;  
public class ThreadPriorityExample1 extends Thread {  
  
	public void run(){    
		System.out.println("Inside the run() method");  
	}  
public static void main(String argvs[]) {  

		Thread.currentThread().setPriority(7);  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		ThreadPriorityExample1 th1 = new ThreadPriorityExample1(); 
		th1.setPriority(7);
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
	}  
}

```

- If there are two threads that have the same priority, then one can not predict which thread will get the chance to execute first. 
- The execution then is dependent on the thread scheduler's algorithm (First Come First Serve, Round-Robin, etc.)

**Example of IllegalArgumentException**

```java
import java.lang.*;    
public class IllegalArgumentException extends Thread {  
public static void main(String argvs[]){  

	Thread.currentThread().setPriority(17);  
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	
	}  
} 
```

### DAEMON THREAD IN JAVA
- Daemon thread in Java is a service provider thread that provides services to the user thread. 
- Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
- There are many java daemon threads running automatically e.g. gc, finalizer etc

**Points to remember for Daemon Thread in Java**
- It provides services to user threads for background supporting tasks. 
- It has no role in life than to serve user threads.
- Its life depends on user threads.
- It is a low priority thread.

##### Why JVM terminates the daemon thread if there is no user thread?
- The sole purpose of the daemon thread is that it provides services to user thread for background supporting task. 
- If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread if there is no user thread

**Methods**
- public void setDaemon(boolean status)
- public boolean isDaemon()

```java
public class TestDaemonThread1 extends Thread{  
		public void run(){  
			if(Thread.currentThread().isDaemon()){
			System.out.println("daemon thread work");  
			}  
		else{  
			System.out.println("user thread work");  
		}  
 }  
 public static void main(String[] args){  
	
	TestDaemonThread1 t1=new TestDaemonThread1();
	TestDaemonThread1 t2=new TestDaemonThread1();  
	TestDaemonThread1 t3=new TestDaemonThread1();  
  
	t1.setDaemon(true);
	t1.start();
	t2.start();  
	t3.start();  
 }  
}

```

```java
class TestDaemonThread2 extends Thread{
	public void run(){  
		System.out.println("Name: "+Thread.currentThread().getName());  
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	}  
  
 public static void main(String[] args){  
	
	TestDaemonThread2 t1 = new TestDaemonThread2();  
	TestDaemonThread2 t2 = new TestDaemonThread2();  
	t1.start();  
	t1.setDaemon(true);  
	t2.start();  
 }  
}
```

### JAVA THREAD POOL.
- Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

**Thread Pool Methods**

**newFixedThreadPool(int s):** The method creates a thread pool of the fixed size s.

**newCachedThreadPool():**: The method creates a new thread pool that creates the new threads when needed but will still use the previously created thread whenever they are available to use.

**newSingleThreadExecutor():**: The method creates a new thread.

- Better performance It saves time because there is no need to create a new thread.
- It is used in Servlet and JSP where the container creates a thread pool to process the request.

```java
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  
```
```java
public class TestThreadPool {  
     public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  
```


### ThreadGroup in Java.
- Java provides a convenient way to group multiple threads in a single object. In such a way, we can suspend, resume or interrupt a group of threads by a single method call.
- Note: Now suspend(), resume() and stop() methods are deprecated.
- Java thread group is implemented by java.lang.ThreadGroup class.
- A ThreadGroup represents a set of threads.
- A thread group can also include the other thread group. 
- The thread group creates a tree in which every thread group except the initial thread group has a parent.
- A thread is allowed to access information about its own thread group.

**Constructors**

1)	**ThreadGroup(String name)**	creates a thread group with given name.
2)	**ThreadGroup(ThreadGroup parent, String name)**	creates a thread group with a given parent group and name.

**Methods**
- **checkAccess()**:	This method determines if the currently running thread has permission to modify the thread group.
- **activeCount()**:	This method returns an estimate of the number of active threads in the thread group and its subgroups.
- **activeGroupCount()**	This method returns an estimate of the number of active groups in the thread group and its subgroups.
- **destroy()**	This method destroys the thread group and all of its subgroups.
- 	getMaxPriority() getName() 	getParent() 	interrupt()
- 	suspend() resume() 	stop()

```java
public class ThreadGroupDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "three");
        t3.start();

        System.out.println("Thread Group Name: " + tg1.getName());
        tg1.list();

    }
}   
```


## Java Shutdown Hook
- A special construct that facilitates the developers to add some code that has to be run when the Java Virtual Machine (JVM) is shutting down is known as the Java shutdown hook.
- The Java shutdown hook comes in very handy in the cases where one needs to perform some special cleanup work when the JVM is shutting down
- In nutshell, the shutdown hook can be used to perform cleanup resources or save the state when JVM shuts down normally or abruptly. 
-  Performing clean resources means closing log files, sending some alerts, or something else. So if you want to execute some code before JVM shuts down, use the shutdown hook.

*When does the JVM shut down?*

- The JVM shuts down when:
    - user presses ctrl+c on the command prompt
    - System.exit(int) method is invoked
    - user logoff
    - user shutdown etc.

#### Syntax
The addShutdownHook() method of the Runtime class is used to register the thread with the Virtual Machine.

```java
public void addShutdownHook(Thread hook){}  
```

The object of the Runtime class can be obtained by calling the static factory method getRuntime()

```java
Runtime r = Runtime.getRuntime();  
```
The removeShutdownHook() method of the Runtime class is invoked to remove the registration of the already registered shutdown hooks.

```java
public boolean removeShutdownHook(Thread hook){ }    
```

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("shut down hook task completed..");
    }
}

public class TestShutdown1 {
    public static void main(String[] args) throws Exception {

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
    }
}
```

**Points to Remember**
- No guarantee for the execution of the shutdown hooks
-  The first and the most important thing to keep in mind is that there is no certainty about the execution of the shutdown hook
-  In some scenarios, the shutdown hooks will not execute at all. 
    -  For example, if the JVM gets crashed due to some internal error, then there is no scope for the shutdown hooks. 
    -  When the operating system gives the SYSKILL signal, then also it will execute

- Note that when the application is terminated normally the shutdown hooks are called (all threads of the application is finished or terminated). Also, when the operating system is shut down or the user presses the ctrl + c the shutdown hooks are invoked.


## How to perform single task by multiple threads in Java?
- If you have to perform a single task by many threads, have only one run() method. 

```java
class TestMultitasking1 extends Thread {
    public void run() {
        System.out.println("task one");
    }
    public static void main(String args[]) {
        TestMultitasking1 t1 = new TestMultitasking1();
        TestMultitasking1 t2 = new TestMultitasking1();
        TestMultitasking1 t3 = new TestMultitasking1();

        t1.start();
        t2.start();
        t3.start();
    }
}
```

```java
class TestMultitasking2 implements Runnable {
    public void run() {
        System.out.println("task one");
    }
    public static void main(String args[]) {
        Thread t1 = new Thread(new TestMultitasking2()); //passing annonymous object of TestMultitasking2 class  
        Thread t2 = new Thread(new TestMultitasking2());

        t1.start();
        t2.start();

    }
}
```
**Note: Each thread run in a separate callstack.**

#### How to perform multiple tasks by multiple threads (multitasking in multithreading)?
- If you have to perform multiple tasks by multiple threads,have multiple run() methods.For example:

```java
class TestMultitasking4 {
    public static void main(String args[]) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("task one");
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("task two");
            }
        };
        t1.start();
        t2.start();
    }
}

```

**Printing even and odd numbers using two threads**
```java
 public class OddEvenExample {
     int contr = 1;
     static int NUM;
     public void displayOddNumber() {
         synchronized(this) {
             while (contr < NUM) {
                 while (contr % 2 == 0) {
                     try {
                         wait();
                     } catch (InterruptedException ex) {
                         ex.printStackTrace();
                     }
                 }
                 System.out.print(contr + " ");
                 contr = contr + 1;
                 notify();
             }
         }
     }

     public void displayEvenNumber() {
         synchronized(this) {
             while (contr < NUM) {
                 while (contr % 2 == 1) {
                     try {
                         wait();
                     } catch (InterruptedException ex) {
                         ex.printStackTrace();
                     }
                 }
                 System.out.print(contr + " ");
                 contr = contr + 1;
                 notify();
             }
         }
     }

     public static void main(String[] argvs) {
         NUM = 20;
         OddEvenExample oe = new OddEvenExample();
         Thread th1 = new Thread(new Runnable() {
             public void run() {
                 oe.displayEvenNumber();
             }
         });
         Thread th2 = new Thread(new Runnable() {
             public void run() {

                 oe.displayOddNumber();
             }
         });
         th1.start();
         th2.start();
     }
 }
```

## Java Garbage Collection
- In java, garbage means unreferenced objects.
- Garbage Collection is process of reclaiming the runtime unused memory automatically. 
- In other words, it is a way to destroy the unused objects.

**Advantages**
- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

**How can an object be unreferenced?**

- By nulling the reference
```java
Employee e=new Employee();  
e=null;
```
- By assigning a reference to another

```java
Employee e1=new Employee();  
Employee e2=new Employee();  
e1=e2;//now the first object referred by e1 is available for garbage collection  
```
- By anonymous object etc.
```java
new Employee();  
```

**Note: 
The Garbage collector of JVM collects only those objects that are created by new keyword. 
So if we have created any object without new, 
we can use finalize method to perform cleanup processing (destroying remaining objects).**

```java
public class TestGarbage1{  
 public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[]){  
  TestGarbage1 s1=new TestGarbage1();  
  TestGarbage1 s2=new TestGarbage1();  
  s1=null;  
  s2=null;  
  System.gc();  
 }  
}
```

**Neither finalization nor garbage collection is guaranteed.**

### Java Runtime class
- Java Runtime class is used to interact with java runtime environment. 
- Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. 
- There is only one instance of java.lang.Runtime class is available for one java application.
- The Runtime.getRuntime() method returns the singleton instance of Runtime class.

**Methods**
- public static Runtime getRuntime()	returns the instance of Runtime class.
- public void exit(int status)	terminates the current virtual machine.
- public void addShutdownHook(Thread hook)	registers new hook thread.
- public Process exec(String command)throws IOException	executes given command in a separate process.
- public int availableProcessors()	returns no. of available processors.
- public long freeMemory()	returns amount of free memory in JVM.
- public long totalMemory()	returns amount of total memory in JVM.

**exec() method**
```java
public class Runtime1 {
    public static void main(String args[]) throws Exception {
        Runtime.getRuntime().exec("notepad"); //will open a new notepad  
        Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");    // will shutdown system
         System.out.println(Runtime.getRuntime().availableProcessors());  
    }
}
```

**freeMemory() and totalMemory()**
```java
public class MemoryTest {
    public static void main(String args[]) throws Exception {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());

        for (int i = 0; i < 10000; i++) {
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: " + r.freeMemory());
    }
}
```