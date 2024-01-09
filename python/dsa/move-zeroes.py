# 283
from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pos = 0
        for i in range(len(nums)):

            if nums[i] != 0:
                nums[i], nums[pos] = nums[pos], nums[i]
                pos += 1

nums = [0,1,0,3,12]