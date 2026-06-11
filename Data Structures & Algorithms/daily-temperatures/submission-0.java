class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]<temperatures[i]){
                int[] temp=st.pop();
                res[temp[1]]=i-temp[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
        return res;
    }
}
