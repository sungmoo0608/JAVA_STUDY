
public class BreakContinue {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i==20)
				break;
			System.out.println(i+"번째 Hello world");
		}
		
		
		// 1부터 1000까지의 숫자 중 11의 배수이자 7의 배수인 첫번째 수는?
		
		for(int i=1; i<=1000; i++) {
			if(i%7==0 && i%11==0) {
				System.out.println(i);
				break;
			}
		}
		
		// 1부터 1000까지의 숫자 중 5의 배수이자 7의 배수인 첫번째 수는?
		
		for(int i=1; i<=1000; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
