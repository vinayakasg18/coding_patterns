from typing import List
import sys


class largest_num():

    def largest_double(self, nums: List[int]) -> int:
        max_l = max(nums)
        index = nums.index(max_l)
        inx = []
        for i in range(0, len(nums)):
            if i != index and nums[i] * 2 <= max_l:
                inx.append(i)
        
        if len(inx) == len(nums) - 1:
            return index
        else:
            return -1
        
        # # Different and better version from discussions section
        
        # m1, m2, index = 0, 0, 0
        
        # for i in range(len(nums)):
        #     if nums[i] > m1:
        #         m1, m2, index = nums[i], m1, i
        #     elif nums[i] > m2:
        #         m2 = nums[i]
        # return index if m1 >= m2 * 2 else -1
                

if __name__ == "__main__":
    nums = [2, 3, 1, 3, 7]
    print(largest_num().largest_double(nums))
    