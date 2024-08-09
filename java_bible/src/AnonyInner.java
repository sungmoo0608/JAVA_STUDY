interface TestInter {
	int data = 10000;
	public void printData();
}

class AnonyInner{

	public void test() {
		
		new TestInter() {
			public void printData() { //미완성 된 것을 완성한다.
				System.out.println("data :" + data);
			}
		}.printData();

	}

	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.test();
		//new AnonInner().test() //익명으로 객체를 형성한다.

	}

}