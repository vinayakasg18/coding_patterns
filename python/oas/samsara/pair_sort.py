from typing import List


class Sort:
    def sort_pair(self, nums: List) -> List:
        res = []
        for i in range(0, len(nums), 2):
            j = i + 1
            y = nums[i]
            if j < len(nums):
                x = nums[j]
                if x > y:
                    res.append(y)
                    res.append(x)
                else:
                    res.append(x)
                    res.append(y)
            else:
                res.append(y)
        return res
              
print(Sort().sort_pair([1, 5, 7, 3, 2, 1, 0]))
            