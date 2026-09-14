class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=0;i<ans.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || ans.charAt(i)!=strs[j].charAt(i)){
                   return ans.substring(0,i);
                }
            }
        }
        return ans;
    }
}