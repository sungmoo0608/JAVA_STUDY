package day_2024_07_26;

import java.util.Scanner;

class Rectangle1{
	private double width,height ; 

	public Rectangle1(double width,double height) {
		this.width=width;
		this.height=height;
	}

	public double getArea() {
		return width*height;
	}
}

public class ArrayRectangleScanner {

	public static void main(String[] args) {

		Rectangle1[] arrRectangle = new Rectangle1[3];

		Scanner sc = new Scanner(System.in);

		for ( int i = 0; i < arrRectangle.length; i++) {
			System.out.print(i+1+"번 째 사격형의 가로를 입력하시오>>");
			double width = sc.nextDouble();
			
			System.out.print(i+1+"번 째 사격형의 세로를 입력하시오>>");
			double height = sc.nextDouble();
			
			arrRectangle[i] = new Rectangle1(width,height);
		}


		double area = 0;

		for ( int i = 0; i < arrRectangle.length; i++) {
			System.out.println((i+1)+"번째 사각형의 넓이 : " + arrRectangle[i].getArea());
			area += arrRectangle[i].getArea();

		}
		System.out.println("3개의 사각형 넓이의 합은 : " + area);

	}

}
