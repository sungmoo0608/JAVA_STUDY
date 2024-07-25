package day_2024_07_24;

import java.util.Scanner;

//1. 1~50사이의 랜덤숫자 만들기 : int randInt = (int) ((Math.random() * 50) + 1); 
//2. 기회 제공 : 기회를 5번 제공하는 경우 첫 판에 사용자에게 숫자를 입력 받고서 기회(int chance)를 줄이므로 변수에는 4를 넣는다. 
//3. 사용자가 입력한 숫자가 정답보다 작은 경우에는 UP!이라고 알려주고 반대로 정답보다 큰 숫자라면 DOWN이라고 알려주어야 한다.

public class UpAndDownMain {

	public static void main(String[] args) {
		//1~50사이의 랜덤숫자 만들기

		int chance = 5;
		int answer = (int)((Math.random())*50+1);	//1부터 50까지 숫자 중 랜덤 숫자 뽑기
		//		System.out.println("테스트용 랜덤숫자 : "+ answer);

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요:");
			System.out.print(">>>");

			//사용자 입력 받기
			int input = sc.nextInt();

			if(input==answer) {
				System.out.println("정답입니다.");
				break;
			}

			if(chance == 1) {
				System.out.println("실패하였습니다. 정답은 "+answer+" 입니다.");
				break;
			}

			//1회가 끝나면 기회를 1개씩 줄인다.
			chance--;

			if(input>answer) {
				System.out.println("다운!! 기회가 "+chance+"번 남았습니다.");
			} else {
				System.out.println("업!! 기회가 "+chance+"번 남았습니다.");
			}

		}
	}

}
