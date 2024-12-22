//head要素を取得して中身を出力する
console.log(document.head);

//body要素を取得して中身を出力する
console.log(document.body);

//windowオブジェクトの中身を出力する
console.log(window);

//HTML要素内のリスト１を出力する
console.log(document.getElementById('first-list'));

//HTML要素内で大中問わず見出しを出力する
console.log(document.getElementsByClassName('heading'));

//複数のHTML要素を１つずつ取得し、中身を出力する
const headings = document.getElementsByClassName('heading');

for(let i=0; i < headings.length; i++) {
  console.log(headings[i]);
}

//HTML要素をCSSセレクタで取得し、中身を出力する(最初の１つ)
console.log(document.querySelector('h1'));
console.log(document.querySelector('#second-heading'));
console.log(document.querySelectorAll('.heading'));
console.log(document.querySelector('li'));

//新しくli要素を作成し、定数に代入する
const li = document.createElement('li');

//作成したli要素にテキストを追加する
li.textContent = 'JavaScriptで新しく作成したリスト３';
//li.innerHTML = '<a href ="#>JavaScriptで新しく作成したリスト３</a>';

//ul要素の末尾にli要素を追加する
document.querySelector('ul').appendChild(li);