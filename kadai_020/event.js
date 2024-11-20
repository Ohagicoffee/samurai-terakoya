//btnというidを持つHTML要素を取得し、定数へ代入
const btn = document.getElementById('btn');
const text = document.getElementById('text');

//HTML要素がクリックされたときにイベント処理を実行
btn.addEventListener('click', ()=> {
    text.textContent = "ボタンをクリックしました";
});
