class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int r = 0, y = x;
        while(y!=0){
            int u = y%10;
            r = r*10 + u;
            y = y /10;
        }
        return r==x;
    }
}
