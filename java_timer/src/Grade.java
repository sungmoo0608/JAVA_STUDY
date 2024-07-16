
public class Grade {

	public static void main(String[] args) {
		
		int kor = 91 ; 
		int math = 90 ; 
		int eng = 75;
		
		int sum = kor + math + eng ;
		
		double avg = sum/3.0;
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + avg);
		
		if(avg>=90) {
			System.out.println("성적 : 수 입니다.");
		} else if (avg>=80) {
			System.out.println("성적 : 우 입니다.");
		} else if (avg>=70) {
			System.out.println("성적 : 미 입니다.");
		} else if (avg>=60) {
			System.out.println("성적 : 양 입니다.");
		} else {
			System.out.println("성적 : 양 입니다.");
		}
		
		int max;
		
		if(kor>=eng&&kor>=math) {
			max=kor;
		} else if (math>=eng&&math>=kor) {
			max=math;
		} else {
			max=eng;
		}
		
		System.out.println("최대값 : " + max);
	}

}
