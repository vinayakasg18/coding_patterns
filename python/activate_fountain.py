def activateFountains(a):
    if not a: 
        return 0
    length = len(a)
    aux = list(range(length + 1))
    for i, x in enumerate(a, 1):
        aux[max(i - x, 1)] = min(i + x, length)
    ans, l, r = 0, 1, aux[1]
    while r <= length:
        new_r, ans = r, ans + 1
        while l <= r:
            new_r = max(new_r, aux[l])
            l += 1
        if l > length: break
        r = max(new_r, aux[l])
    return ans

fountain = {3, 0, 2, 0, 1, 0}
print(activateFountains(fountain))