
// @Title: 最长回文子串 (Longest Palindromic Substring)
// @Author: 2692203539@qq.com
// @Date: 2022-03-14 16:26:04
// @Runtime: 259 ms
// @Memory: 45.3 MB

class Solution {
    public String longestPalindrome(String s) {
        int length =s.length();
        int Maxl=1;
        int begin = 0;
        boolean[][] dp = new boolean[length][length];
        if (length<2&&s!=null){
            return s;
        }
        for(int i =0 ;i<length;i++){
            dp[i][i] = true;
        }
        for(int L =2;L<=length;L++){
            for(int i =0;i<length;i++){
                int j = L+i-1;
                if(j>=length)break;
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j] =false;
                }else {
                    if(j-i<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i+1>Maxl){
                    Maxl = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+Maxl);
    }
}

