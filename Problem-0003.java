class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int res = 0, n = s.length();
        for(int i = 0, j=0; i < n; i++){
            if(map.containsKey(s.charAt(i)))
                j = Math.max(j,map.get(s.charAt(i))+1);
            map.put(s.charAt(i),i);
            res = Math.max(res,i-j+1);
        }

        return res;
    }
}
