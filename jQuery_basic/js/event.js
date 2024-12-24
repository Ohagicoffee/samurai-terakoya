$(function() {
    //ボタンがクリックされた場合
    $('button').on('click', function() {
        console.log('ボタンがクリックされました');
    });
});
//背景色を変更する場合は、.css('background-color', '任意の色')
$(function() {
    //マウスをクリックした時に、正方形の色をグレーから赤に変える
    $('div').on({
        'click': ()=> {
            $('div').css('background-color', 'red');
            //テキストを「click」
            $('div').text('click');
        },
    //マウスをダブルクリックしたときに背景を緑色に変える
        'dblclick': ()=> {
            $('div').css('background-color', 'green');
            //テキストを「dbclick」
            $('div').text('dblclick');
        },
    //マウスが正方形に重なったときに色を青色に変える
        'mouseenter': ()=> {
            $('div').css('background-color', 'blue');
            //テキストを「mouseenter」
            $('div').text('mouseenter');
        },
    //マウスが正方形から外れたときに色をグレーに戻す
        'mouseout': ()=> {
            $('div').css('background-color', 'gray');
            //テキストを「mouseout」
            $('div').text('mouseout');
        }
    })
})