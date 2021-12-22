from typing import List


class diagonal:
    def diag_traverse(self, mat: List[List[int]]) -> List[int]:
        result, intermediate = [], []
        # N rows and M columns
        N, M = len(mat), len(mat[0])
        if not mat or not mat[0]:
            return []
        for i in range(N + M - 1):
            intermediate.clear()
            
            # Figure out the heads of the diagonal.
            r, c = 0 if i < M else i - M + 1, i if i < M else M - 1
                
            while r < N and c > -1:
                intermediate.append(mat[r][c])
                r += 1
                c -= 1
            if i % 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        return result


if __name__ == "__main__":
    mat = [[3],[2]]
    diagonal().diag_traverse(mat)