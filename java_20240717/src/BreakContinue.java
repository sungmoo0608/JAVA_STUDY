
public class BreakContinue {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num <= 5) {
			if(num%2==0)
				continue;
			System.out.println("Hello World");
			num++;
		}

	}

}
