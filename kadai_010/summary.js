$(function() {    
    //文字色変化ボタンを押すと「こんにちは！」の色が変化する
    $('#change-color').on('click', function() {
        $('#target').css('color', 'red');
    });

    //文字内容変化ボタンを押すと「Hello！」に言葉が変化する
    $('#change-text').on('click', function() {
        $('#target').text('Hello!');
    });
    //フェードアウトボタンを押すと文字が徐々に消える
    $('#fade-out').on('click', function() {
        $('#target').fadeOut();
    });
    //フェードインボタンを押すと文字が少しずつ表れる
    $('#fade-in').on('click', function() {
        $('#target').fadeIn();
    })

});

