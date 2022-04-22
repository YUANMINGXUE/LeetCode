
// @Title: 二分查找 (Binary Search)
// @Author: 2692203539@qq.com
// @Date: 2022-03-14 18:32:09
// @Runtime: 0 ms
// @Memory: 41.7 MB

class Solution {
    public int search(int[] nums, int target) {
        int start =0,end =nums.length-1;
        int res =-1;
        while(start<=end){
            if(nums[(start+end)/2]==target){
                return (start+end)/2;
            }else {
                if(nums[(start+end)/2]>target){
                    end=(start+end)/2-1;
                }else {
                    start=(start+end)/2+1;
                }
            }
        }
        return res;
    }
}

