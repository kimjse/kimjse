const repl = require('repl');

repl.start({
    prompt: "달러 단위의 금액을 입력해주세요.> ",
    eval:(command,context,filename,callback) => {
 
	let number = Number(command);
	const doller = Number(number)
	const  won = doller * 1207

	console.log(`달러: ${doller}doller입니다`)
	console.log(`원화: ${won}won입니다`)
			
	callback();
   }
});