package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	
	//名を表すフィールドの値をセットする
	public void setGivenName(){
			this.givenName = "太郎";
		}
	
	//親クラスの抽象メソッドを別個の処理を追加
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
	
}
