package kadai_015;

public class Car_Chapter15 {
	public static void main(String[] args) {
		//テスト用インスタンスを作成
		CarExec_Chapter15 testData = new CarExec_Chapter15(1, 10);
		
		//gearChangeメソッドを呼び出し
		testData.gearChange(3);
		
		//runメソッドを呼び出し
		testData.run();
	}
}
