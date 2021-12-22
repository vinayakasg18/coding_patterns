from typing import List


class customSort:
    def custom_sort(self, arr: List[int]) -> int:
        swap_count = 0
        even_count = 0
        
        for i in range(len(arr)):
            if arr[i] % 2 == 0:
                if arr[even_count] % 2 != 0:
                    swap_count += 1
                even_count += 1
        return swap_count
    

if __name__ == "__main__":
    arr = [13, 10, 21, 20]
    print(customSort().custom_sort(arr))