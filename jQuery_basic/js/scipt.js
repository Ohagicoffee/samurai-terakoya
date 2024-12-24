//セレクタ.メソッド名を用いて記載
//書き方例：　$(タグ名、id属性値、class名など).text();

$(function() {
    const title = $('#title').text();       //text()は対象のHTML要素のテキストを取得します
    const list = $('.message').text();

    //取得したテキストを出力
    console.log(title);
    console.log(list);
})

//部分一致の書き方例です↓↓
// $('HTML要素[属性*="属性値"]')
$('li[class*="sample"]').text()        // <li class="hogesamplehoge">サンプル</li>

//前方一致の書き方例です↓↓
$('HTML要素[属性^="属性値"]').text()          //<li class="samplehoge">サンプル</li>

//後方一致の書き方例です↓↓
$('li[class$="sample"]').text()           //<li class="hogesample">サンプル</li>

//属性フィルタを使用して出力　項目１：前方一致、項目２：後方一致、前方３：部分一致

//項目１
const list = $('li[class^="list"]').text();
console.log(list);

//項目２
const list2 = $('li[class$="list"]').text();
console.log(list2);

//項目３
const sample = $('li[class*="sample-t"]').text();
console.log(sample); 

