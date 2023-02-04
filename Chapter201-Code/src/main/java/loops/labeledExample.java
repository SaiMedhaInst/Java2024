package loops;

public class labeledExample {
    public static void main(String[] args) {


   /*     ak:
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                break ak;
            }
        }
*/
        int i, j;
        //outer loop
        outer:     //label
        for(i=1;i<=5;i++)
        {
            System.out.println();
            //inner loop
            inner:      //label
            for(j=1;j<=10;j++)
            {
                if(i==3)
                    break outer;
                System.out.print(j + " ");

            }
        }
    }
}
