from typing import List

class AvgSubArray:
    def avg_sub_array(self, nums: List, K: int) -> List:
        sum = 0
        avg = []
        start = 0
        for i in range(len(nums)):
            sum += nums[i]
            if i >= K - 1:
                avg.append(sum / K)
                sum -= nums[start]
                start += 1 #Slide the window
        
        return avg


if __name__ == "__main__":
    num = [1, 3, 2, 6, -1, 4, 1, 8, 2]
    print(AvgSubArray().avg_sub_array(num, 5))
