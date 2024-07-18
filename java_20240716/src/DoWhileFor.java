
public class DoWhileFor {

	public static void main(String[] args) {

		int count=1;

		while(count<= 1000) {
			System.out.println(count+"번"+": Hello world");
			count++;
		}

		//do while 사용
		//차이 = do while 실행 문장을 한 번은 실행 시킨다.
		count =1;
		do {
			System.out.println(count+"번"+": Hello world");
			count++;
		} while(count<=100);

		//for문 사용
		for(int i=0; i<100; i++){
			System.out.println(i+"번"+": Hello world");
		}

		// 1부터 100까지의 합
		int sum=0;

		for(int i=1; i<=100; i++) {
			sum += i;
			System.out.println(i+":합:"+sum);
		}

		System.out.println(sum);


		System.out.println("3단 구구단 출력 =========");
		// 3단 구구단 출력
		int dan = 3;
		for (int i=1; i<=9 ; i++) {
			System.out.println(dan + "*"+ i + "=" + (dan*i));
		}


		System.out.println("출력이 홀수 방법1 =========");
		//출력이 홀수1
		for (int i=1; i<=100 ; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}


		System.out.println("출력이 홀수 방법2 =========");
		//출력이 홀수2
		for (int i=1; i<=100 ; i+=2) {
			System.out.println(i);
		}


		System.out.println("100 98 96 ... 2 방법1 =========");
		//100 98 96 ... 2
		for (int i=100; i>=2 ; i-=2) {
			System.out.println(i);
		}


		System.out.println("100 98 96 ... 2 방법2 =========");
		//100 98 96 ... 2
		for (int i=100; i>=2 ; i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}


		System.out.println("1부터 100까지의 수중에서 3의 배수가 아닌 수들의 합은?");
		// 1부터 100까지의 수중에서 3의 배수가 아닌 수들의 합은?
		sum = 0;
		for (int i=1; i<=100; i++) {
			if(i%3 != 0) {
				sum = sum+i;
				System.out.println(sum);
			}
		}
		System.out.println("3의 배수가 아닌 수들의 합은 ==" + sum);


		// 1부터 100까지 3의 배수를 더하는 while문을 사용하시오.
		System.out.println("====1부터 100까지 3의 배수를 더하는 while문을 사용하시오.====");

		int i = 1;
		sum = 0;
		while(i<=100){	//for(int i=1;i<=100;i++){
			if(i%3 == 0) {
				sum = sum+i;
				System.out.println(sum);
			}
			i++;
		}


	}

}
