public class VariablesType {

    // instance variables : accessed with object name
    String collegeName = "UCEOU";
    int studentsCount = 1200;

    int intVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    short shortVar;
    long longVar;
    String strVar;

    // static variables : accessed with class name
    static double college_fee = 95000.52;
    static String personName;

    public static void main(String[] args) { // start
        // local variables 
        String name = "virat kohli";
        int age = 35;
        String team = "RCB";
        // int jerseyNumber;  // must be initialized
        System.out.println(name);
        System.out.println(age);
        System.out.println(team);
        // System.out.println(jerseyNumber); 

        VariablesType vt = new VariablesType(); // object creation
        System.out.println(vt.collegeName); // referenced with object name
        System.out.println(vt.studentsCount);
        System.out.println(vt.intVar);
        System.out.println(vt.shortVar);
        System.out.println(vt.longVar);
        System.out.println(vt.floatVar);
        System.out.println(vt.doubleVar);
        System.out.println(vt.booleanVar);
        System.out.println(vt.strVar);

        System.out.println(VariablesType.college_fee);
        System.out.println(VariablesType.personName);
        
    
    } // end
    
}