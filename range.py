from random import randrange

exlist=[]
for k in range(20):
    exlist.append(randrange(0,100))

k = int(input("몇번째 데이터를 원하시나요?"))
print(exlist)
exlist.sort()
print(exlist)
print(k, 'th data = ', exlist[k-1])

count = 1
exlist2 = []
while count < 10:
    num = randrange(0,10)
    if num not in exlist2:
        exlist2.append(num)
        count += 1

print(exlist2)

for d in range(k):
    mvalue = min(exlist2)
    di = exlist2.index(mvalue)
    del(exlist2[di])

print(k, 'th value', mvalue)
