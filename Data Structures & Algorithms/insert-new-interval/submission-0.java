class Solution {
    public int[][] insert(int[][] inter, int[] newInter) {
        List<int[]> list=new ArrayList<>();
        int n=inter.length;
        int i=0;
        while(i<n && inter[i][1]<newInter[0]) list.add(inter[i++]);
        while(i<n && inter[i][0]<=newInter[1]){
            newInter[0]=Math.min(newInter[0],inter[i][0]);
            newInter[1]=Math.max(newInter[1],inter[i][1]);
            i++;
        }
        list.add(newInter);
        while(i<n) list.add(inter[i++]);
        return list.toArray(new int[list.size()][]);
    }
}
