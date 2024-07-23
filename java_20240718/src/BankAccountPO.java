
class BankAccountPO {
	
	static int balance = 0;	// 예금잔액
	
	public  static int deposit(int amount) {	//입금
		balance += amount;	
		return balance;
	}
	
	public static int withdraw(int amount) {	//출금
		balance -= amount;
		return balance;
	}
	
	public static int checkMyBalance() {	// 예금 조회
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
	public static void main(String[] args) {
		deposit(100000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();

	}

}
