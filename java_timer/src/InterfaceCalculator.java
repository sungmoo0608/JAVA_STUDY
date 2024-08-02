interface ICalculator{
    int add(int num1,int num2);
    int sub(int num1,int num2);
    int mul(int num1,int num2);
    int div(int num1,int num2);       
}

class MyCalculator implements ICalculator{
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	
	public int div(int num1,int num2) {
		
		if(num2==0) {
			System.out.println("잘못된 값 입니다.");
		}
		return num1/num2;
	}
}

public class InterfaceCalculator {

	public static void main(String[] args) {
        ICalculator calculator = new MyCalculator();
        System.out.println(calculator.add(0, 0)); //0
        System.out.println(calculator.sub(1, 1)); //0 
	}

}
