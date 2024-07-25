import java.util.Scanner;

public class StringAt {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("영어 단어를 입력하시오.>>>");
		String str = input.nextLine();

		int vowel = 0; // 모음
		int conso = 0; // 자음

		System.out.println("총 글자 수는 "+str.length()+"개 입니다.");

		for(int i=0; i<str.length() ; i++) {
			switch (str.charAt(i)) {
			case 'a','A','e','E','i','I','o','O','u','U' :
				vowel++;	
			break;
			
			// 공백 및 특수 문자 제외
			case ' ': // 스페이스
			case '\t': // 탭
			case '\n': // 엔터
			case ',': // 콤마
			case '.': // 닷
			case '!': // 느낌표
			case '?': // 물음표
				break;
			
			// 그 외 (자음)
			default :
				conso++;
				break;
			}
		}

		System.out.println("모음은 : "+vowel+"개 입니다.");
		System.out.println("자음은 : "+conso+"개 입니다.");

	}
}