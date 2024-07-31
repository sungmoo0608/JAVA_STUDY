package day_2024_07_31;

class Circle extends Object{
	public double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r*r*Math.PI;
	}
	
	@Override
	public String toString() {
		return "넓이는 " +getArea()+ "입니다.";
	}
}


public class ObjCircle {

	public static void main(String[] args) {
		
		Object obj = new Circle(10);
		System.out.println(obj);	//출력 : 넓이는 100 입니다. (예시)

	}

}
