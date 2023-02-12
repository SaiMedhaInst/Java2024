
### What is a framework in Java
- It provides readymade architecture.
- It represents a set of classes and interfaces.

### What is Collection framework
- The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
 - Interfaces and its implementations, i.e., 
    - classes
    - Algorithm
- The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
- Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

## NEED OF COLLECTIONS
- An array is an indexed Collection which stores only  fixed number of homogeneous data elements.
- The Main advantage of Arrays:
    - represent multiple values with a single variable
    - reusability of the code will be improved
- Limitations of Arrays:
    - Arrays are fixed in size i.e. once we created an array with some size there is no chance of increasing or decreasing it's size based on our requirement.
    - Hence to use arrays compulsory we should know the size in advance which may not possible always.   
    -  Arrays can hold only homogeneous data elements.

```java
Student [] s = new Student [10000];
s[0] = new Student; (correct)
s[1] = new Customer(); (wrong)
```
- Arrays Concept is not implemented based on some standard data structure hence readymade method support is not available for every requirement we have to write the code explicitly. Which is complexity in development.

- To overcome the above limitations of Arrays we should go for Collections.
    - Collections are growbable in nature. i.e. Based on our requirement we can increase (or) Decrease the size.
    - Collections can hold both homogeneous & Heterogeneous elements.
    - Every Collection class is implemented based on some standard data structure. 
    - Hence readymade method support is available for every requirement. 
    - Being a programmer we have to use this method and we are not responsible to provide implementation, which makes development faster and efficient.

![N|Solid](https://i.imgur.com/4S7z3jf.png)


### Collection in Java
- A Collection represents a single unit of objects, i.e., a group.
- when ever we want to represent group of individual objects as a single entity then we should go for collection.

### What is Collectional Framework?
- It defines several classes and interfaces which can be used to define a group of objects as single entity.

## 9 Key Interfaces of Collection Framework.

![N|Solid](https://i.imgur.com/b5pkcnD.png)

### 1. Collection :
* If we want to represent a group of individual objects as a single entity then we should go for Collection.
* Collection interface defines the most common methods which are applicable for any Collection object.
* In general collection interface is considered as root interface of Collection Framework.
Note: there is no concrete class which implements collection
interface directly.

**Difference between Collection & Collections**
* Collection is an interface which can be used to represent a group of individual objects as a single entity.
* Collections is an utility class present in java. util. package to define several utility methods (like Sorting, Searching.) for Collection objects.


### 2.List:
* List is child interface of Collection.
* If we want to represent a group of individual objects as a single entity where 
    * duplicates are allowed 
    * insertion order preserved then we should go for List.

![N|Solid](https://i.imgur.com/nEOb7mU.png)

### 3. Set 
* It is the child interface of Collection.
* If we want to represent a group of individual objects as a single entity where 
    * duplicates are not allowed 
    * insertion order not preserved then we should go for Set.

![N|Solid](https://i.imgur.com/xX8AsYJ.png)

### DIFFERENCE Between List vs Set?
![N|Solid](https://i.imgur.com/YmBVjfJ.png)

### 4. SortedSet
* It is the child interface of Set.
* If we want to represent a group of individual objects as a single entity where
    * duplicates are not allowed 
    * But all objects should be inserted according to some sorting orde then we should go for SortedSet.


### 5. NavigableSet
* It is the child interface of SortedSet if defines several methods for navigation purposes.

![N|Solid](https://i.imgur.com/LghKwvE.png)

### 6. Queue
* It is child interface of Collection.
* If we want to represent a group of individual objects prior to processing then we should go for Queue.
Ex: before sending a mail all mail id's we have to store somewhere and in which order we saved in the same order mail's should be delivered (First in First out) for this requirement Queue concept is the best choice.

![N|Solid](https://i.imgur.com/NxfARt6.png)

**Note:**
* All the above interfaces
(Collection, List, Set, SortedSet, NavigableSet and Queue) meant for representing a group of individual objects.
* If we want to represent a group of objects as key value pairs then we should go for Map Interface.


### 7. Map
* Map is not the child interface of Collection.
* If we want to represent a group of individual objects as key value pairs then should go for Map.
- Both key and value are objects, duplicated keys are not allowed but values can be duplicated

![N|Solid](https://i.imgur.com/ql5VwSr.png)

### 8. SortedMap
* It is the child interface of map.
* If we want to represent a group of key value pairs according to some sorting order of keys then we should go for SortedMap

### 9. NavigableMap
* It is the child interface of sorted map, it defines several utility methods for navigation purpose.

![N|Solid](https://i.imgur.com/WtldahZ.png)

## OVERVIEW OF COLLECTIONA FRAMEWORK
![N|Solid](https://i.imgur.com/QOVuQCH.png)

![N|Solid](https://i.imgur.com/9NIgcwC.png)






