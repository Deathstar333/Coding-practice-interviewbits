public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : a){
            if(set.contains(num)){
                return num;
            } else {
                set.add(num);
            }
        }
        return a.size()+1;
    }
}
