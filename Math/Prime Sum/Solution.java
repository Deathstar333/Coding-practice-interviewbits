public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("1");
        if(A == 4) {
            arr.add(2);
            arr.add(2);
            return arr;
        }
        
        boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime, true);
        System.out.println("2");
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i<=Math.sqrt(A); i++) {
            for(int j=2; i*j <= A; j++) {
                isPrime[i*j] = false;
            }
        }
        System.out.println("3");
        //System.out.println("set of primes: " + sortedPrimes);
        int n=A+1;
        for(int i=0; i<n; i++) {
            if(isPrime[i]) {
                if(isPrime[A-i]) {
                    arr.add(i);
                    arr.add(A-i);
                    break;
                }
            }
        }
        System.out.println("4");
        return arr;
    }
}