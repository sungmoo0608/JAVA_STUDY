
public class MethodReturns {

	public static int adder(int num1,int num2) {
		int addResult = num1 + num2;
		return addResult;	// addResult의 값을 반환
	}

	public static double square(double num) {
		return num*num;	// num*num의 결과를 반환
	}

	public static double getAvg(int num1,int num2,int num3) {
		return (num1+num2+num3) / 3.0;
	}

	public static char getGrade(double avg) {
		char grade = '가';

		if(avg>=90) {
			grade ='수';
		} else if (avg>=80) {
			grade ='우';
		} else if (avg>=70) {
			grade ='미';
		} else if (avg>=60) {
			grade ='양';
		} else {
			grade ='가';
		}

		return grade;
	}

	public static double getCircleArea(double r) {

		// final double pi = 3.14;
		// double circleArea = num*num*pi;

		return r*r*Math.PI;
	}

	public static double getRetangleArea(double width,double height) {

		return width*width;
	}

	public static void main(String[] args) {
		int result;
		result = adder(4,5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));

		double avg = getAvg(92,93,90);
		char grade = getGrade(avg);

		System.out.println("평균은 "+avg+"입니다.");
		System.out.println("성적은 "+grade+"입니다."); // 수

		System.out.println(getCircleArea(10));
		System.out.println(getRetangleArea(14.5,16.7));
	}

}
