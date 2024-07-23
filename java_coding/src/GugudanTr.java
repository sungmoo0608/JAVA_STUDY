class Gugudan{

	void printGuGu(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
}


public class GugudanTr {

	public static void main(String[] args){
		Gugudan gugudan = new Gugudan();

		gugudan.printGuGu(10); // 1단 부터 10단 까지 출력
		gugudan.printGuGu(20); // 1단 부터 20단 까지 출력
	}
}