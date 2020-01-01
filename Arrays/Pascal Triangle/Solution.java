public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<A; i++) {
            mat.add(new ArrayList<Integer>(Collections.nCopies(i+1, 1)));
        }
        for(int k=2; k<A; k++) {
            
            
            
        }
        return mat;
    }
}