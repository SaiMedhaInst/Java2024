package arrays;

public class MultiArray {
    public static void main(String[] args) {


        int[][] arr=new int[3][3];//3 row and 3 column
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        for(int[] row : arr){
            for(int d : row){
                System.out.print(d+" ");
            }
            System.out.println();
        }


        //declaring and initializing 2D array
        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};

        //printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
