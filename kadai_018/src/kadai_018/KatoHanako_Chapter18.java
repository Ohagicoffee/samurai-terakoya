package kadai_018;
	//親クラスから継承する子クラス➂
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	//名を表すフィールドの値をセット(コンストラクタ)
		public KatoHanako_Chapter18() {
			this.givenName = "花子";
		}
		
	//個別の紹介をオーバーライドする
		public void eachIntroduce() {
			System.out.println("趣味は読書です");
		}
}
