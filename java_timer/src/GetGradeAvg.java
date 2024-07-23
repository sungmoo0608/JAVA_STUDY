
public class GetGradeAvg {
	
	public static double getAvg(int kor, int eng, int math) {
		return (kor+eng+math)/3.0;
	}

	public static char getGrade(double Avg) {
		char grade = '가';
		
		if(Avg>=90) {
			grade = '수';
		} else if(Avg>=80) {
			grade = '우';
		} else if(Avg>=70) {
			grade = '미';
		} else if(Avg>=60) {
			grade = '양';
		} else {
			grade = '가';
		}	
		return grade;
	}
	
	public static void main(String[] args) {
		
		double avg1 = getAvg(70,60,80);
		char grade1 = getGrade(avg1);
		
		System.out.println("평균은 "+avg1+" 입니다.");
		System.out.println("성적은 "+grade1+" 입니다.");
	}

}
