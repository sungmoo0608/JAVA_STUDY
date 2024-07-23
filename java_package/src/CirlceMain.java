// default package란?
//=> 패키지 선언이 안되어 있으면 디폴트 패키지임.

import com.wxmx.simple.Circle;

public class CirlceMain {
	
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.getPara());
		
		com.wxfs.smart.Circle circleb = new com.wxfs.smart.Circle(10);
		System.out.println(circleb.getArea());
	}
}
