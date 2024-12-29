class Product {
  constructor(name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }
  //クラス内でメソッドは定義する
  describe() {
    console.log('この商品名は' + this.name + 'です');
  }
}

//インスタンスを作成する
const shampoo = new Product('シャンプー', 500, '生活雑貨');
const coffee = new Product('珈琲', 300, '嗜好品');
const catFood = new Product('キャットフード', 400, '猫用品');

shampoo.describe();
coffee.describe();
catFood.describe();

//通常のオブジェクト(キー(ラベル)と値がセットになっているもののこと)にメソッドを適応する
const Ohagi = {
  name: '河原おはぎ',
  age: 5,
  gender: 'female',
  greet: ()=> {
    console.log('人見知りをする女の子です');
  }
}
Ohagi.greet();
