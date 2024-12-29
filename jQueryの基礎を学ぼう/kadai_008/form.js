$(function() {
  //クラス名btnをクリックしたら
  $('.btn').on('click', function() {
      //クラス名"text-box"に「クリックしました！」と表示する
      $('.text-box').val('クリックしました！');
  })


});