
public class DoWhileFor2 {

	public static void main(String[] args) {
		// 1부터 100까지의 수중 3의 배수가 아닌값들의 합
		int sum=0;

		for(int i=1; i<=100; i++) {
			if(i%3!=0) {
				sum += i;
				System.out.println(i+":합:"+sum);
			}
		}

		System.out.println(sum);


	}
}
