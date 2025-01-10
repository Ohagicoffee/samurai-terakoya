package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
	//各子クラスのインスタンスを親クラスへ代入するように作成
	Kato_Chapter18 taro = new KatoTaro_Chapter18();
	Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
	Kato_Chapter18 hanako = new KatoHanako_Chapter18();
	
	//子クラスインスタンスを実行させる
	//=====taro=====
	taro.exeIntroduce();
	ichiro.exeIntroduce();
	hanako.exeIntroduce();
	
	}
}
