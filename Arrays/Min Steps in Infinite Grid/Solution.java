import java.lang.Math;

public class Solution {
    
    public int minSteps(int x1, int y1, int x2, int y2) {
        
        int ans = Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
        return ans;
    }
    
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int lenA = A.size(), lenB = B.size();
        int result = 0, x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        for(int i = 0; i < lenA - 1; i++) {
             x1 = A.get(i);
             x2 = A.get(i + 1);
             y1 = B.get(i);
             y2 = B.get(i + 1);
             result = result + minSteps(x1,y1,x2,y2);
        }
        return result;
    }
}
