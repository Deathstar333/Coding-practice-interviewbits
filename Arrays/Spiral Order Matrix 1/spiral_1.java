public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int cmin = 0, cmax = A.get(0).size(), rmin = 0, rmax = A.size();
        
        while(true) {
            //Loop 1
            for( int i=cmin; i<cmax; i++) {
                arr.add(A.get(rmin).get(i));
            }
            rmin++;
            if(rmin == rmax) {
                break;
            }
            
            //Loop 2
            for( int i=rmin; i<rmax; i++) {
                arr.add(A.get(i).get(cmax-1));
            }
            cmax--;
            if(cmin == cmax) {
                break;
            }
            
            //Loop 3
            for( int i=cmax-1; i>=cmin; i--) {
                arr.add(A.get(rmax-1).get(i));
            }
            rmax--;
            if(rmin == rmax) {
                break;
            }
            
            //Loop 4
            for( int i=rmax-1; i>=rmin; i--) {
                arr.add(A.get(i).get(cmin));
            }
            cmin++;
            if(cmin == cmax) {
                break;
            }
        }
                
        return arr;
    }
}