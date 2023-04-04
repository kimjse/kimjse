const repl = require('repl');

repl.start({
    prompt: "cm 단위의 숫자를입력해주세요.> ",
    eval:(command, context, filename, callback) => {
 
	let number = Number(command);
	const cm = Number(number)
	const inch = cm * 0.393701

	console.log(`${cm}cm는 ${inch}inch 입니다.`)
		
	callback();
   }
});