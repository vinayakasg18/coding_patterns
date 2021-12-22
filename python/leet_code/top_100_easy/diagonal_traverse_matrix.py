from typing import List


class diagonals:
    def matrix_traversal(self, mat: List[List[int]]) -> List[int]:
        result = []
        mat_map = {}
        
        M = len(mat)
        # N = len(mat[0])
        
        for i in range (M):
            for j in range (len(mat[i])):
                if i + j not in mat_map:
                    mat_map[i + j] = [mat[i][j]]
                else:
                    mat_map[i + j].append(mat[i][j])
        
        for k, v in mat_map.items():
            if k % 2 == 0:
                result.extend(v[::-1])
            else:
                result.extend(v)
        
        return result

if __name__ == "__main__":
    mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    diagonals().matrix_traversal(mat)