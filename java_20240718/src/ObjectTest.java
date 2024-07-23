
class A {
	int num;	// 인스턴스 변수;
	int kor,eng,math;
}


public class ObjectTest {

	public static void main(String[] args) {
		A a; // 변수 선언 int num; // 참조형
		a = new A(); 
		// new 객체(인스턴스) 생성 키워드
		// A() 클래스 이름과 똑같은 함수 : 생성자 함수
		
		System.out.println(a.num);
		
		a.num =3;
		System.out.println(a.num);
		
		a.kor = 80;
		a.eng = 78;
		a.math = 75;
		
		System.out.println("국어"+a.kor);
		System.out.println("영어"+a.eng);
		System.out.println("수학"+a.math);
		
		System.out.println(a);
	}

}
