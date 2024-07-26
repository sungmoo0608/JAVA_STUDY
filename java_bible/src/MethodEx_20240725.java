public class MethodEx_20240725 {
	
	int var1, var2;	// 멤버 변수들
	
	public int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodEx_20240725 me= new MethodEx_20240725();
		int res = me.sum(1000, -10);
		System.out.println("res="+res);
	}

}
