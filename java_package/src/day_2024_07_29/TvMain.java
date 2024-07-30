package day_2024_07_29;

class TV {
	private int inch;

	public TV(int inch) { 
		this.inch = inch; 
	}
	
	//상속 관련- 자손에서는 언제든지 접근 가능(패키지와 상관없이)
	protected int getSize() { 
		return inch; 
	}
}

class ColorTV extends TV{
	private int color;
	
	public ColorTV(int inch,int color) { 
		super(inch);
		this.color = color;
	}

	public void printProperty(){
		System.out.println(super.getSize()+ "인치 "+color+"컬러");
	}
}

public class TvMain{

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}

}
