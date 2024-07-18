
public class While3Sum {

	public static void main(String[] args) {
		// 1~100사이의 3의 배수 합 While 문 이용해서 구하기
		int i=1;
		int sum =0;
		while(i<=100) {
			if(i%3==0) {
				sum += i;
				System.out.println(sum);
			}
			i++;
		}
		
	}

}
