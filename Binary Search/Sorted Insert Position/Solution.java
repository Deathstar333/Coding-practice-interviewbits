public class Solution {
    public int binarySearch(ArrayList<Integer> A, int N,int k) {
        int low = 0;
        int high = N-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(A.get(mid) == k) {
                return mid;
            }
            if(A.get(mid) < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
    
    public int searchInsert(ArrayList<Integer> a, int b) {
        int n = a.size();
        return binarySearch(a,n,b);
    }
}