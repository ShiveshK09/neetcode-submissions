class Solution {
     public List<List<Integer>> permute(int[] nums) {
        boolean[] mark = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, mark, new ArrayList<>(), ans);
        return ans;
    }
    
    private void backtrack(int[] nums, boolean[] mark, List<Integer> tmp, List<List<Integer>> ans) {
        if(tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }       
        for(int i = 0; i < nums.length; i++) {
            if(mark[i] == false) {
                mark[i] = true;
                tmp.add(nums[i]);
                backtrack(nums, mark, tmp, ans);
                tmp.remove(tmp.size()-1);
                mark[i] = false;
            }
        }
    }
}
