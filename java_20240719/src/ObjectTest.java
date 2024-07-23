
class A {
	int num;	//인스턴스 변수;
	int kor, eng, math;
	
	void setKor(int kr) {
		//this.kor=kor;
		kor = kr;
	}
	
	int getKor() {
		return kor;
	}
	
	
	void setEng(int en) {
		//this.kor=kor;
		eng = en;
	}
	
	int getEng() {
		return eng;
	}
	
	
	void setMath(int mat) {
		//this.kor=kor;
		math = mat;
	}
	
	int getMath() {
		return math;
	}
	
	double getAvg() {
		return (kor+eng+math) / 3.0;
	}
	
	void setNum(int n1) {
		num = n1;
	}
	
	int getNum() {
		return num;
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		A a;
		a=new A();
		
		a.setNum(10);
		System.out.println(a.getNum());
		
		a.setKor(90);
		System.out.println(a.getKor());
		
		a.setEng(80);
		System.out.println(a.getEng());

		a.setMath(73);
		System.out.println(a.getMath());
		
		System.out.println(a.getAvg());
		
	}

}
