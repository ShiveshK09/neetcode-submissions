class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(!map.containsKey(value)) map.put(nums[i],i);
            else{
                ans[0]=map.get(value);
                ans[1]=i;
            }
        }
        return ans;
    }
}
