package day_2024_07_25;

//똑같은 함수 이름을 쓸 수 있는 조건 - 파라미터 타입 또는 갯수를 다르게 함 = 함수 오버로딩
//함수 오버로딩 = 같은 함수 이름으로 파라미터 타입 또는 갯수를 달리하는 것. 

class OverloadingEx {

	public void function() {
		System.out.println("함수");
	}

	public void function(int num) {
		System.out.println(num);
	}

	public void function(double num) {
		System.out.println(num);
	}

	public void function(int num,int num2) {
		System.out.println(num);
	}

}

class Person{
	private int regiNum;
	private int passNum;

	public Person(int rnum,int pnum){
		regiNum = rnum;
		passNum = pnum;
	}

	public Person(int rnum) {
		//regiNum = rnum;
		//passNum = 0;
		this(rnum,0);
	}

	void showPersonalInfo() {
		System.out.println("주민등록 번호:"+regiNum);

		if(passNum!=0) {
			System.out.println("여권 번호:"+passNum+"\n");
		} else {
			System.out.println("여권을 가지고 있지 않습니다.\n");
		}
	}
}

class ExampleMain {
	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);

		// 여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();


		OverloadingEx ex = new OverloadingEx();
		ex.function();
		ex.function(10);

	}
}
