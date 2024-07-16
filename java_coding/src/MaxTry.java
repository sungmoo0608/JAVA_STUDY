
public class MaxTry {

	public static void main(String[] args){
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		int max;
		
		if(num1>=num2 && num1>=num3) {
			max = num1;
		} else if (num2>=num1 && num2>=num3) {
			max = num2;
		} else {
			max = num3;
		}
		
		System.out.println("최대값은 : "+max);
	}
}