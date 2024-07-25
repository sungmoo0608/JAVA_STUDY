public class MultiForEx1_20240725 {

	public static void main(String[] args) {
		char ch = 65;
		
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}

}
