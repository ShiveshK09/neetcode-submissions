class Solution {
    public String minWindow(String s, String t) {
        int[] cnt=new int[128];
        for(char c:t.toCharArray()) cnt[c]++;
        int l=0,st=0,min=Integer.MAX_VALUE;
        int need=t.length();
        for(int r=0;r<s.length();r++)
        {
            if(cnt[s.charAt(r)]-- >0) need--;
            while(need==0){
                if(r-l+1<min){
                  min=r-l+1;
                  st=l;
                }
                if(++cnt[s.charAt(l++)]>0) need++;
            }           
        }
        return min==Integer.MAX_VALUE? "" : s.substring(st,st+min);
    }
}
