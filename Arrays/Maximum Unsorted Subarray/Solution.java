public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int n=A.size();
        ArrayList<Integer> ans = new ArrayList<Integer>(2), sorted_arr = new ArrayList<Integer>(A);
        int l=0, r=n-1;
        Collections.sort(sorted_arr);
        
        for( l=0; l<n; l++) {
            if( A.get(l) != sorted_arr.get(l)) {
                break;
            }
        }
        for( r=n-1; r>=0; r--) {
            if( A.get(r) != sorted_arr.get(r)) {
                break;
            }
        }
        if(r<l) {
            ans.add(-1);
            return ans;
        }
        ans.add(l);
        ans.add(r);
        
        return ans;
    }
}