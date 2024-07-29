package day_2024_07_26;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] intArr = new int[3];
		
		intArr[0] = 0;
		intArr[1] = 1;
		intArr[2] = 2;
		
		System.out.println(Arrays.toString(intArr));
		
		System.out.println("==================");
		
		int[] intArr2 = { 0,1,2 };
		System.out.println(Arrays.toString(intArr2));
		
		System.out.println("==================");
		
		String[] seasons = { "봄","여름","가을","겨울" };
		System.out.println(Arrays.toString(seasons));
		
		System.out.println("==================");
		
		for (int i = 0 ; i < seasons.length ; i++) {
			System.out.println(seasons[i]);
		}
	}

}
