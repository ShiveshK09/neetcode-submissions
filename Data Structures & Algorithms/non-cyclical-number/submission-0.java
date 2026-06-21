class Solution {
    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;
       while(fast!=1){
        slow=sum(slow);
        fast=sum(sum(fast));
        if(slow==fast){
            return slow==1;
        }
       } 
       return true;
    }
    private int sum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d;
            n/=10;
        }
        return s;
    }
}
