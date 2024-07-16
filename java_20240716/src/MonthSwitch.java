
public class MonthSwitch {

	public static void main(String[] args) {
		
		// 걸리면 break 까지;
		
		int month = 5;

//		switch(month) {
//		case 1:
//			System.out.println("겨울입니다.");
//			break;
//		case 2:
//			System.out.println("겨울입니다.");
//			break;
//		case 3:
//			System.out.println("봄입니다.");
//			break;
//		case 4:
//			System.out.println("봄입니다.");
//			break;
//		case 5:
//			System.out.println("봄입니다.");
//			break;
//		case 6:
//			System.out.println("여름입니다.");
//			break;
//		case 7:
//			System.out.println("여름입니다.");
//			break;
//		case 8:
//			System.out.println("여름입니다.");
//			break;
//		case 9:
//			System.out.println("가을입니다.");
//			break;
//		case 10:
//			System.out.println("가을입니다.");
//			break;
//		case 11:
//			System.out.println("가을입니다.");
//			break;
//		case 12:
//			System.out.println("겨울입니다.");
//			break;
//		default:
//			System.out.println("잘못된 입력입니다.");
//		}
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		if(month==3||month==4||month==5) {
			System.out.println("봄입니다.");
		} else if(month==6||month==7||month==8) { 
			System.out.println("여름입니다.");
		} else if(month==9||month==10||month==11) { 
			System.out.println("가을입니다.");
		} else if(month==12||month==1||month==2)  {
			System.out.println("겨울입니다.");
		} else {
			System.out.println("잘못된 입력값 입니다.");
		}
		
	}

}
