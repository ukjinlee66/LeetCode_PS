class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length()/2;
        for(int i=0;i<len;i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
}