interface TestAbst {
	int data = 10000;
	public abstract void printData();
}

class AnonyInner1{
	TestAbst inn = new TestAbst() {
		public void printData() {
			System.out.println("data : "+data);
		}
	};
	
	public static void main(String[] args) {
		AnonyInner1 ai = new AnonyInner1();
		ai.inn.printData();
	}

}