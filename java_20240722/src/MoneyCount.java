class Money{
	int money;
	
	void setMoney(int money) {
		this.money = money;
	}
	
	void show() {
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
		System.out.println("5만원권 : " + m50000 + "매");
		System.out.println("1만원권 : " + m10000 + "매");
		System.out.println("5천원권 : " + m5000 + "매");
		System.out.println("1천원권 : " + m1000 + "매");
		System.out.println("5백원 : " + m500 + "개");
		System.out.println("1백원 : " + m100 + "개");
	}
	
	
}
public class MoneyCount {

	public static void main(String[] args) {
		Money money = new Money();
		money.setMoney(1456000);
		money.show();
	}

}
