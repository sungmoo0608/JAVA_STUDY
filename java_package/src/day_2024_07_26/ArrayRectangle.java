package day_2024_07_26;

class Rectangle{
	private double width,height ; 

	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}

	public double getArea() {
		return width*height;
	}
}

public class ArrayRectangle {

	public static void main(String[] args) {
		
		Rectangle[] arrRectangle = new Rectangle[3];
		
		arrRectangle[0] = new Rectangle(10,10);
		arrRectangle[1] = new Rectangle(17,89);
		arrRectangle[2] = new Rectangle(90,100);
		
		double area = 0;
		
		for ( int i = 0; i < arrRectangle.length; i++) {
			System.out.println((i+1)+"번째 사각형의 넓이 : " + arrRectangle[i].getArea());
			area += arrRectangle[i].getArea();
			
		}
		System.out.println("3개의 사각형 넓이의 합은 : " + area);

	}

}
