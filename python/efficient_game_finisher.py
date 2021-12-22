from typing import List


class game():
    def game_min_completion(self, d: List[int], x: int) -> int:
        # d = [1, 12, 10, 4, 5, 2]
        # x = 2
        days = 1
        curMin = d[0]
        curMax = d[0]
        for i in range(1, len(d)):
            if abs(d[i] - curMin) > x or abs(d[i] - curMax) > x:
                days += 1
                curMin = d[i]
                curMax = d[i]
            else:
                if d[i] > curMax:
                    curMax = d[i]
                if d[i] < curMin:
                    curMin = d[i]
        return days
    
if __name__ == "__main__":
    d = [1, 12, 10, 4, 5, 2]
    x = 2
    print(game().game_min_completion(d, x))