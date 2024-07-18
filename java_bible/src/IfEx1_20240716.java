public class IfEx1_20240716 {

	public static void main(String[] args) {
		int su1 = 49;
		String str = "50미만"; // string str; 이렇게 하면 오류가 발생한다.
		
		if(su1 >=50) {
			str="50이상";
		}
		System.out.println(str+" 입니다.");
	}

}
