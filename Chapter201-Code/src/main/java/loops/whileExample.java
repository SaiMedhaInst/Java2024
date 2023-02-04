package loops;

public class whileExample {
    public static void main(String[] args) {


        //simple while
        int ind = 0;
        while(ind<4){
            System.out.println("index is : " +ind);
            ind++;
        }

     /*   for(;;){
            System.out.println("Hello world"); //infinite
        }*/



        //reverse a number
        int num = 396;
        int rev=0;
        while (num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println(rev);



        // sum of digits in a number.
        int numberSum=0;
        while(num!=0){
            numberSum+=num%10;
            num/=10;
        }
        System.out.println(numberSum );
    }
}
