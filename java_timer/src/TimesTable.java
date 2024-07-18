
public class TimesTable {

	public static void main(String[] args) {
		// 구구단을 짜시오

		for(int i=1;i<=9;i++){

			System.out.println(i+"단을 출력하시오.");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}


		// 짝수 단만 출력하시오.
		for(int i=1;i<=9;i++){
			if(i%2==0) {
				System.out.println(i+"단을 출력하시오.");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"x"+j+"="+i*j);
				}
				System.out.println();
			}
		}

		


	}

}
