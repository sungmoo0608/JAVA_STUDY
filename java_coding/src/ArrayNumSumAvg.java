import java.util.Arrays;

public class ArrayNumSumAvg {

	public static void main(String[] args) {
		
		int[] ranNum = new int[10];
		int sum = 0;
		
		for(int i=0; i<ranNum.length; i++) {
			ranNum[i] = (int)((Math.random()*10)+1);
		}
		
		for(int i=0; i<ranNum.length; i++) {
			sum += ranNum[i];
		}
		
		double avg = (double)sum/ranNum.length;
		
		System.out.println("랜덤 정수 : "+Arrays.toString(ranNum));
		System.out.println("랜덤 정수 합계 확인용 : "+sum);
		System.out.println("평균 :"+ avg);
	}

}