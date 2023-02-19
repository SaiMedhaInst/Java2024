## Collectional Interface.
* If we want to represent a group of individual objects as a single entity then we should go for Collection.
* In general collection interface is considered as root interface of Collection Framework.
* Collection interface defines the most common methods which are applicable for any collection object

### METHODS
- boolean add(Obiect o)
- boolean addAlI(Collection c)
- boolean remove Object o)
- boolean removeAll Collection c) 
- boolean retainAlI(Collection c)
- void clear()
- boolean contains Object o)
- boolean containsAll(Collection c)
- boolean isEmpty)
- int size()
- objecti toArray)
- Iterator iterator()

## List Interface.
* It is the child interface of Collection.
* If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for List.
* We can differentiate duplicates by using index.
* We can preserve insertion order by using index, hence index play very important role in list interface.

### METHODS
- void add(int index, Object o) 
- boolean addAllint index, Collection c) 
- object get(int index) 
- object remove(int index) 
- object set(int index, Object new)
    - to replace the element present at specified index with provided Object and returns old object   
- int indexOf Object o) 
- int lastIndexOf(Object o) 
    - returns index of first occurrence of 'o'   
- Listiterator listiterator();

## ArrayList
• The underlined data structure Resizable Array or Growable Array
• Duplicates are allowed.
• Insertion order is preserved.
• Heterogeneous objects are allowed [except TreeSet & TreeMap everywhere heterogeneous objects are allowed.
• Null insertion is possible.

#### CONSTRUCTORS 
**1. ArrayList al = new ArrayList)**
    - Creates an empty Array list object with default initial capacity 10.
    - Once Array List reaches its map capacity a new Array List will be
created with new capacity = (currentcapacity * 3/2) + 1.

**2. ArrayList al = new ArrayList(int initialCapacity);**
- creates a array with initial declared capacity

**3.ArrayList al = new ArrayList(Collection c);**
- used when we want to convert existing collection to ArrayList.

```java
import java.util.*;
class ArrayListDemo {
public static void main(String[] args) {
    ArrayList l = new ArrayList();
    l.add(10.5);
    l.add(10); 
    l.add("A");
    l.add(null);
    System.out println(l); // [10.5, 10, A, null]
    l.remove(2);
    System.out.println(l); // [10.5, 10, null];
    l.add(2, "m");
    l.add("N");
    System.out println(l); // [10.5, 10, M, null, N];
    }
}
```

-  Usually we can use Collections to hold and transfer Objects from one place to another place, to provide support for this requirement 
-  every Collection already implements Serializable and Cloneable interfaces.

* ArrayList and Vector classes implements RandomAccess interface so that we can access any Random element with the same speed.
        * present in java.util.package
        * It doesn't contain any methods and it is a Marker interface.

* Hence if our frequent operation is retrieval operation then
ArrayList is the best choice.

* ArrayList is best choice if our frequent operation is retrieval operation (Because ArrayList implements RandomAccess interfaces)
* ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle (Because several shift operation are require)




## Vector.
- The Vector class implements a growable array of objects. Vectors fall in legacy classes
- It is found in java.util package and implement the List interface
- Vector implements a dynamic array which means it can grow or shrink as required.
- They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
- maintains an insertion order like an ArrayList

##### Syntax: 
public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

Here, E is the type of element.
- It extends AbstractList and implements List interfaces.
- It implements Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess interfaces.
- The directly known subclass is Stack.

##### CONSTRUCTORS
1. Vector(): Creates a default vector of the initial capacity is 10.
    ```java
    Vector<E> v = new Vector<E>();
    ```
2. Vector(int size): Creates a vector whose initial capacity is specified by size.
    ```java 
    Vector<E> v = new Vector<E>(int size);
    ```
    
3. Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and increment is specified by incr. 
It specifies the number of elements to allocate each time a vector is resized upward.
    ```java
    Vector<E> v = new Vector<E>(int size, int incr);
    ```
4. Vector(Collection c): Creates a vector that contains the elements of collection c.
    ```java
     Vector<E> v = new Vector<E>(Collection c);
    ```

- Vector throws an IllegalArgumentException if the InitialSize of the vector defined is negative.
- If the specified collection is null, It throws NullPointerException. 
- If the vector increment is not specified then it’s capacity will be doubled in every increment cycle.
- The capacity of a vector cannot be below the size, it may equal to it.

##### Performing Various Operations on Vector.
1. Adding elements
    add(Object): This method is used to add an element at the end of the Vector.
add(int index, Object): This method is used to add an element at a specific index in the Vector.

2. Updating elements
    set(int index,Object)
3. Removing elements
    remove(Object): This method is used to remove an object from the Vector. 
    remove(int index): removal based on index.

![N|Solid](https://i.imgur.com/tk8CuUP.png)

##### How to get synchronized version of ArrayList Object?
**public static List synchronizedList(List l)**

- Non-Synchronized
ArrayList l1=new Array List();
- Synchronized
List I=Collections.synchronizedList (l1);


## LinkedList
* Present inside java.util.LinkedList and implements List Interface.
* The underlying data structure is Double Linked List.
* Insertion order is preserved.
* Duplicates are allowed.
* Heterogeneous Objects are allowed.
* Null insertion is possible.
* LinkedList implements Serializable and Clonable interfaces but not RandomAccess interface.
* LinkedList is the best choice if our frequent operation is **insertion or deletion** in the middle.
* LinkedList is the worst choice if our frequent operation is **retrieval** operation.
* Usually we can use LinkedList to implement stacks and queues to provide support for this requirement Linked ist class defines following specific methods.
void addFirst); 
void addLast();
Object getFirst();
Object getLast();
Object removeFirst);
Object removeLast);

#### CONSTRUCTORS
1. LinkedList I1=new LinkedListO;
    Creates an empty LinkedList Object
2.LinkedList 11=new LinkedList(Collection c);
    Creates an equivalent LinkedList Object for the given Collection
