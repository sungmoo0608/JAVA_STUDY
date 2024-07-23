
public class StarPrint {

	public static void main(String[] args) {
		// 스타 찍기

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 스타 오른쪽 정렬 찍기

		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println();
		
		// 역 스타 찍기

		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
