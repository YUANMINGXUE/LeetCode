
// @Title: 移除元素 (Remove Element)
// @Author: 2692203539@qq.com
// @Date: 2022-03-14 21:06:21
// @Runtime: 0 ms
// @Memory: 40.1 MB

class Solution {
    public int removeElement(int[] nums, int val) {
            int  fast=0, slow= 0;
            while(fast<nums.length){
                if(nums[fast]!=val){
                    nums[slow]=nums[fast];
                    slow++;
                    fast++;
                }else {
                    fast++;
                }
            }
        return slow;
    }
}

