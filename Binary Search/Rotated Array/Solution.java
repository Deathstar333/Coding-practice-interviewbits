public class Solution {
    // DO NOT MODIFY THE LIST
    public int binarySearch(List<Integer> A, int n) {
        int low = 0,high = n-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            //Case 1
            if(A.get(low)<=A.get(high)) {
                return A.get(low);
            }
            
            //Case 2
            int next = (mid + 1)%n;
            int prev = (mid - 1 + n)%n;
            if(A.get(prev) >= A.get(mid) && A.get(next) >= A.get(mid)) {
                return A.get(mid);
            }
            
            //Case 3 and 4
            if(A.get(mid) >= A.get(high)) {
                low = mid + 1;
            }
            else if(A.get(mid) <= A.get(low)) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public int findMin(final List<Integer> a) {
        int n = a.size();
        return binarySearch(a,n);
    }
}