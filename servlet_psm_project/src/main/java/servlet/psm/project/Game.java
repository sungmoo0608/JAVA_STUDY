package servlet.psm.project;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		while(true) {
			//1~3사이의 랜덤숫자 만들기
			int com = (int)((Math.random())*3+1);	//1부터 3까지 숫자 중 랜덤 숫자 뽑기
			Scanner sc = new Scanner(System.in);
			
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			// System.out.println("테스트용 랜덤숫자 : "+ com);

			String user = sc.nextLine();

			int user1 = 0;
			String com1 = "";

			if(com==1) {
				com1 = "가위";
			} else if (com==2) {
				com1 = "바위";
			} else {
				com1 = "보";
			}

			System.out.println("컴퓨터: "+com1);

			if(user.equals("가위")) {
				user1 = 1;
			} else if(user.equals("바위")) {
				user1 = 2;
			} else {
				user1 = 3;
			}
			
			if(user.equals("가위")) {
				if(com1.equals("바위")) {
					System.out.println("당신이 졌습니다.");
				} else if(com1.equals("보")) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
			else if(user.equals("바위")) {
				if(com1.equals("보")) {
					System.out.println("당신이 졌습니다.");
				} else if(com1.equals("가위")) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
			else if(user.equals("보")) {
				if(com1.equals("가위")) {
					System.out.println("당신이 졌습니다.");
				} else if(com1.equals("바위")) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
			else {
				System.out.println("다시 입력해 주세요!");
			}


			System.out.println("계속하시겠습니까? y,n");

			String yesOrNo = sc.next();

			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}

		}
		
	}
}
