
public class ElseIF_training2 {

	public static void main(String[] args) {
		
		boolean bool = (1>10)?true:false;
		System.out.println(bool);
		
		bool = (1<10)?true:false;
		System.out.println(bool);
		 
		int num1 = 10;
		int num2 = 30;
		int num3 = 20;

		int max ;

		if (num1>=num2 && num1>=num3) {
			max = num1;
		} else if(num2>=num1 && num2>=num3 ) {
			max = num2;
		} else {
			max = num3;
		}

		System.out.println("최대값 : "+max);

		//두번째 방법
		System.out.println("두번째 방법===================");

		max = num1;

		if(max <= num2) {
			max = num2;
		}


		if(max <= num3) {
			max = num3;
		}

		System.out.println("최대값 : "+max);

		//세번째 방법
		System.out.println("세번째 방법===================");

		if(num1>=num2) {
			if(num1>=num3) {
				max = num1;
			}
		}else if(num2>=num1) {
			if(num2>=num3) {
				max = num2;
			}
		}else {
			max = num3;
		}

		System.out.println("최대값 : "+max);

		//중간값 구하기
		System.out.println("중간값 구하기===================");

		int mid;

		if (num1>=num2 && num1<=num3) {
			mid = num1;
		} else if(num2>=num1 && num2<=num3 ) {
			mid = num2;
		} else {
			mid = num3;
		}
		
		System.out.println("중간값 : "+mid);
		
		//중간값 구하기2
		System.out.println("중간값 구하기2===================");

		if( (num2<num1 && num1<num3) || (num3<num1 && num1<num2) )    
			System.out.println("중간값은 "+num1+"입니다.");
		else if ((num1<num2 && num2<num3) || (num3<num2 && num2<num1))  
			System.out.println("중간값은 "+num2+"입니다.");
		else 
			System.out.println("중간값은 "+num3+"입니다.");

	}
}
