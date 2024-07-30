import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		
		final int MAX_NUM = 5;
		
		int num[] = new int[MAX_NUM];
		
		int max = num[0];
		
		for (int i=0; i<num.length ; i++) {
			num[i] = (int)(Math.random()*50+1);
			if(max<num[i]) {
				max = num[i];
			} 
		}
		
		System.out.println("5개 숫자 확인 :"+Arrays.toString(num));
		
		System.out.println("최대값 :"+max);
		
		
		
		
		
	}

}
