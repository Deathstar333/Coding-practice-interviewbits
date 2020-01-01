import java.util.*;

public class Solution {
    
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int n=A.size();
        long maxprod=0;
        ArrayList<Integer> lsv = new ArrayList<Integer>(n);
        ArrayList<Integer> rsv = new ArrayList<Integer>(n);
        Stack<StackEntry> S1 = new Stack<StackEntry>();
        
        //System.out.println("lsv before: " + lsv);
        //LSV loop
        for(int i=0; i<n; i++) {
            while(!S1.empty()) {
                if(S1.peek().value > A.get(i)) {
                    
                    lsv.add(S1.peek().index);
                    break;
                }
                S1.pop();
            }
            if(S1.empty()) {
                lsv.add(0);
            }
            S1.push(new StackEntry(i, A.get(i)));
        }
        //System.out.println("lsv after: " + lsv);
        
        //clearing stack
        while(!S1.empty()) {
            S1.pop();
        }
        
        //System.out.println("rsv before: " + rsv);
        //RSV loop
        for(int i=n-1; i>=0; i--) {
            while(!S1.empty()) {
                if(S1.peek().value > A.get(i)) {
                    
                    rsv.add(S1.peek().index);
                    break;
                }
                S1.pop();
            }
            if(S1.empty()) {
                rsv.add(0);
            }
            S1.push(new StackEntry(i, A.get(i)));
        }
        Collections.reverse(rsv);
        //System.out.println("rsv after: " + rsv);
        
        for(int i=0; i<n; i++) {
            long x = lsv.get(i);
            long y = rsv.get(i);
            x = x * y;
            maxprod = Math.max(maxprod, x%1000000007);
        }
        
        return (int)maxprod;
    }
}

class StackEntry {
    int index;
    int value;
    
    StackEntry() {
    }
    
    StackEntry(int i,int v) {
        this.index = i;
        this.value = v;
    }
}