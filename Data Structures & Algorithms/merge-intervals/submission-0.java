class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        list.add(inter[0]);
        for(int i=1;i<inter.length;i++){
            int[] cur=inter[i];
            if(list.getLast()[1]<cur[0]) list.add(cur);
            else list.getLast()[1]=Math.max(list.getLast()[1],cur[1]);
        }
        return list.toArray(new int[list.size()][2]);   
    }
}
