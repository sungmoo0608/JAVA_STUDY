
public class LoopEx {

	public static void main(String[] args) {
		// 6의 배수이면서 14의 배수인 가장 작은 자연수
		
		int num = 1;
		
		while(true) {
			if(num%6==0 && num%14==0) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}

}
