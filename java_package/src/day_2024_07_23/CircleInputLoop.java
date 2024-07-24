package day_2024_07_23;

import java.util.Scanner;

class Circle10{
	private double rad ; 

	public Circle10(double r) {
		this.rad=r;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
}

public class CircleInputLoop {

	public static void main(String[] args) {

		while(true) {
			double radius;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원의 반지름을 입력하시오 :");
			radius = sc.nextDouble(); 
			
			Circle10 circle = new Circle10(radius);
			System.out.println("원의 넓이는 " + circle.getArea());
			System.out.println("계속하시겠습니까? y,n");
			
			String yesOrNo = sc.next();
			
			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
					
		}
		
		System.out.println("프로그램을 종료합니다.");


	} 
}
