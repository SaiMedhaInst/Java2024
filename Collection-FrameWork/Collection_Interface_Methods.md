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