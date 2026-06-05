class Solution {
    public int trap(int[] height) {
        int ans=0;
        int left=0,right=height.length-1;
        int lmax=height[0],rmax=height[right];
        while(left<=right){
            if(lmax<=rmax){
                lmax=Math.max(lmax,height[left]);
                int val=Math.min(lmax,rmax)-height[left];
                ans+=val<0?0:val;
                left++;
            }
            else{
                rmax=Math.max(rmax,height[right]);
                int val=Math.min(lmax,rmax)-height[right];
                ans+=val<0?0:val;
                right--;
            }
        }
        return ans;
    }
}
