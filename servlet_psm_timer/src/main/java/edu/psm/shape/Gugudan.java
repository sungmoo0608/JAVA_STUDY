package edu.psm.shape;

public class Gugudan {

	private int kor, eng, math;

	
	public Gugudan(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	

	
	public char getGrade() {
		char grade = '가';
		
		double avg = (kor+eng+math) / 3.0;
		
		if(avg>=90) {
			grade = '수';
		} else if(avg>=80) {
			grade = '우';
		} else if(avg>=70) {
			grade = '미';
		} else if(avg>=60) {
			grade = '양';
		} else {
			grade = '가';
		}	
		return grade;
	}
	
	public double getAvg() {
		return (kor+eng+math) / 3.0;
	}
}