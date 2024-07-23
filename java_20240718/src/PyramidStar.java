
public class PyramidStar {
	
	public static void starPrint(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		starPrint(5);
		System.out.println("===============================");
		starPrint(6);
		System.out.println("===============================");
		starPrint(7);
	}

}
