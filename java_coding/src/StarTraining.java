public class StarTraining {

	public static void main(String[] args){

		//		*****
		//		*****
		//		*****
		//		*****
		//		*****
		//		별찍기

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//		*
		//		**
		//		***
		//		****
		//		*****
		//		별찍기
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//			*
		//		   **
		//		  ***
		//		 ****
		//		*****
		//		별찍기
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//		*****
		//		****
		//		***
		//		**
		//		*
		//		별찍기
		
		for(int i=1;i<=5;i++) { // 세로 칸수(층수 결정)
			for(int j=i;j<=5;j++) { // 가로 방수 결정
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}