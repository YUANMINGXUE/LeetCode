
// @Title: 无重复字符的最长子串 (Longest Substring Without Repeating Characters)
// @Author: 2692203539@qq.com
// @Date: 2022-03-10 20:56:08
// @Runtime: 105 ms
// @Memory: 42 MB

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> set = new HashSet<>();
        int  start ,ans= 0;
        int l = s.length();
        for(int i = 0;i<l;i++){
            int j=i;
           while (j<l&&!set.contains(s.charAt(j))){
               set.add(s.charAt(j));
               ++j;
           }
           ans = Math.max(ans, set.size());
           set.clear();
        }
        return ans;
    }
}
