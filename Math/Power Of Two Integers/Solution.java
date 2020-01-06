public class Solution {
    public boolean isPower(int a) {
        if(a==1)
            return true;
            
        for(int i=2;i*i<=a;i++) {
            int x=a;
            
            while(x%i==0) {
                x/=i;
            }
            
            if(x==1){
                return true;
            }
        }
        
        return false;
    }
}