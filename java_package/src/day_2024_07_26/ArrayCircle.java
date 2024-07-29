package day_2024_07_26;

class Circle1{
	private double rad ; 

	public Circle1(double r) {
		this.rad=r;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
}

public class ArrayCircle {

	public static void main(String[] args) {
		
		Circle1[] arrCircle = new Circle1[3];
		
		arrCircle[0] = new Circle1(10);
		arrCircle[1] = new Circle1(15);
		arrCircle[2] = new Circle1(7);
		
		double area = 0;
		
		for ( int i = 0; i < arrCircle.length; i++) {
			area += arrCircle[i].getArea();
		}
		System.out.println("3개의 원 넓이 합은 : " + area);

	}

}
