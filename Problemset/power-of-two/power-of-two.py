
# @Title: 2 的幂 (Power of Two)
# @Author: 2692203539@qq.com
# @Date: 2021-12-21 22:28:37
# @Runtime: 48 ms
# @Memory: N/A

class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        for i in range(32):
            if (pow(2,i)==n or pow(2,-i)==n):
                return True
            
        else :
            return False
