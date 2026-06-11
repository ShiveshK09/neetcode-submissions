class Pair{
    int val;
    int min;
    Pair(int v,int m){
        this.val=v;
        this.min=m;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) st.push(new Pair(val,val));
        else{
            int min=Math.min(st.peek().min,val);
            st.push(new Pair(val,min));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
