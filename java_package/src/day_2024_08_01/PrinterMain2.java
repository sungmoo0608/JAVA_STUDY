package day_2024_08_01;

//데이터 멤버(상수와 함수 선언(abstract) = 추상 메서드(바디(구현부)없는메서드)
interface Printable1 {
	public void print(String doc);
	default void printCMYK(String doc) {};
}

interface ColorPrintable extends Printable1 {
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {
	@Override
	public void print(String doc) {
		System.out.println("Black & White Ver "+doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK Ver "+doc);
	}
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


public class PrinterMain2 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
        String brand = "삼성";
        
        Printable1 prn;
        
        if(brand.equals("삼성")) {
           prn = new SprinterDriver();
           prn.print(myDoc);
           
        }else if(brand.equals("LG")) {
           prn = new LprinterDriver();
           prn.print(myDoc);
        }
        
        ColorPrintable colorPrn = new Prn909Drv();
        colorPrn.print("프린터");
        colorPrn.printCMYK("컬러프린터");
	}

}
