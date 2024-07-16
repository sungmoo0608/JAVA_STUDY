
public class TernaryOperator {

	public static void main(String[] args) {
		
//		삼항연산자 = if else
		
		int num=5;
		
		if(num>=5) {
			num=10;
		} else {
			num=20;
		}
		System.out.println(num);
		
		int result = (num>=5)?10:20;
		System.out.println(result);
		
//		세 수 중에 최대값 구하기
//		
//		int kor = 90;
//		int eng = 100;
//		int math = 70;
//		
//		int max = (kor>=eng&&kor>=math)?kor:(eng>=math)?eng:math;
//		System.out.println(kor+" "+eng+" "+math+" 중");
//		System.out.println("최대값 : " + max);
		
		int kor = 90;
		int eng = 100;
		int math = 70;
		int max;
		
		max = (kor<=eng)?eng:kor;
		max = (math<=max)?max:math;
		
//		max = (kor>eng)?(kor>math?kor:math):(eng>math?eng:math);
		
		System.out.println("최대값 : "+ max);
		
	}

}
