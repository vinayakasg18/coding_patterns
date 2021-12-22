from typing import List


class word_finder:
    def word_find(self, letters: List[List], words: List) -> List:
        m = len(letters)
        n = len(letters[0])
        
        lst = []
        
        for i in range(m):
            buffer = ""
            for j in range(n):
                buffer = buffer + letters[i][j]
            lst.append(buffer)
            
        for i in range(n):
            buffer = ""
            for j in range(m):
                buffer = buffer + letters[i][j]
            lst.append(buffer)

        result = ["None"] * len(words)
        k = 0
        for i in range(len(words)):
            found = False
            for j in range(len(lst)):
                buffer = lst[j]
                if words[i] in buffer or words[i] in reversed(buffer):
                    result[k] = "Yes"
                    k += 1
                    found = True
                    break
            if not found:
                result[k] = "No"
                k += 1
        return result

grid = [ [ 'C', 'A', 'T' ], [ 'I', 'D', 'O' ], [ 'M', 'O', 'M' ] ]
words = "CAT TOM ADO MOM CDM".split(" ")
print(word_finder().word_find(grid, words))     