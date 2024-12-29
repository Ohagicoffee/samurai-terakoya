//引数はprice
const calculateTotal = (price)=> {
  console.log(price + 500 +"円");
}

//priceを1200で関数calculateを呼び出す
calculateTotal(1200);

//priceを900で関数calculateを呼び出す
calculateTotal(900);

//引数が2つ以上のときの関数を考える
const addTwoArguments = (price, shippingFee)=> {
  console.log(price + shippingFee + "円");
}

//priceは970、shippingFeeは300のとき
addTwoArguments(970, 300);

//与えられた引数numを2倍にし、その値を戻り値として返す関数
const double = (num)=> {
  return num * 2;
}

console.log(double(40));

//スコープの対象範囲内のとき

//スコープの対象から外れているとき
const  callingCat2 = (userName)=> {
  const anotherCat = 'ヒコちゃん';
  console.log('我が家には'+ userName +'と' + anotherCat +'がいます');
}

callingCat2('おはぎちゃん');
console.log(anotherCat);