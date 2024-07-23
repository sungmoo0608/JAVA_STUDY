class Grade {
	int kor,eng,math ; 
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	int getKor() {
		return kor;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}
	
	int getEng() {
		return eng;
	}
	
	void setMath(int math) {
		this.math = math;
	}
	
	int getMath() {
		return math;
	}
	
	char getCharGrade() {
		char grade = '가';
		
		double avg = (kor+eng+math)/3.0;
		
		if(avg>=90) {
			grade ='수';
		} else if(avg>=80) {
			grade ='우';
		} else if(avg>=70) {
			grade ='미';
		} else if(avg>=60) {
			grade ='양';
		} else {
			grade ='가';
		}
		
		return grade;
	}
	
	void getGrade() {
		double avg = (kor+eng+math)/3.0;
		
		if(avg>=90) {
			System.out.println("성적은 수 입니다.");
		} else if(avg>=80) {
			System.out.println("성적은 우 입니다.");
		} else if(avg>=70) {
			System.out.println("성적은 미 입니다.");
		} else if(avg>=60) {
			System.out.println("성적은 양 입니다.");
		} else {
			System.out.println("성적은 가 입니다.");
		}
		
	}
	
	void checkGradeObject(Grade grade) {
		grade.getGrade();
	}
}


public class ClassTr3 {

	public static void main(String[] args) {
	
		Grade grade = new Grade();
		grade.setKor(90);
		grade.setEng(90);
		grade.setMath(90);
		
		System.out.println("국어 : "+grade.getKor());
		System.out.println("영어 : "+grade.getEng());
		System.out.println("수학 : "+grade.getMath());
		
		System.out.println(grade.getCharGrade()+" 입니다.");//수입니다.
		grade.getGrade();//성적은 수입니다.
		
		grade.checkGradeObject(grade);//성적은 수입니다.
	}

}
