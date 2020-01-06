public class Solution {
    public int reverse(int A) {
        int sign = 1, digit = 0;
        int no_of_digits = 0;
        double l = 0,ans = 0;
        if(A < 0) {
            sign = -1;
        }
        A = Math.abs(A);
        
        int temp = A;
        while(temp > 0) {
            temp /= 10;
            no_of_digits++;
        }
        
        while(A > 0) {
            digit = A%10;
            A /= 10;
            ans += digit*Math.pow(10,no_of_digits-1);
            no_of_digits--;
        }
        ans = sign*ans;
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int)ans;
    }
}