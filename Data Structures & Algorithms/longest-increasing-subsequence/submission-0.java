class Solution {
    public int lengthOfLIS(int[] nums) {
       int[] dp=new int[nums.length];
        int len=0;
        for(int num:nums)
        {
            int i=0,j=len;
            while(i<j)
            {
                int m=(i+j)/2;
                if(dp[m]<num) i=m+1;
                else j=m;
            }
            dp[i]=num;
            if(i==len) len++;
        }
        return len; 
    }
}
