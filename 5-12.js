// 함수 선언
function print(name, count = 1) {
    if (typeof(count) == "undefined") {
    }
    //함수 본문
    console.log(`${name}이/가 ${count}개 있습니다.`)
}

//함수 호출
print("사과");