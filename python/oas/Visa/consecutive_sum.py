import math
def consecutive(num):
    count = 0
    upper_limit = math.ceil((2 * num + 0.25)**0.5 - 0.5) + 1
    for k in range(1, upper_limit):
        num -= k
        if num % k == 0:
            count += 1
    return count - 1

print(consecutive(15))