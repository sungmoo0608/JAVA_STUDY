class TV{
	String brand;
	int year;
	int inch;

	TV(String brand,int year,int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand+ "에서 만든 " + year + "년 " + inch + "인치");
	}
	
	TV() {
		this.brand = "OO";
		this.year = 1900;
		this.inch = 0;
		show();
	}

}

public class TvMain {

	public static void main(String[] args) {
		TV myTv = new TV("LG",2017,32);	//LG에서 만든 2017년 32인치
		myTv.show();
		
		TV myTv2 = new TV();
	}

}
