
public class ExplicitConversion {

	public static void main(String[] args) {

		double pi = 3.1415 ;
		int wholeNumber = (int)pi ;

		System.out.println(wholeNumber);

		long num1 = 3000_000_007L;
		int num2 = (int)num1; 
		// 64bit 중 뒤의 32bit 부분만 복사한다.
		
		System.out.println(num2);

		short num3 = 1;
		short num4 = 2;
		short num5 = (short)(num3+num4);

		System.out.println(num5);

	}

}
