class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(nums,0,new ArrayList<>(),ans);
        return ans;
    }

    public void dfs(int[] nums,int start,List<Integer> cur,List<List<Integer>> ans){
        ans.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            dfs(nums,i+1,cur,ans);
            cur.remove(cur.size()-1);
        }
    }
}
