def pivot_find(nums):
    arr_sum = sum(nums)
    left_sum = 0
    
    for i in range(0, len(nums)):
        if left_sum == arr_sum - left_sum - nums[i]:
            return i
        left_sum += nums[i]
    return -1


if __name__ == "__main__":
    nums = [1, 7, 3, 6, 5, 6]
    print(pivot_find(nums))