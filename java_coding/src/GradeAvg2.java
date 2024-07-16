
public class GradeAvg2 {

	public static void main(String[] args){
		int kor = 80;
		int math = 80;
		int eng = 60;

		int sum = kor+math+eng;

		double avg = sum / 3.0;

		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + avg);

		if(avg>=90){
			System.out.println("성적 : 수 입니다");
		} else if (avg>=80) {
			System.out.println("성적 : 우 입니다");
		} else if (avg>=70) {
			System.out.println("성적 : 미 입니다");
		} else if (avg>=60) {
			System.out.println("성적 : 양 입니다");
		} else {
			System.out.println("성적 : 가 입니다");
		}
	}
}