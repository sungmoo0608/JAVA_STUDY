public class OverloadingTest2_20240729 {
	
	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	public void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	private int getLength(String str) {
		System.out.println("입력한 값의 길이 : " + str.length());
		return 0;
	}
	
	public static void main(String[] args) {
		OverloadingTest2_20240729 ot2 = new OverloadingTest2_20240729();
		
		ot2.getLength(1000);
		ot2.getLength(3.14f);
		ot2.getLength("10000");
		
	}

}
