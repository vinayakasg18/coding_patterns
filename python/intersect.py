def inter(l,r):
    i=0
    for x in l:
        for i in range(i,len(r)):
            if r[i]>x:
                break
            if r[i]==x:
                yield x

l=[1,2,3]
r=[4,5,6]
x = inter(l,r)
for k in x:
    print(k)