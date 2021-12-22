from typing import List


class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = {}
        for i in range(len(nums)):
            diff = abs(target - nums[i])
            if diff in result:
                return [result[diff], i]
            result[nums[i]] = i
        return None
    
print(TwoSum().twoSum([2, 7, 11, 15], 9))