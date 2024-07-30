import java.util.Arrays;

public class ArrayLotto {

	public static void main(String[] args) {
		
		final int LOTTO_COUTN = 6;
		
		int arrLotto[] = new int[LOTTO_COUTN];
		
		for(int i=0; i<arrLotto.length ; i++) {
			arrLotto[i]=(int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) {
				if(arrLotto[j]==arrLotto[i]) {
					i--;
				break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arrLotto));
		
		
		
	}

}
