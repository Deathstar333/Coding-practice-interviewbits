public class Solution {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] primes = new int[A+1];
        for(int i=0; i<=A; i++) {
            primes[i] = 1;
        }
        primes[0] = 0;
        primes[1] = 0;
        System.out.println("primes array: ");
        for(int i=0; i<=A; i++) {
            
        }
        
        for(int i=1; i<=Math.sqrt(A); i++) {
            for(int j=2; j*i <= A; j++) {
                primes[i*j] = 0;
            }
        }
        System.out.println("primes array: ");
        for(int i=0; i<=A; i++) {
            if(primes[i] == 1) {
                ans.add(primes[i]);
            }
        }
        
        return ans;
    }
}