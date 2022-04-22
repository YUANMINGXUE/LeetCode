
# @Title: 两数之和 (Two Sum)
# @Author: 2692203539@qq.com
# @Date: 2021-12-22 10:33:11
# @Runtime: 4080 ms
# @Memory: N/A

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if (nums[i]+nums[j])==target:
                    return [i,j]
        
