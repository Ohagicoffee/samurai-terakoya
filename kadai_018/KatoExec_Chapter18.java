package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		//Taro, Ichiro, Hanakoの子クラスからインスタンスをそれぞれ生成
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		
		//taroの自己紹介
		taro.setGivenName();
		taro.execIntroduce();
		
		//hanakoの自己紹介
		hanako.setGivenName();
		hanako.execIntroduce();
		
		//ichiroの自己紹介
		ichiro.setGivenName();
		ichiro.execIntroduce();

	}
}
