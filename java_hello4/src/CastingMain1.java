
public class CastingMain1 {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 3;
		
		double result1 = num2/num1;
		
		System.out.println(result1);
		System.out.println("결과값이 의도한대로 나오지 않는다.");
		
		double num3 = 4;
		double num4 = 3;
		
		double result2 = num4/num3;
		
		System.out.println(result2);
		System.out.println("데이터 전체를 double로 선언하면 결과값이 의도한대로 나온다.");
		
		double num5 = 4;
		int num6 = 3;
		
		double result3 = num6/num5;
		
		System.out.println(result3);
		System.out.println("데이터 값 하나를 double로 클래스 선언하면 결과값이 의도한대로 나온다.");
		
		int num7 = 4;
		int num8 = 3;
		
		double result4 = (double)num8/num7;
		
		System.out.println(result4);
		System.out.println("계산식에 한쪽 또는 양쪽 모두 데이터 형태를 double로 선언하면 결과값이 의도한대로 나온다.");

	}

}
