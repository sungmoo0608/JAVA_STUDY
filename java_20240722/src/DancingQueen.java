class Song {
	String title,artist,country;
	int year;

	Song(String title,String artist,int year,String country) {
		this.title = title;
		this.artist =artist;
		this.country = country;
		this.year = year;
	}

	void show() {
		System.out.println(year +"년 "+ country +" 국적의 " + artist + "가 부른 " + title);
	}
}

class Circle3 {	
	double raidus;

	Circle3(double radius){
		this.raidus = radius;
	}

	void getArea() {
		System.out.println(raidus*raidus*Math.PI);
	}
}

class Rectangle4{
	double height,width;
	
	Rectangle4(double height,double width){
		this.height = height;
		this.width = width;
	}
	
	void getArea() {
		System.out.println(height*width);
	}
}

public class DancingQueen {

	public static void main(String[] args) {

		// 문제
		{
			Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
			song.show();
		}
		// 문제
		{
			Circle3 c3 = new Circle3(10);
			c3.getArea();
		}
		// 문제
		
		Rectangle4 rec = new Rectangle4(10,10);
		rec.getArea();
	}

}
