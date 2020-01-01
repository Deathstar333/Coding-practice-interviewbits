public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n=A.size();
        for(int i=0;i<n;i++) {
            if(A.get(i) > 0 && A.get(i) < n+1) {
                int j = A.get(i) - 1;
                if(A.get(j) != A.get(i)) {
                    int temp = A.get(j);
                    A.set(j,A.get(i));
                    A.set(i,temp);
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++) {
            if(A.get(i) != i+1) {
                return i+1;
            }
        }
        return n+1;
    }
}