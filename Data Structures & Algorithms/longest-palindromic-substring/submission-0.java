class Solution {
     int s = 0, len = 0;
    public String longestPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            expand(str, i, i);
            expand(str, i, i + 1);
        }
        return str.substring(s, s + len);
    }
    
    private void expand(String str, int l, int r) {
        while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
            if (r - l + 1 > len) {
                len = r - l + 1;
                s = l;
            }
            l--; r++;
        }
    }
}