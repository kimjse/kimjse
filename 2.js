const repl = require('repl');

repl.start({
    prompt: "원의 반지름을 입력해주세요.> ",
    eval:(command,context,filename,callback) => {
 
	let number = Number(command);
	const cm = Number(number)
	const  cir = 2 * cm * 3.14
	const area = cm * cm * 3.14 

	console.log(`반지름은 ${cm}입니다`)
	console.log(`둘래는 ${cir}입니다`)
	console.log(`넓이은 ${area}입니다`)
		
	callback();
   }
});