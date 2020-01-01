public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) {
            b.add(new ArrayList<Integer>(Collections.nCopies(n,0)));
        }
        
        int ai=0,aj=0,bi=0,bj=n-1;
        for( ai=0,bj=n-1; ai<n; ai++,bj--) {
            for( aj=0,bi=0; aj<n; aj++,bi++) {
                b.get(bi).set(bj, a.get(ai).get(aj));
            }
        }
        Collections.copy(a,b);
    }
}