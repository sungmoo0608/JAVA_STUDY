package day_2024_07_26;

class Circle{
	private double rad ; 

	public Circle(double r) {
		this.rad=r;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
}

public class ArrayString {

	public static void main(String[] args) {
		
		Circle cir1 = new Circle(10);
		Circle cir2 = new Circle(15);
		Circle cir3 = new Circle(7);
		
		Double[] db = new Double[3];
		
		db[0] = cir1.getArea();
		db[1] = cir2.getArea();
		db[2] = cir3.getArea();
		
		double cnum1 = 0;
		for ( int i = 0; i < db.length; i++) {
			System.out.println((i+1)+"번째 원 넓이 : "+db[i]);
			cnum1 += db[i];
		}
		System.out.println("3개의 원 넓이 합은 : " + cnum1);
		
		
		System.out.println("========================");
		
		
		String[] sr = new String[7];
		
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");
		
		int cnum = 0;
		for ( int i = 0; i < sr.length; i++) {
			cnum += sr[i].length();
		}
		System.out.println("총 문자의 수 : " + cnum);

	}

}
