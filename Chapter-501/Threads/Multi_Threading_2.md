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


