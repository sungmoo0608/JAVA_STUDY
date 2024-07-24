class Grade1{
	int kor,eng,math;
	
	Grade1(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math ;
	}
	
	double average() {
		return (kor+eng+math)/3.0;
	}
}


public class GradeAverage {

	public static void main(String[] args) {
		 Grade1 me = new Grade1(90,80 ,60 );
		 System.out.println("평균은 "+me.average());

	}

}
