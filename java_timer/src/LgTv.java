class TV{
	String brand;
	int year,inch;
	
	TV(String brand, int year,int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand +"에서 만든 "+ year + "년 "+ inch +"인치");
	}
	
}


public class LgTv {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		myTV.show();

	}

}
