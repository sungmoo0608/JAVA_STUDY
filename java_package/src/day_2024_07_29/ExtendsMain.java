package day_2024_07_29;

class AAA{
	int aaa;
	
	public void aaaFuction() {
		System.out.println("aaaFunction 함수호출");
	}
}

class BBB extends AAA {
	int bbb;
}

public class ExtendsMain {

	public static void main(String[] args) {

		AAA aaa = new AAA();
		
		System.out.println(aaa.aaa);
		aaa.aaaFuction();
		
		BBB bbb = new BBB();
		
		System.out.println(bbb.aaa);
		bbb.aaaFuction();
		System.out.println(bbb.bbb);
		
	}

}
