
// @Title: 长度最小的子数组 (Minimum Size Subarray Sum)
// @Author: 2692203539@qq.com
// @Date: 2022-03-15 15:15:50
// @Runtime: 1 ms
// @Memory: 41.5 MB

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum =0,minlen =nums.length+1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                  minlen=minlen>i-j+1?i-j+1:minlen;
                  sum-=nums[j];
                  j++;
            }
        }
        return minlen>nums.length?0:minlen;
    }
}

