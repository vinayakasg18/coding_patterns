from typing import List


class Corrupted_array:
    def corrupted_array(self, pairs: List[List]) -> List:
        visited = []

        for i in range(len(pairs)):
            x = pairs[i][0]
            y = pairs[i][1]
            
            if x not in visited:
                visited.append(x)
            if y not in visited:
                visited.append(y)
        return visited

print(Corrupted_array().corrupted_array([[3, 5], [1, 4], [2, 4], [1, 5]]))