
class BankAccount {
	String accNumber;	// 계좌번호
	String ssNumber;	// 주민번호
	int balance = 0;	// 예금잔액
	
	BankAccount(){
		System.out.println("BankAccount 객체 생성됨");
	}
	
	// 생성자 함수 만들기
	// this() -> this 생성자 함수
	// this() -> 생성자에서 다른 생성자를 호출 할 때( 일반 함수에서 this() 함수 호출 안됨 )
	BankAccount(String accNumber, String ssNumber, int balance) {
		this();
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;	// 계좌 개설 시 예금액으로 초기화
	}
	
	
	void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;	// 계좌 개설 시 예금액으로 초기화
	}
	
	void thisExample() {
		this.deposit(1000);
		this.withdraw(1000);
	}
	
	//입금
	public int deposit(int amount) {	
		balance += amount;	
		return balance;
	}
	
	//출금
	public int withdraw(int amount) {	
		balance -= amount;
		return balance;
	}
	
	// 예금 조회
	public int checkMyBalance() {	
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
	// 파라미터로 객체 받아 오기	// 변수 선언
	public void checkBalance(BankAccount acc) {
		acc.checkMyBalance();
	}

}
class BankAccount01 {
	public static void main(String[] args) {
		BankAccount noh = new BankAccount();
		BankAccount choi = new BankAccount("12-34-89","990990-9090990",10000);
//		choi.initAccount("12-34-89","990990-9090990",10000);	//초기화
		
		
//		// 두 개의 인스턴스 생성
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		
//		// 각 인스턴스를 대상으로 예금을 진행
//		yoon.deposit(10000);
//		park.deposit(3000);
//		
//		// 각 인스턴스를 대상으로 출금을 진행
//		yoon.withdraw(2000);
//		park.withdraw(1000);
//		
//		// 각 인스턴스를 대상으로 잔액을 조회
//		yoon.checkMyBalance();
//		park.checkMyBalance();
//		
//		park.checkBalance(yoon);
//		yoon.checkBalance(park);
//
//		park = null;
//		yoon = null;
//		
//		System.out.println(park);
//		System.out.println(yoon);
//		
////		park.checkBalance(yoon);
////		yoon.checkBalance(park);

	}
}
