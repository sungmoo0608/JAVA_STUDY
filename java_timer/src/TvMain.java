class TV1 {
	private int size;

	public TV1(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}        

class ColorTV extends TV1{
	private int color;
	
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(super.getSize()+" 인치 "+ this.color+"컬러");
	}
	
	
}

public class TvMain{

	public static void main(String[] args) {

		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}