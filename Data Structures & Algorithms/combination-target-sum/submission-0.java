class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(nums,target,0,new ArrayList<>(),ans);
        return ans;
    }

    public void dfs(int[] nums,int target,int start,List<Integer> cur,List<List<Integer>> ans){
        if(target==0)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target) continue;
            cur.add(nums[i]);
            dfs(nums,target-nums[i],i,cur,ans);
            cur.remove(cur.size()-1);
        }
    }
}
