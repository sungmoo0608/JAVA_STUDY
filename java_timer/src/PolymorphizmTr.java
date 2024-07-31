class Shape {
	
	public double getArea() {
		return 0;
	}
}

class Circle1 extends Shape{
	public double r;
	
	public Circle1(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r*r*Math.PI;
	}
}

class Rectangle extends Shape{
	public double width,height;
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
}

class Triangle extends Shape{
	public double width,height;
	
	public Triangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height/2.0;
	}
}


public class PolymorphizmTr {

	public static void main(String[] args) {
		Shape[] arrShape = {new Circle1(5),new Rectangle(5,5),new Triangle(10, 5)};
		double area = 0;
		for (Shape shape : arrShape) {
			area = area + shape.getArea();
		}
		System.out.println(area);

	}

}
