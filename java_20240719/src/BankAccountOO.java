
class BankAccount {
	// 예금잔액
	int balance = 0;	
	
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
class BankAccountOO {
	public static void main(String[] args) {
		
		// 두 개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금을 진행
		yoon.deposit(10000);
		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 출금을 진행
		yoon.withdraw(2000);
		park.withdraw(1000);
		
		// 각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		park.checkBalance(yoon);
		yoon.checkBalance(park);
		
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();


	}
}
