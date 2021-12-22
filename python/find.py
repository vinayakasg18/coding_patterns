#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'findMissing' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def findMissing(arr):
    # Write your code here
    last = len(arr)
    start = 0

    while last > start:
        mid = (last + start) // 2
        
        if arr[mid] != mid + 1:
            last = mid
        else:
            start = mid + 1
    return start + 1
    
print(findMissing([1, 2, 3, 4, 5, 6, 7, 9, 10]))
