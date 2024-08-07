package day_2024_08_06;

import java.util.Scanner;

class Player {
	final static int COUNT=3;
	private int[] arrNum;
	private String name;

	public Player(String name) {
		this.name = name;
		arrNum = new int[COUNT];
	}
	
	public String getName() {
		return name;
	}

	public boolean game() {
		for(int i=0; i < arrNum.length;i++) {
			arrNum[i] = (int) ((Math.random()*3) +1);
		}

		System.out.println("\t" + arrNum[0] +" " +arrNum[1] + " " + arrNum[2]);

		if( arrNum[0] == arrNum[1] && arrNum[1] == arrNum[2]) {
			return true;
		}else {
			return false;
		}      
	}   
}


public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = sc.nextInt();
		Player[] players = new Player[num];

		for(int i=0; i<players.length;i++) {
			System.out.println((i+1)+"번째 선수 이름 >>");
			String name = sc.next();
			players[i] = new Player(name);
		}
		
		String buffer = sc.nextLine();
		
		while(true) {
			for(int i=0;i<players.length;i++) {
				System.out.println("["+players[i].getName()+"]:<Enter");
				
				buffer = sc.nextLine();
				
				if(players[i].game()) {
					System.out.println("["+players[i].getName()+"]:님이 이겼습니다.");
					return;
				}
				System.out.println("아쉽군요!");
			}
		}

	}

}
