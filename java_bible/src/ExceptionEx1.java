import static java.lang.System.out;

class ExceptionEx1 {

	public static void main(String[] args) {
		int[] var = {10,20,30};
		for(int i=0;i<=3;i++) {
			out.println("var["+i+"] : " + var[i]);
		}
		out.println("프로그램 끝!");
	}

}
