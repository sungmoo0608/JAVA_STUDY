import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumScan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("100보다 작은 숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		int[] ranNum = new int[num];
		
		for(int i=0; i<ranNum.length; i++) {
			ranNum[i] = (int)((Math.random()*100)+1);
			for(int j=0; j<i; j++) {
				if(ranNum[i]==ranNum[j]) {
					j--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(ranNum));
	}

}