package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	//子クラス自身のコンストラクタを記載
	KatoIchiro_Chapter18() {
		super("一郎");
	}
	
	//親クラスの抽象メソッドを別個の処理を追加
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
