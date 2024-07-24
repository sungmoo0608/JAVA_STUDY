import java.util.Scanner;

class Money{
	private int money;

	Money(int money) {
		this.money = money;
	}

	public void show() {
		int m50000,m10000,m5000,m1000,m500,m100;
		int tMoney;

		m50000 = money/50000;
		tMoney = money%50000;

		m10000 = tMoney/10000;
		tMoney = tMoney%10000;

		m5000 = tMoney/5000;
		tMoney = tMoney%5000;

		m1000 = tMoney/1000;
		tMoney = tMoney%1000;

		m500 = tMoney/500;
		tMoney = tMoney%500;

		m100 = tMoney/100;
		tMoney = tMoney%100;

		System.out.println("총금액 : " + money +"원");
		System.out.println("5만원권 : " + m50000 + "장");
		System.out.println("1만원권 : " + m10000 + "장");
		System.out.println("5천원권 : " + m5000 + "장");
		System.out.println("1천원권 : " + m1000 + "장");
		System.out.println("5백원 : " + m500 + "개");
		System.out.println("1백원 : " + m100 + "개");
	}
}
public class MoneyCountLoop {

	public static void main(String[] args) {

		while(true) {
			int money; 
			Scanner sc = new Scanner(System.in);

			System.out.println("머니를 입력하시오 :");
			money = sc.nextInt(); 
			
			Money m = new Money(money);

			m.show();
			System.out.println("계속하시겠습니까? y,n");

			String yesOrNo = sc.next();

			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}

		}

		System.out.println("지폐 갯수 구하기 종료합니다.");

	}

}