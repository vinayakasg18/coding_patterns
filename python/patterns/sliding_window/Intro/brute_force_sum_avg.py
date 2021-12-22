from typing import List


class AvgSum:
    def avg_sum_bf(self, nums: List, K: int):
        avg = []
        for i in range(len(nums) - K):
            sum = 0
            for j in range(i, i + K):
                sum += nums[j]
            avg.append(sum / K)
        return avg
    
if __name__ == "__main__":
    print(AvgSum().avg_sum_bf([1, 3, 2, 6, -1, 4, 1, 8, 2], 5))