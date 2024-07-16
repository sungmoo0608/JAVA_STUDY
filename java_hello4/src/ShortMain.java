
public class ShortMain {

	public static void main(String[] args) {
		
		short s1 = 1;
		short s2 = 2;
		
		// 에러 
		// short s3 = s1 + s2 ; 
		
		int s3 = s1 + s2 ;	
		// 상위 데이터 타입으로 선언해줘야 에러가 나지 않는다.
		
		System.out.println(s3);
		
		
		char c1 = 'A';
		char c2 = 'A';
		
		// 에러
		// char c3 = c1 + c2;
		
		int c3 = c1 + c2;
		// 상위 데이터 타입으로 선언해줘야 에러가 나지 않는다.
		
		System.out.println(c3);
		
	}

}
