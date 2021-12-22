from typing import List


class cardinality:
    def card(nums: List) -> List:
        cardnums = []
        for n in nums:
            cardnums.extend("{0:b}".format(int(n)))