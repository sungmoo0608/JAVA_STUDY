public class MethodEx2_20240726 {
	
	int var;
	
	public void setInt(int var) {
		this.var = var;
	}
	
	public int getInt() {
		return var;
	}

	public static void main(String[] args) {
		MethodEx2_20240726 me2= new MethodEx2_20240726();
		me2.setInt(1000);
		System.out.println("var="+me2.getInt());
	}

}
