package day_2024_08_07;

import java.util.ArrayList;
import java.util.List;

class Circle {
	private double rad ; 

	public Circle(double r) {
		this.rad=r;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
}

public class LinkedListCircle {

	public static void main(String[] args) {
		
		List<Circle> circleList = new ArrayList<>();
		
		circleList.add(new Circle(10));
		circleList.add(new Circle(20));
		circleList.add(new Circle(30));
		
		double sum = 0 ;
		
		for (Circle circle:circleList) {
			sum = sum + circle.getArea();
		}
		
		System.out.println("3개 원의 합은 ? "+sum);
		
	}
	
}
