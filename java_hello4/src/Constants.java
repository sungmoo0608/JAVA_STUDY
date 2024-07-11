//이름 짓는 법
//1.낙타등(camel case) 표기법 (클래스 이름)
//2.뱀(snake case) 표기법 (상수 이름)

//1.변수와 상수 차이
//변수 : 메모리에 할당되는 값이 변할 수 있다.
//상수 : 메모리에 할당되는 값이 고정된다.

//2.초기화 이해
//변수든 상수든 처음으로 값으로 할당

//3.상수의 응용

public class Constants {

	public static void main(String[] args) {
		int maxSize = 100;
		final char CONST_CHAR = '상';
		
		final int MAX_SIZE = 100;
		
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		// 상수는 초기화 하지 못한다. CONST_ASSIGNED = 13;
		
		System.out.println("변수 : " + maxSize);
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);

	}

}
