from typing import List

def findNumber(nums: List[int]) -> int:
    for i in range(len(nums)):
        if nums[i] != i + 1:
            nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]   
    for j in range(len(nums)):
        if nums[j] != j + 1:
            return nums[j] + (j + 1)
    return -1

print(findNumber([10, 2, 3, 4, 5, 6, 7, 8, 9, 10]))