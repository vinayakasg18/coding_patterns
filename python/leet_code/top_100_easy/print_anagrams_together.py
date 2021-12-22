from typing import List


class PrintAnagrams:
    def print_anagrams_together(self, array: List):
        words = []
        index = []
        dict = {}
        
        for i in range(len(array)):
            index.append(i)
            words.append(sorted(array[i]))
            
        print(index)
        print(words)


PrintAnagrams().print_anagrams_together(["cat", "dog", "tac", "god", "act"])