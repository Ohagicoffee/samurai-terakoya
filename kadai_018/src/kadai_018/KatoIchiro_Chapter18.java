package kadai_018;
//親クラスから継承する子クラス➁
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	//名を表すフィールドの値をセット(コンストラクタ)
		public KatoIchiro_Chapter18() {
			this.givenName = "一郎";
		}
		
	//個別の紹介をオーバーライドする
		public void eachIntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}
}
