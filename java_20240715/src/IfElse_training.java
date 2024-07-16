
public class IfElse_training {

	public static void main(String[] args) {
		int num = 235890 ;
		
		if((num%2)==0) {
			System.out.println(num + " 짝수 입니다.");
		} else {
			System.out.println(num + " 홀수 입니다.");
		}
		
		if(num%2 !=0 ) {
			System.out.println(num + " 홀수 입니다.");
		} else {
			System.out.println(num + " 짝수 입니다.");
		}
		
		System.out.println("/////////////////////////");
		
		// num = 102 ; 
		
		if((num>=1)&&(num<=100)) {
			System.out.println(num + " true 입니다.");
		} else {
			System.out.println(num + " false 입니다.");
		}
		
		System.out.println("/////////////////////////");
		
		if((num%2==0) && (num%3==0)){
			System.out.println(num + " true 입니다.");			
		} else {
			System.out.println(num + " false 입니다.");
		}
	}

}
