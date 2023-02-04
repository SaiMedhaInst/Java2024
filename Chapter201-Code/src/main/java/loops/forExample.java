package loops;

public class forExample {
    public static void main(String[] args) {

        //simple for loop
        for(int i=0;i<5;i++) {//0 1 2 3 4
            System.out.print(i + " ");
        }
        System.out.println();

        for(int a=0;a<4;a++)
            System.out.println("iam at iteration: "+a);

        //generate multiples of 3 & 5 in range of 1-100
        // Calculate Factorial of a NUM
        // Calculate Sum Of N natural nums.
        // Check Whether Num is Prime or Not.
        //Reverse a Array/List or Number or String

        //generate even numbers upto 50.

        for(int i = 0;i<=50;i+=1){
            if(i%2==0)//odd
                System.out.print(i+" ");
        }

        // Calculate Factorial of a NUM

        int num = 4;
        int fac=1;
        for(int i=1;i<=num;++i){
            fac = fac*i;
        }
        System.out.println("Factorial is "+fac);

    }
}
