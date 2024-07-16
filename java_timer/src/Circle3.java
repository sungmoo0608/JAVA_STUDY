
public class Circle3 {

	public static void main(String[] args) {
		
		double raudis = 10;
		final double PI = 3.14 ; 
		
		double area = raudis * raudis * PI;
		
		boolean b = 100>area;
		
		System.out.println("반지름 : " + raudis + " " + "넓이 : " + area);
		System.out.println("넓이가 100 미만 입니까?");
		System.out.println(b);

	}

}
