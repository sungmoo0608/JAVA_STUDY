package day_2024_07_26;

import java.util.Scanner;

class Circle2{
	private double rad ; 

	public Circle2(double r) {
		this.rad=r;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
}

public class ArrayCircleScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle2[] arrCircle = new Circle2[3];
		
		for  ( int i = 0; i < arrCircle.length; i++) {
			System.out.print(i+1+"번째 원의 반지름을 입력해주세요 >>> ");
			double rad = sc.nextDouble();
			
			arrCircle[i] = new Circle2(rad);
		}
		
		double area = 0;
		
		for ( int i = 0; i < arrCircle.length; i++) {
			System.out.println(i+1+"번째 원의 넓이 :"+ arrCircle[i].getArea());
			area += arrCircle[i].getArea();
		}
		System.out.println("3개의 원 넓이 합은 : " + area);

	}

}
