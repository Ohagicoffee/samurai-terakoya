package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
	//【HashMapListメソッド】：HashMapを生成し、Listに変換する
	protected void hashMap(String[] wordsToCheck) {
		
		
		//HashMapのfruitMapを生成
		HashMap<String, String> fruitMap =  new HashMap<String, String>();
		
		//fruitMapに果物10種類を追加
		fruitMap.put("apple", "りんご");
		fruitMap.put("peach", "桃");
		fruitMap.put("banana", "バナナ");
		fruitMap.put("lemon", "レモン");
		fruitMap.put("pear", "梨");
		fruitMap.put("kiwi", "キウイ");
		fruitMap.put("strawberry", "いちご");
		fruitMap.put("grape", "ぶどう");
		fruitMap.put("muscat", "マスカット");
		fruitMap.put("cherry", "さくらんぼ");
		
	
		//辞書を調べる
		for(int i = 0; i < wordsToCheck.length; i++) {
			if(fruitMap.containsKey(wordsToCheck[i])) {
				System.out.println(wordsToCheck[i] + "の意味は" + fruitMap.get(wordsToCheck[i]));
			} else {
			System.out.println(wordsToCheck[i] + "は辞書に存在しません");
			}
		
		}
	}	

	
		
}

