public class StarTraining2 {

//	public static void printStar(int num1) {
//		for(int i=1;i<=num1;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//	public static void printStar2(int num2) {
//		for(int i=1;i<=num2;i++) {
//			for(int j=i;j<=num2;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}


	public static void printStar3(int num3) {
		for(int i=1;i<=num3;i++) {
			for(int j=i;j<=num3;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args){

//		printStar(4);
//		printStar2(4);
		printStar3(4);

	}
}