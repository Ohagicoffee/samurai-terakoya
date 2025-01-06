package kadai_015;

//車クラス
public class CarExec_Chapter15 {

	//フィールド設定
	private int gear = 1; //１速～５速のギア
	private int speed = 10; //ギアチェンジ後の速度
	
	//コンストラクタ(初期化処理)
	public CarExec_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//【メソッド】gearChange_
	public void gearChange(int afterGear) {
		//ギアの値により速度を変える
		switch(afterGear) {
		case 1 -> System.out.println("時速10km");
		case 2 -> System.out.println("時速20km");
		case 3 -> System.out.println("時速30km");
		case 4 -> System.out.println("時速40km");
		case 5 -> System.out.println("時速50km");
		default -> System.out.println("時速10km");
		}
	}
	
	//【メソッド】run_ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("ギアチェンジ後の速度は" +this.speed + "kmです");
	}
}
