public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size(), i = 0, digit = 0, carry = 0;
        if(A.get(n-1) != 9) {
            digit = A.get(n-1);
            A.set(n-1, digit+1);
        }
        else {
            
            i = n-1;
            digit = A.get(i);
            A.set(i, (digit+1)%10);
            carry = (digit+1)/10;
            while(carry > 0) {
                i = i-1;
                if(i<0) {
                    A.add(0,1);
                    break;
                }
                digit = A.get(i);
                A.set(i, (digit+1)%10);
                carry = (digit+1)/10;
            }
            
        }
        Iterator iter = A.iterator();
        while(iter.hasNext()) {
            int x = (Integer)iter.next();
            if(x != 0) {
                break;
            }
            iter.remove();
        }
        return A;
    }
}
