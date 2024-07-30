package day_2024_07_29;

class ColorTV1{
	private int inch;
	private int color;

	public ColorTV1(int inch,int color) { 
		this.inch = inch;
		this.color = color;
	}

	//상속 관련- 자손에서는 언제든지 접근 가능(패키지와 상관없이)
	protected int getSize() { 
		return inch; 
	}
	
	protected int getColor() { 
		return color; 
	}
	
}

class IPTV extends ColorTV1 {
	private String ip;
	
	public IPTV(String ip,int inch,int color) { 
		super(inch,color);
		this.ip = ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip ;
	}
	
	public void printProperty(){
		System.out.println(ip+" 주소에 "+getSize()+ "인치 "+getColor()+"컬러");
	}

}

public class TvMain2{

	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // 
		iptv.printProperty();
	}

}
