import java.util.Scanner;

class CircleLp{
	private double radius;
	private final double PI = 3.14;

	public CircleLp(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius*radius*Math.PI;
	}
}

public class CircleLoop {

	public static void main(String[] args) {

		while(true) {
			double radius;
			Scanner sc = new Scanner(System.in);

			System.out.println("원의 반지름을 입력하시오 :");
			radius = sc.nextDouble();

			CircleLp circle = new CircleLp(radius);
			System.out.println("원의 넓이는 "+ circle.getArea());
			System.out.println("계속하시겠습니까? y,n");

			String yesOrNo = sc.next();

			if(yesOrNo.equals("Y")||yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("원밖으로나갔다.");
	}

}
