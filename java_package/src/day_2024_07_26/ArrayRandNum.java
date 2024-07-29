package day_2024_07_26;

import java.util.Arrays;

public class ArrayRandNum {

	public static void main(String[] args) {

		// 길이가 6인 int형 1차원 배열의 생성
		final int LOTTO_COUNT = 6;
		
		int[] arrLotto = new int[LOTTO_COUNT];
		
		//입력
		for(int i=0; i<arrLotto.length; i++) {
			arrLotto[i] = (int)((Math.random()*45)+1);
			
			for(int j=0; j<i ; j++) {
				if(arrLotto[j]==arrLotto[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arrLotto));
		
//		//출력
//		for(int i=0; i<arrLotto.length; i++) {
//			System.out.print((i+1)+"번째:"+arrLotto[i]+" ");
//		}

	}

}
