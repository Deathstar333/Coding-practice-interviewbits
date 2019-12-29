import java.lang.Math;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int maxsum = A.get(0);
        int ans = A.get(0);
        for(int i = 1; i < n; i++) {
            maxsum = Math.max(maxsum + A.get(i), A.get(i));
            ans = Math.max(ans, maxsum);
        }
        return ans;
    }
}