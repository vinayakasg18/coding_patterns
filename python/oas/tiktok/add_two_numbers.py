import math

class AddNumbers:
    def add_nums(self, a: float, b: float) -> int:
        sum = math.floor(a + b)
        return sum
    
if __name__ == "__main__":
    print(AddNumbers().add_nums(2.34, 5.7))