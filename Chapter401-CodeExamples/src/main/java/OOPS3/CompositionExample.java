package OOPS3;



import java.util.*;
// class College
class College {
    public String name;
    public String address;
    College(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
}
// University has more than one college.
class University {
    // reference to refer to list of college.
    private final List<College> colleges;
    University(List<College> colleges)
    {
        this.colleges = colleges;
    }

    public List<College> getTotalCollegesInUniversity()
    {
        return colleges;
    }
}
public class CompositionExample {
    public static void main(String[] args) {

        College c1 = new College("CBIT", "Gandipet");
        College c2 = new College("MVSR", "Nadergul");
        College c3 = new College("Vasavi", "Ibrahimbagh");

        // Creating list which contains the no. of colleges.
        List<College> college = new ArrayList<College>();
        college.add(c1);
        college.add(c2);
        college.add(c3);
        University university = new University(college);
        List<College> colleges = university.getTotalCollegesInUniversity();
        for (College cg : colleges) {
            System.out.println("Name : " + cg.name + " and " + " Address : " + cg.address);
        }
    }
}
