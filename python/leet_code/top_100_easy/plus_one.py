from typing import List


class plus_one:
    def plusOne(self, digits: List[int]) -> List[int]:
        # num1 = int("".join(map(str, digits)))
        # sum1 = num1 + 1
        
        # num2 = [int(x) for x in str(sum1)]
        
        # return num2
        
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] == 9:
                digits[i] = 0
            else:
                digits[i] = digits[i] + 1
                return digits
        
        return [1] + digits
    

if __name__ == "__main__":
    digits = [9, 9, 9]
    print(plus_one().plusOne(digits))