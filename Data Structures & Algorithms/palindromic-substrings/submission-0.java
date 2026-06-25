class Solution {
    public int countSubstrings(String s) {
        int n=s.length(),ans=0;
        for(int i=0;i<n;i++){
            ans+=cnt(s,i,i);//odd
            ans+=cnt(s,i,i+1);//even
        }
        return ans;
    }
    int cnt(String s,int l,int r){
    int c=0;
    while(l>=0 &&r<s.length()&&s.charAt(l--)==s.charAt(r++))c++;
    return c;
      }
}


