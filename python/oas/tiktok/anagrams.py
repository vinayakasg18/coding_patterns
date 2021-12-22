from typing import List


class Anagrams:
    def anagrams(self, a: List[str], b: List[str]) -> List[int]:
        count = []
        for i in range(len(a)):
            s1 = a[i]
            s2 = b[i]
            num = count_of_manipulations(s1, s2)
            count.append(num)
        return count

def count_of_manipulations(s1: str, s2: str) -> int:
    char_count = 0

    if (len(s1) != len(s2)):
            return -1

    res1 = "".join(sorted(s1))
    res2 = "".join(sorted(s2))
    
    if (res1 != res2):
        for j in range(len(s1)):
            if res1[j] not in res2:
                char_count += 1
        return char_count
    else:
        return char_count
        
                
if __name__ == "__main__":
    # a = ["tea", "tea", "acts"]
    # b = ["ate", "toe", "act"]
    # returns [0, 1, -1]
    
    a = ["a", "jk", "abb", "mn", "abc"]
    b = ["bb", "kj", "bbc", "op", "def"]
    # returns [-1, 0, 1, 2, 3]
    print(Anagrams().anagrams(a, b))
