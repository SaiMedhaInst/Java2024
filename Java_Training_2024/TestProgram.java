public class TestProgram {
	boolean isTest; // instance variable 
	public static void main(String[] args) {
		// local variables
		float salary = 83000.17822f; // by default all decimal nos are double in JAVA, for float declaration use f or F 
		System.out.println("Salary = " + salary);
		
		double companyNetWorth = 19239.229278267;
		System.out.println(companyNetWorth);
		
		long rollNumber = 151130961282L; 
		System.out.println(rollNumber); 
		
		char ch = 65;
		System.out.println(ch);
		System.out.println(ch + 1);
		
		System.out.println("value of isTest boolean is : " + new TestProgram().isTest);
		
		float f = (float)5.0 / 2;
		System.out.println(f);
		
		
	}
}