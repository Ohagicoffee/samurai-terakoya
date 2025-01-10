package kadai_018;
	//親クラスから継承する子クラス➀
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//名を表すフィールドの値をセット(コンストラクタ)
	public KatoTaro_Chapter18() {
		this.givenName = "太郎";
	}
	
	//個別の紹介をオーバーライドする
	void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
