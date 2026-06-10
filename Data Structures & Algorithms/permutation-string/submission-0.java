class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] ar1=new int[26];
        int[] ar2=new int[26];
        for(char c:s1.toCharArray()){
            ar1[c-'a']++;
        }
        for(int i=0;i<m;i++){
            ar2[s2.charAt(i)-'a']++;
            if(i>=n)ar2[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(ar1,ar2)) return true;
        }
        return false;
    }
}
