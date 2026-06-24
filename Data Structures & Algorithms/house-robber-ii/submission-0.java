class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(rob(nums,0,n-2),rob(nums,1,n-1));
    }
    
    int rob(int[] nums,int l,int r)
    {
        int p1=0;
        int p2=0;
        for(int i=l;i<=r;i++)
        {
            int curr=Math.max(p1+nums[i],p2);
            p1=p2;
            p2=curr;
        }
        return p2;
    }
}
