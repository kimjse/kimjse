n=int(input("몇개의 데이터 처리 : "))
listex = []
sum = 0

print('%d개의 데이터 입력 :' % n)
for k in range(n):
    listex.append(int(input()))
    sum += listex[k]

print('리스트 데이터의 합과 평균 : %d, %.2f\n' % (sum, sum/n))


print('주어진 리스트는 최대값(%d), 최소값(%d)을 가지고 있습니다' % (max(listex), min(listex)))


listex2 = [50, 80,90, 30,10,70,44,55]
print(max(listex2))