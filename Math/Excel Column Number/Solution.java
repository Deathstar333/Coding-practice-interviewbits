public class Solution {
    public int titleToNumber(String A) {
        int n=A.length(), ans=0;
        for(int i=0; i<n; i++) {
            ans += (A.charAt(i) - 64)*((int) Math.pow(26, n-i-1));
        }
        return ans;
    }
}