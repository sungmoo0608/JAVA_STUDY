/*
 1.주석을 주면 해당 부분을 컴파일 하지 않음.
 2.주석의 목적 - 소스 코드 설명 
 */

/*
들여쓰기 하는 이유
1. 가독성
*/
public class SysOutExample {

	public static void main(String[] args) {
		System.out.println(7); // 정수

		System.out.println(3.15);
		System.out.println(3 + 5);

		System.out.println("3 + 5");
		System.out.println("3 + 5 = " + 8); // 문자열
		System.out.println("3 + 5 = " + (8 + 5.5)); // 문자열
		System.out.println("3 + 5 = " + 8 + 5.5); // 문자열
		System.out.println("3 + 5 = 8");
	}

}
