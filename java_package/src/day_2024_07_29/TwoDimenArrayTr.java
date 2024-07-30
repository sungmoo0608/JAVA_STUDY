package day_2024_07_29;

import java.util.Arrays;

/* 4*4의 2차원 배열을 만들고 이곳에 
* 1에서 10까지 범위의 정수를 랜덤하게 생성하여
* 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라. 
*/ 

public class TwoDimenArrayTr {

	public static void main(String[] args) {
		
		int[][] arrTwo = new int[4][4];		
		
		// 배열의 구조대로 내용 출력
		for(int i = 0; i < arrTwo.length; i++) {
			for(int j = 0; j < arrTwo[i].length; j++) {
				arrTwo[i][j] = (int)((Math.random()*10)+1);
			}
		}
		
		for(int i = 0; i < arrTwo.length; i++) {
			for(int j = 0; j < arrTwo[i].length; j++) {
				System.out.print(arrTwo[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
