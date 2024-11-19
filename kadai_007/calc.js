//0~15までの値がランダムに出力される変数numを宣言
let num = Math.floor(Math.random() * 16);
console.log(num);

//numが3と５の倍数のとき
if (num % 3 ===0 && num % 5 ===0) {
    console.log('3と5の倍数です');
}
//numが３の倍数の場合
else if (num % 3 ===0) {
    console.log('3の倍数です');
}
//numが5の倍数の場合
else if (num % 5 ===0) {
    console.log('5の倍数です');
}
//それ以外の場合はそのまま数値を出力
else {
    console.log(num);
}
