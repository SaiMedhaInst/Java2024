## Multithreading in Java

- Multithreading in Java is a process of executing multiple threads simultaneously.
- A thread is a lightweight sub-process, the smallest unit of processing. 
- Multiprocessing and multithreading, both are used to achieve multitasking.

#### Advantages 
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
2) we can perform many operations together, so it saves time.
3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
4) Threads allows a program to operate more efficiently by doing multiple things at the same time.
5) Threads can be used to perform complicated tasks in the background without interrupting the main program.



#### Multitasking
- Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:
    - Process-based Multitasking (Multiprocessing)
    - Thread-based Multitasking (Multithreading)

**Process-based Multitasking (Multiprocessing)**
- Each process has an address in memory. In other words, each process allocates a separate memory area.
- A process is heavyweight.
- Cost of communication between the process is high.
- Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc

**Thread-based Multitasking (Multithreading)**
- Threads share the same address space.
- A thread is lightweight.
- Cost of communication between the thread is low.

**Applications**
-  network servers and web server
-  example: playing movie, working on paint, scaning your pc etc all these task appears to be happening at the same time, but in reality multi threading works here.


### Thread in java
- A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.

![N|Solid](https://i.imgur.com/HvhXzCg.png)

 >**a thread is executed inside the process.** There is context-switching between the threads. There can be multiple processes inside the OS, and one process can have multiple threads.
 
 
### JAVA THREAD CLASS.
- Java provides Thread class to achieve thread programming. 
- Thread class provides constructors and methods to create and perform operations on a thread.
- Thread class extends Object class and implements Runnable interface.

**methods**
- void	start()	: It is used to start the execution of the thread.
- void	run()	: It is used to do an action for a thread.
- static void	sleep()	 : It sleeps a thread for the specified amount of time.
- static Thread	currentThread()	: It returns a reference to the currently executing thread object.
- void	join()	: It waits for a thread to die.
- void	stop() : It is used to stop the thread.
- void	destroy()	: It is used to destroy the thread group and all of its subgroups.
- void	notify()  : 	It is used to give the notification for only one thread which is waiting for a particular object.
- void	notifyAll() : 	It is used to give the notification to all waiting threads of a particular object.
- void	interrupt() : 	It interrupts the thread.
- static void	yield()	: It causes the currently executing thread object to pause and allow other threads to execute temporarily.


### LIFE CYCLE OF A THREAD 

In Java, a thread always exists in any one of the following states. These states are:
- New
- Active
- Blocked / Waiting
- Timed Waiting
- Terminated

![N|Solid](https://i.imgur.com/d5fMQNS.png)

**New** : Whenever a new thread is created, it is always in the new state. For a thread in the new state, the code has not been run yet and thus has not begun its execution.

**Active**:  When a thread invokes the start() method, it moves from the new state to the active state. The active state contains two states within it: one is runnable, and the other is running.
  - **Runnable**: A thread, that is ready to run is then moved to the runnable state. 
     - In the runnable state, the thread may be running or may be ready to run at any given instant of time. 
     - It is the duty of the thread scheduler to provide the thread time to run, i.e., moving the thread the running state.
        
- **Running**: When the thread gets the CPU, it moves from the runnable to the running state. 
  - Generally, the most common change in the state of a thread is from runnable to running and again back to runnable.
 

**Blocked or Waiting**: Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked state or is in the waiting state.

**Timed Waiting**: Sometimes, waiting for leads to starvation. 
- For example, a thread (its name is A) has entered the critical section of a code and is not willing to leave that critical section. 
- In such a scenario, another thread (its name is B) has to wait forever, which leads to starvation. 
- To avoid such scenario, a timed waiting state is given to thread B. Thus, thread lies in the waiting state for a specific span of time, and not forever. 
- A real example of timed waiting is when we invoke the sleep() method on a specific thread. The sleep() method puts the thread in the timed wait state. After the time runs out, the thread wakes up and start its execution from when it has left earlier.

**Terminated:** A thread reaches the termination state because of the following reasons:
- When a thread has finished its job, then it exists or terminates normally.
- Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.
- A terminated thread means the thread is no more in the system. In other words, the thread is dead, and there is no way one can respawn (active after kill) the dead thread.

**NOTE** 
- The main difference between **waiting** and **timed waiting** is the time constraint. 
- Waiting has no time constraint, whereas timed waiting has the time constraint. 
- A thread invoking the following method reaches the timed waiting state.
    - sleep
    - join with timeout
    - wait with timeout
    - parkUntil
    - parkNanos

**THREAD STATES**
- In Java, one can get the current state of a thread using the Thread.getState() method. 
- The java.lang.Thread.State class of Java provides the constants ENUM to represent the state of a thread. These constants are:

```java
public static final Thread.State NEW  
public static final Thread.State RUNNABLE  
public static final Thread.State BLOCKED  
public static final Thread.State WAITING  
public static final Thread.State TIMED_WAITING  
public static final Thread.State TERMINATED  

```

### **HOW TO CREATE A THREAD IN JAVA**
There are two ways to create a thread:
- By extending Thread class
- By implementing Runnable interface.

**Thread class:**
- Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.

**constructors**
- Thread()
- Thread(String name)
- Thread(Runnable r)
- Thread(Runnable r,String name)

**methods of Thread class**
- run() , start(), sleep() , join() , getPriority() , getName()
- isAlive() , yield() , suspend() , resume() , stop() , interrupt()


```java
class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
 }  
}
```

**Starting a thread:**
- The start() method of Thread class is used to start a newly created thread.
- It performs the following tasks:
    - A new thread starts(with new callstack).
    - The thread moves from New state to the Runnable state.
    - When the thread gets a chance to execute, its target run() method will run.


**Runnable interface:**
- The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. 
- Runnable interface have only one method named run().
    - public void run(): is used to perform action for a thread.

```java
class Multi3 implements Runnable{  
public void run(){  
    System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
    Multi3 m1=new Multi3();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
 }  
}  

```

- If we are not extending the Thread class,  class object would not be treated as a thread object. So we need to explicitly create the Thread class object. 
- We are passing the object of  class that implements Runnable so that  class run() method may execute.


**3.Using the Thread Class: Thread(String Name)**
- We can directly use the Thread class to spawn new threads using the constructors

```java
public class MyThread1 {  

public static void main(String argvs[]) {  
    
    //// creating an object of the Thread class using the constructor Thread(String name)   
    Thread t= new Thread("My first thread");  
  
    // the start() method moves the thread to the active state  
    t.start();  
    // getting the thread name by invoking the getName() method  
    String str = t.getName();  
    System.out.println(str);  
}  
} 

```

**4) Using the Thread Class: Thread(Runnable r, String name)**
```java
public class MyThread2 implements Runnable {    
    public void run(){    
    System.out.println("Now the thread is running ...");    
    }    

public static void main(String argvs[]) {   
    Runnable r1 = new MyThread2();   
    Thread th1 = new Thread(r1, "My new thread");    
    th1.start();
    System.out.println(th1.getName(););  
}    
} 
```

#### **THREAD SCHEDULER IN JAVA**
- A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
-  In Java, a thread is only chosen by a thread scheduler if it is in the runnable state.
-  However, if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones.
-  There are some criteria that decide which thread will execute first There are two factors for scheduling a thread i.e. Priority and Time of arrival.

**Priority:** Priority of each thread lies between 1 to 10. If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler.

**Time of Arrival:** If two threads has same priority we have to consider Time of Arrival factor.

#### **Thread Scheduler Algorithms**

**First Come First Serve Scheduling:**
- In this scheduling algorithm, the scheduler picks the threads thar arrive first in the runnable queue

![N|Solid](https://i.imgur.com/bLh6Sik.png)

**Time-slicing scheduling:**
- Usually, the First Come First Serve algorithm is non-preemptive, which is bad as it may lead to infinite blocking (also known as starvation). 
- To avoid that, some time-slices are provided to the threads so that after some time, the running thread has to give up the CPU. 
- Thus, the other waiting threads also get time to run their job.

![N|Solid](https://i.imgur.com/CTrKddv.png)

**Preemptive-Priority Scheduling:**
- The name of the scheduling algorithm denotes that the algorithm is related to the priority of the threads.
-  algorithm is also preemptive.

![N|Solid](https://i.imgur.com/8w7JgLO.png)

![N|Solid](https://i.imgur.com/mYX2AnQ.png)


## Thread.sleep()
- The method sleep() is being used to halt the working of a thread for a given amount of time.
- The time up to which the thread remains in the sleeping state is known as the sleeping time of the thread. 
- After the sleeping time is over, the thread starts its execution from where it has left.

**syntax**
```java
public static void sleep(long mls) throws InterruptedException   
public static void sleep(long mls, int n) throws InterruptedException   

<!--
mls: The time in milliseconds is represented by the parameter mls. The duration for which the thread will sleep is given by the method sleep().

n: It shows the additional time up to which the programmer or developer wants the thread to be in the sleeping state. The range of n is from 0 to 999999.
-->
```


**NOTE**
- Whenever the Thread.sleep() methods execute, it always halts the execution of the current thread.
- Whenever another thread does interruption while the current thread is already in the sleep mode, then the InterruptedException is thrown.

```java
class TestSleepMethod1 extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){   
  // the thread will sleep for the 500 milli seconds   
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  TestSleepMethod1 t1=new TestSleepMethod1();    
  TestSleepMethod1 t2=new TestSleepMethod1();    
     
  t1.start();    
  t2.start();    
 }    
} 
```

**the sleep() Method in Java : on the main thread**
```java
// important import statements  
import java.lang.Thread;  
import java.io.*;  
  
public class TestSleepMethod2 {  
    public static void main(String argvs[]){  
        try {  
        for (int j = 0; j < 5; j++){
        // The main thread sleeps for the 1000 milliseconds, which is 1 sec  
        // whenever the loop runs  
        Thread.sleep(1000);  
        System.out.println(j);
        }
    }
    catch (Exception expn) { 
    System.out.println(expn);  
    }  
}  
}
```

**When the sleeping time is -ive  throws the exception IllegalArguementException**.

### Try these?
- Can we start a thread twice?
```java
public class TestThreadTwice1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestThreadTwice1 t1=new TestThreadTwice1();  
  t1.start();  
  t1.start();  
 }  
} 
```

**we call Java run() method directly instead start() method?**
- Each thread starts in a separate call stack. 
- Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

![N|Solid](https://i.imgur.com/IABDY2S.png)

```java
class TestCallRun1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestCallRun1 t1=new TestCallRun1();  
  t1.run();
 }  
}
```

```java
class TestCallRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
  t1.run();  
  t2.run();  
 }  
}  

```

**As we can see in the above program that there is no context-switching because here t1 and t2 will be treated as normal object not thread object.**

## Java join() method
- java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution..
-  If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
-  If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period.
-  However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify

**There are three overloaded join function**

**1. join():** 
- It will put the current thread on wait until the thread on which it is called is dead. 
- If thread is interrupted then it will throw InterruptedException.
Syntax:
```java
public final void join() throws InterruptedException  
```

**2. join(long millis)**
- It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).
Syntax:
```java
public final synchronized void join(long millis) throws InterruptedException,
```
**join(long millis, int nanos):** 
- It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).

```java
public final synchronized void join(long millis, int nanos) throws InterruptedException,
```

```java
import java.io.*;  
class ThreadJoin extends Thread  {  
	public void run(){  
		for (int j = 0; j < 2; j++){  
			try {  
					Thread.sleep(300);  
					System.out.println("The current thread name is: " + Thread.currentThread().getName());  
				}  
			catch(Exception e){  
					System.out.println("The exception has been caught: " + e);  
				}  
			System.out.println( j );  
			}  
		}  
	}  
public class ThreadJoinExample  {  
	public static void main (String argvs[]){  
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin();  
		
		th1.start();  
		try {  
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());
			th1.join();  
		} catch(Exception e){  
			System.out.println("The exception has been caught " + e);  
		}  
 
		th2.start();
		try{  
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			th2.join();  
			} catch(Exception e){  
			System.out.println("The exception has been caught " + e);
			}  
		th3.start();  
	}  
}  

```

**Join() Method: InterruptedException**

```java
class ABC extends Thread {  
	Thread threadToInterrupt; 
	public void run(){  
	threadToInterrupt.interrupt();  
	}  
}  
public class ThreadJoinExample1  {  
	public static void main(String[] argvs) {  

		try{  
			ABC th1 = new ABC();  
			th1.threadToInterrupt = Thread.currentThread();  
			th1.start();  
			th1.join();  
		}catch (InterruptedException ex) {  
			System.out.println("The exception has been caught. " + ex);  
		}  
	}  
}  

```

**Example-3**
```java
class TestJoinMethod1 extends Thread{ 
	public void run(){ 
		for(int i=1;i<=5;i++){
			try{    
				Thread.sleep(500);    
			}catch(Exception e){System.out.println(e);}    
			System.out.println(i);    
		}    
	}    
	public static void main(String args[]){    
		TestJoinMethod1 t1=new TestJoinMethod1();    
		TestJoinMethod1 t2=new TestJoinMethod1();    
		TestJoinMethod1 t3=new TestJoinMethod1();    
		t1.start();    
		try{    
			t1.join();    
		}catch(Exception e){System.out.println(e);}    
		t2.start();    
		t3.start();    
 }    
}  
```

**Example-4: join(long miliseconds) Method**
```java
class TestJoinMethod2 extends Thread{
	public void run(){    
		for(int i=1;i<=5;i++){    
			try{    
				Thread.sleep(500);    
			}catch(Exception e){System.out.println(e);}    
		System.out.println(i);    
	}    
 }    
public static void main(String args[]){    
	TestJoinMethod2 t1=new TestJoinMethod2();    
	TestJoinMethod2 t2=new TestJoinMethod2();    
	TestJoinMethod2 t3=new TestJoinMethod2();    
	t1.start();    
	try{    
		t1.join(1500);    
	}catch(Exception e){System.out.println(e);}    
    
	t2.start();    
	t3.start();    
 }    
}   
```


### Thread wait() 



### Thread Notify ()


### Thread yeild()

### Naming Thread

- The Thread class provides methods to change and get the name of a thread. By default, each thread has a name, i.e. thread-0, thread-1 and so on.

```java
public String getName(): //is used to return the name of a thread.  
public void setName(String name):// is used to change the name of a thread.  
```

```java
class TestMultiNaming1 extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  TestMultiNaming1 t1=new TestMultiNaming1();  
  TestMultiNaming1 t2=new TestMultiNaming1();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Sai Medha..");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}

```


**Without Using setName() Method**
- One can also set the name of a thread at the time of the creation of a thread, without using the setName() method

```java
import java.io.*;  
class ThreadName extends Thread{  
	ThreadName(String threadName){ 
		super(threadName);  
	}  
 
	public void run(){  
		System.out.println(" The thread is executing....");  
	}  
}  
  
public class ThreadNamingExample {  

public static void main (String argvs[]) {  
 
	ThreadName th1 = new ThreadName("SaiMedha ECET");  
	ThreadName th2 = new ThreadName("SaiMedha GATE");  

	System.out.println("Thread - 1: " + th1.getName());  
	System.out.println("Thread - 2: " + th2.getName());  
    
	th1.start();  
	th2.start();  
	}  
} 

```


**Current Thread**
- The currentThread() method returns a reference of the currently executing thread.

```java
public static Thread currentThread()    
```

```java
class TestMultiNaming2 extends Thread{  
 public void run(){  
  System.out.println(Thread.currentThread().getName());  
 }  
 public static void main(String args[]){  
  TestMultiNaming2 t1=new TestMultiNaming2();  
  TestMultiNaming2 t2=new TestMultiNaming2();  
  
  t1.start();  
  t2.start();  
 }  
} 
```


 