
public class Circle {

	public static void main(String[] args) {
		
		
		final double PI = 3.14;
		double radius = 10;
		double area = radius * radius * PI ;
		
		boolean a = area<100;
		
		System.out.println("반지름:"+ radius +" "+ "넓이:"+ area);
		System.out.println("넓이가 100미만 입니까?");
		System.out.println(a);
	}

}
