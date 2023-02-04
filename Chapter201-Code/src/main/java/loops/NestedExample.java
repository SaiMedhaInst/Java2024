package loops;

public class NestedExample {
    public static void main(String[] args) {

        //nested for loop
        for(int i=0;i<3;i++){
            for(int j=0;j<=2;j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }




        //nested while loop
        System.out.println(":::::::::::: NESTED WHILE LOOP:::::::::");
        int x = 0;
        while (x<4){ //outer
            int y=0;
            while(y<2){//inner
                System.out.print(x*y+" ");
                y++;
            }
            System.out.println();
            x++;
        }



        //printing array 1D
        int arr[] = {10,2,8,30,3,30};
        int ind = 0;
        while(ind<arr.length){
            System.out.print(arr[ind]+" ");
            ind++;
        }
        System.out.println();


        //printing 2D arrayData
        int arr2d[][] = {{10,20,30},{11,22,33},{21,32,42}};
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }


        //nested do while loop
        System.out.println("NESTED DO WHILE LOOP");
        int x1=0;
        do{
            int y1=0;
            do{
                System.out.printf("x1 = %d y1=%d",x1,y1);
                y1++;
            }while(y1<=3);
            x1++;
            System.out.println();
        }while(x1<4);


    }
}
