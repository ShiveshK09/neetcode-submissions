class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.val-a.val);
        for(int key:map.keySet()){
            pq.offer(new Pair(key,map.get(key)));
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().key;
        }
        return ans;
    }
}

class Pair{
    int key;
    int val;
    Pair(int k,int v){
        this.key=k;
        this.val=v;
    }
}
