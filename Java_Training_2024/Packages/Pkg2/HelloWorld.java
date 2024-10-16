package Packages.Pkg2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import static java.lang.Math.sqrt;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World Pkg-2");

        // ArrayList
        ArrayList<String> names = new ArrayList<String>();
        names.add("lokesh");
        names.add("surya");
        names.add("ram");
        names.add("krishna");
        names.add("kumar");
        System.out.println(names);

        names.sort(null);
        System.err.println(names);

        names.remove("ram");
        System.out.println(names);


        // HashSet 
        HashSet<String> langs = new HashSet<>();

        // HashMap 
        HashMap<String, Integer> nameToAge = new HashMap<>();

        // Generate DateTime using java.util.Date
        Date utilDate = new Date();
     
        // Generate DataTime using java.sql.Date 
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        

        System.out.println("Util Date: " + utilDate);
		System.out.println("SQL Date: " + sqlDate);

        // Static Importing 
        System.out.println(sqrt(25));
    }
}
