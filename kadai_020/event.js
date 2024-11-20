//btnというidを持つHTML要素を取得し、定数へ代入
const btn = document.getElementById('btn');

//HTML要素がクリックされたときにイベント処理を実行
btn.addEventListener('click', ()=> {
    document.getElementById('text').textContent = "ボタンをクリックしました";
});