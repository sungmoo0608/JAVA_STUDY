public class ValueParameter_20240726 {

	public int increase(int n) {
		++n;
		return n;
	}

	public static void main(String[] args) {
		int var1 = 100;
		ValueParameter_20240726 vp= new ValueParameter_20240726();
		int var2 = vp.increase(var1);
		System.out.println("var1 : "+ var1 + ", var2 : " + var2);
	}

}
