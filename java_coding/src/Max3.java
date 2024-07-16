
public class Max3 {

	public static void main(String[] args) {
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		int max;
		
		max = (num1>=num2&&num1>=num3)?num1:(num2>=num3)?num2:num3 ;
		
		System.out.println(max);
		

	}

}