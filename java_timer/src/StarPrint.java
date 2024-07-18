
public class StarPrint {

	public static void main(String[] args) {
		// 스타 찍기

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
