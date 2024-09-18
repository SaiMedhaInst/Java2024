import java.util.HashMap;

public class PrimeNumberExample {
    public static void main(String[] args) {
        // Check whether num is Prime or not 
        // Prime number : A number having only 2 factors i.e one and itself , 
        // ex: 7: (1*7) (7*1) -> Prime
        // 6: (1*6) (2*3) (3*2) (6*1) -> Not Prime 

        long N = 17L;

        //checkPrimeNumberNativeApproach(N);

        long start = System.currentTimeMillis();
        boolean isPrime = checkPrimeNumberOptimizedApproach(N);
        System.out.println(N + " is Prime: " + isPrime);
        System.out.println("Time Taken in approach-2: " + (System.currentTimeMillis() - start));


        HashMap<Character, Integer> freqMap = new HashMap<>();
        String str = "abccdefa"; // ['a', 'b', 'c', 'c', 'd', 'e', 'f', 'a']
        for(char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch))
                freqMap.put(ch, freqMap.get(ch) + 1);
            else
                freqMap.put(ch, 1);
        }
        System.out.println(freqMap);
    }

    // approach-1 : O(n)
    private static void checkPrimeNumberNativeApproach(long num) {
        int fc=0;
        long start = System.currentTimeMillis();
        for(long i = 1; i<=num; i++) {
            if(num%i == 0) { // if it is factor, remainder will be zero
                fc++;
            }
        }
        if (fc == 2)
            System.out.printf("%d is Prime\n", num);
        else    
             System.out.printf("%d is not Prime\n", num);

        System.out.println("Time Taken in approach-1: " + (System.currentTimeMillis() - start));
    }


    // approach-2
    private static boolean checkPrimeNumberOptimizedApproach(long N) {
        if (N<=1) 
            return false;
        for(int i = 2; i <= Math.sqrt(N); i++) {
            if (N%i == 0) {
                return false;
            }
        }
        return true;
    }

}
