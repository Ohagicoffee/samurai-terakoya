package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	//子クラス自身のコンストラクタを記載
	KatoHanako_Chapter18() {
		super();
	}
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	//親クラスの抽象メソッドを別個の処理を追加
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
