class SumC {
	int num;

	void setNum(int num) {
		this.num = num;
	}

	int getNum(){
		return num;
	}

	void getNumSum() {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}


public class SumClass {

	public static void main(String[] args) {
		
		SumC sumc = new SumC();
		
		sumc.setNum(100);
		sumc.getNumSum();


	}

}