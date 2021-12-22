from typing import Counter


class rockWallClimber:
    def jumps(self, flag_height: int, big_jump: int) -> int:
        count = 0
        
        while flag_height > 0:
            if flag_height >= big_jump:
                flag_height -= big_jump
                count += 1
            else:
                flag_height -= 1
                count += 1
        return count


if __name__ == "__main__":
    print(rockWallClimber().jumps(8, 3))
        