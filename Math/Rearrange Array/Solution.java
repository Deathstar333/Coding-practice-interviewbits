public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        
        //A[i] = A[i] + (A[A[i]]%n)*n
        for(int i=0; i<n; i++) {
            a.set(i, a.get(i) + (a.get(a.get(i))%n)*n );
        }
        //A[i] = A[i]/n
        for(int i=0; i<n; i++) {
            a.set(i, a.get(i)/n);
        }
    }
}
