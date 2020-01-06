public class Solution {
    //returns no  of elements in matrix less than x in O(N*logM)
    public int binarySearchCount(ArrayList<ArrayList<Integer>> A,int N, int M, int x) {
        int full_count = 0;
        for(int i=0; i<N; i++) {
            int low = 0;
            int high = M-1;
            int count = 0;
            while(low <= high) {
                int mid = low + (high-low)/2;
                if(A.get(i).get(mid) < x) {
                    count = mid + 1;
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            full_count += count;
        }
        return full_count;
    }
    
    public int binarySearch(ArrayList<ArrayList<Integer>> A,int N, int M) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int count = binarySearchCount(A,N,M,mid);
            if(count > (M*N)/2) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return high;
    }
    
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int n =A.size(), m=A.get(0).size();
        return binarySearch(A,n,m);
    }
}