package day_2024_07_31;

//데이터 멤버(상수와 함수 선언(abstract) = 추상 메서드(바디(구현부)없는메서드)
interface Printable1 {
	public void print(String doc);
}

//삼성 프린터
class SprinterDriver implements Printable1 {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung pirnter");
		System.out.println(doc);
	}
}

//LG 프린터
class LprinterDriver implements Printable1 {
	@Override
	public void print(String doc) {
		System.out.println("From LG pirnter");
		System.out.println(doc);
	}
}

public class PrinterMain {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		//삼성 프린터로 출력
		Printable1 prn = new SprinterDriver();
		prn.print(myDoc);
		
		//단순줄바꿈
		System.out.println();

		//LG 프린터로 출력
		prn = new LprinterDriver();
		prn.print(myDoc);
	}

}
