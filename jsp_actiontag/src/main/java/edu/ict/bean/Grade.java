package edu.ict.bean;

// Bean 객체
// 일반 클래스 + 생성자 + getter/setter

public class Grade {

	private String name;
	private int kor,eng,math,sum;
	private double avg;

	public Grade() {}
	
	public Grade(String name, int kor, int eng, int math, int sum, double avg) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum = kor+eng+math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg = sum/3.0;
	}

	public void setAvg(double avg) {
		this.avg = avg;
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
	


}
