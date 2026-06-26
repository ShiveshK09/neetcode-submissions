class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] nums, int target, int start,
                     List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < nums.length && nums[i] <= target; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
            path.add(nums[i]);
            dfs(nums, target - nums[i], i + 1, path, res); // i+1 => use once
            path.remove(path.size() - 1);
        }
    }
}
