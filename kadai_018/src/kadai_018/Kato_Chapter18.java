package kadai_018;
 //親クラス
abstract public class Kato_Chapter18 {
	
	//姓と名、住所を表すフィールド
	public String familyName; //姓を表す
	public String givenName; //名を表す
	public String address; //住所を表す
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		this.familyName = "加藤";
		System.out.println("名前は" + this.familyName + givenName + "です");
		System.out.println("住所は東京都中野区〇✖です");
	}
	
	//個別の紹介を出力するメソッド(抽象メソッド)
	abstract void eachIntroduce();
		
	
	//紹介を実行するメソッド
	public void exeIntroduce() {
		//上記２つのメソッドを呼び出す
		commonIntroduce();
		eachIntroduce();
	}
}
