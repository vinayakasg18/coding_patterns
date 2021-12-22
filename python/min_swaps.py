def minMoves(arr):
    count1 = 0
    moves = 0
    for i in arr:
        if i == 0:
            moves += count1
        if i == 1:
            count1 += 1
    count0 = len(arr) - count1
    rev_moves = count1 * count0 - moves
    return min(rev_moves, moves)

print(minMoves([0, 0, 1, 0, 1, 0, 1, 1]))