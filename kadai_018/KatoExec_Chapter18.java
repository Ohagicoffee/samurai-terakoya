package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		//Taro, Ichiro, Hanakoの子クラスからインスタンスをそれぞれ生成
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		
		taro.execIntroduce();
		hanako.execIntroduce();
		ichiro.execIntroduce();

	}
}
