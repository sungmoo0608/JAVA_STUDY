
public class PrintMethodStra {
	
	public static void printStar(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// 스타 찍기
		
		printStar(5);


	}
}


