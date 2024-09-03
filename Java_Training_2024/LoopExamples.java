public class LoopExamples {
    public static void main(String[] args) {
        // for loop 
        // example-1
        for(int i = 0; i <= 10; i++) {
            System.out.printf("i: %d %n", i);
        }

        // example-2
        for(int m = 10; m >= 0 ; m-=2) {
            System.out.printf("m: %d %n", m);
        }

        // example-3 
        	
		for(int i=0, j=1; i<=10 && j<=10; i+=2, j+=2) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // example 4
        int i,j;
        for(i=0, j=1; i<=10 && j<=10; i+=2, j+=2) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // example -5 
        // declaration of two variable should be done at done, inside or outside loop
    /*   
        int i;
        for(i=0, int j=1; i<=10 && j<=10; i+=2, j+=2) {
            System.out.println("i = " + i + ", j = " + j);
        }

    */

        // example - 6 - infinite loop
    /* 
        for( ; ; ){  
            System.out.println("infinitive loop");  
        } 
    */

    // example - 7 
    String[] mobiles = {"Oppo","OnePlus","realme","Vivo"};

    for(int ind=0; ind<mobiles.length;ind++){
        System.out.println(mobiles[ind]);
    }

    // example - 8 
    int marks[] = {97, 90, 65, 87, 65, 99, 92, 83, 89, 88, 93};
    for(int ind=0; ind<marks.length; ind++) {
        if (marks[ind] > 85 && marks[ind] % 2 == 1) {
            System.out.println(marks[ind]);
        }
    }

    // example - 9 : find the largest score
    int maxScore = marks[0];

    for(int ind = 1; ind < marks.length; ind++) {
        if (marks[ind] > maxScore) {
            maxScore = marks[ind];
        }
    }
    System.out.println("largest score: " + maxScore);

    System.out.println("after loop");
    

    }
}
