
public class SwitchExample {

	public static void main(String[] args) {
		
		// 걸리면 break 까지;
		
		int n = 0;

		switch(n) {
		case 1:
			System.out.println("Simple Java");
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("Funny Java");
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("Fantastic Java");
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("The best programming laguage");
			System.out.println("디폴트 입니다.");
		}

		System.out.println("Switch 종료");

	}

}
