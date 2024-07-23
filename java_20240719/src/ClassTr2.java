class Rectangle{
	double height;
	double width;
	
	void setHeight(double h) {
		height = h;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	double getWidth() {
		return width;
	}
	
	double getArea() {
		return height*width;
	}
	
	void printArea(Rectangle rec) {
		System.out.println("넓이:"+rec.getArea());
	}
}

public class ClassTr2 {

	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle();
		rec.setHeight(10.1);
		rec.setWidth(10.1);
		
		System.out.println(rec.getArea());
		rec.printArea(rec);
		
		rec.setHeight(20.1);
		rec.setWidth(10.1);
		
		System.out.println(rec.getArea());
		rec.printArea(rec);
		
		
	}

}
