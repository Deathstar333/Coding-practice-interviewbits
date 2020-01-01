import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        for( int i=0; i<A; i++) {
            mat.add(new ArrayList<Integer>(Collections.nCopies(A,0)));
        }
        int rmin=0, rmax=A, cmin=0, cmax=A, k=1;
        
        while(rmax>rmin && cmax>cmin) {
            //Top row
            for( int i=cmin; i<cmax; i++) {
                mat.get(rmin).set(i, k);
                k++;
            }
            rmin++;
            
            //Rightmost column
            for( int i=rmin; i<rmax; i++) {
                mat.get(i).set(cmax-1, k);
                k++;
            }
            cmax--;
            
            //Bottom Row
            for( int i=cmax-1; i>=cmin; i--) {
                mat.get(rmax-1).set(i, k);
                k++;
            }
            rmax--;
            
            //Leftmost Column
            for( int i=rmax-1; i>=rmin; i--) {
                mat.get(i).set(cmin, k);
                k++;
            }
            cmin++;
            
        }
        
        
        return mat;
    }
}