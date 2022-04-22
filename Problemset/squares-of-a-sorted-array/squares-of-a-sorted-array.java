
// @Title: 有序数组的平方 (Squares of a Sorted Array)
// @Author: 2692203539@qq.com
// @Date: 2022-03-15 14:39:16
// @Runtime: 1 ms
// @Memory: 43.2 MB

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0,j=nums.length-1,ind =nums.length-1;
        int[] result = new int[nums.length];
        while(i<=j){
           if(Math.abs(nums[i])<=Math.abs(nums[j])){
               result[ind]=nums[j]*nums[j];
               j--;
               ind--;
           }else {
               result[ind]=nums[i]*nums[i];
               i++;
               ind--;
           }
        }
        return  result;
    }
}

