public class LoopQuestions {
    public static void main(String[] args) {

        // find the largest num
      
        int arr[] = {1,-19,17,25,-26,9,6};
        findLargestNumber(arr); // calling

        // find the second largest num
        // method -1 
        // find largest number using first for loop 
        // find second largest excluding the largest num calculated in first for loop 
        int nums[] = {12,35,1,9,96,34,1};
        int firstLargest=0;  // index location
        int secondLargest=-1;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] > nums[firstLargest]) {
                firstLargest = i; // update current index to firstLargest
            }
        }
        System.out.println("index of first largest element: " + firstLargest);

        for(int i=0;i<nums.length; i++) {
            if(nums[i] != nums[firstLargest]) {
                if (secondLargest == -1) {
                    secondLargest = i;
                } else if (nums[i] > nums[secondLargest]) {
                    secondLargest = i;
                }                   
            }   
        }
        System.out.println("second largest element index: " + secondLargest);

        // method-2 {1,-19,17,25,-26,9,6};
        int first,second;
        first=second=Integer.MIN_VALUE; // -2147483648
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > first) {
                second = first; // update first into second
                first = arr[i]; // update current ele into first
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i]; // update current ele into second
            }
        }
        System.out.println("first largest: " + first);
        System.out.println("second largest: " + second);

        // find the factorial
        // product of nums 3! = 1 * 2 * 3 => 6
        int n = 5;
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.printf("factorial of %d is %d\n", n, fact);


        // find the sum of first n numbers 
        // n = 5 => 1+2+3+4+5 -> 15
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.printf("sum of first %d natural numbers is %d \n", n, sum);


        // Linear Search : searching the element sequentially 
        // if element is found return index else return default -1 
        // Time Complexity: O(n)
        int data[] = {11,22,10,20,96,67,18};
        int element = 200;
        int keyIndex = -1;
        for(int i=0; i<data.length; i++) {
            if (data[i] == element) 
                keyIndex = i;
        }
        
        System.out.println( keyIndex != -1 ? String.format("element: %d found at index: %d", element, keyIndex): String.format("element: %d doesn't exist", element));

        // Check whether num is Prime or not 
        // Prime number : A number having only 2 factors i.e one and itself , 
        // ex: 7: (1*7) (7*1) -> Prime
        // 6: (1*6) (2*3) (3*2) (6*1) -> Not Prime 
        long num = 10;
        int fc=0;
        long start = System.currentTimeMillis();
        for(long i = 1; i<=num; i++) {
            if(num%i == 0) { // if it is factor, remainder will be zero
                fc++;
            }
        }
        if (fc == 2)
            System.out.printf("num: %d is Prime\n", num);
        else    
             System.out.printf("num: %d is not Prime\n", num);

        System.out.println("Time taken: " + (System.currentTimeMillis() - start));


        // While Loop 
        System.out.println("******** While Loop Examples ********");

        // example - 12     
        int i = 1;    // initialization expression
     
        while (i < 6) {    // test expression
            System.out.println("Hello World");
            i++;  // update expression
        }

        // example-2
        int x = 1;
        int N = 10;
        sum = 0;
        while (x <= N) {
            sum = sum + x;
            x++;
        }
        System.out.println("Sum of N numbers: " + sum);

        // example - 3: Convert Decimal to Binary 
        int number = 12;
        StringBuffer result = new StringBuffer();
        while (number != 0) {
            int rem = number %  2;
            number = number / 2;
            result.append(rem);
        }
        System.out.println(result.reverse()); // applying reverse to print in bottom - top


        // Do while loop 
        System.out.println("******* DO WHILE LOOP ************");
        int ind = 0;
        do {
            System.out.println("Inside do while loop");
            ind++;
        } while (ind < 0);

        // For-Each Loop 
        // mainly for iterating/printing arrays, strings, collections 
        // we cannot access indexes in for each that mean we cannot update the array
        int numbers[] = {10,20,30,40}; 
        for(int index=0; index<numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        // for each 
        for(int ele : numbers) {
            System.out.println(ele);
        }


        // Nested loops 
        System.out.println("**** NESTED LOOPS *****");
        int arr2D[][] = {{1,2,3}, {10,20,30,40}, {22,33}};
        // System.out.println(arr2D.length);
        // System.out.println(arr2D[0].length);
        // System.out.println(arr2D[2].length);

        for(i = 0; i < arr2D.length; i++) {  // iterating rows
            for(int j = 0; j < arr2D[i].length; j++) { // iteratig columns
                 if (arr2D[i][j] % 2 == 0) 
                    System.out.println(arr2D[i][j] * 9);
                else 
                    System.out.println(arr2D[i][j] * 5);  
            }
        }

        System.out.println("*** PATTERN PROGRAMS ***");
        // Pattern programs 
        /*
         * 1 
         * 1 2 
         * 1 2 3 
         * 1 2 3 4 
         * 
         */
        /*
         * 1 
         * 2 3 
         * 4 5 6
         * 7 8 9 10
         */
        n = 6;
        printPattern1(n);
        printPattern2(4);

        // LOOPING STATEMENTS 
        for(i=0;i<100;i++){
            System.out.println("inside for loop..");
            break;
        }

        for(i=0; i<100; i++){
            break;
            //System.out.println("inside for loop.."); // Unreachable code
        }

        for(i=0;i<100;i++){
            continue;
            // System.out.println("inside for loop..");  // Unreachable code
         }

         for(i=0; i<=5; i++);
            System.out.println("hello");
            System.out.println("world");

         i = 0;
        while(i++ <= 10 );
            System.out.println("hello while loop");
        
    }

    
    
    private static void findLargestNumber(int[] arr) {  // method declaration
        int largest = Integer.MIN_VALUE; // -2147483648
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update largest to current element
            }
        }
        System.out.println("largest num: " + largest);
    }


    private static void printPattern2(int n) {
        int count = 1;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println(); // for new line after completing one inner loop
        }
    }

    private static void printPattern1(int n) {
        for(int i = n; i>0; i--) {
            char ch = 65;
            for(int j=1; j<=i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    
}
