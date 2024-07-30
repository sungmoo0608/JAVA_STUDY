package day_2024_07_29;

import java.util.Arrays;

public class ArrayForEach2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		// 배열 요소 전체 출력
		for(int e :arr) {
			System.out.print(e + " ");
		}
		System.out.println();	// 단순 줄 바꿈
		
		int sum = 0;
		
		// 배열 요소의 전체 합 출력
		for(int e:arr) {
			sum += e;
		}
		System.out.println("sum : " + sum);
	}

}
