public class WhileEx1_20240725 {

	public static void main(String[] args) {
		int su = 5; 
		String str = "Java DoublePlus";
		
		do {
			System.out.println(str);			
		} while (su-- >10); // (주의) 세미콜론(;)을 생략하면 오류가 발생한다.
	}

}
