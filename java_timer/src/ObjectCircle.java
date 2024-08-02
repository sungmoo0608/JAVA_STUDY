
class Circle6{
	final double PI = 3.14;
	public double r;
	
	public Circle6(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r*r*Math.PI;
	}
	
	@Override
	public String toString() {
		return "넓이는"+ getArea()+"입니다.";
	}
	
}

public class ObjectCircle {
	
	public static void main(String[] args) {
		
		Object obj = new Circle6(10);

		System.out.println(obj); //출력: 넓이는 100 입니다. (예시)

	}
}