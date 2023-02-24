package CollectionsPracticse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class A{

    public String toString(){
        return "isjkhdwkjqknkwnkwnkndknkwden";
    }
}
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList l = new ArrayList(); // 10 location
        l.add(10);
        l.add(10.2);
        l.add(10.3f);
        l.add("kumar");
        l.add(10.2);
        l.add(null);
        System.out.println(l); // toString()

        l.remove(null);
        l.add(2,"india");

        System.out.println(l);
        l.set(2,"INDIA");
        System.out.println(l);
        System.out.println(l.get(5));

        System.out.println(l.contains("Kumar"));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(1); al.add(1); al.add(122);al.add(221);al.add(111);al.add(111);al.add(211);
        al.add(2); al.add(62);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,10));


//        Collection c = new ArrayList();
//        List c1 = new ArrayList();
//        ArrayList al = new ArrayList();





    }
}
