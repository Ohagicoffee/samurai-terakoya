$(function() {
    //ボタンがクリックされた場合
    $('button').on('click', function() {
        console.log('ボタンがクリックされました');
    });
});
//背景色を変更する場合は、.css('background-color', '任意の色')
$(function() {
    $(document).on('click keydown', (e)=> {
        //クリックされた場合
        if(e.type === 'click'){
            $('div').text('クリックされました！');
        }
        //キーが押された場合
        if(e.type === 'keydown') {
            $('div').text('キーが押されました！');
        }
    });
});