//함수 선언
function callTenTimes(callback) {
    // 10회 반복
    for(let i = 0; i < 10; i++) {
        //매개 변수로 전달된 함수 호출
        callback();
    }
}

//변수 선언
callTenTimes(function () {
    console.log('함수 호출');
});