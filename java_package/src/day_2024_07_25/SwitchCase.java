package day_2024_07_25;

class SwitchCase {
	public static void main(String[] args) {
		
		int num=1;
		String spring = "봄";
		
		switch(spring) {
		case "봄" :
			System.out.println("봄입니다.");
			break;
		default:
			System.out.println("default");
		}
		
		switch(num) {
		case 1:
		case 2:
		case 3:
			System.out.println("봄입니다.");
		}

		switch(num) {
		case 1,2,3:
			System.out.println("봄입니다.");
		}
	}
}
