print("합을 구할 데이터수와 질문 갯수를 입력 : ")

suNo, quizNo = map(int, input().split())
numbers = list(map(int, inout().split()))
pSum = [0]
temp = 0

for i in numbers :
    temp = temp + i
    pSum.append(temp)

print(pSum)

for i in range(quizNo) :
    s, e = map(int, input().split())
    print(slist[i])