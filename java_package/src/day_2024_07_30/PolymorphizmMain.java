package day_2024_07_30;

/*
 * 다형성, 함수오버라이딩 응용
 *
 */

class Dance {
	public void dance() {
		System.out.println("춤을 춥니다");
	}
}

class PersonDance extends Dance {
	
	@Override
	public void dance() {
		System.out.println("사람이 춤을 춥니다");
	}
}

class RobotDance extends Dance {
	
	@Override
	public void dance() {
		System.out.println("로봇이 춤을 춥니다");
	}
}

class AIDance extends Dance {
	
	@Override
	public void dance() {
		System.out.println("AI가 춤을 춥니다");
	}
}

class Shape {
	
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {
	public double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
}

class Rectangle extends Shape {
	public double width,height;
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
}

class Triangle extends Shape {
	public double width,height;
	
	public Triangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height/2.0;
	}
}

public class PolymorphizmMain {

	public static void main(String[] args) {
		
		Dance dance = new PersonDance();
		dance.dance();
		
		dance = new RobotDance();
		dance.dance();
		
		dance = new AIDance();
		dance.dance();
		
		Dance[] arrDance = {new PersonDance(),new RobotDance(),new AIDance()};
		
		for(Dance dan : arrDance) {
			dan.dance();
		}
		
		// 기존 방식
		Circle circle = new Circle(5);
		Rectangle rec = new Rectangle(5,5);
		
		double area = circle.getArea() + rec.getArea();
		System.out.println(area);
		
		// 다형성, 함수오버라이딩 응용
		Shape[] arrShape = {new Circle(5),new Rectangle(5,5),new Triangle(10,5)};
		area = 0;
		for (Shape shape:arrShape) {
			area = area + shape.getArea();
		}
		System.out.println(area);
	}

}
