class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<int[]> st=new Stack<>();
        int ans=0;
        for(int i=0;i<h.length;i++){
            int start=i;
            while(!st.isEmpty() && st.peek()[1]>h[i]){
                int[] p=st.pop();
                ans=Math.max(ans,p[1]*(i-p[0]));
                start=p[0];
            }
            st.push(new int[]{start,h[i]});
        }
        while(!st.isEmpty()){
        int[] p=st.pop();
        ans=Math.max(ans,p[1]*(h.length-p[0]));
        }
        return ans;
    }
}
