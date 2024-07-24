import java.util.Scanner;

class Random {
	private int userInt;
	
	Radom(int randInt){
		this.randInt = randInt;
	}
}


public class RandomNum {

	public static void main(String[] args) {
		
		while(true) {
			int userNum,randInt ; 
			Scanner sc = new Scanner(System.in);
			int randInt = (int)(Math.random()*50)+1; 
			
			System.out.print("숫자를 입력하시오 :");
			userNum = sc.nextInt(); 
			
			System.out.println("업!");
			
			String yesOrNo = sc.next();
			
			if(userNum!=randInt) {
				System.out.println();
				continue;
			} else {
				break;
			}
					
		}
		
	}

}