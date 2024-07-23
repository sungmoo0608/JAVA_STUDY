class Circle {
	double radius;
	final double PI = 3.14;
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}
	
}


public class Circle4 {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(10);
		
		System.out.println(circle1.getArea());
	}

}
