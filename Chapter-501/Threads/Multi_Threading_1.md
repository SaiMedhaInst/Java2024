## Multithreading in Java

- Multithreading in Java is a process of executing multiple threads simultaneously.
- A thread is a lightweight sub-process, the smallest unit of processing. 
- Multiprocessing and multithreading, both are used to achieve multitasking.

#### Advantages 
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
2) we can perform many operations together, so it saves time.
3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

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

### Thread in java
- A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.

![N|Solid](https://i.imgur.com/HvhXzCg.png)

 >**a thread is executed inside the process.** There is context-switching between the threads. There can be multiple processes inside the OS, and one process can have multiple threads.