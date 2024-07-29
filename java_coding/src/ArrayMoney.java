import java.util.Arrays;

public class ArrayMoney {

	public static void main(String[] args) {

		int totalMoney = (int)((Math.random()*5000)+1);
		
		int[] moneyCount = {500,100,50,10};
		
		while(true) {
			if(totalMoney == 0) {
				break;
			}
			for(int i=0;i<moneyCount.length;i++) {
				System.out.println(totalMoney %= moneyCount[i]);
			}
		}
		
		
	}

}