public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        //Step 1:find largest x s.t. P[x] < P[x+1]
        //Step 2:find largest y s.t. P[x] < P[y]
        //Step 3:swap P[x] and P[y]
        //Step 4:reverse the elements from [x+1...n]
        
        int n=A.size();
        int x=0,y=0,flag = 0;
        for( x=n-2; x>=0; x--) {
            if(A.get(x) < A.get(x+1)) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            Collections.reverse(A);
            return A;
        }
        
        for( y=x+1; y<n; y++) {
            if(A.get(x) > A.get(y)) {
                break;
            }
        }
        y--;
        
        //System.out.println("x and y: " + x + " " + y);
        int temp = A.get(x);
        A.set(x, A.get(y));
        A.set(y, temp);
        
        Collections.reverse(A.subList(x+1,n));
        return A;
    }
}