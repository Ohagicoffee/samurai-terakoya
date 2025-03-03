package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
	//じゃんけんクラスのインスタンスを生成
	Jyanken_Chapter26 janken = new Jyanken_Chapter26();
	
	//自分の手
	String mine = janken.getMyChoice();
	
	//対戦相手の手
	String cpu = janken.getRandom();
	
	//対戦結果
	janken.playGames(mine, cpu);
	
	}
}
