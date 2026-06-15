class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int m=nums1.length,n=nums2.length;
        int left=0,right=m;
        int half=(m+n+1)/2;
        while(left<=right){
            int i=(left+right)/2;
            int j=half-i;
            int aL=(i==0)?Integer.MIN_VALUE:nums1[i-1];
            int aR=(i==m)?Integer.MAX_VALUE:nums1[i];
            int bL=(j==0)?Integer.MIN_VALUE:nums2[j-1];
            int bR=(j==n)?Integer.MAX_VALUE:nums2[j];
            if(aL<=bR && bL<=aR){
                return ((m+n)%2==0)?(Math.max(aL,bL)+Math.min(aR,bR))/2.0:Math.max(aL,bL);
            }
            if(aL>bR) right=i-1;
            else left=i+1;
        }
        return 0;
    }
}
