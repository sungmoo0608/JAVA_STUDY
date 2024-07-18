
public class MoneyCount {

	public static void main(String[] args) {
		
		int m = 126500;
		int m50000 = m/50000;
		int m10000 = (m%50000)/10000;
		int m5000 = ((m%50000)%10000)/5000;
		int m1000 = (((m%50000)%10000)%5000)/1000;
		int m500 = ((((m%50000)%10000)%5000)%1000)/500;
		int m100 = (((((m%50000)%10000)%5000)%1000)%500)/100;
		
		System.out.println("총금액 :" + m +"원");
		System.out.println("5만원권 :" + m50000 + "매");
		System.out.println("1만원권 :" + m10000 + "매");
		System.out.println("5천원권 :" + m5000 + "매");
		System.out.println("1천원권 :" + m1000 + "매");
		System.out.println("5백원 :" + m500 + "개");
		System.out.println("1백원 :" + m100 + "개");
		
		

	}

}