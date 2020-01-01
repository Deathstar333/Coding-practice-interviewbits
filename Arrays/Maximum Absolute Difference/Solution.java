public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int i=0, max_diff=0, n=A.size();
        //i1 is A[i] + i, i2 is A[i] - i
        int i1max=A.get(0), i1min=A.get(0), i2max=A.get(0), i2min=A.get(0);
        for( i=1; i<n; i++) {
            i1max = Math.max(i1max, A.get(i) + i);
            i1min = Math.min(i1min, A.get(i) + i);
            i2max = Math.max(i2max, A.get(i) - i);
            i2min = Math.min(i2min, A.get(i) - i);
        }
        max_diff = Math.max(max_diff,Math.max(i1max - i1min,i2max - i2min));
        return max_diff;
    }
}