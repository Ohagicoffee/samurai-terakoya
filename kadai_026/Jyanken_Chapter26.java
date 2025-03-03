package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//getMyChoiceメソッド: 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
			
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
			
		//入力した内容を取得する
		String input = scanner.nextLine();
		String myChoice = "";
		
		//入力内容判定用の変数を設定
		boolean flag = true;	
		
		if(input.equals("r")) {
			myChoice = "グー";
		}else if(input.equals("s")) {
			myChoice = "チョキ";
		}else if(input.equals("p")) {
			myChoice = "パー";
		}else {
			flag = false;
			myChoice = "不正な値";
		}
		
		
		while(myChoice.equals("不正な値")) {
			Scanner scanner2 = new Scanner(System.in); //不正な値が入力された場合用
			String input2 = scanner.nextLine();
			
			if(input2.equals("r")) {
				scanner2.close();
				myChoice = "グー";
				flag = false;
				
			}else if(input2.equals("s")) {
				scanner2.close();
				myChoice = "チョキ";
				flag = false;
				
			}else if(input2.equals("p")) {
				scanner2.close();
				myChoice = "パー";
				flag = false;
				
			}else {
				System.out.println("不正な値だったためやり直し");
			}
		}
		scanner.close();
		return myChoice;
			 
	}
	
	//getRandomメソッド：対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//じゃんけんの手に対応する数値用の変数と、数値に該当するじゃんけんの手の変数を定義
		int num = (int)(Math.floor(Math.random() *3));
		String cpuChoice = "";
		
		//ランダムに出力される数字をじゃんけんの手に対応させる
		cpuChoice = switch(num) {
			case 0 -> "グー";
			case 1 -> "チョキ";
			case 2 -> "パー";
			default -> "";
		};
		
		return cpuChoice;
		
		}
	
	//playGamesメソッド：じゃんけんを行う
	public void playGames(String myChoice, String cpuChoice) {
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + cpuChoice);
		
		//HashMapの生成
		HashMap<String, String> combi = new HashMap<String, String>();
		
		//combiにじゃんけんの手の組み合わせを追加する
		combi.put("グー_グー", "引き分け");
		combi.put("チョキ_チョキ", "引き分け");
		combi.put("パー_パー", "引き分け");
		combi.put("グー_チョキ", "勝ち");
		combi.put("チョキ_パー", "勝ち");
		combi.put("パー_グー", "勝ち");
		combi.put("グー_パー", "負け");
		combi.put("チョキ_グー", "負け");
		combi.put("パー_チョキ", "負け");
		
		String result = combi.get(myChoice + "_" + cpuChoice);
		System.out.println("自分の" + result + "です");
				
		
	
		
	}
	
	
	
	
	
	
}
