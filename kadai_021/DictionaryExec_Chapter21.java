package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		//Dictionary_Chapter21のインスタンスを生成
		Dictionary_Chapter21 checkFruit = new Dictionary_Chapter21();
		
		//辞書に存在するか確認したい単語を配列にセットする
		String[] wordsToCheck = {"apple", "banana", "grape", "orange"};
		
		checkFruit.hashMap(wordsToCheck);
	}
}

