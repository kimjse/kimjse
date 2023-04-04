//변수 생성
const 함수 = function (A, B) {
    let result = 1;
    for(let i = A; i <= B; i++) {
        result *= i
    }
    return result   
}

console.log(함수(1, 2))
console.log(함수(1, 3))