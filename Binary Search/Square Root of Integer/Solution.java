public class Solution {
    public int binarySearch(long x) {
        long high = 46340;
        long low = 1;
        while(low <= high) {
            long mid = low + (high-low)/2;
            if((mid*mid)<=x && x<(mid+1)*(mid+1)) {
                return (int) mid;
            }
            else if((mid*mid)<=x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    
    public int sqrt(int A) {
        if(A == 0) return 0;
        return binarySearch(A);
    }
}