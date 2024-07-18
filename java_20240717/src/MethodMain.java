// 함수
// 기능을 만들어서 > 써먹어야한다.
// 클래스와 메인 함수 사이에 만들어야한다.(선언해야한다.)
//
// 1. say Hello를 출력하는 함수를 만드시오.
// 2. say Hello를 5번 출력하는 함수를 만드시오.
// 3. 두 수를 전달 받아서 두 수의 합을 출력하는 함수를 만드시오.

public class MethodMain {
	
	public static void sayHello() {
		System.out.println("Say Hello");
	}

	public static void sayHelloF() {
		for(int i=0;i<5;i++) {
			System.out.println("Say Hello");
		}
	}

	public static void printHello() {
		// System.out.println("Hello World");
		sayHelloF();
	}
	
	public static void add(int num1,int num2) {
		int result;
		result = num1+num2;
		System.out.println(result);
	}
	
	public static void printStar(int num1) {
		for(int i=1;i<=num1;i++) { // 세로 칸수(층수 결정)
			for(int j=1;j<=i;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//System.out.println("Hello World");
		//printHello();
		//sayHello();
		//sayHelloF();
		
		add(100,5);
		add(100,5308);
		printStar(5);
	}

}
