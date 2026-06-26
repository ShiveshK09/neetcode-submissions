class Solution {
     List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>());
        return ans;
    }

    void dfs(int[] nums, int i, List<Integer> cur) {
        ans.add(new ArrayList<>(cur));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            cur.add(nums[j]);
            dfs(nums, j + 1, cur);
            cur.remove(cur.size() - 1);
        }
}
}
