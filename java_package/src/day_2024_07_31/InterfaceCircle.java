package day_2024_07_31;

interface Shape {
	public static final double PI = 3.14;	//상수
	public abstract void draw();			//도형을 그리는 추상 메소드
	double getArea();		//도형의 면적을 리턴하는 추상 메소드
	default public void redraw() {
		System.out.println("--- 다시 그립니다.");
		draw();
	}	
}

class Circle1 implements Shape{
	public double r;
	
	public Circle1(double r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
	
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
	
	
}


public class InterfaceCircle {

	public static void main(String[] args) {
		
		Shape donut = new Circle1(10);	//반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}
