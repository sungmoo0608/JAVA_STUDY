class Circle{
	int radius;
	final double PI=3.14;

	void setRadius(int r){
		radius = r;
	}

	int getRadius() {
		return radius;
	}

	double getArea() {
		return radius*radius*Math.PI;
	}

	void addCircle(Circle circle1, Circle circle2) {
		System.out.println("두 원의 합은? "+(circle1.getArea()+circle2.getArea()));
	}
	
	double mulCircle(Circle circle1,int mul) {
		return circle1.getArea()*mul;
	}
	
	double absCircle(Circle circle1,Circle circle2){
		double abs = circle1.getArea()-circle2.getArea();
		
//		if(abs<0) {
//			abs = abs*-1;
//		}
		
		return (abs>0)?abs:(-1*abs);
		
//		return Math.abs(circle1.getArea()-circle2.getArea());
	}
	
}

public class ClassTr {

	public static void main(String[] args) {

		Circle circle1 = new Circle();

		circle1.setRadius(11);
		System.out.println(circle1.getArea());

		Circle circle2 = new Circle();

		circle2.setRadius(12);
		System.out.println(circle2.getArea());

		circle1.addCircle(circle1,circle2); // 두원의 넓의 합
		System.out.println(circle1.mulCircle(circle1,2));
		System.out.println(circle1.mulCircle(circle1,3));
		
		System.out.println(circle1.absCircle(circle1,circle2));// 두개의 차를 구하는데 절대값
		
	}

}
