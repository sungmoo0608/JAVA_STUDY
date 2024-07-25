package day_2024_07_25;

class StringComp {
	public static void main(String[] args) {
		String st1 = "Lexicographlically";
		String st2 = "lexicographlically";
		int cmp;
		
		if(st1.equals(st2)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		cmp = st1.compareTo(st2);
		if(cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp <0) {
			System.out.println("사전의 앞에 위치하는 문자 :" + st1);
		} else {
			System.out.println("사전의 앞에 위치하는 문자 :" + st2);
		}
		
		if(st1.compareToIgnoreCase(st2)==0) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
	}
}
