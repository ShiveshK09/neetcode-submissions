class Solution {
    public void rotate(int[][] matrix) {
       int m=matrix.length;
       //transpose
       for(int i=0;i<m;i++){
        for(int j=i;j<m;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       } 
       //reverse each row
       for(int[] row:matrix){
        int left=0,right=m-1;
        while(left<right){
            int temp=row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }
       }
    }
}
