public class Solution {
    public int mod_exp(long x, long n, long d) {
        if(n == 0) {
            return 1;
        }
        long result = 0;
        if(n%2 == 0) {
            result = ((mod_exp(x,n/2,d)%d)*(mod_exp(x,n/2,d)%d))%d;
        }
        else {
            result = ((mod_exp(x,n-1,d)%d)*(x%d))%d;
        }
        return (int) ((result+d)%d);
    }
    
    public int pow(int x, int n, int d) {
        if(x == 0) {
            return 0;
        }
        return mod_exp(x,n,d);
    }
}