public class Solution {
    public String convertToTitle(int A) {
        StringBuilder ans = new StringBuilder();
        int rem = 0;
        while(A > 0) {
            rem = A%26;
            A /= 26;
            if(rem == 0) {
                rem = 26;
                A--;
            }
            ans.append((char)(rem + 64));
        }
        ans.reverse();
        return ans.toString();
    }
}