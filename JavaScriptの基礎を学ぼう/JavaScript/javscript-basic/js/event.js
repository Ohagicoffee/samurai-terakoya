//output-btnというid要素を格納する定数を定義
const btn = document.getElementById('output-btn');

//ボタンがクリックされたときにイベント処理を実行
btn.addEventListener('click', ()=> {
  console.log('クリックされました！');
});

//add-btnというid要素を取得し、定数に格納する
const addBtn = document.getElementById('add-btn');

//parent-listというid要素を取得し、parentListという定数に格納
const parentList = document.getElementById('parent-list');

//「リストの追加」を押下したときにリストが追加されるよう記述(テスト)

addBtn.addEventListener('click', ()=> {
  const childList = document.createElement('li'); //li要素を新しく作成する
  childList.textContent = '新しく作成されたリスト要素です'; //作成されたリスト要素にテキストを追加
  parentList.appendChild(childList);
});

//➀テキストボックスに入力した文字列を数える
//文字数を数えるid要素"count-btn"を取得し、定数に格納する
const countBtn = document.getElementById('count-btn');

/*フォームの場合、name属性を使うことで取得が容易になる
文字列を取得し、定数に格納する*/
countBtn.addEventListener('click', ()=> {
  const text = document.forms.textForm.textBox.value;
  //取得した文字列の文字数を数えて出力する
  console.log(text.length + '文字');
});

//➁ラジオボタンの値を取得する




