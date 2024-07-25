package day_2024_07_24;

class InstCnt{
	static int instNum = 0;	//클래스 변수(static 변수)
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : "+ instNum);
	}	
}

class Card {
	String kind;
	int num;
	public final static int WIDTH = 180;
	public final static int HEIHGT = 120;
}

class AA{
	public AA() {
		System.out.println("AA"+"생성");
	}
	
	public void println() {
		System.out.println("슥샥쇽!");
	}
}

class System2{
	static AA out = new AA();
}

//javac ClassVar.java;
//java.exe ClassVar


class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System2.out.println();
		
		System.out.println(Math.PI);
	}

}
