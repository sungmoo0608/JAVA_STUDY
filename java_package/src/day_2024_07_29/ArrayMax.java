package day_2024_07_29;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {

		int[] arrInt = new int[5];

		// 입력
		for (int i = 0 ; i < arrInt.length; i++) {
			arrInt[i]= (int)((Math.random()*100)+1);
		}

		// max
		int max = arrInt[0];
		for(int i=0 ; i < arrInt.length; i++) {
			if(max < arrInt[i]) {
				max = arrInt[i];
			}
		}

		// min
		
		int min = arrInt[0];
		for(int i=0 ; i < arrInt.length; i++) {
			if(min > arrInt[i]) {
				min = arrInt[i];
			}
		}

		//출력
		System.out.println(Arrays.toString(arrInt));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
