class Bank{
	private String point;	// 은행 위치
	static float interest;	// 은행 이자
	
	public Bank(String point) {
		this.point = point;
	}
	
	//결과를 출력할 메서드
	public void getInfo() {
		System.out.println("지점 : " + point );
		System.out.println("지점 : " + interest );
	}
}
public class BankMain{

	public static void main(String[] args) {
		
		Bank bk1 = new Bank("강남");
		Bank.interest = 0.2f;
		bk1.getInfo();
		
		System.out.println("------------------------------");
		
		Bank bk2 = new Bank("분당");
		//Bank.interest = 0.2f;
		bk2.getInfo();
	}

}
