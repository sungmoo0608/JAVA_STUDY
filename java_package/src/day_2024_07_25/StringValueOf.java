package day_2024_07_25;

class StringValueOf {
	public static void main(String[] args) {
		
	
		String st1 = "abcdefg" + 100;
		System.out.println(st1);
		
		String st2 = st1.substring(2);
		System.out.println(st2);
		
		String st3 = st1.substring(2,4);
		System.out.println(st3);
		
		String st4 = "abcdefg" + "100" +'양'+1;
		System.out.println(st4);
		
		for(int i=0;i<50000000;i++) {
			st4 = st4 + "A";
		}
		
		
	}
}
