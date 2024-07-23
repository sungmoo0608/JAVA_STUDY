class Circle {
	int radius;
	final double PI=3.14;
	
	void setRadius(int radius) {
		this.radius=radius;
	}
	
	int getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}
}
public class AreaTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.setRadius(10);
		System.out.println("원의 넓이 : " + circle.getArea());
		
	}

}