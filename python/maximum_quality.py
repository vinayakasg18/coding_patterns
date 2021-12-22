from typing import List


def maximumQuality(packets: List[int], channels: int) -> int:
    if packets is None or len(packets) == 0:
        return 0
    if len(packets) == 1:
        return packets[0]
    
    packets.sort()
    n = channels - 1
    median = 0
    while n > 0:
        val = packets[len(packets) - 1]
        median =+ val
        packets.pop()
        n = n - 1
    
    result = findMedian(packets, median)
    return result

def findMedian(lst:List, median):
    val = 0
    if (len(lst) % 2 == 0):
        val = (lst[len(lst) / 2] + lst[len(lst) / 2 - 1]) / 2
    else:
        val = lst[len(lst) / 2]
    return val + median


print(maximumQuality([89, 48, 14], 3))