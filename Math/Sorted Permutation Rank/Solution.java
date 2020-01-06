public class Solution {
    public int findRank(String s) {
        final int m = 1000003;
        final int n = s.length();
        final int[] f = new int[n + 1];
        f[0] = f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] * i;
            f[i] %= m;
        }
        
        int rank = 0;
        
        final SortedSet<Character> set = new TreeSet<>();
        
        for (int i = n - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            final int less = set.headSet(c).size();
            
            rank += less * f[n - 1 - i];
            rank %= m;
            
            set.add(c);
        }
        
        return rank + 1;
    }
}