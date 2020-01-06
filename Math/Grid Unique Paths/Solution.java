public class Solution {
    public double fact(int x) {
        double y = 1;
        for(int i=1; i<=x; i++) {
            y *= i;
        }
        return y;
    }
    
    public int uniquePaths(int A, int B) {
        if(A<2) return 1;
        if(B<2) return 1;
        
        return (int) (fact(A+B-2)/(fact(A-1) * fact(B-1)));
    }
}