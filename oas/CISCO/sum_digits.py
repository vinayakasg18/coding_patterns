def sum_digit(numX, numY):
    ans = 0
    for i in range(1, numX + 1):
        s = 0
        nX = i
        
        while nX > 0:
            s =+ nX % 10
            nX = nX // 10
        if s == numY:
            ans =+ 1
    return ans

if __name__ == "__main__":
    print(sum_digit(18, 9))
    