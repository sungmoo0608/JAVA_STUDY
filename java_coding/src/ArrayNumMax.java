import java.util.Arrays;

public class ArrayNumMax {

	public static void main(String[] args) {
		
		int[] ranNum = new int[5];
		
		int max = ranNum[0];
		
		for(int i=1; i<ranNum.length; i++) {
			ranNum[i] = (int)((Math.random()*45)+1);
			if(max<ranNum[i]) {
				max = ranNum[i];
			}
		}
		
		System.out.println(Arrays.toString(ranNum));
		
		System.out.println("최대값 :"+ max);
	}

}