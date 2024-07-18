
public class GradeMax {

	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 92;
		int math = 73;
		int max ;
		
		max = (kor > eng)? kor:eng;
		max = (max > math)? max:math;
		
		System.out.println("최대값 : " + max);
	}

}
